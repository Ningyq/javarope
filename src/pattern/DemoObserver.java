package pattern;

import java.util.ArrayList;
import java.util.List;

interface IPublisher {
    void register(ISubscriber obj);
    void unregister(ISubscriber obj);
    void notifyObservers();

    Object getUpdate();
}

interface ISubscriber {
    void update();
    void setPublisher(IPublisher publisher);
}

class MyPublisher implements IPublisher {
    private List<ISubscriber> subscriberList;
    private String message;
    private boolean changed;
    private final Object MUTEX = new Object();

    public MyPublisher() {
        this.subscriberList = new ArrayList<>();
    }

    @Override
    public void register(ISubscriber obj) {
        if (obj == null) {
            throw new NullPointerException("Null Subscriber");
        }

        synchronized (MUTEX) {
            if (!subscriberList.contains(obj)) {
                subscriberList.add(obj);
            }
            obj.setPublisher(this);
        }
    }

    @Override
    public void unregister(ISubscriber obj) {
        synchronized (MUTEX) {
            subscriberList.remove(obj);
        }
    }

    @Override
    public void notifyObservers() {
        List<ISubscriber> subscriberLocal;

        synchronized (MUTEX) {
            if (!changed) {
                return;
            }

            subscriberLocal = new ArrayList<>(this.subscriberList);
            this.changed = false;
        }
        for (ISubscriber obj : subscriberLocal) {
            obj.update();
        }
    }

    @Override
    public Object getUpdate() {
        return this.message;
    }

    public void postMessage(String msg) {
        System.out.println("Message Posted to Topic: " + msg);
        this.message = msg;
        this.changed = true;
        notifyObservers();
    }
}

class TopicSubscriber implements ISubscriber {
    private String name;
    private IPublisher topic;

    public TopicSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        String message = (String) topic.getUpdate();
        if (message == null) {
            System.out.println(name + ":: No new Message");
        } else {
            System.out.println(name + ":: consuming message ::" + message);
        }
    }

    @Override
    public void setPublisher(IPublisher publisher) {
        this.topic = publisher;
    }
}

public class DemoObserver {

    public static void main(String[] args) {
        MyPublisher publisher = new MyPublisher();
        ISubscriber hh1 = new TopicSubscriber("Tom H");
        ISubscriber hh2 = new TopicSubscriber("Smith H");
        ISubscriber hh3 = new TopicSubscriber("Jerry H");

        publisher.register(hh1);
        publisher.register(hh2);
        publisher.register(hh3);

        hh1.update();

        publisher.postMessage("dharma java 2018");

        hh2.update();
    }
}

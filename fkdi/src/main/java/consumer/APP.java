package consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import service.Service;

@Component
public class APP {
    @Autowired
    private Service service;

//    @Autowired
//    public App(Service service) {
//        this.service = service;
//    }

//    @Autowired
//    public void setService(Service service) {
//        this.service = service;
//    }

    public boolean process(String msg, String rec) {
        return this.service.send(msg, rec);
    }
}

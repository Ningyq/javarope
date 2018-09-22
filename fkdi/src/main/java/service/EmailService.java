package service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class EmailService implements Service {

    public boolean send(String msg, String rec) {
        System.out.println("Email sent to " + rec + " with massage " + msg);
        return true;
    }

    @PostConstruct
    public void init() {
        System.out.println("post construct: email");
    }

    @PreDestroy
    public void finish() {
        System.out.println("pre destruct: email");
    }
}

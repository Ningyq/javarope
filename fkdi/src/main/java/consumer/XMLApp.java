package consumer;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import service.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class XMLApp implements InitializingBean, DisposableBean {
    private Service service;

    public void setService(Service service) {
        this.service = service;
    }

    public boolean process(String msg, String rec) {
        return this.service.send(msg, rec);
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBean init: xmlApp");
    }

    public void destroy() throws Exception {
        System.out.println("DisposableBean destroy: xmlApp");
    }

    private void xmlInit() {
        System.out.println("xml init");
    }

    private void xmlDestroy() {
        System.out.println("xml destroy");
    }


    @PostConstruct
    public void init() {
        System.out.println("post construct: xmlApp");
    }

    @PreDestroy
    public void finish() {
        System.out.println("pre destruct: xmlApp");
    }
}



package main;

import config.DIConfig;
import consumer.APP;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.EmailService;
import service.Service;

public class Client {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DIConfig.class);
        APP app = context.getBean(APP.class);

        app.process("HELLO WORLD", "123456@qq.com");

        APP app1 = context.getBean(APP.class);

        System.out.println("app1 hashCode = " + app.hashCode());
        System.out.println("app2 hashCode = " + app1.hashCode());

        Service service1 = context.getBean(EmailService.class);
        Service service2 = context.getBean(EmailService.class);

        System.out.println("Service1 hashCode = " + service1.hashCode());
        System.out.println("Service2 hashCode = " + service2.hashCode());

        context.close();
    }
}

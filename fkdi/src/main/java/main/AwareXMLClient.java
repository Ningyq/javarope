package main;

import consumer.AwareApp;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AwareXMLClient {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationAwareContext.xml");
        AwareApp awareApp = context.getBean(AwareApp.class);

        context.close();
    }
}

package main;

import consumer.XMLApp;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XMLClient {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        XMLApp xmlapp = context.getBean(XMLApp.class);

        xmlapp.process("HELLO WORLD", "123456@qq.com");

        context.close();
    }
}
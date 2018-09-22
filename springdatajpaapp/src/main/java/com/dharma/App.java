package com.dharma;

import com.dharma.dao.ProductDao;
import com.dharma.modal.Product;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
    private static ProductDao dao;


    public static void main( String[] args ) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        dao = (ProductDao)context.getBean("productDao");

        Product product = dao.getProduct(1);
        System.out.println(product);
    }
}

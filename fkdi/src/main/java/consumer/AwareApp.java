package consumer;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanClassLoaderAware;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.util.Arrays;

public class AwareApp implements ApplicationContextAware, BeanFactoryAware, BeanClassLoaderAware, BeanNameAware {
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("setApplicationContext invoked");
        System.out.println("setApplicationContext:: Bean name = "
                + Arrays.toString(applicationContext.getBeanDefinitionNames()));
    }

    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("setBeanFactory invoked");
        System.out.println("setBeanFactory Scope = "
                + (beanFactory.isPrototype("email") ? "yes" : "no"));
    }

    public void setBeanClassLoader(ClassLoader classLoader) {
        System.out.println("setBeanClassLoader invoked");
        System.out.println("setBeanClassLoader:: classLoader name = " + classLoader);
    }

    public void setBeanName(String s) {
        System.out.println("setBeanName invoked");
        System.out.println("setBeanName:: Bean name = " + s);
    }

}

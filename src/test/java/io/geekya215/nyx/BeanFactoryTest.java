package io.geekya215.nyx;

import io.geekya215.nyx.beans.factory.config.BeanDefinition;
import io.geekya215.nyx.beans.factory.support.DefaultListableBeanFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BeanFactoryTest {

    @Test
    void testGetBean() {
        // create bean factory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        // register bean definition
        BeanDefinition beanDefinition = new BeanDefinition(HelloService.class);
        beanFactory.registerBeanDefinition("helloService", beanDefinition);

        // get bean
        HelloService helloService = (HelloService) beanFactory.getBean("helloService");
        Assertions.assertEquals("hello", helloService.hello());
    }
}

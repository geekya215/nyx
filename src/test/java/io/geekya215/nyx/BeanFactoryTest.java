package io.geekya215.nyx;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BeanFactoryTest {
    class HelloService {
        String hello() {
            System.out.println("Hello!");
            return "hello";
        }
    }

    @Test
    void testGetBean() {
        BeanFactory beanFactory = new BeanFactory();
        HelloService helloService = new HelloService();
        beanFactory.registerBean("helloService", helloService);
        HelloService service = ((HelloService) beanFactory.getBean("helloService"));
        Assertions.assertEquals(helloService, service);
        Assertions.assertEquals("hello", service.hello());
    }
}

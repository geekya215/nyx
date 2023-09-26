package io.geekya215.nyx.beans.factory;

import io.geekya215.nyx.beans.BeansException;

public interface BeanFactory {
    Object getBean(String beanName) throws BeansException;
}

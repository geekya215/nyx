package io.geekya215.nyx.beans.factory.support;

import io.geekya215.nyx.beans.factory.config.BeanDefinition;

public interface BeanDefinitionRegistry {
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}

package io.geekya215.nyx.beans.factory.config;

public final class BeanDefinition {
    private final Class<?> beanClass;

    public BeanDefinition(Class<?> beanClass) {
        this.beanClass = beanClass;
    }

    public Class<?> getBeanClass() {
        return beanClass;
    }
}

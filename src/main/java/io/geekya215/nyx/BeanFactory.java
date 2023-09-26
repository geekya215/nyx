package io.geekya215.nyx;

import java.util.HashMap;
import java.util.Map;

public final class BeanFactory {
    private final Map<String, Object> beanMap = new HashMap<>();

    public void registerBean(String name, Object bean) {
        beanMap.put(name, bean);
    }

    public Object getBean(String name) {
        return beanMap.get(name);
    }
}

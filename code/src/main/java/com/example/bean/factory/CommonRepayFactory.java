package com.example.bean.factory;

import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.stereotype.Component;

@Component
public class CommonRepayFactory {

    private static final Map<String, IRepayFactory> REPAY_FACTORY_MAP = new ConcurrentHashMap<>();

    public static IRepayFactory getRepayFactory(String type) throws Exception {
        IRepayFactory repayFactory = REPAY_FACTORY_MAP.get(type);
        if (Objects.isNull(repayFactory)) {
            throw new Exception("搞的啥，没有这个工厂");
        }
        return repayFactory;
    }

    public static void register(String factoryType, IRepayFactory repayFactory) {
        REPAY_FACTORY_MAP.put(factoryType, repayFactory);
    }
}
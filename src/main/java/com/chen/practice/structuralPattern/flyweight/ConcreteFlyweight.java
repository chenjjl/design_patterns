package com.chen.practice.structuralPattern.flyweight;

/**
 * 具体享元角色
 */
public class ConcreteFlyweight implements Flyweight {

    private String key;

    public ConcreteFlyweight(String key){
        this.key = key;
        System.out.println("具体享元角色" + key + "被创建");
    }

    @Override
    public void operation(UnsharedConcreteFlyweight outState) {
        System.out.println("具体享元" + key + "被调用");
        System.out.println("外部状态为" + outState.getInfo());
    }
}

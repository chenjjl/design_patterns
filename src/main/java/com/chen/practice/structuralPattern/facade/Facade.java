package com.chen.practice.structuralPattern.facade;

/**
 * 外观角色
 */
public class Facade {

    private SubSystem1 subSystem1 = new SubSystem1();
    private SubSystem2 subSystem2 = new SubSystem2();
    private SubSystem3 subSystem3 = new SubSystem3();

    public void method(){
        subSystem1.method1();
        subSystem2.method2();
        subSystem3.method3();
    }
}

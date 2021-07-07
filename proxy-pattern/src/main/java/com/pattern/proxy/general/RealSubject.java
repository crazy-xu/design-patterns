package com.pattern.proxy.general;

/**
 * @author crazy.xu
 * @Title: RealSubject
 * @Package com.pattern.proxy.general
 * @Description: 代理模式-真实对象
 */
public class RealSubject implements ISubject {

    /**
     * 请求操作
     */
    @Override
    public void request() {
        System.out.println("访问真实对象的操作。");
    }
}

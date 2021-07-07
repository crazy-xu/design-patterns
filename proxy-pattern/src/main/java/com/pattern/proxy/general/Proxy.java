package com.pattern.proxy.general;

/**
 * @author crazy.xu
 * @Title: Proxy
 * @Package com.pattern.proxy.general
 * @Description: 代理模式-静态代理-代理对象
 */
public class Proxy implements ISubject {

    private ISubject subject;

    public Proxy(ISubject subject) {
        this.subject = subject;
    }

    /**
     * 请求操作
     */
    @Override
    public void request() {
        before();
        subject.request();
        after();
    }

    /**
     * 请求之前操作
     */
    public void before() {
        System.out.println("访问真实对象之前的预处理操作。");
    }

    /**
     * 请求之后操作
     */
    public void after() {
        System.out.println("访问真实对象之后的后续处理操作。");
    }
}

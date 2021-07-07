package com.pattern.proxy.general;

/**
 * @author crazy.xu
 * @Title: Client
 * @Package com.pattern.proxy.general
 * @Description: 代理模式-静态代理-通常
 */
public class Client {

    public static void main(String[] args) {
        // 传入真实对象，通过代理模式执行操作
        Proxy proxy = new Proxy(new RealSubject());
        proxy.request();
    }
}

package com.qixiafei.book.design.patterns.gof.proxy.dynamic;

import com.qixiafei.book.design.patterns.gof.proxy.staticproxy.IHello;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * <P>Description: . </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   </P>
 * <P>CREATE DATE: 2019/8/14 20:52</P>
 * <P>UPDATE DATE: </P>
 *
 * @author 齐霞飞
 * @version 1.0
 * @since java 1.8.0
 */
public class HelloDynamicProxy implements InvocationHandler {

    private IHello hello;

    public HelloDynamicProxy(IHello hello) {
        this.hello = hello;
    }

    public IHello getProxy() {
        return (IHello) Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), hello.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(final Object proxy, final Method method, final Object[] args) throws Throwable {
        System.out.println("dynamic proxy before");
        Object result = method.invoke(hello, args);
        System.out.println("dynamic proxy after");
        return result;
    }
}

package com.qixiafei.book.design.patterns.gof.proxy;

import com.qixiafei.book.design.patterns.gof.proxy.dynamic.HelloDynamicProxy;
import com.qixiafei.book.design.patterns.gof.proxy.staticproxy.Hello;
import com.qixiafei.book.design.patterns.gof.proxy.staticproxy.HelloProxy;
import com.qixiafei.book.design.patterns.gof.proxy.staticproxy.IHello;

/**
 * <P>Description: . </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   </P>
 * <P>CREATE DATE: 2019/8/14 20:51</P>
 * <P>UPDATE DATE: </P>
 *
 * @author 齐霞飞
 * @version 1.0
 * @since java 1.8.0
 */
public class Client {

    public static void main(String[] args) {
        IHello hello = new HelloProxy(new Hello());

        hello.sayHello("qixiafei");

        IHello proxy = new HelloDynamicProxy(new Hello()).getProxy();
        proxy.sayHello("qixiafei");
    }
}

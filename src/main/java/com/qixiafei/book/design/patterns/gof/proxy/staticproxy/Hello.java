package com.qixiafei.book.design.patterns.gof.proxy.staticproxy;

/**
 * <P>Description: . </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   </P>
 * <P>CREATE DATE: 2019/8/14 20:49</P>
 * <P>UPDATE DATE: </P>
 *
 * @author 齐霞飞
 * @version 1.0
 * @since java 1.8.0
 */
public class Hello implements IHello {
    @Override
    public void sayHello(final String name) {
        System.out.println("hello!" + name);
    }
}

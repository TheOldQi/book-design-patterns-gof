package com.qixiafei.book.design.patterns.gof.flyweight.role;

/**
 * <P>Description: . </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   </P>
 * <P>CREATE DATE: 2019/8/14 15:52</P>
 * <P>UPDATE DATE: </P>
 *
 * @author 齐霞飞
 * @version 1.0
 * @since java 1.8.0
 */
public class Male implements Role {
    @Override
    public void introduce() {
        System.out.println("I'm male");
    }
}

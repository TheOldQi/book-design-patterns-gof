package com.qixiafei.book.design.patterns.gof.vistor.person;

/**
 * <P>Description: . </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   </P>
 * <P>CREATE DATE: 2019/8/14 22:01</P>
 * <P>UPDATE DATE: </P>
 *
 * @author 齐霞飞
 * @version 1.0
 * @since java 1.8.0
 */
public class Cat implements Animal {
    @Override
    public void accept(final Visitor visitor) {
        visitor.visitCat(this);
    }
}

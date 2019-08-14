package com.qixiafei.book.design.patterns.gof.composite.menu;

/**
 * <P>Description: . </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   </P>
 * <P>CREATE DATE: 2019/8/14 10:47</P>
 * <P>UPDATE DATE: </P>
 *
 * @author 齐霞飞
 * @version 1.0
 * @since java 1.8.0
 */
public interface MenuComponent {

    void add(MenuComponent child);

    void remove(MenuComponent child);

    void display();
}

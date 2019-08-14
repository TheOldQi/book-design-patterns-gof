package com.qixiafei.book.design.patterns.gof.composite.menu;

/**
 * <P>Description: . </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   </P>
 * <P>CREATE DATE: 2019/8/14 10:48</P>
 * <P>UPDATE DATE: </P>
 *
 * @author 齐霞飞
 * @version 1.0
 * @since java 1.8.0
 */
public class MenuItem implements MenuComponent {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    @Override
    public void add(MenuComponent child) {
        throw new UnsupportedOperationException("菜单项不支持新增子菜单");
    }

    @Override
    public void remove(MenuComponent child) {
        throw new UnsupportedOperationException("菜单项不支持删除子菜单");
    }

    @Override
    public void display() {
        System.out.println(name);
    }
}

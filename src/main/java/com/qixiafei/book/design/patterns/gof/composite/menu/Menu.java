package com.qixiafei.book.design.patterns.gof.composite.menu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <P>Description: . </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   </P>
 * <P>CREATE DATE: 2019/8/14 10:50</P>
 * <P>UPDATE DATE: </P>
 *
 * @author 齐霞飞
 * @version 1.0
 * @since java 1.8.0
 */
public class Menu implements MenuComponent {

    private List<MenuComponent> childs = new ArrayList<>();
    private Map<MenuComponent, Integer> position = new HashMap<>();

    @Override
    public void add(MenuComponent child) {
        position.put(child, childs.size());
        childs.add(child);
    }

    @Override
    public void remove(MenuComponent child) {
        final Integer remove = position.remove(child);
        if (remove == null) {
            throw new IllegalArgumentException("没有这个子菜单");
        }
        childs.remove((int)remove);
    }

    @Override
    public void display() {
        for (MenuComponent component : childs) {
            component.display();
        }
    }
}

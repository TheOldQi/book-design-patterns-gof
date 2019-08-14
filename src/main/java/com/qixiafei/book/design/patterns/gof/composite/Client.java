package com.qixiafei.book.design.patterns.gof.composite;

import com.qixiafei.book.design.patterns.gof.composite.menu.Menu;
import com.qixiafei.book.design.patterns.gof.composite.menu.MenuComponent;
import com.qixiafei.book.design.patterns.gof.composite.menu.MenuItem;

/**
 * <P>Description: . </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   </P>
 * <P>CREATE DATE: 2019/8/14 10:56</P>
 * <P>UPDATE DATE: </P>
 *
 * @author 齐霞飞
 * @version 1.0
 * @since java 1.8.0
 */
public class Client {

    public static void main(String[] args) {
        final MenuComponent menuLevel1 = new Menu();
        final MenuComponent menuLevel1Item1 = new MenuItem();
        final MenuComponent menuLevel1Item2 = new MenuItem();
        final MenuComponent menuLevel2 = new Menu();
        menuLevel1.add(menuLevel1Item1);
        menuLevel1.add(menuLevel1Item2);
        menuLevel1.add(menuLevel2);

        menuLevel1.display();

    }
}

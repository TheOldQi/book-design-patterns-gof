package com.qixiafei.book.design.patterns.gof.tm;

import com.qixiafei.book.design.patterns.gof.tm.cook.CookTemplate;
import com.qixiafei.book.design.patterns.gof.tm.cook.GongBaoJiDing;
import com.qixiafei.book.design.patterns.gof.tm.cook.PekingFriedDuck;

/**
 * <P>Description: . </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   </P>
 * <P>CREATE DATE: 2019/8/14 21:39</P>
 * <P>UPDATE DATE: </P>
 *
 * @author 齐霞飞
 * @version 1.0
 * @since java 1.8.0
 */
public class Client {

    public static void main(String[] args) {
        CookTemplate cookTemplate = new PekingFriedDuck();
        cookTemplate.cook();
        CookTemplate cookTemplate1 = new GongBaoJiDing();
        cookTemplate1.cook();
    }
}

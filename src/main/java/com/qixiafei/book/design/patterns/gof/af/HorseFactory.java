package com.qixiafei.book.design.patterns.gof.af;

/**
 * <P>Description: . </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   </P>
 * <P>CREATE DATE: 2019/8/13 10:24</P>
 * <P>UPDATE DATE: </P>
 *
 * @author 齐霞飞
 * @version 1.0
 * @since java 1.8.0
 */
public class HorseFactory implements Factory {
    public Head getHead() {
        return new HorseHead();
    }

    public Hand getHand() {
        return new HorseHand();
    }

    public Foot getFoot() {
        return new HorseFoot();
    }
}

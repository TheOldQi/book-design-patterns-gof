package com.qixiafei.book.design.patterns.gof.facade;

import com.qixiafei.book.design.patterns.gof.facade.trip.TripFacade;

/**
 * <P>Description: . </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   </P>
 * <P>CREATE DATE: 2019/8/14 11:49</P>
 * <P>UPDATE DATE: </P>
 *
 * @author 齐霞飞
 * @version 1.0
 * @since java 1.8.0
 */
public class Client {

    public static void main(String[] args) {
        TripFacade facade = new TripFacade();
        facade.eat("chicken");
        facade.sleep(1000);
    }
}

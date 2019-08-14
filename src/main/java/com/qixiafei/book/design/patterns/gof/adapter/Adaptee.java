package com.qixiafei.book.design.patterns.gof.adapter;

/**
 * <P>Description: 需要被适配的类. </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   </P>
 * <P>CREATE DATE: 2019/8/13 10:32</P>
 * <P>UPDATE DATE: </P>
 *
 * @author 齐霞飞
 * @version 1.0
 * @since java 1.8.0
 */
public class Adaptee {


    public AdapteeResponse request(Long id) {
        if (id == 1L) {
            AdapteeResponse adapteeResponse = new AdapteeResponse();
            adapteeResponse.setYourName("佩奇");
            adapteeResponse.setYourSex("女");
            return adapteeResponse;
        } else {
            return null;
        }
    }
}

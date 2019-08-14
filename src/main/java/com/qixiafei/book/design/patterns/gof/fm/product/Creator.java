package com.qixiafei.book.design.patterns.gof.fm.product;

/**
 * <P>Description: . </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   </P>
 * <P>CREATE DATE: 2019/8/14 15:34</P>
 * <P>UPDATE DATE: </P>
 *
 * @author 齐霞飞
 * @version 1.0
 * @since java 1.8.0
 */
public abstract class Creator {


    public void sayProduct() {
        System.out.println(getProduct().getClass().getName());
    }

    protected abstract Product getProduct();

}

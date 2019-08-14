package com.qixiafei.book.design.patterns.gof.decorator.price;

/**
 * <P>Description: . </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   </P>
 * <P>CREATE DATE: 2019/8/14 11:06</P>
 * <P>UPDATE DATE: </P>
 *
 * @author 齐霞飞
 * @version 1.0
 * @since java 1.8.0
 */
public class PackPrice extends PriceDecorator {

    public PackPrice(final IPrice price) {
        super(price);
    }

    @Override
    public double price(final double weight) {
        return price.price(weight) + weight / 5;
    }
}

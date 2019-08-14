package com.qixiafei.book.design.patterns.gof.strategy.count;

/**
 * <P>Description: . </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   </P>
 * <P>CREATE DATE: 2019/8/14 21:26</P>
 * <P>UPDATE DATE: </P>
 *
 * @author 齐霞飞
 * @version 1.0
 * @since java 1.8.0
 */
public class PlusStrategy implements ICalculate {
    @Override
    public int calculate(final int i, final int j) {
        return i + j;
    }
}

package com.qixiafei.book.design.patterns.gof.strategy;

import com.qixiafei.book.design.patterns.gof.strategy.count.ICalculate;
import com.qixiafei.book.design.patterns.gof.strategy.count.PlusStrategy;
import com.qixiafei.book.design.patterns.gof.strategy.count.SubtractStrategy;

/**
 * <P>Description: . </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   </P>
 * <P>CREATE DATE: 2019/8/14 21:27</P>
 * <P>UPDATE DATE: </P>
 *
 * @author 齐霞飞
 * @version 1.0
 * @since java 1.8.0
 */
public class Client {

    public static void main(String[] args) {
        ICalculate calculate = new PlusStrategy();
        int calculate1 = calculate.calculate(1, 2);
        System.out.println(calculate1);
        calculate = new SubtractStrategy();
        int calculate2 = calculate.calculate(1, 2);
        System.out.println(calculate2);
    }
}

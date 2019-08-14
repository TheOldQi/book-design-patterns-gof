package com.qixiafei.book.design.patterns.gof.tm.cook;

/**
 * <P>Description: . </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   </P>
 * <P>CREATE DATE: 2019/8/14 21:37</P>
 * <P>UPDATE DATE: </P>
 *
 * @author 齐霞飞
 * @version 1.0
 * @since java 1.8.0
 */
public class PekingFriedDuck extends CookTemplate {
    @Override
    protected void dishUp() {
        System.out.println("烤鸭端到客人餐桌旁边");
        System.out.println("将烤鸭最肥美的部位片下来摆盘");
    }

    @Override
    protected void cooking() {
        System.out.println("吊在炉子上烤");
    }

    @Override
    protected void prepare() {
        System.out.println("选择最肥的鸭子");
        System.out.println("去毛，洗净");
    }
}

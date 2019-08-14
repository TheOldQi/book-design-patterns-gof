package com.qixiafei.book.design.patterns.gof.tm.cook;

/**
 * <P>Description: . </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   </P>
 * <P>CREATE DATE: 2019/8/14 21:34</P>
 * <P>UPDATE DATE: </P>
 *
 * @author 齐霞飞
 * @version 1.0
 * @since java 1.8.0
 */
public class GongBaoJiDing extends CookTemplate {
    @Override
    protected void dishUp() {
        System.out.println("宫保鸡丁已经端上桌");
    }

    @Override
    protected void cooking() {
        System.out.println("锅里倒油");
        System.out.println("葱花、花椒、大料爆香");
        System.out.println("下鸡丁爆炒");
        System.out.println("下葱段");
    }

    @Override
    protected void prepare() {
        System.out.println("鸡肉切丁");
        System.out.println("葱切段");
        System.out.println("打开一袋酒鬼花生");
        System.out.println("辣椒切碎");
    }
}

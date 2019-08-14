package com.qixiafei.book.design.patterns.gof.decorator;

import com.qixiafei.book.design.patterns.gof.decorator.price.ApplePrice;
import com.qixiafei.book.design.patterns.gof.decorator.price.CutIntoBlockPrice;
import com.qixiafei.book.design.patterns.gof.decorator.price.IPrice;
import com.qixiafei.book.design.patterns.gof.decorator.price.OrangePrice;
import com.qixiafei.book.design.patterns.gof.decorator.price.PackPrice;

/**
 * <P>Description: . </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   </P>
 * <P>CREATE DATE: 2019/8/14 11:09</P>
 * <P>UPDATE DATE: </P>
 *
 * @author 齐霞飞
 * @version 1.0
 * @since java 1.8.0
 */
public class Client {

    public static void main(String[] args) {
        IPrice apple = new ApplePrice();
        System.out.println(apple.price(10));//10斤苹果价格
        apple = new PackPrice(apple); // 打包
        System.out.println(apple.price(10));//10斤苹果打包后价格
        apple = new CutIntoBlockPrice(apple);//切块
        System.out.println(apple.price(10));// 10斤苹果打包并切块的价格

        IPrice orange = new OrangePrice();
        System.out.println(orange.price(10));//10斤橘子价格
        orange = new PackPrice(orange); // 打包
        System.out.println(orange.price(10));//10斤橘子打包后价格
        orange = new CutIntoBlockPrice(orange);//切块
        System.out.println(orange.price(10));// 10斤橘子打包并切块的价格

    }
}

package com.qixiafei.book.design.patterns.gof.bridge.paint;

/**
 * <P>Description: . </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   </P>
 * <P>CREATE DATE: 2019/8/13 11:43</P>
 * <P>UPDATE DATE: </P>
 *
 * @author 齐霞飞
 * @version 1.0
 * @since java 1.8.0
 */
public class SmallPaintBrush extends PaintBrush {
    @Override
    public void info() {
        System.out.println("小号画笔");
        color.color();
    }
}

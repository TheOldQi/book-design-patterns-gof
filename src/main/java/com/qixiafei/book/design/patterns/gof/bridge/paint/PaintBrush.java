package com.qixiafei.book.design.patterns.gof.bridge.paint;

/**
 * <P>Description: 画笔. </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   </P>
 * <P>CREATE DATE: 2019/8/13 11:37</P>
 * <P>UPDATE DATE: </P>
 *
 * @author 齐霞飞
 * @version 1.0
 * @since java 1.8.0
 */
public abstract class PaintBrush {

    protected IColor color;

    public void setColor(final IColor color) {
        this.color = color;
    }

    /**
     * 子类决定实现部分，并可以通过setColor修改抽象部分.
     */
    public abstract void info();

}

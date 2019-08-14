package com.qixiafei.book.design.patterns.gof.bridge;

import com.qixiafei.book.design.patterns.gof.bridge.paint.BigPaintBrush;
import com.qixiafei.book.design.patterns.gof.bridge.paint.Blue;
import com.qixiafei.book.design.patterns.gof.bridge.paint.MediumPaintBrush;
import com.qixiafei.book.design.patterns.gof.bridge.paint.PaintBrush;
import com.qixiafei.book.design.patterns.gof.bridge.paint.Red;
import com.qixiafei.book.design.patterns.gof.bridge.paint.SmallPaintBrush;
import com.qixiafei.book.design.patterns.gof.bridge.paint.Yellow;

/**
 * <P>Description: . </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   </P>
 * <P>CREATE DATE: 2019/8/13 11:46</P>
 * <P>UPDATE DATE: </P>
 *
 * @author 齐霞飞
 * @version 1.0
 * @since java 1.8.0
 */
public class Client {

    public static void main(String[] args) {
        PaintBrush redBigPaint = new BigPaintBrush();
        redBigPaint.setColor(new Red());
        redBigPaint.info();
        PaintBrush blueMediumPaint = new MediumPaintBrush();
        blueMediumPaint.setColor(new Blue());
        blueMediumPaint.info();
        PaintBrush yellowSmallPaint = new SmallPaintBrush();
        yellowSmallPaint.setColor(new Yellow());
        yellowSmallPaint.info();
    }
}

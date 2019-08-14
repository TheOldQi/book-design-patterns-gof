package com.qixiafei.book.design.patterns.gof.interpreter;

import com.qixiafei.book.design.patterns.gof.interpreter.translate.Context;
import com.qixiafei.book.design.patterns.gof.interpreter.translate.Expression;
import com.qixiafei.book.design.patterns.gof.interpreter.translate.TranslateToDongBei;
import com.qixiafei.book.design.patterns.gof.interpreter.translate.TranslateToSiChuan;

/**
 * <P>Description: . </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   </P>
 * <P>CREATE DATE: 2019/8/14 16:15</P>
 * <P>UPDATE DATE: </P>
 *
 * @author 齐霞飞
 * @version 1.0
 * @since java 1.8.0
 */
public class Client {

    public static void main(String[] args) {
        final String words1 = "今天天气不错，空气也好，呼吸起来很舒服，我穿着新买的鞋子走在路肩上，看着周围的风景。哎呀！突然穿出来一个外卖小哥，吓了我一跳，小哥看到我惊慌失措，赶紧停下车跟我说对不起，我说好的好的，没关系。";
        final Context context = new Context(words1);
        final Expression expression = new TranslateToDongBei();
        expression.translate(context);
        System.out.println(context);

        final Expression expression1 = new TranslateToSiChuan();
        expression1.translate(context);
        System.out.println(context);
    }
}

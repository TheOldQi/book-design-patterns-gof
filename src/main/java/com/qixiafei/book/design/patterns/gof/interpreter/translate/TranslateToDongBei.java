package com.qixiafei.book.design.patterns.gof.interpreter.translate;

/**
 * <P>Description: . </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   </P>
 * <P>CREATE DATE: 2019/8/14 16:07</P>
 * <P>UPDATE DATE: </P>
 *
 * @author 齐霞飞
 * @version 1.0
 * @since java 1.8.0
 */
public class TranslateToDongBei implements Expression {

    @Override
    public void translate(final Context context) {
        final String oriWords = context.getOriWords();
        final String translated = oriWords.replace("膝盖", "伯勒盖")
                .replace("破皮", "秃噜皮")
                .replace("路肩", "马路牙子")
                .replace("哎呀", "哎呀妈呀");
        context.getTranslatedWords().put("dongbei", translated);
    }
}

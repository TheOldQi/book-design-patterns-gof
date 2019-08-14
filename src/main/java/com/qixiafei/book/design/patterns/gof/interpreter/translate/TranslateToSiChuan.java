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
public class TranslateToSiChuan implements Expression {
    @Override
    public void translate(final Context context) {
        final String oriWords = context.getOriWords();
        final String translated = oriWords.replace("鞋子", "孩子")
                .replace("舒服", "巴适")
                .replace("好的", "要得，要得");
        context.getTranslatedWords().put("sichuan", translated);

    }
}

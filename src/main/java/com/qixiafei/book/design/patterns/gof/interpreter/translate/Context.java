package com.qixiafei.book.design.patterns.gof.interpreter.translate;

import java.util.HashMap;
import java.util.Map;

/**
 * <P>Description: . </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   </P>
 * <P>CREATE DATE: 2019/8/14 16:06</P>
 * <P>UPDATE DATE: </P>
 *
 * @author 齐霞飞
 * @version 1.0
 * @since java 1.8.0
 */
public class Context {

    private String oriWords;

    private Map<String, String> translatedWords = new HashMap<>();

    public Context(String oriWords) {
        this.oriWords = oriWords;
    }

    public String getOriWords() {
        return oriWords;
    }

    public Map<String, String> getTranslatedWords() {
        return translatedWords;
    }

    @Override
    public String toString() {
        return "Context{" +
                "oriWords='" + oriWords + '\'' +
                ", translatedWords=" + translatedWords +
                '}';
    }
}

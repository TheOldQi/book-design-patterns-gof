package com.qixiafei.book.design.patterns.gof.adapter;

/**
 * <P>Description: . </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   </P>
 * <P>CREATE DATE: 2019/8/13 10:34</P>
 * <P>UPDATE DATE: </P>
 *
 * @author 齐霞飞
 * @version 1.0
 * @since java 1.8.0
 */
public class AdapteeResponse {

    private String yourName;

    private String yourSex;

    public String getYourName() {
        return yourName;
    }

    public void setYourName(final String yourName) {
        this.yourName = yourName;
    }

    public String getYourSex() {
        return yourSex;
    }

    public void setYourSex(final String yourSex) {
        this.yourSex = yourSex;
    }
}

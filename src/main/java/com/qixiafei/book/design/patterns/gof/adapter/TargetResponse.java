package com.qixiafei.book.design.patterns.gof.adapter;

/**
 * <P>Description: . </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   </P>
 * <P>CREATE DATE: 2019/8/13 10:36</P>
 * <P>UPDATE DATE: </P>
 *
 * @author 齐霞飞
 * @version 1.0
 * @since java 1.8.0
 */
public class TargetResponse {

    private String introduction;

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(final String introduction) {
        this.introduction = introduction;
    }

    @Override
    public String toString() {
        return "TargetResponse{" +
                "introduction='" + introduction + '\'' +
                '}';
    }
}

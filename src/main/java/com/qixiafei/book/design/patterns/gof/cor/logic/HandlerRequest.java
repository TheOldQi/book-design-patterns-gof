package com.qixiafei.book.design.patterns.gof.cor.logic;

/**
 * <P>Description: . </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   </P>
 * <P>CREATE DATE: 2019/8/13 17:55</P>
 * <P>UPDATE DATE: </P>
 *
 * @author 齐霞飞
 * @version 1.0
 * @since java 1.8.0
 */
public class HandlerRequest {

    private String json;

    public String getJson() {
        return json;
    }

    public void setJson(final String json) {
        this.json = json;
    }

    @Override
    public String toString() {
        return "HandlerRequest{" +
                "json='" + json + '\'' +
                '}';
    }
}

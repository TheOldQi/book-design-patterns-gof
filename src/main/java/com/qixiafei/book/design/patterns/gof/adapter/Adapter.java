package com.qixiafei.book.design.patterns.gof.adapter;

/**
 * <P>Description: 适配器类. </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   </P>
 * <P>CREATE DATE: 2019/8/13 10:38</P>
 * <P>UPDATE DATE: </P>
 *
 * @author 齐霞飞
 * @version 1.0
 * @since java 1.8.0
 */
public class Adapter implements Target {

    private Adaptee adaptee = new Adaptee();

    public TargetResponse show(int id) {
        AdapteeResponse response = adaptee.request((long) id);
        TargetResponse result = new TargetResponse();
        result.setIntroduction("name:" + response.getYourName() + ",sex:" + response.getYourSex());
        return result;
    }
}

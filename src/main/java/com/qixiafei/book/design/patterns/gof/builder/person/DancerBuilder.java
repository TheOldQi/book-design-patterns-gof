package com.qixiafei.book.design.patterns.gof.builder.person;

/**
 * <P>Description: . </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   </P>
 * <P>CREATE DATE: 2019/8/13 16:58</P>
 * <P>UPDATE DATE: </P>
 *
 * @author 齐霞飞
 * @version 1.0
 * @since java 1.8.0
 */
public class DancerBuilder extends PersonBuilder {

    private Dancer dancer;

    public DancerBuilder(){
        this.dancer = new Dancer();
    }

    @Override
    void buildHead(final String head) {
        dancer.setHead("Dancer's" + head);
    }

    @Override
    void buildBody(final String body) {
        dancer.setBody("Dancer's" + body);
    }

    @Override
    void buildArm(final String arm) {
        dancer.setArm("Dancer's" + arm);
    }

    @Override
    void buildLeg(final String leg) {
        dancer.setLeg("Dancer's" + leg);
    }

    public Dancer getResult() {
        return dancer;
    }
}

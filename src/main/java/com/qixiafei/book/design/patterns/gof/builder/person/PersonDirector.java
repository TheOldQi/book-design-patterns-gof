package com.qixiafei.book.design.patterns.gof.builder.person;

/**
 * <P>Description: . </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   </P>
 * <P>CREATE DATE: 2019/8/13 15:48</P>
 * <P>UPDATE DATE: </P>
 *
 * @author 齐霞飞
 * @version 1.0
 * @since java 1.8.0
 */
public class PersonDirector {

    private PersonBuilder builder;

    public PersonDirector(PersonBuilder builder) {
        this.builder = builder;
    }

    public void setBuilder(PersonBuilder builder) {
        this.builder = builder;
    }

    /**
     * 构建builder.
     */
    public void construct() {
        builder.buildHead("头");
        builder.buildBody("身体");
        builder.buildArm("胳膊");
        builder.buildLeg("腿儿");
    }

}

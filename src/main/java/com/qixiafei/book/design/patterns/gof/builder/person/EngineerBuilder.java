package com.qixiafei.book.design.patterns.gof.builder.person;

/**
 * <P>Description: . </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   </P>
 * <P>CREATE DATE: 2019/8/13 16:24</P>
 * <P>UPDATE DATE: </P>
 *
 * @author 齐霞飞
 * @version 1.0
 * @since java 1.8.0
 */
public class EngineerBuilder extends PersonBuilder {
   private Engineer engineer;

   public EngineerBuilder(){
       engineer = new Engineer();
   }

    @Override
    void buildHead(final String head) {
        engineer.setHead("Engineer's" + head);
    }

    @Override
    void buildBody(final String body) {
        engineer.setBody("Engineer's" + body);
    }

    @Override
    void buildArm(final String arm) {
        engineer.setArm("Engineer's" + arm);
    }

    @Override
    void buildLeg(final String leg) {
        engineer.setLeg("Engineer's" + leg);
    }

    public Engineer getResult() {
        return engineer;
    }
}

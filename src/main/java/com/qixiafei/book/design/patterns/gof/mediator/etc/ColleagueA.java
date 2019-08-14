package com.qixiafei.book.design.patterns.gof.mediator.etc;

/**
 * <P>Description: . </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   </P>
 * <P>CREATE DATE: 2019/8/14 17:40</P>
 * <P>UPDATE DATE: </P>
 *
 * @author 齐霞飞
 * @version 1.0
 * @since java 1.8.0
 */
public class ColleagueA extends Colleague {

    public ColleagueA(final Mediator mediator) {
        super(mediator);
    }

    @Override
    public void operation() {
        System.out.println("colleagueA operation");
        mediator.send(this);
    }

    @Override
    void change() {
        System.out.println("colleagueA be notify");
    }
}

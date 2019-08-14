package com.qixiafei.book.design.patterns.gof.mediator.etc;

/**
 * <P>Description: . </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   </P>
 * <P>CREATE DATE: 2019/8/14 17:39</P>
 * <P>UPDATE DATE: </P>
 *
 * @author 齐霞飞
 * @version 1.0
 * @since java 1.8.0
 */
public class ConcreteMediator extends Mediator {
    @Override
    public void send(final Colleague requestColleague) {
        if (this.colleague1 == requestColleague) {
            this.colleague2.change();
        } else {
            this.colleague1.change();
        }
    }
}

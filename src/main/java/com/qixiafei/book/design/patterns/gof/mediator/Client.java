package com.qixiafei.book.design.patterns.gof.mediator;

import com.qixiafei.book.design.patterns.gof.mediator.etc.Colleague;
import com.qixiafei.book.design.patterns.gof.mediator.etc.ColleagueA;
import com.qixiafei.book.design.patterns.gof.mediator.etc.ColleagueB;
import com.qixiafei.book.design.patterns.gof.mediator.etc.ConcreteMediator;
import com.qixiafei.book.design.patterns.gof.mediator.etc.Mediator;

/**
 * <P>Description: . </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   </P>
 * <P>CREATE DATE: 2019/8/14 17:45</P>
 * <P>UPDATE DATE: </P>
 *
 * @author 齐霞飞
 * @version 1.0
 * @since java 1.8.0
 */
public class Client {

    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();

        Colleague A = new ColleagueA(mediator);
        Colleague B = new ColleagueB(mediator);

        mediator.setColleague1(A);
        mediator.setColleague2(B);

        A.operation();
        B.operation();
    }
}

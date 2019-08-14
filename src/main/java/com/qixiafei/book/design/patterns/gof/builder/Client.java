package com.qixiafei.book.design.patterns.gof.builder;

import com.qixiafei.book.design.patterns.gof.builder.person.Dancer;
import com.qixiafei.book.design.patterns.gof.builder.person.DancerBuilder;
import com.qixiafei.book.design.patterns.gof.builder.person.EngineerBuilder;
import com.qixiafei.book.design.patterns.gof.builder.person.Engineer;
import com.qixiafei.book.design.patterns.gof.builder.person.PersonDirector;

/**
 * <P>Description: . </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   </P>
 * <P>CREATE DATE: 2019/8/13 17:01</P>
 * <P>UPDATE DATE: </P>
 *
 * @author 齐霞飞
 * @version 1.0
 * @since java 1.8.0
 */
public class Client {

    public static void main(String[] args) {
        final EngineerBuilder engineerBuilder = new EngineerBuilder();
        final PersonDirector personDirector = new PersonDirector(engineerBuilder);
        personDirector.construct();
        Engineer engineer = engineerBuilder.getResult();
        System.out.println(engineer);

        final DancerBuilder dancerBuilder = new DancerBuilder();
        personDirector.setBuilder(dancerBuilder);
        personDirector.construct();
        Dancer dancer = dancerBuilder.getResult();
        System.out.println(dancer);

    }
}

package com.qixiafei.book.design.patterns.gof.memento;

/**
 * <P>Description: . </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   </P>
 * <P>CREATE DATE: 2019/8/14 18:12</P>
 * <P>UPDATE DATE: </P>
 *
 * @author 齐霞飞
 * @version 1.0
 * @since java 1.8.0
 */
public class Client {

    public static void main(String[] args) {
        Originator originator = new Originator();
        originator.setName("qixiafei");
        originator.setSex("nan");
        originator.setAge(18);
        Narrow memento = originator.getMemento();

        originator.setAge(50);
        System.out.println(originator);

        originator.setMemento(memento);
        System.out.println(originator);

    }
}

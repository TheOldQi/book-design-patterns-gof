package com.qixiafei.book.design.patterns.gof.af;

import java.util.ArrayList;
import java.util.List;

/**
 * <P>Description: . </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   </P>
 * <P>CREATE DATE: 2019/8/13 10:29</P>
 * <P>UPDATE DATE: </P>
 *
 * @author 齐霞飞
 * @version 1.0
 * @since java 1.8.0
 */
public class Client {

    public static void main(String[] args) {
//        Factory factory = new DogFactory();
//        factory.getFoot();
//        factory.getHand();
//        factory.getHead();
//        factory = new CowFactory();
//        factory.getFoot();
//        factory.getHand();
//        factory.getHead();
//        factory = new BullFactory();
//        factory.getFoot();
//        factory.getHand();
//        factory.getHead();
//        factory = new HorseFactory();
//        factory.getFoot();
//        factory.getHand();
//        factory.getHead();
        final List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        List<Integer> integers = list.subList(0, 9);
        System.out.println(integers);

    }
}

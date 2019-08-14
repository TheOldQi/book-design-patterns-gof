package com.qixiafei.book.design.patterns.gof.af;

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
        final Factory dog = new DogFactory();
        dog.getFoot();
        dog.getHand();
        dog.getHead();
        final Factory cow = new CowFactory();
        cow.getFoot();
        cow.getHand();
        cow.getHead();
        final Factory bull = new BullFactory();
        bull.getFoot();
        bull.getHand();
        bull.getHead();
        final Factory horse = new HorseFactory();
        horse.getFoot();
        horse.getHand();
        horse.getHead();


    }
}

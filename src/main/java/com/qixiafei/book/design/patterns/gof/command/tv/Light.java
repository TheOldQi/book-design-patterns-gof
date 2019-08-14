package com.qixiafei.book.design.patterns.gof.command.tv;

/**
 * <P>Description: . </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   </P>
 * <P>CREATE DATE: 2019/8/13 21:49</P>
 * <P>UPDATE DATE: </P>
 *
 * @author 齐霞飞
 * @version 1.0
 * @since java 1.8.0
 */
public class Light {

    private int state = 0;

    public void turnOnTheLight() {
        if (state == 0) {
            state = 1;
            System.out.println("Light is on");
        }
    }

    public void turnOffTheLight() {
        if (state == 1) {
            state = 0;
            System.out.println("Light is off");

        }
    }

    public void change() {
        if (state == 1) {
            state = 0;
            System.out.println("Light is off");

        } else {
            state = 1;
            System.out.println("Light is on");

        }
    }
}

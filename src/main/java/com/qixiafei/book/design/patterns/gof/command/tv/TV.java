package com.qixiafei.book.design.patterns.gof.command.tv;

/**
 * <P>Description: receiver. </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   </P>
 * <P>CREATE DATE: 2019/8/13 21:48</P>
 * <P>UPDATE DATE: </P>
 *
 * @author 齐霞飞
 * @version 1.0
 * @since java 1.8.0
 */
public class TV {

    private int channel = 1;

    public void on() {
        System.out.println("TV is On");
    }

    public void off() {
        System.out.println("TV is off");
    }

    public void addChannel() {
        System.out.println("Now channel is :" + channel++);
    }
}

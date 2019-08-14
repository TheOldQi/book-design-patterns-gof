package com.qixiafei.book.design.patterns.gof.command.tv;

/**
 * <P>Description: . </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   </P>
 * <P>CREATE DATE: 2019/8/13 21:55</P>
 * <P>UPDATE DATE: </P>
 *
 * @author 齐霞飞
 * @version 1.0
 * @since java 1.8.0
 */
public class Invoker {

    private Command onCommand;
    private Command offCommand;
    private Command changeCommand;

    public void setOnCommand(final Command onCommand) {
        this.onCommand = onCommand;
    }

    public void setOffCommand(final Command offCommand) {
        this.offCommand = offCommand;
    }

    public void setChangeCommand(final Command changeCommand) {
        this.changeCommand = changeCommand;
    }

    public Invoker(final Command onCommand, final Command offCommand, final Command changeCommand) {
        this.onCommand = onCommand;
        this.offCommand = offCommand;
        this.changeCommand = changeCommand;

    }

    public void turnOn() {
        onCommand.execute();
    }

    public void turnOff() {
        offCommand.execute();
    }

    public void change() {
        changeCommand.execute();
    }
}

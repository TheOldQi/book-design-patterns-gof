package com.qixiafei.book.design.patterns.gof.command.tv;

/**
 * <P>Description: . </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   </P>
 * <P>CREATE DATE: 2019/8/13 21:52</P>
 * <P>UPDATE DATE: </P>
 *
 * @author 齐霞飞
 * @version 1.0
 * @since java 1.8.0
 */
public class ChangeTvCommand implements Command {

    private TV tv;

    public ChangeTvCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.addChannel();
    }
}

package com.qixiafei.book.design.patterns.gof.command;

import com.qixiafei.book.design.patterns.gof.command.tv.ChangeLightCommand;
import com.qixiafei.book.design.patterns.gof.command.tv.ChangeTvCommand;
import com.qixiafei.book.design.patterns.gof.command.tv.Invoker;
import com.qixiafei.book.design.patterns.gof.command.tv.Light;
import com.qixiafei.book.design.patterns.gof.command.tv.TV;
import com.qixiafei.book.design.patterns.gof.command.tv.TurnOffLightCommand;
import com.qixiafei.book.design.patterns.gof.command.tv.TurnOffTvCommand;
import com.qixiafei.book.design.patterns.gof.command.tv.TurnOnLightCommand;
import com.qixiafei.book.design.patterns.gof.command.tv.TurnOnTvCommand;

/**
 * <P>Description: . </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   </P>
 * <P>CREATE DATE: 2019/8/13 21:56</P>
 * <P>UPDATE DATE: </P>
 *
 * @author 齐霞飞
 * @version 1.0
 * @since java 1.8.0
 */
public class Client {

    public static void main(String[] args) {

        TV tv = new TV();
        Invoker invoker = new Invoker(new TurnOnTvCommand(tv), new TurnOffTvCommand(tv), new ChangeTvCommand(tv));

        invoker.turnOn();
        invoker.turnOff();
        invoker.change();

        Light light = new Light();
        invoker.setOnCommand(new TurnOnLightCommand(light));
        invoker.setOffCommand(new TurnOffLightCommand(light));
        invoker.setChangeCommand(new ChangeLightCommand(light));

        invoker.turnOn();
        invoker.turnOff();
        invoker.change();

    }
}

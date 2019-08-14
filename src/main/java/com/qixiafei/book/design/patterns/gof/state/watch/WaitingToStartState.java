package com.qixiafei.book.design.patterns.gof.state.watch;

/**
 * <P>Description: . </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   </P>
 * <P>CREATE DATE: 2019/8/14 21:03</P>
 * <P>UPDATE DATE: </P>
 *
 * @author 齐霞飞
 * @version 1.0
 * @since java 1.8.0
 */
public class WaitingToStartState implements State {

    private WatchContext context;

    public WaitingToStartState(WatchContext context) {
        this.context = context;
    }

    @Override
    public void start() {
        System.out.println("开始计时");
        context.setCurrentState(context.workingState);
    }

    @Override
    public void suspend() {
        System.out.println("还未启动，不允许暂停");
    }

    @Override
    public void goOn() {
        System.out.println("还未启动，不允许继续");
    }

    @Override
    public void stop() {
        System.out.println("还未启动，不允许停止");
    }
}

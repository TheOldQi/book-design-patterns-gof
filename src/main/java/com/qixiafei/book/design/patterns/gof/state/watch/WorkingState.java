package com.qixiafei.book.design.patterns.gof.state.watch;

/**
 * <P>Description: . </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   </P>
 * <P>CREATE DATE: 2019/8/14 21:10</P>
 * <P>UPDATE DATE: </P>
 *
 * @author 齐霞飞
 * @version 1.0
 * @since java 1.8.0
 */
public class WorkingState implements State {

    private WatchContext context;

    public WorkingState(WatchContext context) {
        this.context = context;
    }

    @Override
    public void start() {
        System.out.println("当前为运行状态，不允许重复启动");
    }

    @Override
    public void suspend() {
        System.out.println("已暂停");
        this.context.setCurrentState(context.suspendedState);
    }

    @Override
    public void goOn() {
        System.out.println("当前为运行状态，不允许继续");
    }

    @Override
    public void stop() {
        System.out.println("已停止");
        this.context.setCurrentState(context.finalState);
    }
}

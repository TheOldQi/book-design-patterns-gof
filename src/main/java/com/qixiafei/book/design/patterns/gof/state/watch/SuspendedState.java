package com.qixiafei.book.design.patterns.gof.state.watch;

/**
 * <P>Description: . </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   </P>
 * <P>CREATE DATE: 2019/8/14 21:12</P>
 * <P>UPDATE DATE: </P>
 *
 * @author 齐霞飞
 * @version 1.0
 * @since java 1.8.0
 */
public class SuspendedState implements State {

    private WatchContext context;

    public SuspendedState(WatchContext watchContext) {
        this.context = watchContext;
    }

    @Override
    public void start() {
        System.out.println("当前为暂停状态，不允许重新开始");
    }

    @Override
    public void suspend() {
        System.out.println("当前为暂停状态，不允许重复暂停");
    }

    @Override
    public void goOn() {
        System.out.println("已继续");
        this.context.setCurrentState(context.workingState);
    }

    @Override
    public void stop() {
        System.out.println("已停止");
        this.context.setCurrentState(context.finalState);
    }
}

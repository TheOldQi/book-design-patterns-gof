package com.qixiafei.book.design.patterns.gof.state.watch;

/**
 * <P>Description: . </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   </P>
 * <P>CREATE DATE: 2019/8/14 21:06</P>
 * <P>UPDATE DATE: </P>
 *
 * @author 齐霞飞
 * @version 1.0
 * @since java 1.8.0
 */
public class WatchContext {

    protected State waitingToStartState;
    protected State workingState;
    protected State suspendedState;
    protected State finalState;

    private State currentState;

    public WatchContext() {
        this.waitingToStartState = new WaitingToStartState(this);
        this.workingState = new WorkingState(this);
        this.suspendedState = new SuspendedState(this);
        this.finalState = new FinalState(this);
        this.currentState = waitingToStartState;
    }

    public void setCurrentState(final State currentState) {
        this.currentState = currentState;
    }

    public void start() {
        currentState.start();
    }

    public void suspend() {
        currentState.suspend();
    }

    public void goOn() {
        currentState.goOn();
    }

    public void stop() {
        currentState.stop();
    }
}

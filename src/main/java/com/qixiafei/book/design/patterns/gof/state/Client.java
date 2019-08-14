package com.qixiafei.book.design.patterns.gof.state;

import com.qixiafei.book.design.patterns.gof.state.watch.WatchContext;

/**
 * <P>Description: . </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   </P>
 * <P>CREATE DATE: 2019/8/14 21:21</P>
 * <P>UPDATE DATE: </P>
 *
 * @author 齐霞飞
 * @version 1.0
 * @since java 1.8.0
 */
public class Client {

    public static void main(String[] args) {

        final WatchContext watchContext = new WatchContext();
        watchContext.goOn();
        watchContext.stop();
        watchContext.suspend();
        watchContext.start();
        watchContext.goOn();
        watchContext.suspend();

        watchContext.goOn();
        watchContext.suspend();
        watchContext.stop();
        watchContext.goOn();
        watchContext.suspend();

        watchContext.goOn();
        watchContext.suspend();
        watchContext.start();

    }
}

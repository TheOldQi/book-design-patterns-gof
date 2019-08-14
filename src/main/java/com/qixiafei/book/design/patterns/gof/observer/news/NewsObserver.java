package com.qixiafei.book.design.patterns.gof.observer.news;

/**
 * <P>Description: . </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   </P>
 * <P>CREATE DATE: 2019/8/14 20:32</P>
 * <P>UPDATE DATE: </P>
 *
 * @author 齐霞飞
 * @version 1.0
 * @since java 1.8.0
 */
public class NewsObserver implements Observer {

    private Subject subject;
    private final String name;

    public NewsObserver(Subject subject, final String name) {
        this.subject = subject;
        this.name = name;
    }

    public void subscribeNews() {
        this.subject.registerObserver(this);
    }

    public void stopSubscribeNews() {
        this.subject.removeObserver(this);
    }

    @Override
    public void update(final Subject subject, final Object arg) {
        System.out.println(name + ":" + arg);
    }


}

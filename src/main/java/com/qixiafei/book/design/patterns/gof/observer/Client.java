package com.qixiafei.book.design.patterns.gof.observer;

import com.qixiafei.book.design.patterns.gof.observer.news.NewsObserver;
import com.qixiafei.book.design.patterns.gof.observer.news.NewsSubject;
import com.qixiafei.book.design.patterns.gof.observer.news.Observer;

/**
 * <P>Description: . </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   </P>
 * <P>CREATE DATE: 2019/8/14 20:40</P>
 * <P>UPDATE DATE: </P>
 *
 * @author 齐霞飞
 * @version 1.0
 * @since java 1.8.0
 */
public class Client {

    public static void main(String[] args) {
        NewsSubject subject = new NewsSubject();

        Observer ob1 = new NewsObserver(subject, "ob1");
        Observer ob2 = new NewsObserver(subject, "ob2");
        Observer ob3 = new NewsObserver(subject, "ob3");

        ob1.subscribeNews();
        ob2.subscribeNews();
        ob3.subscribeNews();

        subject.updateNews("北京即将工资上涨");

        ob2.stopSubscribeNews();

        subject.updateNews("在收听的人都长命百岁");
    }
}

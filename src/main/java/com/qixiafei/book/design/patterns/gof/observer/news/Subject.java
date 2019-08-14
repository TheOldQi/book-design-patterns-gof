package com.qixiafei.book.design.patterns.gof.observer.news;

/**
 * <P>Description: . </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   </P>
 * <P>CREATE DATE: 2019/8/14 20:19</P>
 * <P>UPDATE DATE: </P>
 *
 * @author 齐霞飞
 * @version 1.0
 * @since java 1.8.0
 */
public interface Subject {

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);
    void notifyObservers(String news);
}

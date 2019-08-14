package com.qixiafei.book.design.patterns.gof.observer.news;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * <P>Description: . </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   </P>
 * <P>CREATE DATE: 2019/8/14 20:22</P>
 * <P>UPDATE DATE: </P>
 *
 * @author 齐霞飞
 * @version 1.0
 * @since java 1.8.0
 */
public class NewsSubject implements Subject {

    private final Map<Integer, Observer> observers = new LinkedHashMap<>();

    public void updateNews(String news) {
        notifyObservers(news);
    }

    @Override
    public void registerObserver(final Observer observer) {
        int memoryLocation = System.identityHashCode(observer);
        observers.put(memoryLocation, observer);
    }

    @Override
    public void removeObserver(final Observer observer) {
        int memoryLocation = System.identityHashCode(observer);
        observers.remove(memoryLocation);
    }

    @Override
    public void notifyObservers(String news) {
        for (Map.Entry<Integer, Observer> entry : observers.entrySet()) {
            Observer value = entry.getValue();
            value.update(this, news);
        }
    }
}

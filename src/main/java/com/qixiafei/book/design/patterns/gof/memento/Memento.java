package com.qixiafei.book.design.patterns.gof.memento;

/**
 * <P>Description: . </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   </P>
 * <P>CREATE DATE: 2019/8/14 17:52</P>
 * <P>UPDATE DATE: </P>
 *
 * @author 齐霞飞
 * @version 1.0
 * @since java 1.8.0
 */
public class Memento implements Narrow, IMemento {

    private String name;
    private String sex;
    private int age;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(final String name) {
        this.name = name;
    }

    @Override
    public String getSex() {
        return sex;
    }

    @Override
    public void setSex(final String sex) {
        this.sex = sex;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setAge(final int age) {
        this.age = age;
    }
}

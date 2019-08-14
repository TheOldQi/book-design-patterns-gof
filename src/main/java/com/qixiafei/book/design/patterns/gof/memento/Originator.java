package com.qixiafei.book.design.patterns.gof.memento;

/**
 * <P>Description: . </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   </P>
 * <P>CREATE DATE: 2019/8/14 17:54</P>
 * <P>UPDATE DATE: </P>
 *
 * @author 齐霞飞
 * @version 1.0
 * @since java 1.8.0
 */
public class Originator {


    private String name;
    private String sex;
    private int age;
    private int step = 2;

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(final String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(final int age) {
        this.age = age;
    }

    public int getStep() {
        return step;
    }

    public void setStep(final int step) {
        this.step = step;
    }

    public Narrow getMemento() {
        IMemento iMemento = new Memento();
        iMemento.setName(name);
        iMemento.setSex(sex);
        iMemento.setAge(age);
        return (Narrow) iMemento;
    }

    public void setMemento(Narrow memento) {
        IMemento memento1 = (IMemento) memento;
        this.name = memento1.getName();
        this.sex = memento1.getSex();
        this.age = memento1.getAge();
    }

    @Override
    public String toString() {
        return "Originator{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", step=" + step +
                '}';
    }
}

package com.qixiafei.book.design.patterns.gof.builder.person;

/**
 * <P>Description: . </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   </P>
 * <P>CREATE DATE: 2019/8/13 15:49</P>
 * <P>UPDATE DATE: </P>
 *
 * @author 齐霞飞
 * @version 1.0
 * @since java 1.8.0
 */
public class Engineer {

    private String head;
    private String body;
    private String arm;
    private String leg;

    public String getHead() {
        return head;
    }

    public void setHead(final String head) {
        this.head = head;
    }

    public String getBody() {
        return body;
    }

    public void setBody(final String body) {
        this.body = body;
    }

    public String getArm() {
        return arm;
    }

    public void setArm(final String arm) {
        this.arm = arm;
    }

    public String getLeg() {
        return leg;
    }

    public void setLeg(final String leg) {
        this.leg = leg;
    }

    @Override
    public String toString() {
        return "Person{" +
                "head='" + head + '\'' +
                ", body='" + body + '\'' +
                ", arm='" + arm + '\'' +
                ", leg='" + leg + '\'' +
                '}';
    }
}

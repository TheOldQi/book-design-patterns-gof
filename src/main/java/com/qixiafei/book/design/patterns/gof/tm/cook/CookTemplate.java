package com.qixiafei.book.design.patterns.gof.tm.cook;

/**
 * <P>Description: . </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   </P>
 * <P>CREATE DATE: 2019/8/14 21:31</P>
 * <P>UPDATE DATE: </P>
 *
 * @author 齐霞飞
 * @version 1.0
 * @since java 1.8.0
 */
public abstract class CookTemplate {

    public void cook() {
        prepare();
        cooking();
        dishUp();
    }

    protected abstract void dishUp();

    protected abstract void cooking();

    protected abstract void prepare();
}

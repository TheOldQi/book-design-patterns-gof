package com.qixiafei.book.design.patterns.gof.adapter;

/**
 * <P>Description: 客户希望的接口. </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   </P>
 * <P>CREATE DATE: 2019/8/13 10:35</P>
 * <P>UPDATE DATE: </P>
 *
 * @author 齐霞飞
 * @version 1.0
 * @since java 1.8.0
 */
public interface Target {


    TargetResponse show(int id);
}

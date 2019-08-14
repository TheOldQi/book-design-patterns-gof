package com.qixiafei.book.design.patterns.gof.fm;

import com.qixiafei.book.design.patterns.gof.fm.product.Creator;
import com.qixiafei.book.design.patterns.gof.fm.product.ProductACreator;

/**
 * <P>Description: . </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   </P>
 * <P>CREATE DATE: 2019/8/14 15:36</P>
 * <P>UPDATE DATE: </P>
 *
 * @author 齐霞飞
 * @version 1.0
 * @since java 1.8.0
 */
public class Client {

    public static void main(String[] args) {

        Creator creator = new ProductACreator();
        creator.sayProduct();
    }
}

package com.qixiafei.book.design.patterns.gof.flyweight;

import com.qixiafei.book.design.patterns.gof.flyweight.role.Role;
import com.qixiafei.book.design.patterns.gof.flyweight.role.RoleFactory;

/**
 * <P>Description: . </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   </P>
 * <P>CREATE DATE: 2019/8/14 15:58</P>
 * <P>UPDATE DATE: </P>
 *
 * @author 齐霞飞
 * @version 1.0
 * @since java 1.8.0
 */
public class Client {

    public static void main(String[] args) {
        final RoleFactory roleFactory = new RoleFactory();
        Role role = roleFactory.getRole(RoleFactory.Type.FEMALE);
        
    }
}

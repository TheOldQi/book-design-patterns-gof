package com.qixiafei.book.design.patterns.gof.flyweight.role;

import java.util.HashMap;
import java.util.Map;

/**
 * <P>Description: . </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   </P>
 * <P>CREATE DATE: 2019/8/14 15:39</P>
 * <P>UPDATE DATE: </P>
 *
 * @author 齐霞飞
 * @version 1.0
 * @since java 1.8.0
 */
public class RoleFactory {

    private Map<Type, Role> datas = new HashMap<>();

   public enum Type {
        MALE, FEMALE, CHILDREN, OLD
    }

    public RoleFactory() {
        datas.put(Type.MALE, new Male());
        datas.put(Type.FEMALE, new FeMale());
        datas.put(Type.CHILDREN, new Children());
        datas.put(Type.OLD, new Old());
    }

    public Role getRole(Type type) {
        Role role = datas.get(type);
        if (role == null) {
            return new NonShardRole();
        }
        return role;
    }

}

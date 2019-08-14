package com.qixiafei.book.design.patterns.gof.cor.builder;

import com.qixiafei.book.design.patterns.gof.cor.logic.Handler;
import com.qixiafei.book.design.patterns.gof.cor.logic.LowerCaseHandler;
import com.qixiafei.book.design.patterns.gof.cor.logic.OutPutContentHandler;
import com.qixiafei.book.design.patterns.gof.cor.logic.OutPutLengthHandler;

/**
 * <P>Description: . </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   </P>
 * <P>CREATE DATE: 2019/8/13 18:09</P>
 * <P>UPDATE DATE: </P>
 *
 * @author 齐霞飞
 * @version 1.0
 * @since java 1.8.0
 */
public class OutPutAndLowerCaseHandlerCreator implements HandlerCreator {
    @Override
    public Handler buildHandler() {
        return new OutPutContentHandler(new OutPutLengthHandler(new LowerCaseHandler()));
    }
}

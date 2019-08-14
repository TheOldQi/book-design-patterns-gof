package com.qixiafei.book.design.patterns.gof.cor;

import com.qixiafei.book.design.patterns.gof.cor.builder.HandlerCreator;
import com.qixiafei.book.design.patterns.gof.cor.builder.OutPutAndLowerCaseHandlerCreator;
import com.qixiafei.book.design.patterns.gof.cor.builder.OutPutOnlyHandlerCreator;
import com.qixiafei.book.design.patterns.gof.cor.logic.Handler;
import com.qixiafei.book.design.patterns.gof.cor.logic.HandlerRequest;
import com.qixiafei.book.design.patterns.gof.cor.logic.HandlerResponse;

/**
 * <P>Description: . </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   </P>
 * <P>CREATE DATE: 2019/8/13 18:10</P>
 * <P>UPDATE DATE: </P>
 *
 * @author 齐霞飞
 * @version 1.0
 * @since java 1.8.0
 */
public class Client {

    public static void main(String[] args) {
        final String json = "Hello World!";
        final HandlerRequest request = new HandlerRequest();
        request.setJson(json);

        final HandlerCreator outputOnlyCreator = new OutPutOnlyHandlerCreator();
        Handler handler = outputOnlyCreator.buildHandler();
        HandlerResponse handlerResponse = handler.handleRequest(request);
        System.out.println("response:"+handlerResponse);

        final HandlerCreator creator2  = new OutPutAndLowerCaseHandlerCreator();
        Handler handler1 = creator2.buildHandler();
        request.setJson(json);
        HandlerResponse handlerResponse1 = handler1.handleRequest(request);
        System.out.println("response:"+handlerResponse1);

    }
}

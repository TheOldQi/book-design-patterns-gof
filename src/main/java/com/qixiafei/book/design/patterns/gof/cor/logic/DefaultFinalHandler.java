package com.qixiafei.book.design.patterns.gof.cor.logic;

/**
 * <P>Description: . </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   </P>
 * <P>CREATE DATE: 2019/8/13 18:01</P>
 * <P>UPDATE DATE: </P>
 *
 * @author 齐霞飞
 * @version 1.0
 * @since java 1.8.0
 */
public class DefaultFinalHandler implements Handler {

    private static final DefaultFinalHandler SINGLETON = new DefaultFinalHandler();

    public static DefaultFinalHandler getSingleton() {
        return SINGLETON;
    }

    private DefaultFinalHandler() {

    }

    @Override
    public HandlerResponse handleRequest(final HandlerRequest request) {
        HandlerResponse response = new HandlerResponse();
        response.setJson(request.getJson());
        return response;
    }
}

package com.qixiafei.book.design.patterns.gof.cor.logic;

/**
 * <P>Description: . </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   </P>
 * <P>CREATE DATE: 2019/8/13 18:04</P>
 * <P>UPDATE DATE: </P>
 *
 * @author 齐霞飞
 * @version 1.0
 * @since java 1.8.0
 */
public class LowerCaseHandler implements Handler {

    private Handler successor = DefaultFinalHandler.getSingleton();

    public LowerCaseHandler() {

    }

    public LowerCaseHandler(Handler successor) {
        this.successor = successor;
    }

    @Override
    public HandlerResponse handleRequest(final HandlerRequest request) {

        request.setJson(request.getJson().toLowerCase());
        return successor.handleRequest(request);
    }
}

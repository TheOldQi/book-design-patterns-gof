package com.qixiafei.book.design.patterns.gof.cor.logic;

/**
 * <P>Description: . </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   </P>
 * <P>CREATE DATE: 2019/8/13 18:00</P>
 * <P>UPDATE DATE: </P>
 *
 * @author 齐霞飞
 * @version 1.0
 * @since java 1.8.0
 */
public class OutPutContentHandler implements Handler {

    private Handler successor = DefaultFinalHandler.getSingleton();

    public OutPutContentHandler() {
    }

    public OutPutContentHandler(Handler successor) {
        this.successor = successor;
    }

    @Override
    public HandlerResponse handleRequest(final HandlerRequest request) {
        System.out.println("content is :" + request);
        return successor.handleRequest(request);
    }
}

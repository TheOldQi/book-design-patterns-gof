package com.qixiafei.book.design.patterns.gof.cor.logic;

/**
 * <P>Description: . </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   </P>
 * <P>CREATE DATE: 2019/8/13 17:57</P>
 * <P>UPDATE DATE: </P>
 *
 * @author 齐霞飞
 * @version 1.0
 * @since java 1.8.0
 */
public class OutPutLengthHandler implements Handler {

    private Handler successor = null;

    public OutPutLengthHandler() {

    }

    public OutPutLengthHandler(Handler successor) {
        this.successor = successor;
    }

    @Override
    public HandlerResponse handleRequest(final HandlerRequest request) {

        System.out.println("request json length:" + request.getJson().length());
        if (successor == null) {
            HandlerResponse response = new HandlerResponse();
            response.setJson(request.getJson());
            return response;
        }
        return successor.handleRequest(request);
    }
}

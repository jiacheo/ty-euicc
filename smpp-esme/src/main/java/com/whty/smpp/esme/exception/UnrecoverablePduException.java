package com.whty.smpp.esme.exception;
/**
 * @ClassName UnrecoverablePduException
 * @author Administrator
 * @date 2017-1-23 下午3:23:32
 * @Description TODO(这里用一句话描述这个类的作用)
 */
public class UnrecoverablePduException extends Exception {
    static final long serialVersionUID = 1L;
    
    public UnrecoverablePduException(String msg) {
        super(msg);
    }

    public UnrecoverablePduException(String msg, Throwable t) {
        super(msg, t);
    }
}
package com.whty.smpp.esme.exception;
/**
 * @ClassName TlvConvertException
 * @author Administrator
 * @date 2017-1-23 下午3:23:32
 * @Description TODO(这里用一句话描述这个类的作用)
 */
public class TlvConvertException extends RecoverablePduException {
    static final long serialVersionUID = 1L;
    
    public TlvConvertException(String msg) {
        super(msg);
    }

    public TlvConvertException(String typeName, String extraMsg) {
        super("Unable to cast TLV value into " + typeName + ": " + extraMsg);
    }

    public TlvConvertException(String msg, Throwable t) {
        super(msg, t);
    }
}
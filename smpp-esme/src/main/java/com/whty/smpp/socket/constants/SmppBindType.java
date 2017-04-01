package com.whty.smpp.socket.constants;

import org.apache.commons.lang3.StringUtils;
/**
 * 
 * @ClassName SmppBindType
 * @author Administrator
 * @date 2017-3-10 下午1:48:07
 * @Description TODO(这里用一句话描述这个类的作用)
 */
public enum SmppBindType {

    TRANSCEIVER,
    TRANSMITTER,
    RECEIVER;
    
    public static SmppBindType getBindType(String bindType) {
    	SmppBindType type = null;
    	if (StringUtils.equals(bindType, "transceiver")) {
    		type = SmppBindType.TRANSCEIVER;
    	} else if (StringUtils.equals(bindType, "transmitter")) {
    		type = SmppBindType.TRANSMITTER;
    	} else if (StringUtils.equals(bindType, "receiver")) {
    		type = SmppBindType.RECEIVER;
    	} else {
    		type = SmppBindType.TRANSCEIVER;
    	}
    	return type;
    }
}

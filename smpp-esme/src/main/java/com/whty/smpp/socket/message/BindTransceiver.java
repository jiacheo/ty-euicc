package com.whty.smpp.socket.message;

import com.whty.smpp.socket.constants.SmppConstants;
/**
 * 
 * @ClassName BindTransceiver
 * @author Administrator
 * @date 2017-3-10 下午1:47:13
 * @Description TODO(这里用一句话描述这个类的作用)
 */
public class BindTransceiver extends BaseBind<BindTransceiverResp> {

    public BindTransceiver() {
        super(SmppConstants.CMD_ID_BIND_TRANSCEIVER, "bind_transceiver");
    }

    @Override
    public BindTransceiverResp createResponse() {
        BindTransceiverResp resp = new BindTransceiverResp();
        resp.setSequenceNumber(this.getSequenceNumber());
        return resp;
    }

    @Override
    public Class<BindTransceiverResp> getResponseClass() {
        return BindTransceiverResp.class;
    }
    
}
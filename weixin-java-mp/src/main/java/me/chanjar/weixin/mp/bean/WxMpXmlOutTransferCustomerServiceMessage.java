package me.chanjar.weixin.mp.bean;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;
import me.chanjar.weixin.common.api.WxConsts;
import me.chanjar.weixin.common.util.xml.XStreamCDataConverter;

/**
 * Created by lujian on 2015/7/5.
 */
@XStreamAlias("xml")
public class WxMpXmlOutTransferCustomerServiceMessage extends WxMpXmlOutMessage {

    @XStreamAlias("TransInfo")
    protected final TransInfo transInfo = new TransInfo();

    public WxMpXmlOutTransferCustomerServiceMessage() {
        this.msgType = WxConsts.XML_TRANSFER_CUSTOMER_SERVICE;
    }
    public String getKfAccount() {
        return transInfo.getKfAccount();
    }

    public void setKfAccount(String kfAccount) {
        transInfo.setKfAccount(kfAccount);
    }

    @XStreamAlias("TransInfo")
    public static class TransInfo {

        @XStreamAlias("KfAccount")
        @XStreamConverter(value = XStreamCDataConverter.class)
        private String kfAccount;

        public String getKfAccount() {
            return kfAccount;
        }

        public void setKfAccount(String kfAccount) {
            this.kfAccount = kfAccount;
        }
    }
}

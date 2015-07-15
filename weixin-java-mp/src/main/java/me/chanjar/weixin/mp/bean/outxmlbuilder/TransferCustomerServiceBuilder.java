package me.chanjar.weixin.mp.bean.outxmlbuilder;
import me.chanjar.weixin.mp.bean.WxMpXmlOutTransferCustomerServiceMessage;

/**
 * Created by lujian on 2015/7/5.
 */
public class TransferCustomerServiceBuilder extends BaseBuilder<TransferCustomerServiceBuilder, WxMpXmlOutTransferCustomerServiceMessage> {
    private String kfAccount;

    public TransferCustomerServiceBuilder kfAccount(String kfAccount) {
        this.kfAccount = kfAccount;
        return this;
    }

    public WxMpXmlOutTransferCustomerServiceMessage build() {
        WxMpXmlOutTransferCustomerServiceMessage m = new WxMpXmlOutTransferCustomerServiceMessage();
        setCommon(m);
        m.setKfAccount(this.kfAccount);
        return m;
    }
}

package me.chanjar.weixin.mp.bean.outxmlbuilder;
import me.chanjar.weixin.mp.bean.WxXmlOutTransferCustomerServiceMessage;

/**
 * Created by lujian on 2015/7/5.
 */
public class TransferCustomerServiceBuilder extends BaseBuilder<TransferCustomerServiceBuilder, WxXmlOutTransferCustomerServiceMessage> {
    private String kfAccount;

    public TransferCustomerServiceBuilder kfAccount(String kfAccount) {
        this.kfAccount = kfAccount;
        return this;
    }

    public WxXmlOutTransferCustomerServiceMessage build() {
        WxXmlOutTransferCustomerServiceMessage m = new WxXmlOutTransferCustomerServiceMessage();
        setCommon(m);
        m.setKfAccount(this.kfAccount);
        return m;
    }
}

package me.chanjar.weixin.mp.bean;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;
import me.chanjar.weixin.common.util.xml.XStreamCDataConverter;
import me.chanjar.weixin.mp.util.xml.XStreamTransformer;

import java.io.Serializable;

/**
 * @author lujian
 * @date 15/7/9.
 */
@XStreamAlias("xml")
public class WxMpPayOrderQuery implements Serializable {

    @XStreamAlias("appid")
    @XStreamConverter(value=XStreamCDataConverter.class)
    private String appid;

    @XStreamAlias("mch_id")
    @XStreamConverter(value=XStreamCDataConverter.class)
    private String mchId;

    @XStreamAlias("transaction_id")
    @XStreamConverter(value=XStreamCDataConverter.class)
    private String transactionId;

    @XStreamAlias("out_trade_no")
    @XStreamConverter(value=XStreamCDataConverter.class)
    private String outTradeNo;


    @XStreamAlias("nonce_str")
    @XStreamConverter(value=XStreamCDataConverter.class)
    private String nonceStr;

    @XStreamAlias("sign")
    @XStreamConverter(value=XStreamCDataConverter.class)
    private String sign;

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public String getMchId() {
        return mchId;
    }

    public void setMchId(String mchId) {
        this.mchId = mchId;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getOutTradeNo() {
        return outTradeNo;
    }

    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
    }

    public String getNonceStr() {
        return nonceStr;
    }

    public void setNonceStr(String nonceStr) {
        this.nonceStr = nonceStr;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String toXml() {
        return XStreamTransformer.toXml((Class) this.getClass(), this);
    }
}

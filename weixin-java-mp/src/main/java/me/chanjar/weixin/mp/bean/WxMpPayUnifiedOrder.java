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
public class WxMpPayUnifiedOrder implements Serializable {


    @XStreamAlias("appid")
    @XStreamConverter(value=XStreamCDataConverter.class)
    private String appid;

    @XStreamAlias("mch_id")
    @XStreamConverter(value=XStreamCDataConverter.class)
    private String mchId;

    @XStreamAlias("device_info")
    @XStreamConverter(value=XStreamCDataConverter.class)
    private String deviceInfo;

    @XStreamAlias("nonce_str")
    @XStreamConverter(value=XStreamCDataConverter.class)
    private String nonceStr;

    @XStreamAlias("sign")
    @XStreamConverter(value=XStreamCDataConverter.class)
    private String sign;

    @XStreamAlias("body")
    @XStreamConverter(value=XStreamCDataConverter.class)
    private String body;

    @XStreamAlias("out_trade_no")
    @XStreamConverter(value=XStreamCDataConverter.class)
    private String outTradeNo;

    @XStreamAlias("total_fee")
    private int totalFee;

    @XStreamAlias("trade_type")
    @XStreamConverter(value=XStreamCDataConverter.class)
    private String tradeType;

    @XStreamAlias("spbill_create_ip")
    @XStreamConverter(value=XStreamCDataConverter.class)
    private String spbillCreateIp;

    @XStreamAlias("notify_url")
    @XStreamConverter(value=XStreamCDataConverter.class)
    private String notifyUrl;

    @XStreamAlias("openid")
    @XStreamConverter(value=XStreamCDataConverter.class)
    private String openid;

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

    public String getDeviceInfo() {
        return deviceInfo;
    }

    public void setDeviceInfo(String deviceInfo) {
        this.deviceInfo = deviceInfo;
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

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getOutTradeNo() {
        return outTradeNo;
    }

    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
    }

    public int getTotalFee() {
        return totalFee;
    }

    public void setTotalFee(int totalFee) {
        this.totalFee = totalFee;
    }

    public String getTradeType() {
        return tradeType;
    }

    public void setTradeType(String tradeType) {
        this.tradeType = tradeType;
    }

    public String getSpbillCreateIp() {
        return spbillCreateIp;
    }

    public void setSpbillCreateIp(String spbillCreateIp) {
        this.spbillCreateIp = spbillCreateIp;
    }

    public String getNotifyUrl() {
        return notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String toXml() {
        return XStreamTransformer.toXml((Class) this.getClass(), this);
    }
}

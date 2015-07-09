package me.chanjar.weixin.mp.bean.result;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;
import me.chanjar.weixin.common.util.xml.XStreamCDataConverter;
import me.chanjar.weixin.mp.util.json.WxMpGsonBuilder;

import java.io.Serializable;

/**
 * <pre>
 * 微信支付
 * https://pay.weixin.qq.com/wiki/doc/api/jsapi.php?chapter=9_1
 *
 * </pre>
 *
 * @author lujian
 * @date 15/7/9.
 */

@XStreamAlias("xml")
public class WxMpPayUnifiedOrderResult implements Serializable {
    @XStreamAlias("return_code")
    @XStreamConverter(value=XStreamCDataConverter.class)
    private String returnCode;
    @XStreamAlias("return_msg")
    @XStreamConverter(value=XStreamCDataConverter.class)
    private String returnMsg;
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
    @XStreamAlias("result_code")
    @XStreamConverter(value=XStreamCDataConverter.class)
    private String resultCode;

    @XStreamAlias("err_code")
    @XStreamConverter(value=XStreamCDataConverter.class)
    private String errCode;

    @XStreamAlias("err_code_des")
    @XStreamConverter(value=XStreamCDataConverter.class)
    private String errCodeDes;

    @XStreamAlias("prepay_id")
    @XStreamConverter(value=XStreamCDataConverter.class)
    private String prepayId;
    @XStreamAlias("trade_type")
    @XStreamConverter(value=XStreamCDataConverter.class)
    private String tradeType;

    @XStreamAlias("code_url")
    @XStreamConverter(value=XStreamCDataConverter.class)
    private String codeUrl;

    public String getReturnCode() {
        return returnCode;
    }

    public void setReturnCode(String returnCode) {
        this.returnCode = returnCode;
    }

    public String getReturnMsg() {
        return returnMsg;
    }

    public void setReturnMsg(String returnMsg) {
        this.returnMsg = returnMsg;
    }

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

    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public String getPrepayId() {
        return prepayId;
    }

    public void setPrepayId(String prepayId) {
        this.prepayId = prepayId;
    }

    public String getTradeType() {
        return tradeType;
    }

    public void setTradeType(String tradeType) {
        this.tradeType = tradeType;
    }

    public String getDeviceInfo() {
        return deviceInfo;
    }

    public void setDeviceInfo(String deviceInfo) {
        this.deviceInfo = deviceInfo;
    }

    public String getErrCode() {
        return errCode;
    }

    public void setErrCode(String errCode) {
        this.errCode = errCode;
    }

    public String getErrCodeDes() {
        return errCodeDes;
    }

    public void setErrCodeDes(String errCodeDes) {
        this.errCodeDes = errCodeDes;
    }

    public String getCodeUrl() {
        return codeUrl;
    }

    public void setCodeUrl(String codeUrl) {
        this.codeUrl = codeUrl;
    }

    public static WxMpPayUnifiedOrderResult fromJson(String json) {
        return WxMpGsonBuilder.create().fromJson(json, WxMpPayUnifiedOrderResult.class);
    }
}

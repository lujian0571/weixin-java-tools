package me.chanjar.weixin.mp.bean.result;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;
import me.chanjar.weixin.common.util.xml.XStreamCDataConverter;
import me.chanjar.weixin.mp.bean.WxMpXmlMessage;
import me.chanjar.weixin.mp.util.xml.XStreamTransformer;

import java.io.InputStream;

/**
 * @author lujian
 * @date 15/7/9.
 */
@XStreamAlias("xml")
public class WxMpPayOrderResult {

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

    @XStreamAlias("openid")
    @XStreamConverter(value=XStreamCDataConverter.class)
    private String openid;

    @XStreamAlias("is_subscribe")
    @XStreamConverter(value=XStreamCDataConverter.class)
    private String isSubscribe;

    @XStreamAlias("trade_type")
    @XStreamConverter(value=XStreamCDataConverter.class)
    private String tradeType;

    @XStreamAlias("bank_type")
    @XStreamConverter(value=XStreamCDataConverter.class)
    private String bankType;

    @XStreamAlias("total_fee")
    private int totalFee;

    @XStreamAlias("fee_type")
    @XStreamConverter(value=XStreamCDataConverter.class)
    private String feeType;

    @XStreamAlias("cash_fee")
    private int cashFee;

    @XStreamAlias("cash_fee_type")
    @XStreamConverter(value=XStreamCDataConverter.class)
    private String cashFeeType;

    @XStreamAlias("coupon_fee")
    private int couponFee;

    @XStreamAlias("coupon_count")
    private int couponCount;
    //    private String couponBatchId_$n;
//    private String couponId_$n;
//    private String couponFee_$n;

    @XStreamAlias("transaction_id")
    @XStreamConverter(value=XStreamCDataConverter.class)
    private String transactionId;

    @XStreamAlias("out_trade_no")
    @XStreamConverter(value=XStreamCDataConverter.class)
    private String outTradeNo;

    @XStreamAlias("attach")
    @XStreamConverter(value=XStreamCDataConverter.class)
    private String attach;

    @XStreamAlias("time_end")
    @XStreamConverter(value=XStreamCDataConverter.class)
    private String timeEnd;

    @XStreamAlias("trade_state_desc")
    @XStreamConverter(value=XStreamCDataConverter.class)
    private String tradeStateDesc;


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

    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
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

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getIsSubscribe() {
        return isSubscribe;
    }

    public void setIsSubscribe(String isSubscribe) {
        this.isSubscribe = isSubscribe;
    }

    public String getTradeType() {
        return tradeType;
    }

    public void setTradeType(String tradeType) {
        this.tradeType = tradeType;
    }

    public String getBankType() {
        return bankType;
    }

    public void setBankType(String bankType) {
        this.bankType = bankType;
    }

    public int getTotalFee() {
        return totalFee;
    }

    public void setTotalFee(int totalFee) {
        this.totalFee = totalFee;
    }

    public String getFeeType() {
        return feeType;
    }

    public void setFeeType(String feeType) {
        this.feeType = feeType;
    }

    public int getCashFee() {
        return cashFee;
    }

    public void setCashFee(int cashFee) {
        this.cashFee = cashFee;
    }

    public String getCashFeeType() {
        return cashFeeType;
    }

    public void setCashFeeType(String cashFeeType) {
        this.cashFeeType = cashFeeType;
    }

    public int getCouponFee() {
        return couponFee;
    }

    public void setCouponFee(int couponFee) {
        this.couponFee = couponFee;
    }

    public int getCouponCount() {
        return couponCount;
    }

    public void setCouponCount(int couponCount) {
        this.couponCount = couponCount;
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

    public String getAttach() {
        return attach;
    }

    public void setAttach(String attach) {
        this.attach = attach;
    }

    public String getTimeEnd() {
        return timeEnd;
    }

    public void setTimeEnd(String timeEnd) {
        this.timeEnd = timeEnd;
    }

    public String getTradeStateDesc() {
        return tradeStateDesc;
    }

    public void setTradeStateDesc(String tradeStateDesc) {
        this.tradeStateDesc = tradeStateDesc;
    }

    public static WxMpPayOrderResult fromXml(String xml) {
        return XStreamTransformer.fromXml(WxMpPayOrderResult.class, xml);
    }

    public static WxMpPayOrderResult fromXml(InputStream is) {
        return XStreamTransformer.fromXml(WxMpPayOrderResult.class, is);
    }
}

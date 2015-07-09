package me.chanjar.weixin.mp.bean;

        import com.thoughtworks.xstream.annotations.XStreamAlias;
        import com.thoughtworks.xstream.annotations.XStreamConverter;
        import me.chanjar.weixin.common.util.xml.XStreamCDataConverter;
        import me.chanjar.weixin.mp.util.xml.XStreamTransformer;

/**
 * @author lujian
 * @date 15/7/9.
 */
@XStreamAlias("xml")
public class WxMpXmlOutPayCallback {


    @XStreamAlias("return_code")
    @XStreamConverter(value=XStreamCDataConverter.class)
    private String returnCode = "SUCCESS";

    @XStreamAlias("return_msg")
    @XStreamConverter(value=XStreamCDataConverter.class)
    private String returnMsg = "OK";

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


    public String toXml() {
        return XStreamTransformer.toXml((Class) this.getClass(), this);
    }
}

package me.chanjar.weixin.mp.bean.result;

import me.chanjar.weixin.mp.util.json.WxMpGsonBuilder;

import java.io.Serializable;

/**
 * Created by lujian on 2015/7/6.
 */
public class WxMpOnlineKf implements Serializable {

    private String kfAccount;
    private int status;
    private String kfId;
    private int autoAccept;
    private int acceptedCase;

    public String getKfAccount() {
        return kfAccount;
    }

    public void setKfAccount(String kfAccount) {
        this.kfAccount = kfAccount;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getKfId() {
        return kfId;
    }

    public void setKfId(String kfId) {
        this.kfId = kfId;
    }

    public int getAutoAccept() {
        return autoAccept;
    }

    public void setAutoAccept(int autoAccept) {
        this.autoAccept = autoAccept;
    }

    public int getAcceptedCase() {
        return acceptedCase;
    }

    public void setAcceptedCase(int acceptedCase) {
        this.acceptedCase = acceptedCase;
    }

    public static WxMpOnlineKf fromJson(String json) {
        return WxMpGsonBuilder.INSTANCE.create().fromJson(json, WxMpOnlineKf.class);
    }

    @Override
    public String toString() {
        return "WxMpOnlineKf{" +
                "kfAccount='" + kfAccount +"\'"+
                ", status=" + status +
                ", kfId='" + kfId + '\'' +
                ", autoAccept=" + autoAccept +
                ", acceptedCase=" + acceptedCase +
                '}';
    }
}

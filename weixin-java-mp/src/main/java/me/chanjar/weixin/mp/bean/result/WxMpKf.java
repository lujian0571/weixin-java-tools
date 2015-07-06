package me.chanjar.weixin.mp.bean.result;

import me.chanjar.weixin.mp.util.json.WxMpGsonBuilder;

import java.io.Serializable;

/**
 * Created by lujian on 2015/7/6.
 */
public class WxMpKf implements Serializable {

    private String kfAccount;
    private String kfHeadimgurl;
    private String kfId;
    private String kfNick;

    public String getKfAccount() {
        return kfAccount;
    }

    public void setKfAccount(String kfAccount) {
        this.kfAccount = kfAccount;
    }

    public String getKfHeadimgurl() {
        return kfHeadimgurl;
    }

    public void setKfHeadimgurl(String kfHeadimgurl) {
        this.kfHeadimgurl = kfHeadimgurl;
    }

    public String getKfId() {
        return kfId;
    }

    public void setKfId(String kfId) {
        this.kfId = kfId;
    }

    public String getKfNick() {
        return kfNick;
    }

    public void setKfNick(String kfNick) {
        this.kfNick = kfNick;
    }

    public static WxMpKf fromJson(String json) {
        return WxMpGsonBuilder.INSTANCE.create().fromJson(json, WxMpKf.class);
    }

    @Override
    public String toString() {
        return "WxMpKf{" +
                "kfAccount='" + kfAccount +"\'"+
                ", kfHeadimgurl='" + kfHeadimgurl + '\'' +
                ", kfId='" + kfId + '\'' +
                ", kfNick='" + kfNick + '\'' +
                '}';
    }
}

package com.toquery.oauth2.model.sys.entity.vo;


import com.toquery.oauth2.core.config.utils.security.Des3Utils;

public class Response {
    private ResponseHead head = new ResponseHead();
    private ResponseRet ret = new ResponseRet();
    private String body;

    public ResponseHead getHead() {
        return head;
    }

    public void setHead(ResponseHead head) {
        this.head = head;
    }

    public ResponseRet getRet() {
        return ret;
    }

    public void setRet(ResponseRet ret) {
        this.ret = ret;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = Des3Utils.decryption(body, "");
    }
}

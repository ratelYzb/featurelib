package com.bnk.featurelib.common.script.model;

import java.io.Serializable;

/**
 * @author ratel
 * @create 2018/12/3
 */
public class ScriptModel implements Serializable{

    private int     scriptId;

    private String  content;

    private String  md5;

    private String  className;

    public int getScriptId() {
        return scriptId;
    }

    public void setScriptId(int scriptId) {
        this.scriptId = scriptId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getMd5() {
        return md5;
    }

    public void setMd5(String md5) {
        this.md5 = md5;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}

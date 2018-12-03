package com.bnk.featurelib.common.facade.model;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * @author ratel
 * @create 2018/12/3
 */
public class ScriptMeta {

    private int     scriptId;

    private String  content;

    private String  template;

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

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("scriptId", scriptId)
                .append("content", content)
                .append("template", template)
                .toString();
    }
}

package com.bnk.featurelib.common.facade.service;

import com.bnk.featurelib.common.facade.model.ScriptMeta;

/**
 * @author ratel
 * @create 2018/12/3
 */
public interface ScriptMetaFacade {

    /**
     *
     * @param scriptId
     * @return
     */
    public ScriptMeta getScriptMetaById(int scriptId);
}

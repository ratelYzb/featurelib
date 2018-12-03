package com.bnk.featurelib.common.script.repository;

import com.bnk.featurelib.common.script.model.ScriptModel;

/**
 * @author ratel
 * @create 2018/12/3
 */
public interface ScriptModelRepository {

    /**
     *
     * @param scriptId
     * @return
     */
    ScriptModel getByScriptId(String scriptId);


}

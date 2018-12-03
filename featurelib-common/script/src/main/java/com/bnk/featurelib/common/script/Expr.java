package com.bnk.featurelib.common.script;

import java.util.Map;

/**
 * 表达式接口
 *
 * @author ratel
 * @create 2018/12/3
 */
public interface Expr {

    /**
     * 根据上下文执行
     * @param ctx
     * @return
     * @throws Exception
     */
    Object eval(Map<String, Object> ctx) throws Exception;
}

package com.bnk.featurelib.common.script.service;

import com.bnk.featurelib.common.script.Expr;

import java.util.Map;

/**
 *
 * @author ratel
 * @create 2018/12/3
 */
public interface ExprEvalService {

    /**
     *
     * @param scriptId
     * @param ctx
     * @return
     */
    Object evelByScript(String scriptId, Map<String, Object> ctx);

    /**
     *
     * @param expr
     * @param ctx
     * @return
     */
    Object evelByExpr(Expr expr, Map<String, Object> ctx);

    /**
     *
     * @param expr
     * @param ctx
     * @return
     */
    Object evel(String expr, Map<String, Object> ctx);


}

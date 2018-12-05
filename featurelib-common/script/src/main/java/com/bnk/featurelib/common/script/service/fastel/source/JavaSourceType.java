package com.bnk.featurelib.common.script.service.fastel.source;

/**
 * @author ratel
 * @create 10:25 PM
 */
public enum JavaSourceType {

    FEATURE("FEATURE", "特征", new FeatureJavaSourceFactory()),

    DV("DATA_VIEW", "数据视图", new DvJavaSourceFactory()),

    UDF("UDF", "函数", new UdfJavaSourceFactory());

    private String code;

    private String desc;

    private JavaSourceFactory javaSourceFactory;

    JavaSourceType(String code, String desc, JavaSourceFactory javaSourceFactory) {
        this.code = code;
        this.desc = desc;
        this.javaSourceFactory = javaSourceFactory;
    }

    public JavaSourceFactory getJavaSourceFactory() {
        return javaSourceFactory;
    }
}

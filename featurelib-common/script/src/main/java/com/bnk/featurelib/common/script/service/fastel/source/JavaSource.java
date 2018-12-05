package com.bnk.featurelib.common.script.service.fastel.source;

/**
 * @author ratel
 * @create 2018/12/3
 */
public class JavaSource {

    private String packageName;

    private String className;

    private String source;

    private JavaSourceType javaSourceType;

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public JavaSourceType getJavaSourceType() {
        return javaSourceType;
    }

    public void setJavaSourceType(JavaSourceType javaSourceType) {
        this.javaSourceType = javaSourceType;
    }
}

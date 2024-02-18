package com.cxy.maker.model;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 动态模版配置
 */
@Data
public class DataModel {


    /**
     * 是否需要git托管
     */
    public boolean needGit;

    /**
     * 是否生成循环
     */
    public boolean loop;

    /**
     * 作者注释
     */
    public String author = "cxy";

    /**
     * 输出信息
     */
    public String outputText = "sum = ";
}
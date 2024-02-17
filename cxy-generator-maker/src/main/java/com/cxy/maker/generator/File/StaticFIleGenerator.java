package com.cxy.maker.generator.File;

import cn.hutool.core.io.FileUtil;

/**
 * 静态文件生成器
 */
public class StaticFIleGenerator {


    /**
     * 拷贝文件（Hutool 实现，会将输入目录完整拷贝到输出目录下）
     *
     * @param inputPath
     * @param outPath
     */
    public static void copyFilesByHutool(String inputPath,String outPath){
        FileUtil.copy(inputPath,outPath,false);
    }


}

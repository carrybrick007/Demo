package com.xxx.Demo.utils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class MyFile {
	public static void writeFile(String path,String fileContent) {
		try {
            // 准备文件666.txt其中的内容是空的
            File f1 = new File(path);
            if (!f1.exists()){
            	f1.getParentFile().mkdirs();
                f1.createNewFile();
            }
            byte data[] = fileContent.getBytes("utf-8");
            // 创建基于文件的输出流
            FileOutputStream fos = new FileOutputStream(f1);
            // 把数据写入到输出流
            fos.write(data);
            // 关闭输出流
            fos.close();
            System.out.println("输出完成");
        } catch (IOException e) {
            e.printStackTrace();
        }

	} 
}

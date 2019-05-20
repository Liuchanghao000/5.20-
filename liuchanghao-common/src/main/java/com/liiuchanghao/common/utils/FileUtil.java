package com.liiuchanghao.common.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileUtil {
	
	/*
	* 方法1：给定一个文件名，返回该文件名的扩展名，例如“aaa.jpg”，返回“.jpg”(3分)
	*/
	public static String getExtendName(String fileName,String src,String des) throws IOException{
		FileInputStream fis = null;
		FileOutputStream fos = null;
		Byte[] b =new Byte[1024];
		try {
			fis = new FileInputStream(new File(src));
			int len = 0;
			while (fis.read()!= -1) {
				fos.write(0);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			fis.close();
			fos.close();
		}
		
		return fileName;
	//TODO 实现代码
	}
	
	/*
	* 方法2：返回操作系统临时目录(5分)
	*/
	public static File getTempDirectory(File file){
	//TODO 实现代码
		while (file.isDirectory()) {
			file.getName();
		}
		return null;
	}
	
	/*
	* 方法3：返回操作系统用户目录(5分)
	* 例如Linux系统是在/home/{用户账号名}，Windows系统是在C:\Users\{用户账号名}> 
	*/
	public static  File getUserDirectory(File file){
		while (file.isDirectory()) {
			if (file.isFile()) {
				file.getName();
				System.out.println("Windows系统是在C:/Users/{用户账号名}");
			}else {
				file.getName();
				System.out.println("Windows系统不是在C:/Users/{用户账号名}");
			}
			
		}
	//TODO 实现代码
		return null;
	}
	
	
	
	

}

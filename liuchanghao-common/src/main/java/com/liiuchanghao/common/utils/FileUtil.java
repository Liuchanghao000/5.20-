package com.liiuchanghao.common.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileUtil {
	
	/*
	* ����1������һ���ļ��������ظ��ļ�������չ�������硰aaa.jpg�������ء�.jpg��(3��)
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
	//TODO ʵ�ִ���
	}
	
	/*
	* ����2�����ز���ϵͳ��ʱĿ¼(5��)
	*/
	public static File getTempDirectory(File file){
	//TODO ʵ�ִ���
		while (file.isDirectory()) {
			file.getName();
		}
		return null;
	}
	
	/*
	* ����3�����ز���ϵͳ�û�Ŀ¼(5��)
	* ����Linuxϵͳ����/home/{�û��˺���}��Windowsϵͳ����C:\Users\{�û��˺���}> 
	*/
	public static  File getUserDirectory(File file){
		while (file.isDirectory()) {
			if (file.isFile()) {
				file.getName();
				System.out.println("Windowsϵͳ����C:/Users/{�û��˺���}");
			}else {
				file.getName();
				System.out.println("Windowsϵͳ������C:/Users/{�û��˺���}");
			}
			
		}
	//TODO ʵ�ִ���
		return null;
	}
	
	
	
	

}

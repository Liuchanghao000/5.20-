package com.liiuchanghao.common.utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;

public class StreamUtil {
	
	public static void main(String[] args) {
		closeAll();
	}
	
	/*
	* 方法1：批量关闭流，参数能传无限个。(3分)
	* 例如传入FileInputStream对象、JDBC中Connection对象都可以关闭。
	*/
	public static void closeAll(Closeable...closeables){
	//TODO 实现代码
		for (Closeable c : closeables) {
			if (c != null) {
				try {
					c.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	/*
	* 方法2：传入一个文本文件对象，默认为UTF-8编码，返回该文件内容(3分)，
	* 要求方法内部调用上面第1个方法关闭流(3分)
	*/
	public static String readTextFile(String src,String dec) throws IOException{
	//TODO 实现代码
		BufferedReader br = null;
		BufferedWriter bw = null;
		String count ="";
		try {
			br = new BufferedReader(new FileReader(src));
			bw = new BufferedWriter(new FileWriter(dec));
			while (count!=br.readLine()) {
				bw.flush();
				bw.newLine();
				bw.write(count);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			closeAll(br,bw);
		}
		return null;
	}
	

}

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
	* ����1�������ر����������ܴ����޸���(3��)
	* ���紫��FileInputStream����JDBC��Connection���󶼿��Թرա�
	*/
	public static void closeAll(Closeable...closeables){
	//TODO ʵ�ִ���
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
	* ����2������һ���ı��ļ�����Ĭ��ΪUTF-8���룬���ظ��ļ�����(3��)��
	* Ҫ�󷽷��ڲ����������1�������ر���(3��)
	*/
	public static String readTextFile(String src,String dec) throws IOException{
	//TODO ʵ�ִ���
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

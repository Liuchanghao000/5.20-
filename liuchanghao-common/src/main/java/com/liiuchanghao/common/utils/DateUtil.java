package com.liiuchanghao.common.utils;

import java.util.Calendar;
import java.util.Date;

public class DateUtil {
	
	public static void main(String[] args) {
		
	}
	
	/*
	* ����1��(5��)
	* ��һ��ʱ����󣬷��ظ�ʱ�������µ�1��0ʱ0��0�롣����һ��Date�����ֵ��2019-05-18 11:37:22
	* �򷵻صĽ��Ϊ2019-05-01 00:00:00
	*/
	public static Date getDateByInitMonth(Date src){
		return src;
	//TODO ʵ�ִ���
		
		
	}
	
	/*
	* ����2��(5��)
	* ��һ��ʱ����󣬷��ظ�ʱ�������µ������23ʱ59��59�룬��Ҫ�����´���С�Ͷ������������
	* ����һ��Date�����ֵ��2019-05-18 11:37:22���򷵻ص�ʱ��Ϊ2019-05-31 23:59:59
	* ����һ��Date�����ֵ��2019-02-05 15:42:18���򷵻ص�ʱ��Ϊ2019-02-28 23:59:59
	*/
	public static Date getDateByFullMonth(Date src){
		return src;
	//TODO ʵ�ִ���
		
	}

}

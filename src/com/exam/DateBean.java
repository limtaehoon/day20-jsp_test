package com.exam;

import java.util.Calendar;

public class DateBean {
	Calendar ca = Calendar.getInstance();
	String[]arr = {"��","��","ȭ","��","��","��","��"};
	public String getToday() {
		String str = ca.get(Calendar.YEAR)+"��";
		 str += ca.get(Calendar.MONDAY)+"��";
		 str += ca.get(Calendar.DATE)+"��";
		 str += ca.get(Calendar.DAY_OF_WEEK+1)+"����";
		 return str;
	}
	public String getDay() {
		StringBuilder sb = new StringBuilder();
		sb.append(ca.get(Calendar.YEAR)+"��");
		sb.append(ca.get(Calendar.MONDAY)+1+"��");
		sb.append(ca.get(Calendar.DATE)+"��");
		sb.append(arr[ca.get(Calendar.DAY_OF_WEEK)-1]+"����");
		return sb.toString();
	}
	}

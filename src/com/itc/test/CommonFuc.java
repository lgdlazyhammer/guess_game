package com.itc.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*
 * player computer entity
 * 2016-12-14
 * from liguodong
 * */
public class CommonFuc {

	/*check string is number*/
	public static boolean checkStrNum(String param){
		String regEx = "^[0-9]*$";
		Pattern pattern = Pattern.compile(regEx);
		Matcher matcher = pattern.matcher(param);
		return matcher.matches();
	}
}

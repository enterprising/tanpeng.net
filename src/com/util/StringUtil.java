package com.util;

public class StringUtil{
	
	public static boolean isNull(String str)
	{
		if (str==null || str.trim().length()==0|| str.equals("null"))
			return true;
		
		return false;
	}
	
	public static boolean isNotNull(String str)
	{
		return !isNull(str);
	}

}

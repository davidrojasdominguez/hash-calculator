package com.akomachi.hashcalculator;
import java.security.MessageDigest;

import android.text.Editable;

public class encrypt {

	public static String hashStr(Editable str, String type) throws Exception
	{
		String result = "Impossible!";
		
		if (type == "MD5" || type == "SHA-1" || type == "SHA-256" || type == "SHA-384" || type == "SHA-512" ) {
				MessageDigest md = MessageDigest.getInstance(type);
				md.update(str.toString().getBytes());

				StringBuilder sb = new StringBuilder();
				for (byte b : md.digest())
					sb.append(Integer.toHexString(0x100 + (b & 0xff)).substring(1));
				result = sb.toString();
		};
		
		return 	result;	
	}
}

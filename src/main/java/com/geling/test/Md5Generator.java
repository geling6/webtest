package com.geling.test;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Md5Generator {
	public static void main(String[] args) {
		
		MessageDigest md = null;
		try {
			md = MessageDigest.getInstance("MD5");
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		
		char[] factor = {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','w','x','y','z'};
		for(int i=10;i<factor.length;i++){
			for(int j=10;j<factor.length;j++){
				for(int k=0;k<factor.length;k++){
					for(int m=0;m<factor.length;m++){
						for(int n=0;n<factor.length;n++){
							for(int p=0;p<factor.length;p++){
								char char1 = factor[i];
								char char2 = factor[j];
								char char3 = factor[k];
								char char4 = factor[m];
								char char5 = factor[n];
								char char6 = factor[p];
								String origin = "" + char1 + char2 +char3 + char4 + char5 + char6;
								md.update(origin.getBytes());
					            String pwd = new BigInteger(1, md.digest()).toString(16);
					            System.out.println(origin + "," + pwd);
							}
						}
					}
				}
			}
		}
	}
}

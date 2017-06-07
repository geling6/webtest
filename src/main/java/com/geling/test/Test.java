package com.geling.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.Reader;

public class Test{
	public static void main(String[] args) throws Exception{
		Reader reader = new FileReader("src" + File.separator + "main" + File.separator + "java" + File.separator + "com" 
        		+ File.separator + "geling" + File.separator + "test" + File.separator + "temp.txt");
		BufferedReader br = new BufferedReader(reader);
		String line = null;
		while((line = br.readLine()) != null){
			StringBuilder sb = new StringBuilder("{");
			String[] content = line.split("	");
			sb.append("\"label\"" + ":\"" + content[0] + "\"" + ",");
			sb.append("\"storeName\"" + ":\"" + content[1] + "\"" + ",");
			sb.append("\"storeType\"" + ":[\"" + content[2] + "\"]" + ",");
			sb.append("\"businessType\"" + ":\"" + content[3] + "\"" + ",");
			sb.append("\"isPhysicalStore\"" + ":" + content[4] + "" + ",");
			sb.append("\"provinceId\"" + ":\"" + content[5] + "\"" + ",");
			sb.append("\"cityId\"" + ":\"" + content[6] + "\"" + ",");
			sb.append("\"countyId\"" + ":\"" + content[7] + "\"" + ",");
			sb.append("\"latitude\"" + ":" + content[8] + "" + ",");
			sb.append("\"longitude\"" + ":" + content[9] + "" + ",");
			sb.append("\"storeAddress\"" + ":\"" + content[10] + "\"" + ",");
			sb.append("\"storePhone\"" + ":\"" + content[11] + "\"" + ",");
			sb.append("\"storePicsrc\"" + ":\"" + content[12] + "\"" + ",");
			sb.append("\"bgPic\"" + ":\"" + content[13] + "\"" + ",");
			sb.append("\"sourceId\"" + ":\"" + content[14] + "\"" + ",");
			sb.append("\"lastUpdateSourceId\"" + ":\"" + content[15] + "\"" + ",");
			sb.append("\"creatorId\"" + ":\"" + content[16] + "\"" + ",");
			sb.append("\"operatorId\"" + ":\"" + content[17] + "\"" + ",");
			sb.append("\"operationDepartmentId\"" + ":[\"" + content[18] + "\"]");
			sb.append("},");
			System.out.println(sb);
		}
	}
}
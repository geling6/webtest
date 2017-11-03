package com.wande.flushdata;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.springframework.http.HttpMethod;

import com.wande.utils.SendUtil;

public class StoreKFK {

	public static void main(String[] args) throws Exception{
		Reader reader = new FileReader("src" + File.separator + "main" + File.separator + "java" + File.separator + "com" 
        		+ File.separator + "wande" + File.separator + "flushdata" + File.separator + "storeVirtual.txt");
		BufferedReader br = new BufferedReader(reader);
		String line = null;
		StringBuilder sb = new StringBuilder();
		while((line = br.readLine()) != null){
			String[] storeIds = line.split(" ");
			int offset = 0, limit = 20;
			while(offset <= storeIds.length) {
				int size = (offset+limit) <= storeIds.length ? (offset+limit) : storeIds.length;
				for(int i = offset; i<size; i++) {
					sb.append(storeIds[i]).append(",");
				}
				//do something
				//1. kafka
				//sendStoreInKFK
				String kfkUrl = "";
				Map<String, Object> storeIdParam = new HashMap<>();
				storeIdParam.put("storeId", sb.toString());
				storeIdParam.put("key", "142536");
				//SendUtil.sendRequestWithParam(kfkUrl, storeIdParam, HttpMethod.GET);
				
				//2. es
				//stores/sync/es
				String esUrl = "";
				Map<String, Object> storeIdsParam = new HashMap<>();
				storeIdsParam.put("ids", sb.toString());
				storeIdsParam.put("key", "142536");
				//SendUtil.sendRequestWithParam(esUrl, storeIdsParam, HttpMethod.GET);
				
				//3. cache,kafka,es
				///changeEventStores
				String allUrl = "";
				Map<String, Object> param = new HashMap<>();
				param.put("storeIds", sb.toString());
				param.put("key", "142536");
				SendUtil.sendRequestWithParam(allUrl, param, HttpMethod.GET);
				
				//sleep 3s
				try {
					TimeUnit.SECONDS.sleep(1);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
				sb = new StringBuilder();
				offset += limit;
			}
		}
	}

}

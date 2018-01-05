package com.wande.flushdata;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpMethod;

import com.wande.utils.SendUtil;

public class ContractTest {

	public static void main(String[] args) throws Exception{
		String url = "http://localhost:8080/common-contract-web/contract/contracts?commonDataCrypticKey=H00A027624AB05DCAC2B5998F1E710B432A&__uni_source=ffan&userId=1&userName=ffan";
		
		Map<String,Object> variables = new HashMap<>();
		variables.put("contractVo", "{\"signingDate\":\"2017-12-26 16:28:46\",\"startDate\":\"2017-12-26 16:28:46\",\"endDate\":\"2018-12-26 16:28:46\",\"partAName\":\"上海新飞凡电子商务有限公司\",\"partAId\":10003,\"partAAddr\":\"上海市浦东新区乳山路227号3楼D区677室\",\"partBContractor\":\"陈小龙\",\"partBName\":\"商户12\",\"partBId\":10080938,\"partBAddr\":\"巴中市中心\",\"partBPhone\":\"18273664592\",\"contractType\":4,\"supplement\":\"\",\"status\":3,\"contactPhone\":\"18273664592\",\"otherPics\":\"\",\"serviceCodes\":\"FSI011,FSI012,FSI013,FSI014,FSI015,FSI016,FSI018,FSI019,FSI029,FSI033\",\"isCinema\":0,\"createTime\":1514276930515,\"contreacPdfType\":1,\"versionName\":\"v2\",\"contractPdfExtList\":[{\"contractSerial\":\"2017122616284601\",\"contractPdf\":\"T1gTxgBvVv1RCvBVdK\",\"contractPdfType\":1}]}");
		variables.put("feeSettlementInfoVo", "{\"technicalServiceFee\":0.0,\"cooperationMargin\":0.0,\"settlementPeriod\":\"BC01\",\"serviceUniformRate\":\"0\",\"commissionRatio\":\"0\"}");
		variables.put("contractPdfExtList", "[{\"contractSerial\":\"2017122616284601\",\"contractPdf\":\"T1gTxgBvVv1RCvBVdK\",\"contractPdfType\":1}]");
		variables.put("paymentInfoList", "[{\"financialContacts\":\"陈小龙\",\"financialContactPhone\":\"18273667694\",\"ownerType\":1}]");
		
		SendUtil.sendSelfJson(url, variables, HttpMethod.POST, variables);
	}

}

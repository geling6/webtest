package com.wande.elasticsearch;

import java.util.ArrayList;

import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.action.search.SearchType;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.ImmutableSettings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.index.query.QueryBuilders;

import com.wande.utils.JSONUtil;

/*
 * 传统数据库结构Database->table->rows->columns
 * ElasticSearch结构Indexes->type->document->fields
 */
public class ElasticSearchTest {

	private static TransportClient client;
	public static void main(String[] args) throws Exception{
		ImmutableSettings.Builder builder = ImmutableSettings.settingsBuilder();
        builder.put("client.transport.ignore_cluster_name", true);
        //builder.put("client.transport.sniff", true);
        //builder.put("cluster.name","myelasticsearch");
        client = new TransportClient(builder.build());
        InetSocketTransportAddress [] inetSocketTransportAddresses = new InetSocketTransportAddress[1];
        inetSocketTransportAddresses[0] = new InetSocketTransportAddress("192.168.20.129", 9300);
        //inetSocketTransportAddresses[1] = new InetSocketTransportAddress("192.168.20.131",9300);
        client.addTransportAddresses(inetSocketTransportAddresses);
        
        
		//增加一个文档
        Fucker yangYandi = new Fucker();
        yangYandi.setId("4");
        yangYandi.setFirst_name("yang");
        yangYandi.setLast_name("yandi");
        yangYandi.setAbout("qian cao");
        yangYandi.setInterests(new ArrayList<String>());
        //createIndex(client,yangYandi);
        getIndex(client);
	}
	
	/*
	 * 增加文档
	 */
	public static void createIndex(TransportClient client,Bean bean)throws Exception{
		String json = JSONUtil.getMapper().writeValueAsString(bean);
		client.prepareIndex("bitch", "fuck", bean.getId()).setSource(json).execute().actionGet();
	}
	
	/*
	 *查询 
	 */
	public static void getIndex(TransportClient client)throws Exception{
		SearchResponse response = client.prepareSearch("bitch")
		        .setTypes("fuck")
		        //.setSearchType(SearchType.DFS_QUERY_THEN_FETCH)
		        //.setQuery(QueryBuilders.termQuery("multi", "test"))                 // Query
		        //.setPostFilter(QueryBuilders.rangeQuery("age").from(12).to(18))     // Filter
		        //.setFrom(0).setSize(60).setExplain(true)
		        .execute()
		        .actionGet();
		System.out.println(response);
	}
}

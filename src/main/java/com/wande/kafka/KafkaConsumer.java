package com.wande.kafka;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import kafka.consumer.Consumer;
import kafka.consumer.ConsumerConfig;
import kafka.consumer.ConsumerIterator;
import kafka.consumer.KafkaStream;
import kafka.javaapi.consumer.ConsumerConnector;

public class KafkaConsumer {
	public static void main(String[] args) {
		Properties props = new Properties();

		props.put("zookeeper.connect", "192.168.20.130:2181");
		props.put("group.id", "group2");
		props.put("auto.offset.reset", "smallest");//配置是否取全部消息
		
		ConsumerConfig consumerConfig = new ConsumerConfig(props);
		ConsumerConnector consumerConnector = Consumer.createJavaConsumerConnector(consumerConfig);
		
		Map<String,Integer> map = new HashMap<>();
		map.put("", 1);
		Map<String,List<KafkaStream<byte[],byte[]>>> messageStreams = consumerConnector.createMessageStreams(map);

		KafkaStream<byte[],byte[]> messageStream = messageStreams.get("cda-store").get(0);
		ConsumerIterator<byte[],byte[]> iterator = messageStream.iterator();
		while(iterator.hasNext()){
            String message = new String(iterator.next().message());  
            System.out.println("接受到: " + message);
        }
	}
}

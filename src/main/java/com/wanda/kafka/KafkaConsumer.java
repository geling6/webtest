package com.wanda.kafka;

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
		props.put("zookeeper.connect", "192.168.20.129:2181");
		props.put("group.id", "test-consumer-group");
		
		ConsumerConfig consumerConfig = new ConsumerConfig(props);
		ConsumerConnector consumerConnector = Consumer.createJavaConsumerConnector(consumerConfig);
		
		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("mytopic2", 1);
		Map<String,List<KafkaStream<byte[],byte[]>>> messageStreams = consumerConnector.createMessageStreams(map);
		KafkaStream<byte[],byte[]> messageStream = messageStreams.get("mytopic2").get(0);
		ConsumerIterator<byte[],byte[]> iterator = messageStream.iterator();
		while(iterator.hasNext()){
            String message = new String(iterator.next().message());  
            System.out.println("接收到: " + message);
        }
	}
}

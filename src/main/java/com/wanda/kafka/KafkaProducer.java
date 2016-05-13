package com.wanda.kafka;

import java.util.Properties;

import kafka.javaapi.producer.Producer;
import kafka.producer.KeyedMessage;
import kafka.producer.ProducerConfig;

public class KafkaProducer {

	public static void main(String[] args) {
		
		Properties props = new Properties();
		//props.put("zk.connect", "192.168.203.130:2181");
        props.put("metadata.broker.list", "192.168.203.130:9092");
        props.put("serializer.class", "kafka.serializer.StringEncoder");
        props.put("request.required.acks", "-1");
		
		
		Producer<Integer,String> producer = new Producer<>(new ProducerConfig(props));
		producer.send(new KeyedMessage<Integer,String>("mytopic","gundanba"));
		
	}

}

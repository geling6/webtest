package com.wande.kafka;

import java.util.Properties;

import kafka.javaapi.producer.Producer;
import kafka.producer.KeyedMessage;
import kafka.producer.ProducerConfig;

/*
 * 要用测客户端调通服务端。服务端需要修改配置文件server.properties里"zookeeper.host","advertised.host.name","host.name"为服务端ip地址(单机)
 */
public class KafkaProducer {

	public static void main(String[] args) {
		
		Properties props = new Properties();
		//props.put("zk.connect", "192.168.20.129:2181");
        props.put("metadata.broker.list", "10.213.57.156:10001");
        props.put("serializer.class", "kafka.serializer.StringEncoder");
        props.put("request.required.acks", "-1");
		
		
		Producer<Integer,String> producer = new Producer<>(new ProducerConfig(props));
		producer.send(new KeyedMessage<Integer,String>("cda-contract-qingjs","cccchui3"));
		
	}

}

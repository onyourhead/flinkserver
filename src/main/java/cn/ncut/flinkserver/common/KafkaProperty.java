package cn.ncut.flinkserver.common;

import java.util.Properties;

/**
 * title: KafkaProperty
 * projectName： my-flink-project
 * author： 张政淇
 * date： 2019/11/15
 * time： 11:29
 */
public class KafkaProperty {
    public static Properties producerProps = new Properties();
    public static Properties consumerProps = new Properties();
    static {
        producerProps.put("bootstrap.servers", "zzq:9092");
        producerProps.put("acks", "0");
        producerProps.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        producerProps.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");
    }
    static {
        consumerProps.setProperty("bootstrap.servers", "zzq:9092");
        consumerProps.setProperty("group.id", "test");
        consumerProps.setProperty("auto.offset.reset", "latest");
        consumerProps.setProperty("enable.auto.commit", "true");
        consumerProps.setProperty("auto.commit.interval.ms", "1000");
        consumerProps.setProperty("key.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
        consumerProps.setProperty("value.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
    }
}

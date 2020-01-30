package cn.ncut.flinkserver.service;

import cn.ncut.flinkserver.common.KafkaProperty;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.springframework.stereotype.Service;

import java.time.Duration;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author 张政淇
 * @class KafkaConsumeService
 * @desc todo
 * @date 2020/1/10 11:31
 */
@Service
public class KafkaConsumeService {
    private KafkaConsumer<String, String> baseConsumer = new KafkaConsumer<>(KafkaProperty.consumerProps);

    public static void main(String[] args) {
        KafkaConsumeService kafkaConsumeService = new KafkaConsumeService();
        kafkaConsumeService.getRecords("test");
    }
    public List<String> getRecords(String topic) {


        baseConsumer.subscribe(Collections.singleton(topic));
        while (true) {
            ConsumerRecords<String, String> records = baseConsumer.poll(Duration.ofMillis(100));
            for (ConsumerRecord<String, String> record : records) {
                System.out.printf("offset = %d, key = %s, value = %s%n", record.offset(), record.key(), record.value());
            }
        }
    }
}

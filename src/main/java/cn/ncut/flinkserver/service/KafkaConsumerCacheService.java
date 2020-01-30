package cn.ncut.flinkserver.service;

import cn.ncut.flinkserver.common.KafkaProperty;
import org.apache.kafka.clients.consumer.KafkaConsumer;

import java.util.HashMap;

/**
 * @author 张政淇
 * @class KafkaConsumerCacheService
 * @desc todo
 * @date 2020/1/10 11:43
 */
public class KafkaConsumerCacheService {
    private final HashMap<String, KafkaConsumer<String, String>> kafkaConsumerCache = new HashMap<>();
    private KafkaConsumer<String, String> baseConsumer = new KafkaConsumer<>(KafkaProperty.consumerProps);
    public KafkaConsumer<String, String> getCacheConsumer(String topic) {
//        kafkaConsumerCache.computeIfAbsent(topic, k -> )
        return null;
    }
}

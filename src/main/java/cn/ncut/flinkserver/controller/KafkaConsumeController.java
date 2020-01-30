package cn.ncut.flinkserver.controller;

import cn.ncut.flinkserver.service.KafkaConsumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 张政淇
 * @class KafkaConsumeController
 * @desc todo
 * @date 2020/1/10 11:30
 */
@RestController
public class KafkaConsumeController {
    @Autowired
    KafkaConsumeService kafkaConsumeService;

    @RequestMapping("/kafka/records")
    public List<String> getRecords(String topic) {
        return kafkaConsumeService.getRecords(topic);
    }
}

package ru.sberbank.hackathonproducer.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProducerService {

    private final KafkaTemplate<String, Object> kafkaTemplate;

    @Value("${spring.kafka.template.default-topic}")
    private String topic;



    public void produce(){
        kafkaTemplate.send(topic, "fjfbjfdyfkefykfvyrtf");
    }
}

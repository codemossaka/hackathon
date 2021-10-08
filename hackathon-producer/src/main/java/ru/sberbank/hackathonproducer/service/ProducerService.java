package ru.sberbank.hackathonproducer.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import ru.sberbank.hackathonproducer.dto.UserEvent;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProducerService {

    private final KafkaTemplate<String, List<UserEvent>> kafkaTemplate;

//    @Value("${spring.kafka.template.default-topic}")
    private final String TOPIC ="user-events";



    public void produce(List<UserEvent> userEvent){
        kafkaTemplate.send(TOPIC, userEvent);
    }
}

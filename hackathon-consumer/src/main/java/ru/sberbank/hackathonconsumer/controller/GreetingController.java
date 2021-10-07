package ru.sberbank.hackathonconsumer.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import ru.sberbank.hackathonconsumer.entities.Door;
import ru.sberbank.hackathonconsumer.respositories.DoorRepository;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class GreetingController {

    private final DoorRepository doorRepository;

//    @MessageMapping("/door")
//    @SendTo("/topic/message")
//    public Door greeting(HelloMessage message) throws Exception {
////        Thread.sleep(1000); // simulated delay
//        List<Door> all = doorRepository.findAll();
//        int v = (int) ((Math.random() * ((all.size() - 1) + 1)) + 1);
//        return all.get(v);
//    }

}
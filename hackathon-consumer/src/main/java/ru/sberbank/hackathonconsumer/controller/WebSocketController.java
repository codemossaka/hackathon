package ru.sberbank.hackathonconsumer.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import ru.sberbank.hackathonconsumer.entities.Arm;
import ru.sberbank.hackathonconsumer.entities.Door;
import ru.sberbank.hackathonconsumer.entities.Router;
import ru.sberbank.hackathonconsumer.respositories.ArmRepository;
import ru.sberbank.hackathonconsumer.respositories.DoorRepository;
import ru.sberbank.hackathonconsumer.respositories.RouterRepository;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class WebSocketController {

    private final ArmRepository armRepository;
    private final DoorRepository doorRepository;
    private final RouterRepository routerRepository;

    @MessageMapping("arm")
    @SendTo("topic/messages")
    public List<Arm> sendArm() {
        return armRepository.findAll();
    }

    @MessageMapping("/door")
    @SendTo("/topic/messages")
    public List<Door> greetinxsssg() throws Exception {
//        Thread.sleep(1000); // simulated delay
//        List<Door> all =
//        int v = (int) ((Math.random() * ((all.size() - 1) + 1)) + 1);
        return doorRepository.findAll();
    }

//    @MessageMapping("door")
//    @SendTo("topic/message")
//    public Door sendDoor() {
//        List<Door> all = doorRepository.findAll();
//        int v = (int) ((Math.random() * ((all.size() - 1) + 1)) + 1);
//        return all.get(v);
//    }

    @MessageMapping("router")
    @SendTo("topic/messages")
    public List<Router> sendRouter() {
        return routerRepository.findAll();
    }

}

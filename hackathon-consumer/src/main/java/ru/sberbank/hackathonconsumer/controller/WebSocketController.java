package ru.sberbank.hackathonconsumer.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import ru.sberbank.hackathonconsumer.entities.*;
import ru.sberbank.hackathonconsumer.respositories.*;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class WebSocketController {

    private final ArmRepository armRepository;
    private final DoorRepository doorRepository;
    private final RouterRepository routerRepository;
    private final RoomRepository roomRepository;
    private final UserRepository userRepository;
    private final UserEventRepository userEventRepository;

    @MessageMapping("arm")
    @SendTo("/topic/arm")
    public List<Arm> arm() {
        return armRepository.findAll();
    }

    @MessageMapping("/door")
    @SendTo("/topic/door")
    public List<Door> door() {
        return doorRepository.findAll();
    }

    @MessageMapping("router")
    @SendTo("/topic/router")
    public List<Router> router() {
        return routerRepository.findAll();
    }

    @MessageMapping("/room")
    @SendTo("/topic/room")
    public List<Room> room() {
        return roomRepository.findAll();
    }

    @MessageMapping("/user")
    @SendTo("/topic/user")
    public List<User> user() {
        return userRepository.findAll();
    }

    @MessageMapping("/userEvent")
    @SendTo("/topic/userEvent")
    public List<UserEvent> userEvent() {
        return userEventRepository.findAll();
    }

}

package ru.sberbank.hackathonconsumer.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import ru.sberbank.hackathonconsumer.entities.*;
import ru.sberbank.hackathonconsumer.service.WebSocketService;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class WebSocketController {

    private final WebSocketService webSocketService;

    @MessageMapping("arm")
    @SendTo("/topic/arm")
    public List<Arm> arm() {
        return webSocketService.getArms();
    }

    @MessageMapping("/door")
    @SendTo("/topic/door")
    public List<Door> door() {
        return webSocketService.getDoors();
    }

    @MessageMapping("router")
    @SendTo("/topic/router")
    public List<Router> router() {
        return webSocketService.getRouters();
    }

    @MessageMapping("/room")
    @SendTo("/topic/room")
    public List<Room> room() {
        return webSocketService.getRooms();
    }

    @MessageMapping("/user")
    @SendTo("/topic/user")
    public List<User> user() {
        return webSocketService.getUsers();
    }

    @MessageMapping("/userEvent")
    @SendTo("/topic/userEvent")
    public List<UserEvent> userEvent() {
        return webSocketService.getUserEvents();
    }

}

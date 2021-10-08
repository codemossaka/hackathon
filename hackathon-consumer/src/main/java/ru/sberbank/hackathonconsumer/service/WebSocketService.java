package ru.sberbank.hackathonconsumer.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.sberbank.hackathonconsumer.entities.*;
import ru.sberbank.hackathonconsumer.respositories.*;

import java.util.List;

@Service
@RequiredArgsConstructor
public class WebSocketService {

    private final ArmRepository armRepository;
    private final DoorRepository doorRepository;
    private final RouterRepository routerRepository;
    private final RoomRepository roomRepository;
    private final UserRepository userRepository;
    private final UserEventRepository userEventRepository;

    public List<Arm> getArms() {
        return armRepository.findAll();
    }

    public List<Door> getDoors() {
        return doorRepository.findAll();
    }

    public List<Router> getRouters() {
        return routerRepository.findAll();
    }

    public List<Room> getRooms() {
        return roomRepository.findAll();
    }

    public List<User> getUsers() {
        return userRepository.findAll();
    }

    public List<UserEvent> getUserEvents() {
        return userEventRepository.findAll();
    }
}

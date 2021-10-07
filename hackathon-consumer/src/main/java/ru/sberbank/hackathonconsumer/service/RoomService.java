package ru.sberbank.hackathonconsumer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.sberbank.hackathonconsumer.entity.Room;
import ru.sberbank.hackathonconsumer.repository.RoomRepository;

import javax.annotation.PostConstruct;

@Service
public class RoomService {
    private final RoomRepository roomRepository;

    public RoomService(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    @PostConstruct
    public void save() {
        Room room = new Room();
        room.setName("ААА");
        roomRepository.save(room);
    }
}

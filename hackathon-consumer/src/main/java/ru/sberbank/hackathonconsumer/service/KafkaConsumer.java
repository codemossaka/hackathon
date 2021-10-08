package ru.sberbank.hackathonconsumer.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Service;
import ru.sberbank.hackathonconsumer.dto.UserEventDto;
import ru.sberbank.hackathonconsumer.entities.UserEvent;
import ru.sberbank.hackathonconsumer.respositories.DoorRepository;
import ru.sberbank.hackathonconsumer.respositories.RoomRepository;
import ru.sberbank.hackathonconsumer.respositories.UserEventRepository;
import ru.sberbank.hackathonconsumer.respositories.UserRepository;

import java.util.LinkedList;
import java.util.List;

@Service
@Slf4j
@AllArgsConstructor
public class KafkaConsumer {
    private final UserRepository userRepository;
    private final DoorRepository doorRepository;
    private final RoomRepository roomRepository;
    private final UserEventRepository userEventRepository;
    private final SimpMessagingTemplate template;
    @KafkaListener(topics = "user-events", groupId = "group_id")
    public void consume(String message) {
        ObjectMapper mapper = new ObjectMapper();
        List<UserEventDto> userEventDtos;
        try {
            userEventDtos = mapper.readValue(message, new TypeReference<List<UserEventDto>>(){});
        } catch (JsonProcessingException e) {
            log.warn("Невозможно распарсить событие из producer: " + message);
            throw new RuntimeException("Невозможно распарсить сообщение из producer: " + message);
        }
        template.convertAndSend("/topic/userEvent", saveUserEvent(userEventDtos));
    }

    private List<UserEvent> saveUserEvent(List<UserEventDto> userEventDtos) {
        List<UserEvent> userEvents = new LinkedList<>();
        for (UserEventDto userEventDto: userEventDtos) {
            UserEvent userEvent = new UserEvent();
            userEvent.setId(userEvent.getId());
            userEvent.setUser(userRepository.getById(userEventDto.getUserId()));
            userEvent.setDoor(doorRepository.getById(userEventDto.getDoorId()));
            userEvent.setEntry(roomRepository.getById(userEventDto.getEntryRoomId()));
            userEvent.setExit(roomRepository.getById(userEventDto.getExitRoomId()));
            userEvent.setCreatedAt(userEventDto.getCreatedAt());

            userEvents.add(userEventRepository.saveAndFlush(userEvent));
        }
        return userEvents;
    }

}

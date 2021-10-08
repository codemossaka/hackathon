package ru.sberbank.hackathonproducer;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.sberbank.hackathonproducer.dto.UserEvent;
import ru.sberbank.hackathonproducer.service.ProducerService;

import java.util.UUID;

@SpringBootApplication
@RequiredArgsConstructor
public class HackathonProducerApplication implements CommandLineRunner {

	private final ProducerService producerService;

	public static void main(String[] args) {
		SpringApplication.run(HackathonProducerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		Пользователь сидит в 100B
		UserEvent userEvent6 = new UserEvent();
		userEvent6.setId(1L);
		userEvent6.setUserId(2L);
		userEvent6.setDoorId(3L);
		userEvent6.setEntryRoomId(3L);
		userEvent6.setExitRoomId(6L);
		producerService.produce(userEvent6);

//		Пользователь сидит в guest area
		UserEvent userEvent7 = new UserEvent();
		userEvent7.setId(2L);
		userEvent7.setUserId(3L);
		userEvent7.setDoorId(6L);
		userEvent7.setEntryRoomId(1L);
		userEvent7.setExitRoomId(6L);
		producerService.produce(userEvent7);

//		Пользователь сидит в guest area
		UserEvent userEvent8 = new UserEvent();
		userEvent8.setId(3L);
		userEvent8.setUserId(4L);
		userEvent8.setDoorId(6L);
		userEvent8.setEntryRoomId(1L);
		userEvent8.setExitRoomId(6L);
		producerService.produce(userEvent8);

//		Пользователь сидит в Lobby
		UserEvent userEvent9 = new UserEvent();
		userEvent9.setId(1L);
		userEvent9.setUserId(5L);
		userEvent9.setDoorId(2L);
		userEvent9.setEntryRoomId(6L);
		userEvent9.setExitRoomId(3L);
		producerService.produce(userEvent9);

		while (true){
			// Пользователь с улицы заходить в лобби, из лобби в guest room
			Thread.sleep(5000);
			UserEvent userEvent = new UserEvent();
			userEvent.setId(UUID.randomUUID().getMostSignificantBits() & Long.MAX_VALUE);
			userEvent.setUserId(1L);
			userEvent.setDoorId(1L);
			userEvent.setEntryRoomId(2L);
			userEvent.setExitRoomId(7L);
			producerService.produce(userEvent);
			Thread.sleep(5000);
//			из лобби в guest room
			UserEvent userEvent1 = new UserEvent();
			userEvent1.setId(UUID.randomUUID().getMostSignificantBits() & Long.MAX_VALUE);
			userEvent1.setUserId(1L);
			userEvent1.setDoorId(6L);
			userEvent1.setEntryRoomId(6L);
			userEvent1.setExitRoomId(2L);
			producerService.produce(userEvent1);
			//	из guest room в лобби
			Thread.sleep(5000);
			UserEvent userEvent2 = new UserEvent();
			userEvent2.setId(UUID.randomUUID().getMostSignificantBits() & Long.MAX_VALUE);
			userEvent2.setUserId(1L);
			userEvent2.setDoorId(6L);
			userEvent2.setEntryRoomId(2L);
			userEvent2.setExitRoomId(6L);
			producerService.produce(userEvent2);
			// из лобби на 100A
			Thread.sleep(5000);
			UserEvent userEvent3 = new UserEvent();
			userEvent3.setId(UUID.randomUUID().getMostSignificantBits() & Long.MAX_VALUE);
			userEvent3.setUserId(1L);
			userEvent3.setDoorId(2L);
			userEvent3.setEntryRoomId(3L);
			userEvent3.setExitRoomId(2L);
			producerService.produce(userEvent3);
			// из 100A в лобби
			Thread.sleep(5000);
			UserEvent userEvent4 = new UserEvent();
			userEvent4.setId(UUID.randomUUID().getMostSignificantBits() & Long.MAX_VALUE);
			userEvent4.setUserId(1L);
			userEvent4.setDoorId(2L);
			userEvent4.setEntryRoomId(2L);
			userEvent4.setExitRoomId(3L);
			producerService.produce(userEvent4);
			// из лобби на свободу
			Thread.sleep(5000);
			UserEvent userEvent5 = new UserEvent();
			userEvent5.setId(UUID.randomUUID().getMostSignificantBits() & Long.MAX_VALUE);
			userEvent5.setUserId(1L);
			userEvent5.setDoorId(1L);
			userEvent5.setEntryRoomId(7L);
			userEvent5.setExitRoomId(2L);
			producerService.produce(userEvent5);
		}
	}
}

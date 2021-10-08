package ru.sberbank.hackathonproducer;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.sberbank.hackathonproducer.dto.UserEvent;
import ru.sberbank.hackathonproducer.service.ProducerService;

@SpringBootApplication
@RequiredArgsConstructor
public class HackathonProducerApplication implements CommandLineRunner {

	private final ProducerService producerService;

	public static void main(String[] args) {
		SpringApplication.run(HackathonProducerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		while (true){
			// Пользователь с улицы заходить в лобби, из лобби в guest room
			Thread.sleep(5000);
			UserEvent userEvent = new UserEvent();
			userEvent.setId(1L);
			userEvent.setUserId(1L);
			userEvent.setDoorId(1L);
			userEvent.setEntryRoomId(2L);
			userEvent.setExitRoomId(null);
			producerService.produce(userEvent);
			Thread.sleep(5000);
//			из лобби в guest room
			UserEvent userEvent1 = new UserEvent();
			userEvent1.setId(1L);
			userEvent1.setUserId(1L);
			userEvent1.setDoorId(6L);
			userEvent1.setEntryRoomId(6L);
			userEvent1.setExitRoomId(2L);
			producerService.produce(userEvent1);
			//	из guest room в лобби
			Thread.sleep(5000);
			UserEvent userEvent2 = new UserEvent();
			userEvent2.setId(1L);
			userEvent2.setUserId(1L);
			userEvent2.setDoorId(6L);
			userEvent2.setEntryRoomId(2L);
			userEvent2.setExitRoomId(6L);
			producerService.produce(userEvent2);
			// из лобби на 100A
			Thread.sleep(5000);
			UserEvent userEvent3 = new UserEvent();
			userEvent3.setId(1L);
			userEvent3.setUserId(1L);
			userEvent3.setDoorId(2L);
			userEvent3.setEntryRoomId(3L);
			userEvent3.setExitRoomId(2L);
			producerService.produce(userEvent3);
			// из 100A в лобби
			Thread.sleep(5000);
			UserEvent userEvent4 = new UserEvent();
			userEvent4.setId(1L);
			userEvent4.setUserId(1L);
			userEvent4.setDoorId(2L);
			userEvent4.setEntryRoomId(2L);
			userEvent4.setExitRoomId(3L);
			producerService.produce(userEvent4);
			// из лобби на свободу
			Thread.sleep(5000);
			UserEvent userEvent5 = new UserEvent();
			userEvent5.setId(1L);
			userEvent5.setUserId(1L);
			userEvent5.setDoorId(1L);
			userEvent5.setEntryRoomId(null);
			userEvent5.setExitRoomId(2L);
			producerService.produce(userEvent5);
		}
	}
}

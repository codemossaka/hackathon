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
			Thread.sleep(2000);
			UserEvent userEvent = new UserEvent();
			userEvent.setId((long) ((Math.random() * ((100 - 1) + 1)) + 1));
			userEvent.setUserId((long) ((Math.random() * ((10 - 1) + 1)) + 1));
			userEvent.setDoorId((long) ((Math.random() * ((5 - 1) + 1)) + 1));
			userEvent.setEntryRoomId((long) ((Math.random() * ((6 - 1) + 1)) + 1));
			userEvent.setExitRoomId((long) ((Math.random() * ((6 - 1) + 1)) + 1));
			producerService.produce(userEvent);
		}
	}
}

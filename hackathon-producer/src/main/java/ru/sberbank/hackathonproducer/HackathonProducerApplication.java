package ru.sberbank.hackathonproducer;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
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
		producerService.produce();
	}
}

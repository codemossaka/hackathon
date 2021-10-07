package ru.sberbank.hackathonconsumer;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.sberbank.hackathonconsumer.entities.Arm;
import ru.sberbank.hackathonconsumer.entities.Door;
import ru.sberbank.hackathonconsumer.entities.Router;
import ru.sberbank.hackathonconsumer.respositories.ArmRepository;
import ru.sberbank.hackathonconsumer.respositories.DoorRepository;
import ru.sberbank.hackathonconsumer.respositories.RouterRepository;

@SpringBootApplication
@RequiredArgsConstructor
public class HackathonConsumerApplication implements CommandLineRunner {

	private final RouterRepository routerRepository;
	private final ArmRepository armRepository;
	private final DoorRepository doorRepository;

	public static void main(String[] args) {
		SpringApplication.run(HackathonConsumerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Router router1 = new Router();
		router1.setId(1L);
		router1.setName("r1");
		routerRepository.save(router1);
		Router router2 = new Router();
		router2.setId(2L);
		router2.setName("r2");
		routerRepository.save(router2);
		Router router3 = new Router();
		router3.setId(3L);
		router3.setName("r3");
		routerRepository.save(router3);
		Router router4 = new Router();
		router4.setId(4L);
		router4.setName("r4");
		routerRepository.saveAndFlush(router4);

		Arm arm1 = new Arm();
		arm1.setId(1L);
		arm1.setRouter(router1);
		arm1.setStatus("logout");
		armRepository.save(arm1);
		Arm arm2 = new Arm();
		arm2.setId(2L);
		arm2.setRouter(router1);
		arm2.setStatus("logout");
		armRepository.save(arm2);
		Arm arm3 = new Arm();
		arm3.setId(3L);
		arm3.setRouter(router1);
		arm3.setStatus("logout");
		armRepository.save(arm3);
		Arm arm4 = new Arm();
		arm4.setId(4L);
		arm4.setRouter(router2);
		arm4.setStatus("logout");
		armRepository.save(arm4);
		Arm arm5 = new Arm();
		arm5.setId(5L);
		arm5.setRouter(router4);
		arm5.setStatus("logout");
		armRepository.saveAndFlush(arm5);

		Door door1 = new Door();
		door1.setId(1L);
		door1.setName("From receptionAre to Lobby");
		doorRepository.save(door1);
		Door door2 = new Door();
		door2.setId(2L);
		door2.setName("From Lobby to 100A");
		doorRepository.save(door2);
		Door door3 = new Door();
		door3.setId(3L);
		door3.setName("From Lobby to 100B");
		doorRepository.save(door3);
		Door door4 = new Door();
		door4.setId(4L);
		door4.setName("From Lobby to 100C");
		doorRepository.save(door4);
		Door door5 = new Door();
		door5.setId(5L);
		door5.setName("From Lobby to 100D");
		doorRepository.saveAndFlush(door5);
	}
}

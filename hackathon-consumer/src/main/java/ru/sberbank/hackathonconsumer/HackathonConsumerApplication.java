package ru.sberbank.hackathonconsumer;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.sberbank.hackathonconsumer.entities.*;
import ru.sberbank.hackathonconsumer.respositories.*;

@SpringBootApplication
@RequiredArgsConstructor
public class HackathonConsumerApplication implements CommandLineRunner {

	private final RouterRepository routerRepository;
	private final ArmRepository armRepository;
	private final DoorRepository doorRepository;
	private final UserRepository userRepository;
	private final RoomRepository roomRepository;

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
		door1.setName("From street to Lobby");
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
		doorRepository.save(door5);
		Door door6 = new Door();
		door6.setId(6L);
		door6.setName("From Lobby to guest area");
		doorRepository.saveAndFlush(door6);

		Room room1 = new Room();
		room1.setId(1L);
		room1.setName("Guest Area");
		roomRepository.save(room1);
		Room room2 = new Room();
		room2.setId(2L);
		room2.setName("Lobby");
		roomRepository.save(room2);
		Room room3 = new Room();
		room3.setId(3L);
		room3.setName("100A");
		roomRepository.save(room3);
		Room room4 = new Room();
		room4.setId(4L);
		room4.setName("100B");
		roomRepository.save(room4);
		Room room5 = new Room();
		room5.setId(5L);
		room5.setName("100C");
		roomRepository.save(room5);
		Room room6 = new Room();
		room6.setId(6L);
		room6.setName("100D");
		roomRepository.saveAndFlush(room6);

		User user1 = new User();
		user1.setId(1L);
		user1.setFullname("Ессонга Пея-Бамба");
		user1.setRouter(router1);
		user1.setArm(arm1);
		userRepository.save(user1);
		User user2 = new User();
		user2.setId(2L);
		user2.setFullname("Рабадангаджиев Муртазали Магомедгаджиевич");
		user2.setRouter(router2);
		user2.setArm(arm2);
		userRepository.save(user2);
		User user3 = new User();
		user3.setId(3L);
		user3.setFullname("Лазаренко Сергей Александрович");
		user3.setRouter(router3);
		user3.setArm(arm3);
		userRepository.save(user3);
		User user4 = new User();
		user4.setId(4L);
		user4.setFullname("Лопаткин Вадим Валерьевич");
		user4.setRouter(router4);
		user4.setArm(arm4);
		userRepository.save(user4);
		User user5 = new User();
		user5.setId(5L);
		user5.setFullname("Афонин Илья Игоревич");
		user5.setRouter(router1);
		user5.setArm(arm5);
		userRepository.save(user5);
		User user6 = new User();
		user6.setId(6L);
		user6.setFullname("Дадорин Дмитрий Юрьевич");
		user6.setRouter(router2);
		user6.setArm(arm1);
		userRepository.save(user6);
		User user7 = new User();
		user7.setId(7L);
		user7.setFullname("Иванова Елена Сергеевна");
		user7.setRouter(router3);
		user7.setArm(arm2);
		userRepository.save(user7);
		User user8 = new User();
		user8.setId(8L);
		user8.setFullname("Ардаков Игорь Герасимович");
		user8.setRouter(router4);
		user8.setArm(arm3);
		userRepository.save(user8);
		User user9 = new User();
		user9.setId(9L);
		user9.setFullname("Логинова Екатерина Олеговна");
		user9.setRouter(router3);
		user9.setArm(arm2);
		userRepository.save(user9);
		User user10 = new User();
		user10.setId(10L);
		user10.setFullname("Полякова Вера Дмитриевна");
		user10.setRouter(router4);
		user10.setArm(arm3);
		userRepository.saveAndFlush(user10);

	}
}

package com.course.kafka;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;


@EnableScheduling
@SpringBootApplication
public class KafkaCoreProducerApplication implements CommandLineRunner {

//	@Autowired
//	private HelloKafkaProducer producer;

	public static void main(String[] args) {
		SpringApplication.run(KafkaCoreProducerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception{
//		producer.sendHello("Mohit Sajwan "+ ThreadLocalRandom.current().nextInt());
	}
}

package com.course.kafka;

import com.course.kafka.entity.Employee;
import com.course.kafka.producer.Employee2JsonProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.time.LocalDate;


@EnableScheduling
@SpringBootApplication
public class KafkaCoreProducerApplication implements CommandLineRunner {

//	@Autowired
//	private HelloKafkaProducer producer;

//	@Autowired
//	private KafkaKeyProducer producer;

//	@Autowired
//	private EmployeeJsonProducer producer;

	@Autowired
	private Employee2JsonProducer producer;


	public static void main(String[] args) {
		SpringApplication.run(KafkaCoreProducerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception{
//		producer.sendHello("Mohit Sajwan "+ ThreadLocalRandom.current().nextInt());

//		for(int i=0;i<10000;i++){
//			var key = "key-"+(i%4);
//			var value = "value "+i+" with key "+key;
//			producer.sendMessage(key,value);
//			TimeUnit.SECONDS.sleep(1);
//		}

		for(int i=0;i<5;i++){
			var emp = new Employee("Employee-"+i,"Emp-"+i, LocalDate.now());
			producer.sendMessage(emp);
		}
	}
}

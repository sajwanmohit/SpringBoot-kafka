package com.course.kafka.producer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicInteger;

@Service
public class FixedProducer2 {

    private static final Logger LOG = LoggerFactory.getLogger(FixedProducer2.class);

    @Autowired
    KafkaTemplate<String,String> kafkaTemplate;

    private AtomicInteger counter = new AtomicInteger();

    @Scheduled(fixedRate = 1000)
    public void sendMessage(){
        var i = counter.incrementAndGet();
        LOG.info("i is "+i);
        kafkaTemplate.send("t-fixed-rate-2","fixed-rate "+i);
    }
}
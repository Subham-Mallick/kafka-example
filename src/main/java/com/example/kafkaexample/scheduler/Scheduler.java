package com.example.kafkaexample.scheduler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.ZonedDateTime;

/**
 * @author subham.mallick on 20/04/22
 */
@Component
public class Scheduler {
    @Autowired
    private KafkaTemplate<String,String> kafkaTemplate;

    @Scheduled(fixedRate = 500)
    public void publishScheduled(){
        kafkaTemplate.send("scheduled", ZonedDateTime.now().toString());
    }
}

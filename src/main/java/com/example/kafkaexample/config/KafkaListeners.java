package com.example.kafkaexample.config;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * @author subham.mallick on 20/04/22
 */
@Component
public class KafkaListeners {

    @KafkaListener(
            topics = "subhamCode",
            groupId = "groupId-foo-1"
    )
    void listenerSubhamCode(String data){
        System.out.println("RECEIVED: " + data + " :) ");
    }

    @KafkaListener(
            topics = "scheduled",
            groupId = "groupId-foo-1"
    )
    void listenerScheduled(String data){
        System.out.println("RECEIVED: " + data + " :) ");
    }

}

package com.example.kafkaexample.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

/**
 * @author subham.mallick on 20/04/22
 */
@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic subhamCodeTopic(){
        return TopicBuilder
                .name("subhamCode")
                .build();
    }

    @Bean
    public NewTopic scheduledTopic(){
        return TopicBuilder
                .name("scheduled")
                .build();
    }



}

package com.sprigBootBasicToPro.Kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {



    @KafkaListener(topics = "myTopic",groupId = "myTopic")
    public void listenTopic(String receivedMessage){
        System.out.println("This message coming from the producer -"+ receivedMessage);
    }


}

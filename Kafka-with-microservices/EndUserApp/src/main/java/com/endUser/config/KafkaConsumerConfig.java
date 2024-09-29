package com.endUser.config;

import com.endUser.constants.AppConstants;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class KafkaConsumerConfig {

    @KafkaListener(topics = AppConstants.LOCATION_UPDATE_TOPIC, groupId= AppConstants.GROUP_ID)
    public void updatedLocation(String receiveLocationValue){

        System.out.println(receiveLocationValue);
    }
}

package com.konark.consumer.Controllers;

import com.konark.consumer.Model.RiderLocation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Consumer;

@Configuration
public class KafkaConsumerNew {
    @Bean
    public Consumer<RiderLocation> processRiderLocation() {
        return riderLocation -> {
            System.out.println("Received rider location: " + riderLocation.getRiderId() +
                               ", Latitude: " + riderLocation.getLatitude() +
                               ", Longitude: " + riderLocation.getLongitude());
        };
    }
}

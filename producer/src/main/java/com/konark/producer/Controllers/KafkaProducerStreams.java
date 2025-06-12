package com.konark.producer.Controllers;

import com.konark.producer.Model.RiderLocation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Supplier;

@Configuration
public class KafkaProducerStreams {
    @Bean
    public Supplier<RiderLocation> sendRiderLocation() {
        return () -> {
            RiderLocation riderLocation = new RiderLocation("rider123", 12.9716, 77.5946);
            System.out.println("Sending rider location: " + riderLocation.getRiderId() +
                               ", Latitude: " + riderLocation.getLatitude() +
                               ", Longitude: " + riderLocation.getLongitude());

            return riderLocation;
        };
    }
}

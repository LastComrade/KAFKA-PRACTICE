package com.konark.consumer.Controllers;

//import com.konark.consumer.Model.RiderLocation;
//import org.springframework.kafka.annotation.KafkaListener;
//import org.springframework.stereotype.Component;
//
//@Component
//public class KafkaConsumer {
//    @KafkaListener(topics = "my-topic", groupId = "my-new-group")
//    public void listen1(String message) {
//        System.out.println("Received message 1: " + message);
//    }
//
//    @KafkaListener(topics = "my-topic", groupId = "my-new-group")
//    public void listen2(String message) {
//        System.out.println("Received message 2: " + message);
//    }
//
//    @KafkaListener(topics = "my-new-topic", groupId = "rider-location-group")
//    public void listen3(RiderLocation riderLocation) {
//        System.out.println("Received rider location: " + riderLocation.getRiderId() +
//                           ", Latitude: " + riderLocation.getLatitude() +
//                           ", Longitude: " + riderLocation.getLongitude());
//    }
//}

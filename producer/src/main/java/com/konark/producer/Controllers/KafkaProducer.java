package com.konark.producer.Controllers;

//import com.konark.producer.Model.RiderLocation;
//import org.springframework.kafka.core.KafkaTemplate;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("/api")
//public class KafkaProducer {
//    private final KafkaTemplate<String, ++RiderLocation> kafkaTemplate;
//
//    public KafkaProducer(KafkaTemplate<String, RiderLocation> kafkaTemplate) {
//        this.kafkaTemplate = kafkaTemplate;
//    }
//
//    @PostMapping("/send")
//    public String sendMessage(@RequestParam String riderId, @RequestParam double latitude, @RequestParam double longitude) {
//        RiderLocation riderLocation = new RiderLocation(riderId, latitude, longitude);
//
//        kafkaTemplate.send("my-new-topic", riderLocation);
//
//        return "Message sent to Kafka topic - [my-new-topic]: " + riderLocation.toString();
//    }
//}

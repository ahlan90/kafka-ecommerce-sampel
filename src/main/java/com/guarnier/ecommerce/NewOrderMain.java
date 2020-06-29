package com.guarnier.ecommerce;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;

import java.util.Properties;

public class NewOrderMain {

    public static void main(String[] args) {
        var producer = new KafkaProducer<String, String>(properties());
    }

    private static Properties properties() {
        var properties = new Properties();
        properties.setProperty(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "127.0.0.1:9092");
        return properties;
    }
}

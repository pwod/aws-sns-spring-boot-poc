package com.awsnsspringbootpoc.publisher;

import com.awsnsspringbootpoc.pojo.Pojo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.aws.messaging.core.NotificationMessagingTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class Publisher {

    @Value("${cloud.aws.end-point.uri}")
    private String endpoint;

    NotificationMessagingTemplate messagingTemplate;

    public Publisher(NotificationMessagingTemplate messagingTemplate) {
        this.messagingTemplate = messagingTemplate;
    }

    @Scheduled(fixedRate = 10000)
    public void scheduleFixedRateTask() {
        log.info("Sending Message to SNS ");
        messagingTemplate.sendNotification("spring-boot-test-topic", new Pojo("Patrick", 28),"teste");

    }
}
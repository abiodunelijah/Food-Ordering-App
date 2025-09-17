package com.coder2client;

import com.coder2client.email_notification.dtos.NotificationDTO;
import com.coder2client.email_notification.service.NotificationService;
import com.coder2client.enums.NotificationType;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
@RequiredArgsConstructor
public class FoodOrderingAppApplication {

    private final NotificationService notificationService;

    public static void main(String[] args) {
        SpringApplication.run(FoodOrderingAppApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(){
        return args -> {
            NotificationDTO notificationDTO = NotificationDTO.builder()
                    .recipient("abbey4me2u@gmail.com")
                    .subject("Hello, Testing")
                    .body("This is a testing email.")
                    .type(NotificationType.EMAIL)
                    .build();

            notificationService.sendEmail(notificationDTO);
        };
    }
}

package com.coder2client.email_notification.repository;


import com.coder2client.email_notification.entity.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationRepository extends JpaRepository<Notification, Long> {
}

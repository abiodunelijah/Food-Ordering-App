package com.coder2client.email_notification.service;

import com.coder2client.email_notification.dtos.NotificationDTO;

public interface NotificationService {

    void sendEmail(NotificationDTO notificationDTO);
}

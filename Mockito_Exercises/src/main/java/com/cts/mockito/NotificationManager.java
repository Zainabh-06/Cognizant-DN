package com.cts.mockito;

public class NotificationManager {

    private NotificationService notificationService;

    public NotificationManager(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void notifyUser(String message) {
        notificationService.sendNotification(message);
    }
}
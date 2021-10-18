package com.kodilla.mockito.notification.homework;

import com.kodilla.mockito.notification.Notification;

import java.util.ArrayList;
import java.util.List;

public interface MyClient {

    void receive(WeatherNotification weatherNotification);
    void receiveNotificationAlert(NotificationAlert notificationAlert);

    void addCities(Cities cities);
    void removeCities(Cities cities);

}

package com.kodilla.mockito.notification.homework;

import java.util.*;

public class WeatherAlertService {

    Map<MyClient, Cities> alertSystem = new HashMap<>();

    public void addSubscriber(MyClient myClient, Cities cities) {
        for (Map.Entry<MyClient, Cities> myClientEntry : alertSystem.entrySet()) {
            if (myClientEntry.getKey().equals(myClient)) {
                myClientEntry.getKey().addCities(cities);
            }
        }
        alertSystem.put(myClient, cities);
    }

    public void removeSubscriber(MyClient myClient, Cities cities) {
        for (Map.Entry<MyClient, Cities> myClientEntry : alertSystem.entrySet()) {
            if (myClientEntry.getKey().equals(myClient)) {
                myClientEntry.getKey().removeCities(cities);
            }
        }
        alertSystem.remove(myClient);
    }

    public void sendNotification(WeatherNotification weatherNotification) {
            this.alertSystem.forEach((myClient, cities) -> myClient.receive(weatherNotification));

    }

    public void sendNotificationAlertToAllSubscribers(NotificationAlert notificationAlert) {
        this.alertSystem.forEach(((myClient, cities) -> myClient.receiveNotificationAlert(notificationAlert)));
    }

    public void removeCity(Cities cities) {
        for (Map.Entry<MyClient, Cities> myCitiesEntry : alertSystem.entrySet()) {
            if (myCitiesEntry.getValue().equals(cities)) {
                myCitiesEntry.getValue().removeCities();
            }
        }
        alertSystem.remove(cities);
    }
}

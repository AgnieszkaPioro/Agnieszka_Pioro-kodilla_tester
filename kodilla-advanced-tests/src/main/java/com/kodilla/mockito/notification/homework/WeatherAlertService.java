package com.kodilla.mockito.notification.homework;
import java.util.*;

public class WeatherAlertService {


    private Map<MyClient, List<Cities>> alertSystem = new HashMap<>();


    public void addSubscriber(MyClient myClient, Cities cities) {

        List<Cities> citiesList = new ArrayList<>();

        if (this.alertSystem.containsKey(myClient)) {
            alertSystem.get(myClient).add(cities);
        } else {
            citiesList.add(cities);
            alertSystem.put(myClient, citiesList);
        }
    }
    public void removeSubscriber(MyClient myClient, Cities cities) {

        List<Cities> citiesList = alertSystem.get(myClient);
        if (citiesList != null) {
            citiesList.remove(cities);
            if (citiesList.isEmpty()) {
                alertSystem.remove(myClient);
            }
        }


//        for (Map.Entry<MyClient, List<Cities>> myClientEntry : alertSystem.entrySet()) {
//            if (myClientEntry.getKey().equals(myClient)) {
//                myClientEntry.getValue().remove(cities);
//            } if (myClientEntry.getValue().isEmpty()) {
//                alertSystem.remove(myClient);
//            }
//        }
    }
    public void sendNotification(Cities cities) {

        alertSystem.entrySet()
                .stream()
                .filter(n -> n.getValue().contains(cities))
                .forEach(n -> n.getKey().receive(cities));
    }
    public void sendNotificationAlertToAllSubscribers(NotificationAlert notificationAlert) {
        alertSystem.entrySet()
                .stream()
                .forEach(n -> n.getKey().receiveNotificationAlert(notificationAlert));
        }

    public void removeCity(Cities cities) {
//      this.citiesList.remove(cities);
        this.alertSystem.remove(cities);
    }
}


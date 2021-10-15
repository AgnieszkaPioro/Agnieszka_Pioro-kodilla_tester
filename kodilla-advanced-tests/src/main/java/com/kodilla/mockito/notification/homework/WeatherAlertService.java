package com.kodilla.mockito.notification.homework;

import java.util.*;

public class WeatherAlertService {

    Map<List<MyClient>, String> alertSystem = new HashMap<>();
    List<MyClient> clientsListCracow = new ArrayList<>();
    List<MyClient> clientsListWroclaw = new ArrayList<>();
    List<MyClient> allClients = new ArrayList<>();


    public void addListOfClientsCracowToMap() {

        alertSystem.put(clientsListCracow, "Cracow");
    }

    public void removeLocationCracowFromMap() {

        alertSystem.remove(clientsListCracow, "Cracow");
    }

    public int showSizeOfMap() {

        return alertSystem.size();
    }

    public void removeLocationWroclawFromMap() {

        alertSystem.remove(clientsListWroclaw, "Wroclaw");
    }

    public void addListOfClientsWroclawToMap() {

        alertSystem.put(clientsListWroclaw, "Wroclaw");
    }

    public void addSubscriberCracow(MyClient myClient) {

        this.clientsListCracow.add(myClient);
        this.allClients.add(myClient);
    }

    public void addSubscriberWroclaw(MyClient myClient) {

        this.clientsListWroclaw.add(myClient);
        this.allClients.add(myClient);
    }

    public void removeSubscriberCracow(MyClient myClient) {

        this.clientsListCracow.remove(myClient);
    }

    public void removeSubscriberWroclaw(MyClient myClient) {

        this.clientsListWroclaw.remove(myClient);
    }

    public void removeSubscriberFromAllNotification(MyClient myClient) {
        this.clientsListCracow.remove(myClient);
        this.clientsListWroclaw.remove(myClient);
        this.allClients.remove(myClient);
    }

    public void sendNotificationToAllClients(NotificationAll notificationAll) {

        this.allClients.forEach(myClient -> myClient.receiveAll(notificationAll));
    }

    public void sendNotificationCracow(NotificationCracow notificationCracow) {

        this.clientsListCracow.forEach(myClient -> myClient.receiveCracow(notificationCracow));
    }

    public void sendNotificationWroclaw(NotificationWroclaw notificationWroclaw) {

        this.clientsListWroclaw.forEach(myClient -> myClient.receiveWroclaw(notificationWroclaw));
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WeatherAlertService that = (WeatherAlertService) o;
        return Objects.equals(clientsListCracow, that.clientsListCracow) && Objects.equals(clientsListWroclaw, that.clientsListWroclaw) && Objects.equals(alertSystem, that.alertSystem);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientsListCracow, clientsListWroclaw, alertSystem);
    }
}

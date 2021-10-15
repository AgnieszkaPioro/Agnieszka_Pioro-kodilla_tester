package com.kodilla.mockito.homework;

import com.kodilla.mockito.notification.Notification;
import com.kodilla.mockito.notification.homework.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

public class WeatherAlertTestSuite {

    WeatherAlertService weatherAlertService = new WeatherAlertService();
    MyClient client = Mockito.mock(MyClient.class);
    NotificationCracow notificationCracow = Mockito.mock(NotificationCracow.class);
    NotificationWroclaw notificationWroclaw = Mockito.mock(NotificationWroclaw.class);
    NotificationAll notificationAll = Mockito.mock(NotificationAll.class);
    MyClient secondClient = Mockito.mock(MyClient.class);
    MyClient thirdClient = Mockito.mock(MyClient.class);


    @Test
    public void unsubscribedClientShouldNotReceiveNotification() {

        weatherAlertService.sendNotificationCracow(notificationCracow);
        Mockito.verify(client, Mockito.never()).receiveCracow(notificationCracow);
    }
    @Test
    public void subscribedClientShouldReceiveNotificationFromHisLocation(){

        weatherAlertService.addSubscriberCracow(client);
        weatherAlertService.sendNotificationCracow(notificationCracow);
        weatherAlertService.addListOfClientsCracowToMap();
        weatherAlertService.addListOfClientsWroclawToMap();

        Mockito.verify(client, Mockito.times(1)).receiveCracow(notificationCracow);
    }
    @Test
    public void clientCanDeleteSubscriptionFromHisLocation(){

        weatherAlertService.addSubscriberCracow(client);
        weatherAlertService.addSubscriberWroclaw(client);
        weatherAlertService.removeSubscriberWroclaw(client);
        weatherAlertService.sendNotificationCracow(notificationCracow);
        weatherAlertService.sendNotificationWroclaw(notificationWroclaw);
        weatherAlertService.addListOfClientsCracowToMap();
        weatherAlertService.addListOfClientsWroclawToMap();

        Mockito.verify(client, Mockito.times(1)).receiveCracow(notificationCracow);
        Mockito.verify(client, Mockito.times(0)).receiveWroclaw(notificationWroclaw);

    }
    @Test
    public void clientCanDeleteAllHisSubscription(){

        weatherAlertService.addSubscriberCracow(client);
        weatherAlertService.addSubscriberWroclaw(client);
        weatherAlertService.removeSubscriberFromAllNotification(client);
        weatherAlertService.sendNotificationCracow(notificationCracow);
        weatherAlertService.sendNotificationWroclaw(notificationWroclaw);
        weatherAlertService.addListOfClientsCracowToMap();
        weatherAlertService.addListOfClientsWroclawToMap();

        Mockito.verify(client, Mockito.times(0)).receiveCracow(notificationCracow);
        Mockito.verify(client, Mockito.times(0)).receiveWroclaw(notificationWroclaw);
        Mockito.verify(client, Mockito.times(0)).receiveAll(notificationAll);

    }
    @Test
    public void notificationFromLocationShouldBeSentToAllSubscribers(){


        weatherAlertService.addSubscriberCracow(client);
        weatherAlertService.addSubscriberCracow(secondClient);
        weatherAlertService.addSubscriberCracow(thirdClient);
        weatherAlertService.addSubscriberWroclaw(client);
        weatherAlertService.addSubscriberWroclaw(secondClient);
        weatherAlertService.addSubscriberWroclaw(thirdClient);
        weatherAlertService.addListOfClientsCracowToMap();
        weatherAlertService.addListOfClientsWroclawToMap();
        weatherAlertService.sendNotificationCracow(notificationCracow);
        weatherAlertService.sendNotificationWroclaw(notificationWroclaw);

        Mockito.verify(client, Mockito.times(1)).receiveCracow(notificationCracow);
        Mockito.verify(secondClient, Mockito.times(1)).receiveCracow(notificationCracow);
        Mockito.verify(thirdClient, Mockito.times(1)).receiveCracow(notificationCracow);
        Mockito.verify(client, Mockito.times(1)).receiveWroclaw(notificationWroclaw);
        Mockito.verify(secondClient, Mockito.times(1)).receiveWroclaw(notificationWroclaw);
        Mockito.verify(thirdClient, Mockito.times(1)).receiveWroclaw(notificationWroclaw);
    }
    @Test
    public void notificationCanBeSendToAllSubscribers() {

        weatherAlertService.addSubscriberCracow(client);
        weatherAlertService.addSubscriberCracow(secondClient);
        weatherAlertService.addSubscriberWroclaw(client);
        weatherAlertService.addSubscriberWroclaw(thirdClient);
        weatherAlertService.sendNotificationToAllClients(notificationAll);
        weatherAlertService.addListOfClientsCracowToMap();
        weatherAlertService.addListOfClientsWroclawToMap();

        Mockito.verify(client, Mockito.times(2)).receiveAll(notificationAll);
        Mockito.verify(secondClient, Mockito.times(1)).receiveAll(notificationAll);
        Mockito.verify(thirdClient, Mockito.times(1)).receiveAll(notificationAll);

    }
    @Test
    public void locationCanBeDelete() {

        weatherAlertService.addSubscriberCracow(client);
        weatherAlertService.addSubscriberCracow(secondClient);
        weatherAlertService.addSubscriberWroclaw(client);
        weatherAlertService.addSubscriberWroclaw(thirdClient);
        weatherAlertService.addListOfClientsCracowToMap();
        weatherAlertService.addListOfClientsWroclawToMap();
        weatherAlertService.removeLocationCracowFromMap();

        int size = weatherAlertService.showSizeOfMap();
        Assertions.assertEquals(1, size);
    }

}

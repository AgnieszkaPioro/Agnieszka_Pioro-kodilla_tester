package com.kodilla.mockito.homework;
import com.kodilla.mockito.notification.homework.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class WeatherAlertTestSuite {

    WeatherAlertService weatherAlertService = new WeatherAlertService();
    MyClient client = Mockito.mock(MyClient.class);
    MyClient secondClient = Mockito.mock(MyClient.class);
    MyClient thirdClient = Mockito.mock(MyClient.class);
    WeatherNotification weatherNotification = Mockito.mock(WeatherNotification.class);
    Cities cracow = Mockito.mock(Cities.class);
    Cities wroclaw = Mockito.mock(Cities.class);
    NotificationAlert notificationAlert = Mockito.mock(NotificationAlert.class);

    @Test
    public void unsubscribedClientShouldNotReceiveNotification() {

        weatherAlertService.sendNotification(weatherNotification);
        Mockito.verify(client, Mockito.never()).receive(weatherNotification);
    }
    @Test
    public void subscribedClientShouldReceiveNotificationFromHisLocation(){

        weatherAlertService.addSubscriber(client, cracow);
        weatherAlertService.addSubscriber(secondClient, cracow);
        weatherAlertService.addSubscriber(thirdClient, cracow);
        weatherAlertService.sendNotification(weatherNotification);

        Mockito.verify(client, Mockito.times(1)).receive(weatherNotification);
        Mockito.verify(secondClient, Mockito.times(1)).receive(weatherNotification);
        Mockito.verify(thirdClient, Mockito.times(1)).receive(weatherNotification);
    }
    @Test
    public void clientCanDeleteSubscriptionFromHisLocation(){

        weatherAlertService.addSubscriber(client, cracow);
        weatherAlertService.removeSubscriber(client, cracow);
        weatherAlertService.sendNotification(weatherNotification);

        Mockito.verify(client, Mockito.times(0)).receive(weatherNotification);
    }
    @Test
    public void clientCanDeleteAllHisSubscription(){

        weatherAlertService.addSubscriber(client, cracow);
        weatherAlertService.addSubscriber(client, wroclaw);
        weatherAlertService.removeSubscriber(client, cracow);
        weatherAlertService.removeSubscriber(client, wroclaw);
        weatherAlertService.sendNotification(weatherNotification);

        Mockito.verify(client, Mockito.times(0)).receive(weatherNotification);
    }
    @Test
    public void notificationCanBeSendToAllSubscribers() {

        weatherAlertService.addSubscriber(client, cracow);
        weatherAlertService.addSubscriber(secondClient, wroclaw);
        weatherAlertService.sendNotificationAlertToAllSubscribers(notificationAlert);

        Mockito.verify(client, Mockito.times(1)).receiveNotificationAlert(notificationAlert);
        Mockito.verify(secondClient, Mockito.times(1)).receiveNotificationAlert(notificationAlert);
    }
    @Test
    public void CityCanBeDelete() {

        weatherAlertService.addSubscriber(client, cracow);
        weatherAlertService.addSubscriber(secondClient, cracow);
        weatherAlertService.removeCity(cracow);

        Mockito.verify(client, Mockito.times(0)).receive(weatherNotification);
        Mockito.verify(secondClient, Mockito.times(0)).receive(weatherNotification);
    }
}

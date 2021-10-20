package com.kodilla.mockito.homework;
import com.kodilla.mockito.notification.homework.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class WeatherAlertTestSuite {

    WeatherAlertService weatherAlertService = new WeatherAlertService();

    NotificationAlert notificationAlert = Mockito.mock(NotificationAlert.class);

    @Test
    public void unsubscribedClientShouldNotReceiveNotification() {

        Cities cracow = Mockito.mock(Cities.class);

        MyClient client = Mockito.mock(MyClient.class);
        weatherAlertService.sendNotification(cracow);
        Mockito.verify(client, Mockito.never()).receive(cracow);
    }
    @Test
    public void subscribedClientShouldReceiveNotificationFromHisLocation(){

        MyClient client = Mockito.mock(MyClient.class);
        MyClient secondClient = Mockito.mock(MyClient.class);
        MyClient thirdClient = Mockito.mock(MyClient.class);

        Cities cracow = Mockito.mock(Cities.class);


        weatherAlertService.addSubscriber(client, cracow);
        weatherAlertService.addSubscriber(secondClient, cracow);
        weatherAlertService.addSubscriber(thirdClient, cracow);
        weatherAlertService.sendNotification(cracow);

        Mockito.verify(client, Mockito.times(1)).receive(cracow);
        Mockito.verify(secondClient, Mockito.times(1)).receive(cracow);
        Mockito.verify(thirdClient, Mockito.times(1)).receive(cracow);
    }
    @Test
    public void clientCanDeleteSubscriptionFromHisLocation(){

        MyClient client = Mockito.mock(MyClient.class);

        Cities cracow = Mockito.mock(Cities.class);

        weatherAlertService.addSubscriber(client, cracow);
        weatherAlertService.removeSubscriber(client, cracow);
        weatherAlertService.sendNotification(cracow);

        Mockito.verify(client, Mockito.times(0)).receive(cracow);
    }
    @Test
    public void clientCanDeleteAllHisSubscription(){
        MyClient client = Mockito.mock(MyClient.class);
        Cities cracow = Mockito.mock(Cities.class);
        Cities wroclaw = Mockito.mock(Cities.class);

        weatherAlertService.addSubscriber(client, cracow);
        weatherAlertService.addSubscriber(client, wroclaw);
        weatherAlertService.removeSubscriber(client, cracow);
        weatherAlertService.removeSubscriber(client, wroclaw);
        weatherAlertService.sendNotification(cracow);
        weatherAlertService.sendNotification(wroclaw);

        Mockito.verify(client, Mockito.times(0)).receive(cracow);
        Mockito.verify(client, Mockito.times(0)).receive(wroclaw);
    }
    @Test
    public void notificationCanBeSendToAllSubscribers() {
        MyClient client = Mockito.mock(MyClient.class);
        MyClient secondClient = Mockito.mock(MyClient.class);
        Cities cracow = Mockito.mock(Cities.class);
        Cities wroclaw = Mockito.mock(Cities.class);

        weatherAlertService.addSubscriber(client, cracow);
        weatherAlertService.addSubscriber(secondClient, wroclaw);
        weatherAlertService.removeSubscriber(client,cracow);
        weatherAlertService.sendNotificationAlertToAllSubscribers(notificationAlert);

        Mockito.verify(client, Mockito.times(0)).receiveNotificationAlert(notificationAlert);
        Mockito.verify(secondClient, Mockito.times(1)).receiveNotificationAlert(notificationAlert);

    }
    @Test
    public void CityCanBeDelete() {
        MyClient client = Mockito.mock(MyClient.class);
        MyClient secondClient = Mockito.mock(MyClient.class);
        Cities cracow = Mockito.mock(Cities.class);
        Cities wroclaw = Mockito.mock(Cities.class);

        weatherAlertService.addSubscriber(client, cracow);
        weatherAlertService.addSubscriber(secondClient, cracow);
        weatherAlertService.removeCity(cracow);

        Mockito.verify(client, Mockito.times(0)).receive(cracow);
        Mockito.verify(secondClient, Mockito.times(0)).receive(cracow);
    }
}

package com.kodilla.mockito.notification.homework;

import java.util.ArrayList;
import java.util.List;

public interface MyClient {



    void receiveCracow(NotificationCracow notificationCracow);

    void receiveWroclaw(NotificationWroclaw notificationWroclaw);

    void receiveAll(NotificationAll notificationAll);
}

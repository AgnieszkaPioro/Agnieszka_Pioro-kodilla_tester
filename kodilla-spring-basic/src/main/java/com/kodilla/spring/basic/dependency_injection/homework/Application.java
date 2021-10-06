package com.kodilla.spring.basic.dependency_injection.homework;

public class Application {


    public static void main(String[] args) {
        DeliveryService deliveryService = new PolandDeliveryService();
        NotificationService notificationService = new PolandNotificationService();
        ShippingCenter shippingCenter = new ShippingCenter(deliveryService, notificationService);
        shippingCenter.sendPackage("Ogrodowa 12, Wroclaw", 18.2);


        DeliveryService deliveryService2 = new InternationalDeliveryService();
        NotificationService notificationService2 = new InternationalNotificationService();
        ShippingCenter shippingCenter2 = new ShippingCenter(deliveryService2, notificationService2);
        shippingCenter2.sendPackage("Yubin-kyoku 35, Japan", 21.5);

    }
}

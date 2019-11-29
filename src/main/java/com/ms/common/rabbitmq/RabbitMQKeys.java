package com.ms.common.rabbitmq;

public class RabbitMQKeys {
    
    public static final String NOTIFICATION_TOPIC_NAME = "dev_notificaiton_exchange";

    public static final String NOTIFICATION_QUEUE_EMAIL = "dev_notificaiton_queue_email";
    public static final String NOTIFICATION_QUEUE_SMS = "dev_notificaiton_queue_sms";
    public static final String NOTIFICATION_QUEUE_IOS = "dev_notificaiton_queue_ios";
    public static final String NOTIFICATION_QUEUE_ANDROID = "dev_notificaiton_queue_android";

    public static final String NOTIFICATION_ROUTING_KEY_EMAIL = "dev_notificaiton_route_email";
    public static final String NOTIFICATION_ROUTING_KEY_SMS = "dev_notificaiton_route_sms";
    public static final String NOTIFICATION_ROUTING_KEY_IOS = "dev_notificaiton_route_ios";
    public static final String NOTIFICATION_ROUTING_KEY_ANDROID = "dev_notificaiton_route_android";


    public static final String DEVICE_TOPIC_NAME = "dev_device_exchange";
    public static final String DEVICE_QUEUE = "dev_device_queue";
    public static final String DEVICE_ROUTING_KEY = "dev_device_route";
}
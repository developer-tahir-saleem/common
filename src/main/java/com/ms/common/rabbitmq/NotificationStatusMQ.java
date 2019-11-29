package com.ms.common.rabbitmq;

import lombok.*;

import java.io.Serializable;



@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class NotificationStatusMQ implements Serializable {

    protected String name;
    protected int cueCount;
    protected boolean status;
    protected String log;

}

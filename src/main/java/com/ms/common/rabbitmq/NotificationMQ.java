package com.ms.common.rabbitmq;

import lombok.*;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class NotificationMQ implements Serializable {

    protected String subject;
    protected String body;
    protected String data;
    protected String url;
    protected String path;

    protected boolean action;

    protected int type;

    protected List<NotificationStatusMQ> notificationStatus;

    private AppUserMQ fromUser;

    private String fromId;

    private AppUserMQ toUser;

    private String toId;


}

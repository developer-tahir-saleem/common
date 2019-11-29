package com.ms.common.rabbitmq;

import lombok.*;

import java.io.Serializable;
import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DeviceMQ implements Serializable {

    protected long type;
    protected String userId;
    protected boolean isLoggedin;
    private String hardwareId;
    private String deviceToken;

}

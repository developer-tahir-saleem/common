package com.ms.common.rabbitmq;

import lombok.*;

import java.io.Serializable;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class AppUserMQ  implements Serializable {

    private String authId;
    private String dateOfBirth;
    private int gender;
    private String phone;
    private String isoCode;
    private String type;
    private String rewardCode;
    private String address;
    private String image;
    private String email;
    private String password;
}

package com.ms.common.rabbitmq;


import lombok.*;

import java.io.Serializable;
import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Order implements Serializable {
    
    private String id;
    
    private String customerEmail;
    
    private BigDecimal amount;
}

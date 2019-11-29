package com.ms.common.rabbitmq.enums;

public enum ElasticSearchFlags {
    DEVICE {
        @Override
        public String toLowerCase() {
            return DEVICE.toString().toLowerCase();
        }
    },
    USER {
        @Override
        public String toLowerCase() {
            return USER.toString().toLowerCase();
        }
    };

    public abstract String toLowerCase();
}

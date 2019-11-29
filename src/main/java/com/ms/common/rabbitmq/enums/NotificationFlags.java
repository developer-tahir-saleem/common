package com.ms.common.rabbitmq.enums;

public enum NotificationFlags {
    SMS {
        @Override
        public String asLowerCase() {
            return SMS.toString().toLowerCase();
        }
    },
    EMAIL {
        @Override
        public String asLowerCase() {
            return EMAIL.toString().toLowerCase();
        }
    },
    FCM {
        @Override
        public String asLowerCase() {
            return FCM.toString().toLowerCase();
        }
    },
    IOS {
        @Override
        public String asLowerCase() {
            return IOS.toString().toLowerCase();
        }
    },
    ANDROID {
        @Override
        public String asLowerCase() {
            return ANDROID.toString().toLowerCase();
        }
    };

    public abstract String asLowerCase();
}

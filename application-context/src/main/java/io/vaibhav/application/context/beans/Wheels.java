package io.vaibhav.application.context.beans;

import org.springframework.stereotype.Component;

@Component
class Wheels {
    void roll() {
        System.out.println("Wheels are rolling");
    }
}

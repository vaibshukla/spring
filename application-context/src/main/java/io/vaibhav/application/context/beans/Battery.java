package io.vaibhav.application.context.beans;

import org.springframework.stereotype.Component;

@Component
class Battery {
    void supplyPower() {
        System.out.println("Supplying power");
    }
}

package io.vaibhav.application.context.web.servlet2.annotation;


import io.vaibhav.application.context.web.servlet2.beans.SpringBean1;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *  Helpful in integration with third party
 */
public class AnnotationConfigApplicationContextFourthWay {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("io.vaibhav.application.context.nonweb.beans");
        context.refresh();

        // Also have registered Bean and other method. which is more manual.

        SpringBean1 springBean1 = context.getBean(SpringBean1.class);

        springBean1.sayHello();
    }
}

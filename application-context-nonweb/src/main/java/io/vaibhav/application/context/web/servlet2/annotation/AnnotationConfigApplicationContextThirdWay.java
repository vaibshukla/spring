package io.vaibhav.application.context.web.servlet2.annotation;


import io.vaibhav.application.context.web.servlet2.beans.SpringBean1;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *  Helpful in integration with third party
 */
public class AnnotationConfigApplicationContextThirdWay {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("io.vaibhav.application.context.nonweb.beans");

        SpringBean1 springBean1 = context.getBean(SpringBean1.class);

        springBean1.sayHello();
    }
}

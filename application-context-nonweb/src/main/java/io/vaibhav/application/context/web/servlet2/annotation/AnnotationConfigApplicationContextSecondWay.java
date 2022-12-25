package io.vaibhav.application.context.web.servlet2.annotation;


import io.vaibhav.application.context.web.servlet2.beans.SpringBean1;
import io.vaibhav.application.context.web.servlet2.defined.configuration.ConfigurationStatic;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *  Helpful in integration with third party
 */
public class AnnotationConfigApplicationContextSecondWay {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationStatic.class);

        SpringBean1 springBean1 = context.getBean(SpringBean1.class);

        springBean1.sayHello();
    }
}

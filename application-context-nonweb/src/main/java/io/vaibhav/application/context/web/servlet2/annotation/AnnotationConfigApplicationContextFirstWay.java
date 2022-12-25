package io.vaibhav.application.context.web.servlet2.annotation;

import io.vaibhav.application.context.web.servlet2.beans.ConfigurationComponentScan;
import io.vaibhav.application.context.web.servlet2.beans.SpringBean1;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationConfigApplicationContextFirstWay {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationComponentScan.class);

        SpringBean1 springBean1 = context.getBean(SpringBean1.class);

        springBean1.sayHello();
    }
}

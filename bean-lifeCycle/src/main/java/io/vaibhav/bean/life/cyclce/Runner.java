package io.vaibhav.bean.life.cyclce;

import io.vaibhav.bean.life.cyclce.bean.SpringBean1;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);

        SpringBean1 springBean1 = context.getBean(SpringBean1.class);

        springBean1.sayHello();

        context.close();
    }
}

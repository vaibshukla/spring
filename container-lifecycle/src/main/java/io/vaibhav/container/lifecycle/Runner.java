package io.vaibhav.container.lifecycle;

import io.vaibhav.container.lifecycle.beans.SpringBean1;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {

    public static void main(String[] args) {

        try(AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class)) {
            //SpringBean1 springBean1 = context.getBean(SpringBean1.class);
        }
    }
}

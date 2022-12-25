package io.vaibhav.bean.scope;

import io.vaibhav.bean.scope.beans.prototype.SpringBean2;
import io.vaibhav.bean.scope.beans.singleton.SpringBean1;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {


    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
        context.registerShutdownHook();


        // Different Instance of same bean
        System.out.println(context.getBean(SpringBean1.class));
        System.out.println(context.getBean(SpringBean1.class));
        System.out.println(context.getBean(SpringBean1.class));

        // Different Instance for same Bean
        System.out.println(context.getBean(SpringBean2.class));
        System.out.println(context.getBean(SpringBean2.class));
        System.out.println(context.getBean(SpringBean2.class));



    }
}

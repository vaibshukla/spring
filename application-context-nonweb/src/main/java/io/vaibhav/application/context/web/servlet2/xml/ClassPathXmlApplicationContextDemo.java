package io.vaibhav.application.context.web.servlet2.xml;

import io.vaibhav.application.context.web.servlet2.beans.SpringBean1;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClassPathXmlApplicationContextDemo {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

        SpringBean1 springBean1 = context.getBean(SpringBean1.class);
        springBean1.sayHello();
    }
}

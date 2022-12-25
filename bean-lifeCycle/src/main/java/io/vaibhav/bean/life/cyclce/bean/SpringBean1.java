package io.vaibhav.bean.life.cyclce.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class SpringBean1 implements InitializingBean, DisposableBean {

    private SpringBean2 springBean2;

    public SpringBean1() {
        System.out.println("SpringBean1 is created and constructor is called");
    }

    @Autowired
    public void setSpringBean2(SpringBean2 springBean2) {
        System.out.println(" Setting the properties of bean which marked as dependency ");
        this.springBean2 = springBean2;

    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBean :: afterPropertiesSet method is called" );
    }


    @PostConstruct
    public void postConstructSpringBean1() {
        System.out.println("@PostConstruct of SpringBean1 is called ");
    }

    public void sayHello() {
        System.out.println("\nHello\n");
    }


    @PreDestroy
    public void preDestroy() {
        System.out.println("@PreDestroy of SpringBean1 is called ");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("DisposableBean :: destroy method is called" );
    }



    public void initMethod() {
        System.out.println("@Bean init is called ");
    }

    public void destroyMethod() {
        System.out.println("@Bean destroyMethod is called ");
    }
}

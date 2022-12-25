package io.vaibhav.container.lifecycle;

import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan
public class ApplicationConfiguration {

    @Bean
    public BeanFactoryPostProcessor beanFactoryPostProcessor() {
        return new CustomBeanFactoryPostProcessor();
    }

    /**
     * @PostConstruct will be not called.
     * @return
     */
    @Bean
    public BeanPostProcessor beanPostProcessor() {
        return  new CustomBeanPostProcessor();
    }
}

package io.vaibhav.bean.life.cyclce;

import io.vaibhav.bean.life.cyclce.bean.SpringBean1;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class ApplicationConfiguration {

    @Bean(initMethod = "initMethod" , destroyMethod = "destroyMethod")
    public SpringBean1 springBean1() {
        return new SpringBean1();
    }
}

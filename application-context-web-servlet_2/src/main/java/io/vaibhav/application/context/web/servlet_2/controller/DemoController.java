package io.vaibhav.application.context.web.servlet_2.controller;

import io.vaibhav.application.context.web.servlet_2.beans.SpringBean1;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {


    private SpringBean1 springBean1;

    public void setSpringBean1(SpringBean1 springBean1) {
        this.springBean1 = springBean1;
    }

    @RequestMapping
    @ResponseBody
    public String index() {
        return springBean1.getHello();
    }
}

package io.vaibhav.application.context.web.servlet3.annotation.controller;

import io.vaibhav.application.context.web.servlet3.annotation.beans.SpringBean1;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {


    private final SpringBean1 springBean1;

    public DemoController(SpringBean1 springBean1) {
        this.springBean1 = springBean1;
    }

    @RequestMapping
    @ResponseBody
    public String index() {
        return springBean1.getHello();
    }
}

package io.vaibhav.application.context.web.servler_3xml.controller;


import io.vaibhav.application.context.web.servler_3xml.beans.SpringBean1;
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

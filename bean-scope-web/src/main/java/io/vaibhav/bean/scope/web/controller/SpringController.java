package io.vaibhav.bean.scope.web.controller;

import io.vaibhav.bean.scope.web.beans.*;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Scope("prototype")
public class SpringController {

    private final SpringSessionBean springSessionBean;

    private final SpringSingletonBean springSingletonBean;

    private final SpringRequestBean springRequestBean;

    private final SpringApplicationBean springApplicationBean;

    private final SpringPrototypeBean springPrototypeBean;

    public SpringController(SpringSessionBean springSessionBean, SpringSingletonBean springSingletonBean, SpringRequestBean springRequestBean, SpringApplicationBean springApplicationBean, SpringPrototypeBean springPrototypeBean) {
        this.springSessionBean = springSessionBean;
        this.springSingletonBean = springSingletonBean;
        this.springRequestBean = springRequestBean;
        this.springApplicationBean = springApplicationBean;
        this.springPrototypeBean = springPrototypeBean;
    }

    @RequestMapping
    @ResponseBody
    public String index() {
        return "<pre>" +
                springSingletonBean + " - Singleton\n" +
                springPrototypeBean + " - Prototype\n" +
                springRequestBean + " - Request Scope\n" +
                springSessionBean + " - Session Scope\n" +
                springApplicationBean + " - Application Scope\n" +
                "</pre>";
    }

}

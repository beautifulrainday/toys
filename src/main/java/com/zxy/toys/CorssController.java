package com.zxy.toys;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CorssController {

    @Value("${server.port}")
    String port;

    @GetMapping(value = "test")
    @ResponseBody
    public String test()
    {
        return this.port;
    }

    @GetMapping(value = "index")
    public String index(Model model)
    {
        model.addAttribute("test", port);
        return "index";
    }
}

package com.mango.controlleradvice;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.Set;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String getGlobalData(Model model){
        /*Object info = model.getAttribute("info");
        System.err.println(info);*/
        Map<String, Object> map = model.asMap();
        Set<String> set = map.keySet();
        for (String key : set) {
            System.err.println(key+":"+map.get(key));
        }
        return "hello";
    }
}

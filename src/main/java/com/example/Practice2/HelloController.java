package com.example.Practice2;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloController {
    @RequestMapping("/about")
    public Map<String,String> hello2()
    {
        HashMap<String,String> temp=new HashMap<>();
        temp.put("A","B");
        return temp;
    }
}
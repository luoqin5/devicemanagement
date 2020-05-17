package com.example.devicemanagement.controller;


import com.example.devicemanagement.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
    @Autowired
    private TestService testService;

    @GetMapping("/luoqin/{str}")
    public  String test(@PathVariable("str") String str){
        return testService.test(str);
    }
}

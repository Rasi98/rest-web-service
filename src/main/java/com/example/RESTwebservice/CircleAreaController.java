package com.example.RESTwebservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CircleAreaController {

    @GetMapping("/area")
    public CircleArea circleArea(@RequestParam(value = "radius",defaultValue = "0") double radius){
        return new CircleArea(radius);
    }
}

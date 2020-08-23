package com.leonardo.example.restfulwebservices.filtering;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class FilteringController {

    @GetMapping (path = "/retrieveBean")
    public SomeBean retrieveBean () {
        return new SomeBean ("value1","value2","value3");
    }

    @GetMapping (path = "/retrieveAllBeans")
    public List<SomeBean> retrieveAllBeans () {
        return Arrays.asList(
                new SomeBean("value1","value2","value3"),
                new SomeBean("value11","value22","value33")
        );
    }
}

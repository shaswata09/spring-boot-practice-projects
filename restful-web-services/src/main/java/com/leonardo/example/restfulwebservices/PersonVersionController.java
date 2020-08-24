package com.leonardo.example.restfulwebservices;


import com.leonardo.example.restfulwebservices.versioning.Name;
import com.leonardo.example.restfulwebservices.versioning.PersonV1;
import com.leonardo.example.restfulwebservices.versioning.PersonV2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonVersionController {

    @GetMapping("/v1/person")
    public PersonV1 personV1 (){
        return new PersonV1("Bob Charlie");
    }

    @GetMapping("/v2/person")
    public PersonV2 personV2 (){
        return new PersonV2(new Name("Bob", "Charlie"));
    }

}

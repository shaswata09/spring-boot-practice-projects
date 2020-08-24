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

    @GetMapping(path = "/person/param", params = "version=1")
    public PersonV1 paramsPersonV1 (){
        return new PersonV1("Bob Charlie");
    }

    @GetMapping(value = "/person/param", params = "version=2")
    public PersonV2 paramsPersonV2 (){
        return new PersonV2(new Name("Bob", "Charlie"));
    }

    @GetMapping(path = "/person/header", headers = "X-API-VERSION=1")
    public PersonV1 headerPersonV1 (){
        return new PersonV1("Bob Charlie");
    }

    @GetMapping(value = "/person/header", headers = "X-API-VERSION=2")
    public PersonV2 headerPersonV2 (){
        return new PersonV2(new Name("Bob", "Charlie"));
    }

    @GetMapping(path = "/person/produces", produces = "application/vnd.company.app-v1+json")
    public PersonV1 producesPersonV1 (){
        return new PersonV1("Bob Charlie");
    }

    @GetMapping(value = "/person/produces", produces = "application/vnd.company.app-v2+json")
    public PersonV2 producesPersonV2 (){
        return new PersonV2(new Name("Bob", "Charlie"));
    }


}

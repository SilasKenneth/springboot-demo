package com.example.silas.demo.controllers;

import com.example.silas.demo.models.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(value = "/demo")
public class DemoController {

    @GetMapping("/welcome")
    public List<Person> helloDemo(){

        List<Person> plist = new ArrayList<>();

        for (int i = 0; i < 5 ; i ++) {
            Person p = new Person("Silas", 20L, new UUID(2L, 0L));
            plist.add(p);
        }

        return plist;
    }

    @PutMapping("/update/{personId}")
    public List<Person> updatePerson(@RequestBody Person updateData, @PathVariable("personId") int personId){

        List<Person> plist = new ArrayList<>();

        for (int i = 0; i < 5 ; i ++) {
            Person p = new Person("Silas", 20L, new UUID(2L, 0L));
            plist.add(p);
        }

        Person pupdate = plist.get(personId);

        pupdate.setAge(updateData.getAge());
        pupdate.setName(updateData.getName());
        pupdate.setUuid(updateData.getUuid());

        return plist;
    }
}

package com.libra.design.patterns.visitor.demo;


import com.libra.design.patterns.visitor.demo.person.Person;
import com.libra.design.patterns.visitor.demo.status.Status;

import java.util.ArrayList;
import java.util.List;

public class ObjectStructure {
    private List<Person> persons = new ArrayList<>();

    public void attach(Person person) {
        persons.add(person);
    }

    public void detach(Person person) {
        persons.remove(person);
    }

    public void in(Status status){
        for (Person person : persons) {
            person.in(status);
        }
    }
}

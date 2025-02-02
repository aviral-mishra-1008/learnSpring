package com.components;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {

    @Value(16)
    private int age;

    @Value("Aviral")
    private String firstName;

    @Value("Mishra")
    private String lastName;

}

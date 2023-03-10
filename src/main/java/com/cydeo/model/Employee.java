package com.cydeo.model;

import lombok.*;

import java.time.LocalDate;

@NoArgsConstructor //because we need one empty object to use in Form (html)
@Data //includes setter/getter/toString
@AllArgsConstructor //maybe we need it
public class Employee {

    private String firstName;
    private String lastName;
    private LocalDate birthday;
    private String email;
    private String password;
    private String address;
    private String address2;
    private String city;
    private String state;
    private String zipCode;

}

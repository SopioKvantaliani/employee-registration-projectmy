package com.cydeo.model;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@NoArgsConstructor //because we need one empty object to use in Form (html)
@Data //includes setter/getter/toString
@AllArgsConstructor //maybe we need it
public class Employee {

//    @NotNull        --->    Field shouldn't be null
//    @NotEmpty       --->    Field shouldn't be ""
//    @NotBlank       --->    Field shouldn't be "       "

//    @NotNull -> @NotNull
//    @NotEmpty -> @NotNull + @NotEmpty
//    @NotBlank -> @NotNull + @NotEmpty + @NotBlank

        @NotBlank
        @Size(max = 12, min = 2)
        private String firstName;

        //    @NotBlank
//    @Size(max = 12, min = 2)
        private String lastName;

        // Thymeleaf accepts yyyy-MM-dd, but LocalDate accepts mm-dd-yyyy  -   yyyy-dd-mm

        //    @NotNull
        @DateTimeFormat(pattern = "yyyy-MM-dd")
        private LocalDate birthday;

        //    @NotBlank
//    @Email
        private String email;

        //    @NotBlank
//    @Pattern(regexp = "(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{4,}")
        private String password;

        private String address;
        private String address2;
        private String city;
        private String state;
        private String zipCode;


    }

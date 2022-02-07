package com.example.SampleSpringBoot.model;

import lombok.*;

import java.util.List;
@NoArgsConstructor
@Data
@AllArgsConstructor
@Getter
@Setter
public class Customer {
    int id;
    int age;
    String name;
    String country;
    List<String> phoneNumbers;
}

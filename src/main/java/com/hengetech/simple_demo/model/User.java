package com.hengetech.simple_demo.model;

import groovy.transform.ToString;
import groovy.transform.builder.Builder;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@Builder
@NoArgsConstructor
@ToString
public class User {
    private String name;
    private int age;
    private String birthState;    
}

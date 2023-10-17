package com.hengetech.simple_demo.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


@Data
@NoArgsConstructor
public class User implements Serializable {
    private String name;
    private int age;
    private String birthState;    
}

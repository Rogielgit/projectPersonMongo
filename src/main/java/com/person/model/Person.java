package com.person.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Document
public class Person  implements Serializable {

    @Id
    private String id;

    private String name;

    private String country;

    public String getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public String getCountry(){
        return this.country;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}

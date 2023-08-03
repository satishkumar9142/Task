package com.reactiveworks.jsonb.model;

import java.util.Set;

public class User {
	
 // Public fields are included in the JSON data by default
    public long id;
    public Set<String> roles;
    public String name;
    public int age;
    
 // Private fields are ignored by JSON-B by default
    private String somethingSecret = "hello";
    
 // Static fields are also ignored by JSON-B by default
    public static String FOO_CONSTANT = "FOO";
    
    public User() {
        // A default constructor is required
        // If no default constructor is present, the class must be annotated with @JsonbCreator
    }
    
    public User(long id, String name, int age, Set<String> roles) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.roles = roles;
    }
}

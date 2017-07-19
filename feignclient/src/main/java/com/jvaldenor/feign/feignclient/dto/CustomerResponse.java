package com.jvaldenor.feign.feignclient.dto;


/**
 * Created by 81013534 on 19/07/2017.
 */
public class CustomerResponse {
    private String name;
    private int age;
    private String gender;

    public CustomerResponse() {
    }

    public CustomerResponse(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}


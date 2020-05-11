package com.ggq.springboot02.entity;



import org.springframework.data.annotation.Id;

import javax.persistence.Entity;


@Entity
public class Sutdent {
    @Id
    private String name;
    private  Integer id;
    private  Integer age;

    @Override
    public String toString() {
        return "Sutdent{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                '}';
    }

    public Sutdent() {
    }

    public Sutdent(String name, Integer id, Integer age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}

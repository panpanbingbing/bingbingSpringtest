package org.example.component;


import org.springframework.stereotype.Component;

@Component
public class Student {
    private String name;
    private int age;
    private Classes classer;
    private int id;

    public Student() {

    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", classer=" + classer +
                ", id=" + id +
                '}';
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

    public Classes getClasser() {
        return classer;
    }

    public void setClasser(Classes classer) {
        this.classer = classer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Student(String name, int age, Classes classer, int id) {
        this.name = name;
        this.age = age;
        this.classer = classer;
        this.id = id;
    }
}

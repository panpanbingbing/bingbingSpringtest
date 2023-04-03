package org.example.component;

import org.springframework.stereotype.Component;

@Component
public class Classes {
    public String name;
    public String teacher;

    public int number;

    public Classes() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Classes(String name, String teacher, int number) {
        this.name = name;
        this.teacher = teacher;
        this.number = number;
    }
}

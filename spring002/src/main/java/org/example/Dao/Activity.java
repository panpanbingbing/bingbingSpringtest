package org.example.Dao;

public class Activity {



    String name;
    int age;
    String add;

    public Activity() {
        System.out.println("无参构造方法执行");
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

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    public Activity(String name, int age, String add) {
        this.name = name;
        this.age = age;
        this.add = add;
    }

    @Override
    public String toString() {
        return "Activity{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", add='" + add + '\'' +
                '}';
    }
}

package org.example.Dao;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ActivityImp implements ActivityDao{


    @Value("张三")
    String name;
    @Value("20")
    int age;
    @Value("北京")
    String add;

    public ActivityImp() {
    }

    public ActivityImp(String name, int age, String add) {
        this.name = name;
        this.age = age;
        this.add = add;
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


    @Override
    public String toString() {
        return "ActivityImp{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", add='" + add + '\'' +
                '}';
    }

    @Override
    public void onActivityResult() {
        System.out.println("订单正在生成");
    }
}

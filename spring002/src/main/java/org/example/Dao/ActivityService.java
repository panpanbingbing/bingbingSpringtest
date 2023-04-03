package org.example.Dao;


import org.springframework.stereotype.Component;

@Component
public class ActivityService implements ActivityDao{
    @Override
    public void onActivityResult() {
        System.out.println("myspl 正在查询");
    }
}

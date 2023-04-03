package org.example.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class User {

    @Autowired
    @Qualifier("activityImp")
    private ActivityDao activity;

////    @Autowired
////    @Qualifier("activityService")
//    public User(ActivityDao activity) {
//        this.activity = activity;
//    }


    public ActivityDao getActivity() {
        return activity;
    }

    public void setActivity(ActivityDao activity) {
        this.activity = activity;
    }
}

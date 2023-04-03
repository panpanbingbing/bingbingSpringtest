package org.exampie;

import org.example.Dao.ActivityDao;
import org.example.Dao.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Annotate {


        @Test
        public void testAutowired(){
            ApplicationContext context = new ClassPathXmlApplicationContext("Spring6ComponentText.xml");
            User user = context.getBean("user", User.class);
            ActivityDao activity= user.getActivity();
            System.out.println(activity);
            activity.onActivityResult();
//        System.out.println(user);
        }




}

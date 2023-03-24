package org.exampie;

import org.example.Dao.Activity;
import org.example.Dao.User;
import org.example.component.Classes;
import org.example.component.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringBean {
    @Test
    public void testStudent() {
     ApplicationContext appContext = new ClassPathXmlApplicationContext("springBean.xml");
        Student studentBean = appContext.getBean("studentBean", Student.class);
        Classes classBean = appContext.getBean("classBean", Classes.class);
        studentBean.setClasser(classBean);
        System.out.println(studentBean);

        Student studentBean2 = appContext.getBean("studentBean", Student.class);
        Classes classBean2 = appContext.getBean("classBean", Classes.class);
        studentBean2.setClasser(classBean2);
        System.out.println(studentBean2);


    }

    @Test
    public void testComponent() {
        ApplicationContext appContext = new ClassPathXmlApplicationContext("Spring6ComponentText.xml");
        User userBean = appContext.getBean("userBean", User.class);
        System.out.println(userBean);


    }

    @Test
    public void testDao() {
        ApplicationContext appContext = new ClassPathXmlApplicationContext("springBean.xml");
        Activity activityBean = appContext.getBean("activityBean", Activity.class);
        Activity activityBean2 = appContext.getBean("activityBean", Activity.class);
//        System.out.println(activityBean);
//        System.out.println(activityBean2);
    }
}

package org.exampie;

import org.example.Dao.ActivityDao;
import org.example.Dao.ActivityImp;
import org.example.Dao.User;
import org.example.annotate.servies.UserService;
import org.example.component.Classes;
import org.example.component.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ResourceBundle;

public class SpringBean {

    @Test
    public void testAutowired(){
       ApplicationContext context = new ClassPathXmlApplicationContext("Spring6ComponentText.xml");
        User user = context.getBean("user", User.class);
        ActivityDao activity= user.getActivity();
        System.out.println(activity);
        activity.onActivityResult();
//        System.out.println(user);
    }


    @Test
    public void testAnnotate() throws Exception {

        ApplicationContext context = new ClassPathXmlApplicationContext("Spring6ComponentText.xml");

//        Student student = context.getBean("student", Student.class);
        UserService userService = context.getBean("userService", UserService.class);

//        System.out.println(userService);
        System.out.println(userService.getUserId(153));
//        System.out.println(student);


    }


    @Test
    public void testProperties() throws Exception {
        ResourceBundle resource = ResourceBundle.getBundle("myspl");
        //调用静态方法直接获得键值对中值
        String classNameValue  =resource.getString("jdbc.driver");//demo.Teacher
        String methodNameValue =resource.getString("jdbc.url");//teach
        System.out.println(classNameValue);
        System.out.println(methodNameValue);

    }

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
        User userBean = appContext.getBean("user", User.class);
        System.out.println(userBean);


    }

    @Test
    public void testDao() {
        ApplicationContext appContext = new ClassPathXmlApplicationContext("springBean.xml");
        ActivityImp activityBean = appContext.getBean("activityBean", ActivityImp.class);
        ActivityImp activityBean2 = appContext.getBean("activityBean", ActivityImp.class);
//        System.out.println(activityBean);
//        System.out.println(activityBean2);
    }
}

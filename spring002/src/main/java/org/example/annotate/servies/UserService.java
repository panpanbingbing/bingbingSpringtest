package org.example.annotate.servies;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class UserService {


    private static final Logger logger = LoggerFactory.getLogger(UserService.class);
    public int getUserId(int userId) throws InterruptedException {
        long l = System.currentTimeMillis();
        int id= userId+100;
        Thread.sleep(2000);
        logger.info("userId: " + id);
        System.out.println("userId: " + id);
        long l2 = System.currentTimeMillis();

        return (int) (l2-l);
    }
}

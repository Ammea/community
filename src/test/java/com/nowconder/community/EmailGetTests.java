package com.nowconder.community;

import com.nowconder.community.dao.UserMapper;
import com.nowconder.community.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = CommunityApplication.class)
public class EmailGetTests {
    @Autowired
    private UserMapper userMapper;
    @Test
    public void findUserByEmail(){
        String email="test@qq.com";
        User uu=userMapper.selectByEmail(email);
        System.out.println(uu.getEmail());
        //return userMapper.selectByEmail(email);
    }
}

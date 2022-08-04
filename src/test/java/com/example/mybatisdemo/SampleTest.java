package com.example.mybatisdemo;

import com.example.mybatisdemo.dao.UserMapper;
import com.example.mybatisdemo.model.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

//@RunWith(SpringRunner.class)
@TestPropertySource(value = "classpath:application-h2.yml")
@SpringBootTest
public class SampleTest {

    @Resource
    private UserMapper userMapper;

    @Test
    public void testSelect() {
        List<User> users = userMapper.selectList(null);
        Assert.assertEquals(5, users.size());

        users.forEach(System.out::println);
    }
}

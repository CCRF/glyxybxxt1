package cn.edu.guet.service.impl;

import cn.edu.guet.bean.User;
import cn.edu.guet.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public User test() {
        User user = new User();
        user.setUsername("zs");
        user.setPassword("123");

        User user2 = restTemplate.getForObject("http://localhost:8081/getUser", User.class);
        System.out.println(user2);
        return user2;
    }
}

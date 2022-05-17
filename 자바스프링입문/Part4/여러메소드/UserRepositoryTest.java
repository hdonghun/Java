package com.fastcampus.jpa.bookmanager.repository;

import com.fastcampus.jpa.bookmanager.domain.User;
import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Sort;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    void crud(){ // create, read, update, delete
      //List<User> users = userRepository.findAllById(Lists.newArrayList(1L,3L,5L));
      //users.forEach(System.out::println);
      //userRepository.findAll().forEach(System.out::println);
      // 위와 같은 문법
        // for(user user : userRepository.findAll(){
        // System.out.println(user);}
        userRepository.saveAndFlush(new User("new ,artin","newmartin@fastcampus.com"));
        userRepository.findAll().forEach(System.out::println);

    }

}

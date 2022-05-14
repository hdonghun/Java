package com.fastcampus.jpa.bookmanager.domain;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;



class UserTest {
    @Test
    void test(){
        User user = new User();                        //@NoArgsConstructor
        user.setEmail("martin@fastcampus.com");
        user.setName("martin");
        user.setCreatedAt(LocalDateTime.now());
        user.setUpdatedAt(LocalDateTime.now());

        User user1 = new User(null, "Derek", "toyou4203@naver.com", LocalDateTime.now(), LocalDateTime.now()); //@AllArgsConstructor
        User user2 = new User("Derek","toyou4203@naver.com"); //@RequiredArgsConstructor

        User user3 = User.builder()
                .name("derek")
                .email("abcdefg")
                .build();

        System.out.println(">>> "+user.toString());
    }
}
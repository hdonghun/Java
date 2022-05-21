package com.fastcampus.jpa.bookmanager.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@ToString
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@EqualsAndHashCode // 자바의 기본적인 영역이라 ;;
@Data // Equivalent to Getters and Setters RequiredArgsConstructor and ToString and EqualsAndHashCode
@Builder
@Table(name = "user")
@Entity //db의 테이블과 자바 객체를 연결시켜주는  ORM이 자바에서는 Entity다?

public class User {
    @Id // Entity를 하려면 PK가 필요하다
    @GeneratedValue // 순차적으로 데이터를 증가시켜주기 위해서
    private Long id;


    @NonNull                    //RequiredArgsConstructor 필요 필수사용
    private String name;

    @NonNull                    //RequiredArgsConstructor 필요 필수사용
    private String email;

    // private String address;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;


}

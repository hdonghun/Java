package com.fastcampus.jpa.bookmanager.domain;

import lombok.*;

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
public class User {
    @NonNull                    //RequiredArgsConstructor 필요 필수사용
    private String name;
    @NonNull                    //RequiredArgsConstructor 필요 필수사용
    private String email;
    private String address;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;


}

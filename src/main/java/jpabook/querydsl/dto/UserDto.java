package jpabook.querydsl.dto;

import lombok.Data;

@Data
public class UserDto {
    private String name;
    private int age;

    public UserDto(String name, int age) {
        this.age = age;
        this.name = name;
    }
}

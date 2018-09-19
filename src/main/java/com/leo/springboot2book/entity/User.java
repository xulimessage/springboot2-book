package com.leo.springboot2book.entity;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class User {
    long id;
    String name;

}

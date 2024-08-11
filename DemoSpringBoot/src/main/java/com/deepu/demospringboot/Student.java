package com.deepu.demospringboot;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
public class Student {
    @Id
    String _id;
    String roll_number;
    String name;
    String dept;
}

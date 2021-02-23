package com.kgc.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
    public class Teacher  implements Serializable {
    @Value("${teacher.name}")
    private String name;
    @Value("${teacher.age}")
    private Integer age;


}

package com.libra.design.patterns.memento.code;

import java.io.Serializable;

/**
 * Description: 学生类
 *
 * @author sx
 * @date 2021-02-23
 */
public class Student implements Serializable {
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

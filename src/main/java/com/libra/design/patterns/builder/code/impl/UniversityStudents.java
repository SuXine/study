package com.libra.design.patterns.builder.code.impl;

import com.libra.design.patterns.builder.code.BasicData;
import com.libra.design.patterns.builder.code.Student;

/**
 * Description: 大学生
 *
 * @author sx
 * @date 2021-02-05
 */
public class UniversityStudents extends Student {

    public void create(BasicData basicData){
        Student.StudentBuilder builder = new Student.StudentBuilder(basicData,this) {
            @Override
            public Student.StudentBuilder builderName() {
                getStudent().setName("大学生：" + getBasicData().getName());
                return this;
            }

            @Override
            public Student.StudentBuilder builderClazz() {
                getStudent().setClazz("大学" + getBasicData().getClazz());
                return this;
            }

            @Override
            public Student.StudentBuilder builderAge() {
                getStudent().setAge(getBasicData().getAge());
                return this;
            }
        };
        builder.builderName().builderAge().builderClazz();
    }

}

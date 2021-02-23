package com.libra.design.patterns.builder.code;

import com.libra.design.patterns.builder.code.impl.PrimarySchoolStudents;
import com.libra.design.patterns.builder.code.impl.UniversityStudents;

/**
 * Description: 主方法
 *
 * @author sx
 * @date 2021-02-05
 */
public class Main {
    public static void main(String[] args) {
        BasicData basicData = new BasicData();
        basicData.setName("小红");
        basicData.setClazz("一年三班");
        basicData.setAge("9岁");

        PrimarySchoolStudents primarySchoolStudents = new PrimarySchoolStudents();
        primarySchoolStudents.create(basicData);
        System.out.println(primarySchoolStudents.toString());

        UniversityStudents universityStudents = new UniversityStudents();
        universityStudents.create(basicData);
        System.out.println(universityStudents.toString());
    }
}

package com.libra.design.patterns.builder.code;

/**
 * Description: 学生类
 *
 * @author sx
 * @date 2021-02-05
 */
public class Student {
    private String name;
    private String clazz;
    private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClazz() {
        return clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", clazz='" + clazz + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    protected abstract static class StudentBuilder<T extends Student> {
        BasicData basicData;
        T student;

        public StudentBuilder(BasicData basicData, T student) {
            this.basicData = basicData;
            this.student = student;
        }

        public T getStudent() {
            return student;
        }

        public BasicData getBasicData() {
            return basicData;
        }

        public abstract StudentBuilder builderName();

        public abstract StudentBuilder builderClazz();

        public abstract StudentBuilder builderAge();
    }
}

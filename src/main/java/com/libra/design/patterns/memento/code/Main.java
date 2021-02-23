package com.libra.design.patterns.memento.code;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Description: 主方法
 *
 * @author sx
 * @date 2021-02-23
 */
public class Main {

    public static void main(String[] args) throws Exception {
        Student student = new Student();
        student.setName("小红");
        student.setAge(1);
        System.out.println(student);
        save(student);
        Student load = load();
        System.out.println(load);
    }

    private static void save(Student student) throws Exception {
        File file = new File("student.data");
        ObjectOutputStream outputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(file);
            outputStream = new ObjectOutputStream(fileOutputStream);
            outputStream.writeObject(student);
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            if (outputStream != null) {
                outputStream.close();
            }
            if (fileOutputStream != null) {
                fileOutputStream.close();
            }
        }
    }

    private static Student load() throws Exception {
        File file = new File("student.data");
        ObjectInputStream inputStream = null;
        FileInputStream fileInputStream = null;
        Student student = new Student();
        try {
            fileInputStream = new FileInputStream(file);
            inputStream = new ObjectInputStream(fileInputStream);
            student = (Student) inputStream.readObject();
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (fileInputStream != null) {
                fileInputStream.close();
            }
        }
        return student;
    }
}

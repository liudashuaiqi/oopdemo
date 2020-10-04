package com.msb;

import java.util.Objects;

public class Student extends Object{
    private String name;
    private int age;
    {
        System.out.println("构造代码块");
    }
    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, age);
    }

    public static void main(String[] args) {
        Student s1 = new Student("lisi",123);
        Student s2 = new Student("lisi",123);

        System.out.println(s1.getName());
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    }
}

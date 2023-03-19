package com.xzy;

import java.util.Objects;

public class hash {
    public static void main(String[] args) {

//    Student student1=new Student("xiaoming");
//    Student student2=new Student("xiaoming");
//    System.out.println(student1.hashCode());
//    System.out.println(student2.hashCode());
        System.out.println("Aa".hashCode());
        System.out.println("BB".hashCode());
        System.out.println("test git");
    }
}
class Student{
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}





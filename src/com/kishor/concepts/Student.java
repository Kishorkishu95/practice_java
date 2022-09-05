package com.kishor.concepts;

public class Student {

    int student_id;
    String name;
    static String college_name;

    static int counter=0;
    public Student(String name){
        this.name=name;
        this.student_id=setStudentId();
    }

    static int setStudentId() {
        counter++;
        return counter;
    }
    static void setCollegeName(String name){
        college_name=name; //9844484704
    }
    void getSInfo(){
        System.out.println(this.name);
        System.out.println(this.college_name);
        System.out.println(this.student_id);
    }

    public static void main(String[] args) {
        Student.setCollegeName("Harward");
        Student s1=new Student("Alice");
        Student s2=new Student("Nairobhi");
        s1.getSInfo();
        s2.getSInfo();
    }
}

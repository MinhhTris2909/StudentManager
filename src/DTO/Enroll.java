/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author phamt
 */
public class Enroll {
    Course C;
    Student S;
    public Enroll(){
        C=null;
        S=null;
    }

    public Enroll(Course C, Student S) {
        this.C = C;
        this.S = S;
    }

    public Course getC() {
        return C;
    }

    public void setC(Course C) {
        this.C = C;
    }

    public Student getS() {
        return S;
    }

    public void setS(Student S) {
        this.S = S;
    }
    
        public void output(){
        System.out.println("Student: ");
        C.Output();
        System.out.println("Course: ");
        S.Output();
    }

    @Override
    public String toString() {
        return "Enroll{" + "C=" + C + ", S=" + S + '}';
    }
    
}

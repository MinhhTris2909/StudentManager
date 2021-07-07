/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author  SE151045

 */
public class StudentList {
    ArrayList<Student> StudentList;
    public StudentList(){
        StudentList= new ArrayList();
        
    }
    public boolean Add(Student S){
        return StudentList.add(S);
    }
    public boolean Display(){
        if(StudentList.isEmpty()) return false;
        for(int i=0; i<StudentList.size(); i++) StudentList.get(i).Output();
        return true;
    }
    /// find staff by id
    public int Find(int id){
        for(int i=0; i<StudentList.size(); i++ ) if ( StudentList.get(i).getID() == id) return i;
            return -1;
    }
    /// SearchStaff by ID tra ve Staff
    public Student Search(int id){
        for(int i=0; i<StudentList.size(); i++ ) if ( StudentList.get(i).getID() == id) return StudentList.get(i);
        return null;
    }
    //Update by ID Staff
    public boolean UpdateStaff(int id){
        Student tmp = Search(id);
        if (tmp==null) return false;
        tmp.setID(id);
        tmp.AddStudent();
     return true;   
    }
    public boolean Remove(int id){
        Student tmp= Search(id);
        if(tmp==null) return false;
        return StudentList.remove(tmp);
    }
    public boolean SortByID(int id ){
        if(StudentList.isEmpty()) return false;
        Collections.sort(StudentList);
        return true;
    }
}

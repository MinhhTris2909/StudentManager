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
public class CourseList {
    ArrayList<Course> ArrayCourse;
    public CourseList(){
        ArrayCourse= new ArrayList();
        
    }
    public boolean AddList(Course S){
        return ArrayCourse.add(S);
    }
    public boolean Display(){
        if(ArrayCourse.isEmpty()) return false;
        for(int i=0; i<ArrayCourse.size(); i++) ArrayCourse.get(i).Output();
        return true;
    }
    /// find staff by id
    public int Find(int id){
        for(int i=0; i<ArrayCourse.size(); i++ ) if ( ArrayCourse.get(i).getCode()== id) return i;
            return -1;
    }
    /// SearchStaff by ID tra ve Staff
    public Course Search(int id){
        for(int i=0; i<ArrayCourse.size(); i++ ) if ( ArrayCourse.get(i).getCode()== id) return ArrayCourse.get(i);
        return null;
    }
    //Update by ID Staff
    public boolean Update(int id){
        Course tmp = Search(id);
        if (tmp==null) return false;
        tmp.setCode(id);
        tmp.Add();
     return true;   
    }
    public boolean Remove(int id){
        Course tmp= Search(id);
        if(tmp==null) return false;
        return ArrayCourse.remove(tmp);
    }
    public boolean SortByID(int id ){
        if(ArrayCourse.isEmpty()) return false;
        Collections.sort(ArrayCourse);
        return true;
    }
}

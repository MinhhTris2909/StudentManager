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
public class CampusList {
    ArrayList<Campus> CampusList;
    public CampusList(){
        CampusList= new ArrayList();
        
    }
    public boolean Add(Campus S){
        return CampusList.add(S);
    }
    public boolean Display(){
        if(CampusList.isEmpty()) return false;
        for(int i=0; i<CampusList.size(); i++) CampusList.get(i).OutPutCampus();
        return true;
    }
    /// find staff by id
    public int Find(int id){
        for(int i=0; i<CampusList.size(); i++ ) if ( CampusList.get(i).getCode()== id) return i;
            return -1;
    }
    /// SearchStaff by ID tra ve Staff
    public Campus Search(int id){
        for(int i=0; i<CampusList.size(); i++ ) if ( CampusList.get(i).getCode()== id) return CampusList.get(i);
        return null;
    }
    //Update by ID Staff
    public boolean Update(int id){
        Campus tmp = Search(id);
        if (tmp==null) return false;
        tmp.setCode(id);
        tmp.AddCampus();
     return true;   
    }
    public boolean Remove(int id){
        Campus tmp= Search(id);
        if(tmp==null) return false;
        return CampusList.remove(tmp);
    }
    public boolean SortByID( ){
        if(CampusList.isEmpty()) return false;
        Collections.sort(CampusList);
        return true;
    }

    public void Add(Student tmp) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

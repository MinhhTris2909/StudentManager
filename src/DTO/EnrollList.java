/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.util.ArrayList;

/**
 *
 * @author phamt
 */
public class EnrollList {
    ArrayList<Enroll> EnrollLISt;
    public EnrollList(){
        EnrollLISt=new ArrayList();
    }
    public void Add(Enroll T){
        EnrollLISt.add(T);
    }
        public boolean Output() {
        if(EnrollLISt.isEmpty()||EnrollLISt==null) return false; 
        for (int i = 0; i < EnrollLISt.size(); i++) {
                EnrollLISt.get(i).output();
        }
        return true;
    }
    public int Find(Student S, Course C) {
        for (int i = 0; i < EnrollLISt.size(); i++) {
            if(EnrollLISt.get(i).S.getID()== S.getID()) 
            if(EnrollLISt.get(i).C.getCode()== C.getCode()) return i;
        }
        return -1;
    }

    public Enroll Search(Student S, Course C) {
        for (int i = 0; i < EnrollLISt.size(); i++) {
            if(EnrollLISt.get(i).S.getID()== S.getID()) 
            if(EnrollLISt.get(i).C.getCode()== C.getCode()) return EnrollLISt.get(i);
    }
        return null;
    }
    public boolean Update(Student S, Course C){
        Enroll TS = Search(S,C);
        if(TS==null ) return false;
        TS.setS(S);
        TS.setC(C);
        return true;
    }
        public boolean Remove(Student S,Course C){
        Enroll T = Search(S,C);
                if (T == null) {
            return false;
        } 
        return EnrollLISt.remove(T);
    }
}

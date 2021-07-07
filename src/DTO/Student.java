/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import static DTO.FormatForm.StringInput;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 *
 * @author phamt
 */
public class Student implements Comparable<Student>{
    protected int ID;
    protected String Name;
    protected String Address;
    protected String Gender;
    Campus C ;
    public Student(){
        ID=0;
        Name="";
        Address="";
        Gender="";
        C=null;
    }
    public Student(int ID, String Name, String Address, String Gender, Campus C) {
        this.ID = ID;
        this.Name = Name;
        this.Address = Address;
        this.Gender = Gender;
        this.C = C;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public Campus getC() {
        return C;
    }

    public void setC(Campus C) {
        this.C = C;
    }
    public void AddID(){
       boolean Flag=false;
        do{
            try{
            Scanner sc= new Scanner(System.in);
            String S = new String();
            System.out.println("Input ID for Student");
            S=sc.next();
            this.ID=Integer.parseInt(S);
            if(ID   <= 0) throw new Exception();
            } catch(NumberFormatException  e){
                System.out.println("Wrong Format ID");
                Flag=true;
            } catch(Exception e1){
                System.out.println("Wrong ID");
                Flag=true;
            }
        } while(Flag);
    }
    public void AddStudent(){
        boolean Flag;
        Scanner sc = new Scanner(System.in);
        do{
            Flag=false;
            try{
                sc = new Scanner(System.in);
                System.out.println("Input Name for Campus");
                this.Name= sc.nextLine();
                if(Name.isEmpty()||Name.matches(StringInput)==false) throw new Exception();
            Name=FormatForm.toTitleCase(Name);
            }catch(NoSuchElementException e){
            System.out.println("Wrong Format");
            Flag=true; }
            catch(Exception e1){
                System.out.println("Wrong Format");
                Flag=true;
            }
        }while(Flag);
        do{
            Flag=false;
            try{
                sc = new Scanner(System.in);
                System.out.println("Input Address for Campus");
                this.Address= sc.nextLine();
                if(Address.isEmpty()||Address.matches(StringInput)==false) throw new Exception();
            Address=FormatForm.toTitleCase(Address);
            }catch(NoSuchElementException e){
            System.out.println("Wrong Format");
            Flag=true; }
            catch(Exception e1){
                System.out.println("Wrong Format");
                Flag=true;
            }
        }while(Flag);
        do{
            Flag=false;
            try{
                sc = new Scanner(System.in);
                System.out.println("What is Staff gender, male of female?");
                this.Gender= sc.nextLine();
                Gender.toLowerCase();
                if( Gender.equalsIgnoreCase("male")==false )
                if(Gender.equalsIgnoreCase("female")==false){ 
                    throw new Exception();
                }
                if(Gender.isEmpty()) throw new Exception();
            Gender=FormatForm.toTitleCase(Gender);
            }catch(NoSuchElementException e){
            System.out.println("Wrong Format");
            Flag=true; }
            catch(Exception e1){
                System.out.println("Wrong Format");
                Flag=true;
            }
        }while(Flag);
    }
    public void Output(){
        System.out.println("ID: "+ID);
        System.out.println("Name: "+Name);
        System.out.println("Address: "+Address);
        System.out.println("Gender: "+Gender);
    }
    public String toString() {
        return "Student{" + "ID=" + ID + ", Name=" + Name + ", Address=" + Address + ", Gender=" + Gender + ", C=" + C + '}';
    }

    public int compareTo(Student o) {
      if(this.ID > o.ID ) return 1;
      if(this.ID < o.ID ) return -1;
      return 0;
    }
    
    
    
}

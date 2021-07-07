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
public class Course implements Comparable<Course>{
    protected int code;
    protected String name;
    protected String credits;
    public Course(){
        code=0;
        name="";
        credits="";
        
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCredits() {
        return credits;
    }

    public void setCredits(String credits) {
        this.credits = credits;
    }
     public void AddCode(){
        boolean Flag;
           do {
               Flag=false;
               try{
               System.out.println("Input Code ");
               Scanner sc = new Scanner(System.in);
               String s= sc.next();
                this.code=Integer.parseInt(s);
                if(code<=0){
                    Flag=true;
                    throw new Exception();
                }
                }catch (NumberFormatException e){
                    System.out.println("Wrong Format Code(Code is number)");
                }
                catch(Exception e1){
                    System.out.println("Code !>0");
                }
    }while(Flag);
    }
      public void Add(){
        boolean Flag;
        Scanner sc = new Scanner(System.in);
        do{
            Flag=false;
            try{
                sc = new Scanner(System.in);
                System.out.println("Input Name");
                this.name= sc.nextLine();
                if(name.isEmpty()|| name.matches(StringInput)==false) throw new Exception();
            name=FormatForm.toTitleCase(name);
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
                this.credits= sc.nextLine();
                if(credits.isEmpty()||credits.matches(StringInput)==false) throw new Exception();
                credits=FormatForm.toTitleCase(credits);
            }
            catch(NoSuchElementException e){
                System.out.println("Wrong Format");
                Flag=true;
                }
            catch(Exception e1){
                System.out.println("Wrong Format");
                Flag=true;
                }
        }while(Flag);  
    }
public void Output(){
        System.out.println("code: "+code);
        System.out.println("Name: "+ name);
        System.out.println("credits: "+credits);
    }
    @Override
    public String toString() {
        return "Course{" + "code=" + code + ", name=" + name + ", credits=" + credits + '}';
    }

    @Override
    public int compareTo(Course o) {
        if(this.code > o.code) return 1;
        if(this.code < o.code) return -1;
        return 0;
        
    }
}

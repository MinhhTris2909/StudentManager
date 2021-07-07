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
public class Campus implements Comparable<Campus>{
    protected int code;
    protected String Name;
    protected String Address;

    public Campus() {
        code =0;
        Name="";
        Address="";
        
    }

    public Campus(int code, String Name, String Address) {
        this.code = code;
        this.Name = Name;
        this.Address = Address;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
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
    public void AddCode(){
        boolean Flag;
           do {
               Flag=false;
               try{
               System.out.println("Input Code for Campus");
               Scanner sc = new Scanner(System.in);
               String s= sc.next();
                this.code=Integer.parseInt(s);
                if(code<=0){
                    
                    throw new Exception();
                }
                }catch (NumberFormatException e){
                    System.out.println("Wrong Format Code(Code is number)");
                     Flag=true;
                }
                catch(Exception e1){
                    System.out.println("Code !>0");
                     Flag=true;
                }
    }while(Flag);
    }
    @Override
    public String toString() {
        return "Campus{" + "code=" + code + ", Name=" + Name + ", Address=" + Address + '}';
    }
    public void AddCampus(){
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
    public void OutPutCampus(){
        System.out.println("Code: "+code);
        System.out.println("Name: "+Name);
        System.out.println("Address: "+Address);
        
    }

    @Override
    public int compareTo(Campus o) {
      if(this.code > o.code ) return 1;
      if(this.code < o.code ) return -1;
      return 0;
    }
    
}

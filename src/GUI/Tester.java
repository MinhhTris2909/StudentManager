/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DTO.Campus;
import DTO.CampusList;
import DTO.Course;
import DTO.CourseList;
import DTO.Enroll;
import DTO.EnrollList;
import DTO.Student;
import DTO.StudentList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author phamt
 */
public class Tester {
    public static void main(String[] args) {
        int ChoiceMain=0;
        int Choice=0;
        CampusList ListCampus = new CampusList();
        CourseList ListCourse = new CourseList();
        EnrollList ListEnroll = new EnrollList();
        StudentList ListStudent = new StudentList();
        Scanner sc = new Scanner(System.in);
        boolean Flag=false;
        do{
            Flag = true;
        System.out.println("---Nemu---");
        System.out.println("1.Campus Manager");
        System.out.println("2.Student Manager");
        System.out.println("3.Course Manager");
        System.out.println("4.Enroll Manager");
        System.out.println("0. Out");
        System.out.println("------------------");
        try{
        sc = new Scanner(System.in);
        ChoiceMain = sc.nextInt();
        if(ChoiceMain==0){
            System.out.println("Thank for use my services");
            Flag=false;
        }
        if(ChoiceMain<0 || ChoiceMain>5) throw new Exception();
        }
        catch(InputMismatchException e1){
            System.out.println("Wrong Format");
            
        }
        catch(Exception e){
            System.out.println("Wrong choice, please choice agian");
           
        }
        switch(ChoiceMain){
            case 1:
                do{
                    Flag=true;
                    try{
                    sc=new Scanner(System.in);
                    System.out.println("-Campus Staff-");
                    System.out.println("1.Add CamPus");
                    System.out.println("2.Display Campus");
                    System.out.println("3.Update Campus");
                    System.out.println("4.Remove Campus");
                    System.out.println("5.Sort");
                    System.out.println("0.Out");
                    Choice = sc.nextInt();
                    if(Choice==0){
                        System.out.println("Thank!!! back to Main Nemu");
                        Flag=false;
                        
                    }
                    if(Choice<0 || Choice>6) throw new Exception();
                    } catch(InputMismatchException e1){
                        System.out.println("Wrong Format");
                        
                    } catch(Exception e){
                        System.out.println("Wrong choice, Please choice agian");
                        
                    }
                    switch(Choice){
                        case 1: 
                            System.out.println("Add Campus");
                            Campus C = new Campus();
                            C.AddCode();
                            C.AddCampus();
                            ListCampus.Add(C);
                            break;
                        case 2: 
                            System.out.println("Display Campus");
                            if(ListCampus.Display()==true){
                                System.out.println("successfull");
                            } else System.out.println("Failer");
                            break;
                        case 3: 
                            System.out.println("Input ID you want Update");
                            C=new Campus();
                            C.AddCode();
                            C=ListCampus.Search(C.getCode());
                            if(C==null) System.out.println("Don't have ID");
                            ListCampus.Update(C.getCode());
                            break;
                        case 4: 
                            System.out.println("Input ID you want remove");
                            C=new Campus();
                            C.AddCode();
                            C=ListCampus.Search(C.getCode());
                            if(C==null) System.out.println("Don't have ID");
                            ListCampus.Update(C.getCode());
                            
                            break;    
                        case 5: 
                            if(ListCampus.SortByID()==true) System.out.println("Successfull");
                            else System.out.println("Fail");
                            break;    
                    }
                }while(Flag);
                break;
            case 2:
                  do{
                    Flag=true;
                    try{
                    sc=new Scanner(System.in);
                    System.out.println("-Nemu Student-");
                    System.out.println("1.Add Student");
                    System.out.println("2.Display Student");
                    System.out.println("3.Update Student");
                    System.out.println("4.Remove Student");
                    System.out.println("5.Sort");
                    System.out.println("0.Out");
                    Choice = sc.nextInt();
                    if(Choice==0){
                        System.out.println("Thank!!! back to Main Nemu");
                        Flag=false;
                        
                    }
                    if(Choice<0 || Choice>6) throw new Exception();
                    } catch(InputMismatchException e1){
                        System.out.println("Wrong Format");
                        
                    } catch(Exception e){
                        System.out.println("Wrong choice, Please choice agian");
                        
                    }
                    switch(Choice){
                        case 1: 
                            System.out.println("Add Student");
                            Student tmp = new Student();
                            tmp.AddID();
                            tmp.AddStudent();
                            ListStudent.Add(tmp);
                            break;
                        case 2: 
                            System.out.println("Display Student");
                            if(ListStudent.Display()==true){
                                System.out.println("successfull");
                            } else System.out.println("Failer");
                            break;
                        case 3: 
                            System.out.println("Input ID you want Update");
                            tmp=new Student();
                            tmp.AddID();
                            tmp=ListStudent.Search(tmp.getID());
                            if(tmp==null) System.out.println("Don't have ID");
                            ListStudent.UpdateStaff(tmp.getID());
                            break;
                        case 4: 
                            System.out.println("Input ID you want remove");
                            tmp=new Student();
                            tmp.AddID();
                            tmp=ListStudent.Search(tmp.getID());
                            if(tmp==null) System.out.println("Don't have ID");
                            ListCampus.Remove(tmp.getID());
                            
                            break;    
                        case 5: 
                            if(ListCampus.SortByID()==true) System.out.println("Successfull");
                            else System.out.println("Fail");
                            break;    
                    }
                }while(Flag);
                break;
            case 3:
                    do{
                    Flag=true;
                    try{
                    sc=new Scanner(System.in);
                    System.out.println("-Course Nemu-");
                    System.out.println("1.Add Course");
                    System.out.println("2.Display Course");
                    System.out.println("3.Update Course");
                    System.out.println("4.Remove Course");
                    System.out.println("5.Sort");
                    System.out.println("0.Out");
                    Choice = sc.nextInt();
                    if(Choice==0){
                        System.out.println("Thank!!! back to Main Nemu");
                        Flag=false;
                        
                    }
                    if(Choice<0 || Choice>6) throw new Exception();
                    } catch(InputMismatchException e1){
                        System.out.println("Wrong Format");
                        
                    } catch(Exception e){
                        System.out.println("Wrong choice, Please choice agian");
                        
                    }
                    switch(Choice){
                        case 1: 
                            System.out.println("Add Course");
                            Course tmp = new Course();
                            tmp.AddCode();
                            tmp.Add();
                            ListCourse.AddList(tmp);
                            break;
                        case 2: 
                            System.out.println("Display Course");
                            if(ListCourse.Display()==true){
                                System.out.println("successfull");
                            } else System.out.println("Failer");
                            break;
                        case 3: 
                            System.out.println("Input ID you want Update");
                            tmp=new Course();
                            tmp.AddCode();
                            tmp=ListCourse.Search(tmp.getCode());
                            if(tmp==null) System.out.println("Don't have ID");
                            ListCourse.Update(tmp.getCode());
                            break;
                        case 4: 
                            System.out.println("Input ID you want remove");
                            tmp=new Course();
                            tmp.AddCode();
                            tmp=ListCourse.Search(tmp.getCode());
                            if(tmp==null) System.out.println("Don't have ID");
                            ListCourse.Remove(tmp.getCode());
                            
                            break;    
                        case 5: 
                            if(ListCampus.SortByID()==true) System.out.println("Successfull");
                            else System.out.println("Fail");
                            break;
                    }
                }while(Flag);
                break;
            case 4: 
                do{
                    Flag=true;
                    try{
                    sc=new Scanner(System.in);
                    System.out.println("-Enroll Course-");
                    System.out.println("1.Enroll ");
                    System.out.println("2.Display Enroll");
                    System.out.println("3.Update Enroll");
                    System.out.println("4.Remove Enroll");
                    System.out.println("0.Out");
                    Choice = sc.nextInt();
                    if(Choice==0){
                        System.out.println("Thank!!! back to Main Nemu");
                        Flag=false;
                        
                    }
                    if(Choice<0 || Choice>5) throw new Exception();
                    } catch(InputMismatchException e1){
                        System.out.println("Wrong Format");
                        
                    } catch(Exception e){
                        System.out.println("Wrong choice, Please choice agian");
                        
                    }
                    switch(Choice){
                        case 1: 
                            System.out.println("Add Course");
                            Course tmp = new Course();
                            tmp.AddCode();
                            tmp.Add();
                            System.out.println("Add Student");
                            Student tmp1 = new Student();
                            tmp1.AddID();
                            tmp1.AddStudent();
                            Enroll E = new Enroll();
                            E.setC(tmp);
                            E.setS(tmp1);
                            ListEnroll.Add(E);
                            break;
                        case 2: 
                            System.out.println("Display Enroll Course");
                            if(ListEnroll.Output()==true){
                                System.out.println("successfull");
                            } else System.out.println("Failer");
                            break;
                        case 3: 
                            System.out.println("Input ID Student you want Update");
                            tmp=new Course();
                            tmp.AddCode();
                            System.out.println("Input ID Course for student");
                            tmp1=new Student();
                            tmp1.AddID();
                            tmp=ListCourse.Search(tmp1.getID());
                            tmp1=ListStudent.Search(tmp1.getID());
                            if(tmp==null || tmp1==null) System.out.println("Don't have ID");
                            ListEnroll.Update(tmp1,tmp);
                            break;
                        case 4: 
                            System.out.println("Input ID Student you want remove");
                            tmp=new Course();
                            tmp.AddCode();
                            System.out.println("Input ID Course for student");
                            tmp1=new Student();
                            tmp1.AddID();
                            tmp=ListCourse.Search(tmp1.getID());
                            tmp1=ListStudent.Search(tmp1.getID());
                            if(tmp==null) System.out.println("Don't have ID");
                            ListEnroll.Remove(tmp1,tmp);
                            
                            break;    
                        
                    }
                }while(Flag);
                
        }
        }while(Flag);
    }
    
}

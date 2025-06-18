package Biradar;
import java.util.*;
public class Main {
     int num;
     String name;
     char grade;
    /* void setdata(int number, String names,char grd)
     {
         num=number;
         name=names;
         grade=grd;
     }*/
     Main(int number, String names,char grd)
     {
        num=number;
         name=names;
         grade=grd; 
  System.out.println(num+" "+name+" "+grade);
     }
     void printdata()
     {
    	  System.out.println(num+" "+name+" "+grade);

     }
    public static void main(String[] args) {
        Main m=new Main(10,"vishant",'a');
      /*  m.num=10;
        m.name="vishant";
        m.grade='a';*/
       // m.setdata(10,"vishant",'a');
        m.printdata();
        


      
}
}
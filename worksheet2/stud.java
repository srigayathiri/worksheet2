import java.util.Scanner;
class student
{
   
    int m1;
    int m2;
    int m3;
    String name;
    String dept;
    String grade;
    void getdata()
    {
      System.out.println("enter name dept m1 m2 m3");
      Scanner obj=new Scanner(System.in);
      name=obj.next();
      dept=obj.next();
      m1=obj.nextInt();
      m2=obj.nextInt();
      m3=obj.nextInt();
     
    }
    void markcal()
    {
        double s;
        if(m1<50 || m2<50 || m3<50)
            grade="Grade: FAIL";
        else
        {
        s=(m1+m2+m3)/3;
        if(s>80)
            grade="Grade: FIRST CLASS";
        else if(s>70 && s<79)
            grade="Grade: SECOND CLASS";
        else if (s>50 && s<69)
            grade="Grade: THIRD CLASS";
        else
            grade="Grade : FAIL";
        }
       
    }
    void display()
    {
        System.out.println("NAME:"+name);
        System.out.println("DEPT:"+dept);
        System.out.println(grade);
        System.out.println("m1->"+m1);
        System.out.println("m2->"+m2);
        System.out.println("m3->"+m3);
    }
   
   
}
public class school{
    public static void main(String[] args) {
        student obb[]=new student[10];
        int i;
        System.out.println("enter Student details:");
        for(i=0;i<3;i++)
        {
           obb[i]=new student();
           obb[i].getdata();
           obb[i].markcal();
        }
        for(i=0;i<3;i++)
        {
            obb[i].display();
        }
    }
   
}

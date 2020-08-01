import java.util.*;
class arithmatic
{
   int a;
   int b;
    void add(int a,int b)
    {
        System.out.println("Addition is "+(a+b));
    }
    void sub(int a,int b)
    {
        System.out.println("Subraction is "+(a-b));
    }
    void mul(int a,int b)
    {
        System.out.println("Multiplication is "+(a*b));
    }
    void div(int a,int b)
    {
        System.out.println("Division is "+(a/b));
    }
   
}
public class maths {
    public static void main(String[] args) {
        arithmatic obj=new arithmatic();
        System.out.println("enter two number");
        Scanner objt=new Scanner(System.in);
        obj.a=objt.nextInt();
        obj.b=objt.nextInt();
        obj.add(obj.a,obj.b);
        obj.sub(obj.a,obj.b);
        obj.mul(obj.a,obj.b);
        obj.div(obj.a,obj.b);
    }
   
}

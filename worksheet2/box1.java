import java.util.Scanner;
class box2
        {
    double l;
    double b;
    double h;
void getvalue()
    {
        System.out.println("enter the length breadth height");
        Scanner obj=new Scanner(System.in);
        l=obj.nextDouble();
        b=obj.nextDouble();
        h=obj.nextDouble();
    }
    void calcu()
    {
        System.out.println("the volume is:"+" "+l*h*b);
       
    }
}
public class container2 {
    public static void main(String[] args) {
        box2 obj=new box2();
       
        obj.getvalue();
        obj.calcu();
    }
   
}

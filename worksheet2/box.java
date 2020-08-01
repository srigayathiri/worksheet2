import java.util.Scanner;
 class box
{
    double length;
    double breadth;
    double width;
}
public class container {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        box objt=new box();
        System.out.println("enter length breadth width");
        objt.length=obj.nextInt();
        objt.breadth=obj.nextInt();
        objt.width=obj.nextInt();
        System.out.println("the volume is : "+(objt.length*objt.breadth*objt.width));

    }
   
}


import java.util.*;
import java.math.*;

class Triangle{
    int x,y,z;

    public Triangle(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double area(int x,int y,int z){
        if((x+y)>z && (x+z)>y && (y+z)>x)
        {
            int s=(x+y+z)/2;
            double  area1=Math.sqrt(s*(s-x)*(s-y)*(s-z));
            return area1;
        }
        else
           return 0;}
}

public class Solution7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x= sc.nextInt();
        int y= sc.nextInt();
        int z= sc.nextInt();
        Triangle n=new Triangle(x,y,z);
        System.out.println("Area is:"+n.area(x,y,z));

    }
}
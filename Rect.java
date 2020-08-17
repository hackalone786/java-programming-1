import java.util.*;

class Rectangle
{
    int width;
    int height;
    void display(int width, int height)
    {
        System.out.println(width+" "+height);
    }
}

class RectangleArea extends Rectangle 
{
    void read_input(int x, int y) {
        this.width = x;
        this.height = y;
    }

    void display() {
        System.out.println(width*height);
    }
}

public class Rect {

    public static void main(String[] args)
    {
        int wid,height;
        Scanner sc = new Scanner(System.in);
        wid = sc.nextInt();
        height = sc.nextInt();
        Rectangle f1 = new Rectangle();
        RectangleArea f2 = new RectangleArea();
        f1.display(wid,height);
        f2.read_input(wid, height);
        f2.display();

    }

}
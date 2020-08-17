import java.util.*;

class Generics {
         public void Generic(int n){
             Scanner sc = new Scanner(System.in);
             ArrayList<Double> list= new ArrayList<>(n);
             double a;
             for(int i=1;i<=n;i++) {
                 try {
                    a = sc.nextDouble();
                 } catch (InputMismatchException e) {
                     System.out.println("Wrong input, Not a number");
                     break;
                 }
                 list.add(a);
             }
             for (Double i : list) {
                 System.out.println((0.67)*i);
         }



}}

public class Solution8 {
             Solution8(){
    Generics gen = new Generics();
                 Scanner sc = new Scanner(System.in);
                 System.out.println("How many numbers you want to enter? ");
                 int n= sc.nextInt();
                     gen.Generic(n);}



    public static void main(String[] args)
    {
        Solution8 test = new Solution8();
    }
    }
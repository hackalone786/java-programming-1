import java.util.*;

public class Calculator {
    @FunctionalInterface
    interface Calcop{
        int operate(int number1, int number2);
    }

    public int operate(int a,int b,Calcop op) {
        return op.operate(a,b);
    }

    private void add(int a, int b) {
        Calcop add = (number1, number2) -> number1 + number2;
        System.out.println("Addition is = " + operate(a, b, add));
    }

    private void difference(int a, int b) {
        Calcop s = (number1, number2) -> number1 - number2;
        System.out.println("Subtraction is = " + operate(a, b, s));
    }

    private void product(int a, int b) {
        Calcop mul = (number1, number2) -> number1 * number2;
        System.out.println("Multiplication = " + operate(a, b, mul));
    }

    private void safeDivision(int a, int b) {
        Calcop div = (number1, number2) -> number1 / number2;
        System.out.println("Division = " + operate(a, b, div));
    }

    public static void main(String[] args) {
        Calculator i = new Calculator();
        Scanner sc = new Scanner(System.in);
        int x,y,n;
         System.out.println("Enter 2 numbers: ");
         x = sc.nextInt();
         y = sc.nextInt();
         System.out.println("Choose :-\n1.Addtion \n2.Substraction \n3.Multiplication \n4.Division");
        n = sc.nextInt();
        switch(n) {
            case 1:i.add(x, y);
            break;
            case 2:i.difference(x, y);
            break;
            case 3:i.product(x, y);
            break;
            case 4:i.safeDivision(x, y);
            break;
            default : System.out.println("Wrong choice!");
        }


    }

}
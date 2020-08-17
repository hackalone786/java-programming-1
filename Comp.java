import java.util.*;

class Complex{
    int real;
    int imaginary;

    public Complex(int real , int imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }

    public Complex add(Complex b){
        return new Complex(this.real+b.real,this.imaginary+b.imaginary);
    }
    public Complex subtract(Complex b){
        return new Complex(this.real-b.real,this.imaginary-b.imaginary);
    }
    public Complex multiply(Complex b){
        return new Complex( this.real*b.real - this.imaginary*b.imaginary , this.imaginary*b.real + this.real*b.imaginary);
    }
    public String toString(){
        return String.format("Real part : %d : Imaginary part : %d",this.real,this.imaginary );
    }
}
public class Comp
 {

    Comp(){
        Complex x = new Complex(1,2);
        Complex y = new Complex(3,4);
        System.out.println((x.add(y)).toString());
        System.out.println((x.subtract(y)).toString());
        System.out.println((x.multiply(y).toString()));


    }

    public static void main(String[] args) {
        Comp test = new Comp();
    }
}
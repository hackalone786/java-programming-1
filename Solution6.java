import java.util.*;
class Employees{
    String empName,empAddress;
    int empJoin,empSalary;

    public Employees(String empName,int empJoin, int empSalary, String empAddress) {
        this.empName = empName;
        this.empAddress = empAddress;
        this.empJoin = empJoin;
        this.empSalary = empSalary;
    }


}

public class Solution6 {
    public static void main(String[] args) {
        List<Employees>employees=Arrays.asList(new Employees("Robert",1994,64000,"64C-Wall Street"),
                new Employees("Sam",2000,65000,"68D-Wall Street"),
                new Employees("John",1999,25000,"26B- Wall Steet"));
        System.out.println("Name\tYear of joining\tAddress");
        for(Employees e:employees){
             int i;
             i = e.empName.length();
            if(i>3) {
               // System.out.println(i);
                System.out.println(e.empName + "\t" + e.empJoin + "\t\t\t" + e.empAddress);
            }
            else
                System.out.println(e.empName + "\t\t" + e.empJoin + "\t\t\t" + e.empAddress);


        }
    }
}
import java.util.*;
public class Employee {
    int id;
    String Name;
    String Designation;
    int Salary;
    String Location;
    public Employee(int id,String Name,String Designation,int Salary,
                    String Location) {
        this.id=id;
        this.Name= Name;
        this.Designation=Designation;
        this.Salary=Salary;
        this.Location=Location;

    }

    public int getEmpId() {
        return id;
    }
    public void setEmpId(int id) {
        this.id = id;
    }
    public String getEmpName() {
        return Name;
    }
    public void setEmpName(String Name) {
        this.Name = Name;
    }
    public String getEmpDesignation() {
        return Designation;
    }
    public void setEmpDesignation(String Designation) {
        this.Designation = Designation;
    }
    public Integer getEmpSalary() {
        return Salary;
    }
    public void setEmpSalary(int Salary) {
        this.Salary = Salary;
    }
    public String getEmpLocation() {
        return Location;
    }
    public void setEmpLocation(String Location) {
        this.Location = Location;
    }
    public String toString(){
        return id+" "+Name+" "+Designation+" "+Salary+" "+Location;

    }
    public static void main(String[] args){
        ArrayList<Employee> employee1=new ArrayList<>();
        employee1.add(new Employee(1,"Test1","PA",10000,"Delhi"));
        employee1.add(new Employee(2,"Test2","Analyst",10000,"Mumbai"));
        employee1.add(new Employee(3,"Test3","Sr.Analst",95000,"Indore"));
        employee1.add(new Employee(4,"Test4","Junior Analyst",11000,"Bhopal"));
        employee1.add(new Employee(5,"Test5","Comp operator",40000,"Nagpur"));
        employee1.add(new Employee(6,"Test6","Manager",80000,"Dehradun"));
        employee1.add(new Employee(7,"Test7","Assist manager",60000,"Delhi"));
        employee1.add(new Employee(8,"Test8","PA",8000,"Mumbai"));
        employee1.add(new Employee(9,"Test9","Analyst",2000,"Bhopal"));
        employee1.add(new Employee(10,"Test10","TRAINEE",630000,"Jabalpur"));




        System.out.println("All the name's of Employee");
        employee1.forEach(employee -> System.out.println(employee.getEmpName()));
		System.out.println("Employee's whose salary greater than 50000");
        employee1.stream().filter(employee -> employee.getEmpSalary()>50000).forEach(employee -> System.out.println(employee.getEmpSalary()));
        System.out.println("Location starts with M");
        employee1.stream().filter(employee -> employee.getEmpLocation().startsWith("M")).forEach(employee -> System.out.println(employee.getEmpLocation()));
        System.out.println("Designation Ending With E");
        employee1.stream().filter(employee -> employee.getEmpDesignation().endsWith("E")).forEach(employee -> System.out.println(employee.getEmpDesignation()));

    }
}
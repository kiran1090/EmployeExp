import java.util.ArrayList;
import java.util.List;


public class Employee {
    public String Name,Address;
    public int YearOfJoining;
    public Double Salary;
    public Employee(String Name, int YearOfJoining,Double Salary,String Address)
    {
        this.Name=Name;
        this.YearOfJoining=YearOfJoining;
        this.Salary=Salary;
        this.Address=Address;
    }


    @Override
    public String toString() {
        return "" +
                  Name + " "
                 + Address +" "
                 + YearOfJoining +
                " "+ Salary
                ;
    }

    public static void main(String[] args)
    {


        System.out.println("Name     Address    Yearofjoining   Salary");
Employee Emp1= new Employee("kiran",1990,1000.0,"sreevalsam");
Employee Emp2= new Employee("Arun",1991,200.00,"mariyapuram");
        System.out.println(Emp1);
    }
}
import java.util.ArrayList;
import java.util.List;
public class EmployeeMain
{
    public static void main(String args[])
    {
//creating an empty list of employee and adding objects to them
        List<Employee> employees= new ArrayList<>();
        employees.add(new Employee("B065", "Emma", 'F', 21, "emma123@yahoo.com",  78000.00));
        employees.add(new Employee("M034", "Olivia", 'F', 24, "olivia123@gmail.com",  89000));
        employees.add(new Employee("C045", "Smith", 'M', 25, "Smith997@rediff.com",  56000.00));
        employees.add(new Employee("L056", "Herry", 'M', 22, "herry23@hotmail.com",  56000.00));
        employees.add(new Employee("P078", "William", 'M', 27, "william56@gmail.com",  80000.00));
        employees.add(new Employee("G089", "Maria", 'F', 30, "maria90@gmail.com",  100000.00));
        employees.add(new Employee("S012", "Julia", 'F', 25, "julia1990@gmail.com",  60000.00));
        employees.add(new Employee("M055", "David", 'M', 23, "david99@gmail.com",  70000.00));
//prints the list objects in tabular format
        System.out.println("---------------------------------------------------------------------------------------------");
        System.out.printf("%5s %10s %10s %8s %20s %17s", "EMPLOYEE ID", "NAME", "GENDER", "AGE", "E-MAIL ID", "SALARY");
        System.out.println();
        System.out.println("---------------------------------------------------------------------------------------------");
//iterates over the list
        for(Employee employee: employees)
        {
            System.out.format("%7s %14s %7s %10s %25s %13s", employee.getId(), employee.getName(), employee.getGender(), employee.getAge(), employee.getEmailId(), employee.getSalary());
            System.out.println();
        }
        System.out.println("----------------------------------------------------------------------------------------------");
    }
}
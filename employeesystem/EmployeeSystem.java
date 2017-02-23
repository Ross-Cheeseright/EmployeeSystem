/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeesystem;

/**
 *
 * @author 2cheer65
 */
public class EmployeeSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Employee e1 = new Employee("Ross", 23000, 30, 10);
        FrontLine f1 = new FrontLine("Ross", 15, 20, 5);
        Admin a1 = new Admin ("Ross", 15, 20, 5, "God");
        Manager m1 = new Manager ("God",23000,30,10,5);
        
        if(e1.setWorkHours(40)==false)
        {
            System.out.println("Uh-oh something went wrong");
        }
        else
        {
            System.out.println("Success! \n");
        }
        
        System.out.println("Yearly salary: \t" + e1.getPayRate());
        System.out.println(e1.bookHoliday(4));
        System.out.println(e1.getHoliday());
        
        System.out.println("\nEmployee Name: \t\t" + e1.getName()+ "\n" +
                            "Yearly Pay: \t\t" +e1.getPayRate()+ "\n" +
                            "Employee Holiday: \t" + e1.getHoliday());
        
        System.out.println("\nEmployee Name: \t\t" + f1.getName()+ "\n" +
                            "Yearly Pay: \t\t" +f1.getPayRate()+ "\n" +
                            "Employee Holiday: \t" + f1.getHoliday());
        
        System.out.println("\nEmployee Name: \t\t" + f1.getName()+ "\n" +
                            "Yearly Pay: \t\t" +f1.getPayRate()+ "\n" +
                            "Employee Holiday: \t" + f1.getHoliday()+"\n" +
                            "Manager name: \t\t" + a1.getManagerName());        
    }
    
}

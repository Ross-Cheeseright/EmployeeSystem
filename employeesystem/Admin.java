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
public class Admin extends Employee {
    
    // Attributes inhereted from Eployee //
    protected String managerName;
    
    // Constructor // 
    public Admin (String nameIn, int payRateIn, int workHoursIn, int holidayIn, String managerNameIn)
    {
        super (nameIn, payRateIn, workHoursIn, holidayIn);
        managerName = managerNameIn;
    }
    
    // Getters //
    public String getManagerName()
    {
        return managerName;
    }
    
    // Setters // 
    public void setManagerName(String managerNameIn)
    {
        managerName = managerNameIn;
    }
}

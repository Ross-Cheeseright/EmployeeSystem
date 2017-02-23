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
public class FrontLine extends Employee 
{
    // Attributes inherited from Employee// 
    
    // Constructor //
    public FrontLine(String nameIn, int payRateIn, int workHoursIn, int holidayIn)
    {
        super (nameIn, payRateIn, workHoursIn, holidayIn);
    }
    
    // Override Methods //
    
    @Override
    public int getPayRate()
    {
        int salary = (workHours * payRate)*52;
        return salary;
    }
}

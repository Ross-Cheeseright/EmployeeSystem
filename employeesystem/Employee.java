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
public class Employee {
    // Attributed //
    protected String name;
    protected int payRate;
    protected int workHours;
    protected int holiday;
    
    // Construct //
    public Employee (String nameIn, int payRateIn, int workHoursIn, int holidayIn)
    {
        name = nameIn;
        payRate = payRateIn;
        workHours = workHoursIn;
        holiday = holidayIn;
    }
    
    // Getters // 
    
    public String getName()
    {
        return name;
    }
    
    public int getPayRate()
    {
        return payRate;
    }
    
    public int getWorkHours()
    {
        return workHours;
    }
    
    public int getHoliday()
    {
        return holiday;
    }
    
    // Setters // 
    public void setPayRate(int payRateIn)
    {
        payRate = payRateIn;
    }
    
    
    // Methods //
    public boolean setWorkHours(int workHoursIn)
    {
        if (workHoursIn > 40)
        {
            return false;
        }
        else
        {
            workHours = workHoursIn;
            return true;
        }
    }
    
    public boolean bookHoliday(int daysRequested)
    {
        if (holiday < 0)
        {
            return false;
        }
        else
        {
            holiday = holiday - daysRequested;
            return true;
        }
    }
}

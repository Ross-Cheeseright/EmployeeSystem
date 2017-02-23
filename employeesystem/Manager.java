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
public class Manager extends Employee {
    
    // Attributes inhereted from Employee // 
    protected int bonus;
    
    // Constructor // 
    public Manager (String nameIn, int payRateIn, int workHoursIn, int holidayIn, int bonusIn)
    {
        super (nameIn, payRateIn, workHoursIn, holidayIn);
        bonus = bonusIn;
    }
    
    // Getters // 
    public int getBonus()
    {
        return bonus;
    }
    
    public void setBonus(int bonusIn)
    {
        bonus = bonusIn;
    }
    
}

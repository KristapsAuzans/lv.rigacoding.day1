/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lv.rigacoding.day1;

/**
 *
 * @author Kristaps
 */
public class Worker {
    private String Name;
    private String Family;
    private int DateofBirth;
    private String email;
    private String Phone;
    private Adress Adrese;
    private Department Department;
    private Department PreviousDepartment;
    
    
    public Worker(String Name, String Family, int DateofBirth, String email, String Phone, Adress Adrese, Department Department, Department previousDepartment){
        this.Name = Name;
        this.Family = Family;
        this.DateofBirth = DateofBirth;
        this.email = email;
        this.Phone = Phone;
        this.Adrese = Adrese;
        this.Department = Department;
        this.PreviousDepartment = PreviousDepartment;
    }
    public String getName(){
    return Name;
}
    
}

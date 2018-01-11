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
public class Department {
    public String Name;
    public int Worker;
    public Adress Location;
       
    public Department(String Name, int Worker, Adress Location){
        this.Name = Name;
        this.Worker = Worker;
        this.Location = Location;
    }
    public String getDepartment(){
        return Name + ", " + Worker + " darbinieki, " + Location.getAdress();
    }
    
    }



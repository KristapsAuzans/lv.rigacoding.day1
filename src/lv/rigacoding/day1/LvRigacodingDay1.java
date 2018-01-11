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
public class LvRigacodingDay1 {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Adress a1 = new Adress ("Latvia", "Bauska", "Govju iela", "14a", "-1");
        Adress a2 = new Adress ("Latvia", "Bauska", "Ziepju iela", "25b", "-7");
        Adress a3 = new Adress ("Latvia", "Bauska", "Sienāžu iela", "2", "9");
        Adress a4 = new Adress ("Latvia", "Bauska", null, null, null);
               
        Department d1 = new Department ("\"Miestnieki\"", 12, a2);
        Department d2 = new Department ("\"Fermeri\"", 9, a3);
        Worker w1 = new Worker ("Jānis", "Sloka", 1976, "JSloka@gmail.com", "28388822", a1, d1, d2);
        
        
         System.out.println("Mani sauc " + w1.getName() + ", es dzīvoju " + a1.getAdress());
         System.out.println("mani sauc " +w1.getName()+ ", es pārgāju uz jauno nodaļu " + d2.getDepartment() + " no vecās nodaļas " + d1.getDepartment());
        System.out.println("Es dzīvoju " + a4.ShortAdress());
        
                
        
        
    }
    
    
   
    
}

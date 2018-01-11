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
public class Adress {
    private String State;
    private String City;
    private String Street;
    private String HouseNr;
    private String ApartmentNr;
    
    public Adress(String State, String City, String Street, String HouseNr, String ApartmentNr){
      this.State = State;
      this.City = City;
      this.Street = Street;
      this.HouseNr = HouseNr;
      this.ApartmentNr = ApartmentNr;
    }
      
          public String getAdress(){
          return (State + ", " + City + ", " + Street + " " + HouseNr + "-" + ApartmentNr);
      }
    
          public String ShortAdress(){
              String parts = "";
              if(State != null){
                  parts = parts + State + ", ";
              }
              if(City != null){
                  parts = parts + City + "  ";
              }
              if(Street != null){
                  parts = parts + Street + "  ";
              }
              if(HouseNr != null){
                  parts = parts + HouseNr + " - ";
              }
              if(ApartmentNr != null){
                  parts = parts + ApartmentNr + ". ";
              }
              if(parts.length()>0){
                  parts = parts.substring(0, parts.length()- 2);
              }
              
              return (parts); 
          }
          
}

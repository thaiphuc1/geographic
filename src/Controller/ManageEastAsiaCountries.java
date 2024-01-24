/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.util.ArrayList;
import Model.EastAsiaCountries;
import java.util.Collections;
import java.util.Comparator;
/**
 *
 * @author thaip
 */
public class ManageEastAsiaCountries {
    private ArrayList<EastAsiaCountries> list = new ArrayList<>();
    public void enterInfo(EastAsiaCountries country){
        list.add(country);
        System.out.println("Add successful!");
    }
    
    
    public void search(String name){
        for (EastAsiaCountries k : list) {
            if(k.getCountryName().equals(name)){
                System.out.println(k.toString());
            }
        }
    }
    public void sort(){
        Collections.sort(list, new Comparator<EastAsiaCountries>() {
            @Override
            public int compare(EastAsiaCountries o1, EastAsiaCountries o2) {
                return o1.getCountryName().compareTo(o2.getCountryName());
            }
        }
                
        );
        
    }
    
    public  void displayCountry(){
        System.out.println("ID\t\tName\t\tTotal Area\tTerrain");
        for (EastAsiaCountries a : list) {
                System.out.println(a.toString());
        }
    }
    
}

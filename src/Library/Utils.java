/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Library;
import View.Menu;
import Controller.ManageEastAsiaCountries;
import Model.Country;
import Model.EastAsiaCountries;
import java.util.Scanner;
import jdk.jshell.execution.Util;
/**
 *
 * @author thaip
 */
public class Utils extends Menu<String>{
    private static String[] mc={"Input the information of 11 countries in East Asia","Display the information of country you've just input","Search the information of country by user-entered name","Display the information of countries sorted name in ascending order","Exit"};
    private ManageEastAsiaCountries country = new ManageEastAsiaCountries();
    Scanner sc = new Scanner(System.in);
    public Utils() {
        super("Menu",mc);
     }
    @Override
    public void execute(int n) {
        switch(n) {
            case 1: {input(); break;}
            case 2: {printCountry(); break;}
            case 3: {search(); break;}
            case 4: {sort();break;}
            case 5: System.exit(0);
        }
    }
    public void input(){
        String id = Menu.getString("Enter code of country: ");
        String name = Menu.getString("Enter name of country: ");
        double area = 0;
        do{
           try{
            area = Double.parseDouble(Menu.getString("Enter total Area: "));
            if(area == 0){
                System.out.println("Area cannot be 0. Please input valid area!");
            }
        }catch(NumberFormatException e){
                System.out.println("Area cannot be 0. Please input valid area!");
        }
        }while(area == 0);
        String terrain = Menu.getString("Enter terrain of country: ");
        country.enterInfo(new EastAsiaCountries(terrain, id, name, area));
    }
    public void printCountry(){
        country.displayCountry();
    }
    public void search(){
        String name = Menu.getString("Enter the name you want to search for: ");
        country.search(name);
    }
    public void sort(){
        country.sort();
        printCountry();
    }

    
}

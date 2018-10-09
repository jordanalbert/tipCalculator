/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package albert_project4.pkg1_tipcalculator;

import java.text.NumberFormat;
import java.util.*;

/*
 *Jordan Albert
 *September 8th, 2018
 *Project 4-1 Tip Calculator
 */
public class Albert_Project41_tipCalculator {

    static Scanner sc = new Scanner(System.in);
    

    
    public static void main(String[] args) {
        
        
            setTitle();
            String a;
        
        do {
            double costOfMeal = getCostOfMeal();
            double fifteenTip = fifteenPercent(costOfMeal);
            double twentyTip = twentyPercent(costOfMeal);
            double twentyFiveTip = twentyFivePercent(costOfMeal);
            
        
            NumberFormat currency = NumberFormat.getCurrencyInstance();
         
            System.out.println();
            System.out.println("15%");
            System.out.println("Tip Amount: " + currency.format(fifteenTip));
            System.out.println("Total Amount: " + currency.format(costOfMeal + fifteenTip));
            System.out.println();
        
            System.out.println("20%");
            System.out.println("Tip Amount: " + currency.format(twentyTip));
            System.out.println("Total Amount: " + currency.format(costOfMeal + twentyTip));
            System.out.println();
        
            System.out.println("25%");
            System.out.println("Tip Amount: " + currency.format(twentyFiveTip));
            System.out.println("Total Amount: " + currency.format(costOfMeal + twentyFiveTip));
            System.out.println();
        
            System.out.println("Continue? (y/n): ");
            a = sc.next();
            
        }
        while (a.equalsIgnoreCase("y"));
        
    } //end main
    
    public static void setTitle() {
        System.out.println("Tip Calculator");
    }
    
    public static double getCostOfMeal() {
        System.out.print("Cost of meal: ");
        double c = sc.nextDouble();
        return c;
    }
    
    public static double fifteenPercent(double costOfMeal) {
        double fifteen = costOfMeal * .15;
        return fifteen;
    }
    
    public static double twentyPercent(double costOfMeal) {
        double twenty = costOfMeal * .2;
        return twenty;
    }
    
    public static double twentyFivePercent(double costOfMeal) {
        double twentyFive = costOfMeal * .25;
        return twentyFive;
    }
    
}

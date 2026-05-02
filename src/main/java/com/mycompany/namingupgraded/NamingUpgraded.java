/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.namingupgraded;

/**
 *
 * @author mojela Thabo
 */
import java.util.Scanner;

public class NamingUpgraded {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("What is your name : ");
        String name = sc.nextLine();
        
        System.out.print("My name is " + name);
    }
}

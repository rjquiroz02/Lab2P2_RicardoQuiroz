/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2p2_ricardoquiroz;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author rjqer
 */
public class Lab2P2_RicardoQuiroz {
static Scanner lea = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Cuenta administrador: ");
        String admin = lea.next();
        System.out.println("Clave administrador: ");
        String pass = lea.next();
        if (admin.equals("admin") && pass.equals("admin1234")) {            
            ArrayList lista = new ArrayList();
            boolean cent;
            int menu = 0;
            while (menu != 4) {                
                cent = false;
                System.out.println("----------Menu Principal----------");
                System.out.println("1. Clientes");
                System.out.println("2. Empleados");
                System.out.println("3. Carros");
                System.out.println("Ingrese submenu que desea abrir: ");
                menu = lea.nextInt();
                System.out.println("----------------------------------");
                if (menu == 1) {
                    System.out.println("----------Clientes----------");
                    System.out.println("");
                    System.out.println("----------------------------");
                    cent = true;
                }
                if (menu == 2) {
                    
                    cent = true;
                }
                if (menu == 3) {
                    
                    cent = true;
                }
            }
        }
        while (!admin.equals("admin") || !pass.equals("admin1234")) {  
            System.out.println("Ingrese la cuenta y clave correcta de la cuenta");
            System.out.println("Cuenta administrador: ");
            admin = lea.next();
            System.out.println("Clave administrador: ");
            pass = lea.next();
        }        
        
    }//void main
    
}//public class

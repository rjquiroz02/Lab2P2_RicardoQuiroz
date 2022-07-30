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
                System.out.println("4. Salir");
                System.out.println("Ingrese submenu que desea abrir: ");
                menu = lea.nextInt();
                System.out.println("----------------------------------");
                if (menu == 1) {
                    int submenu1 = 0;
                    boolean cent1;
                    while (submenu1 != 6) {
                        cent1 = false;
                        System.out.println("----------Clientes----------");
                        System.out.println("1. Crear");
                        System.out.println("2. Modificar");
                        System.out.println("3. Eliminar");
                        System.out.println("4. Listar clientes en sistema");
                        System.out.println("5. Listar carros por cliente");
                        System.out.println("6. Salir");
                        System.out.println("Ingrese opcion del submenu: ");
                        submenu1 = lea.nextInt();
                        System.out.println("----------------------------");
                        if (submenu1 == 1) {
                            String n, i;
                            int a, p;
                            System.out.print("Nombre: ");
                            lea.nextLine();
                            n = lea.nextLine();
                            System.out.print("Edad: ");
                            a = lea.nextInt();
                            System.out.print("Identidad: ");
                            i = lea.next();
                            System.out.print("Saldo a pagar: ");
                            p = lea.nextInt();
                            lista.add(new Cliente(n, a, i, p));           
                            
                            cent1 = true;
                        }
                        if (submenu1 == 2) {
                            int indice;
                            
                            
                            cent1 = true;
                        }
                        if (submenu1 == 3) {
                            int indice;
                            System.out.print("Ingrese indice del cliente a borrar: ");
                            indice = lea.nextInt();
                            if (indice <= lista.size()-1 && lista.get(indice) instanceof Cliente) {
                                lista.remove(indice);
                                System.out.println("Cliente eliminado");
                            }
                            else{
                                System.out.println("No se cumplen los requisitos");
                            }
                            
                            cent1 = true;
                        }
                        if (submenu1 == 4) {
                            String out = "";
                            for (Object object : lista) {
                                if (object instanceof Cliente) {
                                    out+=lista.indexOf(object)+"-> "+((Cliente) object).toStringCl()+"\n";
                                }
                            }
                            System.out.println(out);
                            
                            cent1 = true;
                        }
                        if (submenu1 == 5) {
                            
                            
                            cent1 = true;
                        }
                        if (!cent1 && submenu1 != 6) {
                            System.out.println("Ingrese opcion correcta del submenu");
                        }
                    }                    
                    cent = true;
                }
                if (menu == 2) {
                    int submenu2 = 0;
                    boolean cent2;
                    while (submenu2 != 6) {
                        cent2 = false;
                        System.out.println("----------Empleados----------");
                        System.out.println("1. Crear");
                        System.out.println("2. Modificar");
                        System.out.println("3. Eliminar");
                        System.out.println("4. Listar");
                        System.out.println("5. Marcar asistencia");
                        System.out.println("6. Salir");
                        System.out.println("Ingrese opcion del submenu: ");
                        submenu2 = lea.nextInt();
                        System.out.println("-----------------------------");
                        if (submenu2 == 1) {
                            String nom;
                            int e, s, r;
                            //String cond;
                            boolean t;
                            System.out.print("Nombre: ");
                            lea.nextLine();
                            nom = lea.nextLine();
                            System.out.print("Edad: ");
                            e = lea.nextInt();
                            System.out.print("Sueldo: ");
                            s = lea.nextInt();
                            System.out.print("Numero RRHH: ");
                            r = lea.nextInt();
                            t = false;
                            lista.add(new Empleado(nom, e, s, r, t));
                            
                            cent2 = true;
                        }
                        if (submenu2 == 2) {
                            int indice;
                            boolean t;
                            String cond;
                            System.out.println("Ingrese el indice del empleado a modificar: ");
                            indice = lea.nextInt();
                            if (indice <= lista.size()-1 && lista.get(indice) instanceof Empleado) {
                                System.out.println("Esta trabajando[s/n]: ");
                                cond = lea.next();
                                if (cond.contains("s")) {
                                    t = true;
                                }
                                else{
                                    t = false;
                                }
                                ((Empleado)lista.get(indice)).setTrabaja(t);
                                System.out.println("Empleado modificado");
                            }
                            
                            cent2 = true;
                        }
                        if (submenu2 == 3) {
                            int indice;
                            System.out.print("Ingrese indice del empleado a borrar: ");
                            indice = lea.nextInt();
                            if (indice <= lista.size()-1 && lista.get(indice) instanceof Empleado) {
                                lista.remove(indice);
                                System.out.println("Empleado eliminado");
                            }
                            else{
                                System.out.println("No se cumplen los requisitos");
                            }
                            
                            cent2 = true;
                        }
                        if (submenu2 == 4) {
                            String out = "";
                            for (Object object : lista) {
                                if (object instanceof Empleado) {
                                    out+=lista.indexOf(object)+"-> "+((Empleado) object).toStringEm()+"\n";
                                }
                            }
                            System.out.println(out);
                            
                            cent2 = true;
                        }
                        if (submenu2 == 5) {
                            String cond;
                            boolean t;                           
                            int indice;
                            System.out.println("Ingrese el indice del empleado a modificar: ");
                            indice = lea.nextInt();
                            if (indice <= lista.size()-1 && lista.get(indice) instanceof Empleado) {
                                System.out.println("Esta trabajando[s/n]: ");
                                cond = lea.next();
                                if (cond.contains("s")) {
                                    t = true;
                                }
                                else{
                                    t = false;
                                }
                                ((Empleado)lista.get(indice)).setTrabaja(t);
                                System.out.println("Empleado modificado");
                            }
                            
                            cent2 = true;
                        }
                        if (!cent2 && submenu2 != 6) {
                            System.out.println("Ingrese opcion correcta del submenu");
                        }
                    }                    
                    cent = true;
                }
                if (menu == 3) {
                    int submenu3 = 0;
                    boolean cent3;
                    while (submenu3 != 4) {  
                        cent3 = false;
                        System.out.println("---------Carros----------");
                        System.out.println("1. Crear");
                        System.out.println("2. Modificar");
                        System.out.println("3. Listar por su estado");
                        System.out.println("4. Salir");
                        System.out.println("Ingrese opcion del submenu: ");
                        submenu3 = lea.nextInt();
                        System.out.println("-------------------------");
                        if (submenu3 == 1) {
                            String marca, modelo, fechaingreso, estado, ref;
                            int anofab, costorep;
                            System.out.print("Marca: ");
                            lea.nextLine();
                            marca = lea.nextLine();
                            System.out.print("Modelo: ");
                            lea.nextLine();
                            modelo = lea.nextLine();
                            System.out.print("Ano Fabricado: ");
                            anofab = lea.nextInt();
                            System.out.println("Fecha ingreso: ");
                            fechaingreso = lea.next();
                            System.out.println("Estado: ");
                            lea.nextLine();
                            estado = lea.nextLine();
                            System.out.println("Referencia Dueno: ");
                            lea.nextLine();
                            ref = lea.nextLine();
                            System.out.println("Costo Reparacion: ");
                            costorep = lea.nextInt();
                            lista.add(new Carro(marca, modelo, anofab, fechaingreso, estado, ref, costorep));
                            
                            cent3 = true;
                        }
                        if (submenu3 == 2) {
                            int indice;
                            String estado="";
                            System.out.println("Ingrese el indice del carro a modificar: ");
                            indice = lea.nextInt();
                            if (indice <= lista.size()-1 && lista.get(indice) instanceof Carro) {
                                System.out.println("Ingrese estado: ");
                                estado = lea.nextLine();
                                ((Carro)lista.get(indice)).setEstado(estado);
                                System.out.println("Carro modificado");
                            }
                            
                            cent3 = true;
                        }
                        if (submenu3 == 3) {
                            
                            
                            cent3 = true;
                        }
                        if (!cent3 && submenu3 != 4) {
                            System.out.println("Ingrese opcion correcta del submenu");
                        }
                    }
                    cent = true;
                }
                if (!cent && menu !=4) {
                    System.out.println("Ingrese opcion valida del menu");
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

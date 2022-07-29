/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2p2_ricardoquiroz;

/**
 *
 * @author rjqer
 */
public class Cliente {
    //atributos
    private String name;
    private int age;
    private String identidad;
    private int pagorep;
    
    //constructor
    public Cliente(String name, int age, String identidad, int pagorep){
        this.name=name;
        this.age=age;
        this.identidad=identidad;
        this.pagorep=pagorep;
    }
    
    //mutadores
    public void setName(String n){
        this.name=n;
    }
    
    public String getName(){
        return name;
    }
    
    public void setAge(int a){
        this.age=a;
    }
    
    public int getAge(){
        return age;
    }
    
    public void setIdentidad(String i){
        this.identidad=i;
    }
    
    public String getIdentidad(){
        return identidad;
    }
    
    public void setPagorep(int p){
        this.pagorep=p;
    }
    
    public int getPagorep(){
        return pagorep;
    }
    
    //metodo admin
    public String toString(){
        return "El cliente es: \n"
                + "Nombre: "+name+" Edad: "+age+" Identidad: "+identidad+" Saldo a pagar: "+pagorep;
    }
    
}//public class

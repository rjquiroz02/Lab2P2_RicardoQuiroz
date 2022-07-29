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
public class Empleado {
    //atributos
    private String nombre;
    private int edad;
    private int sueldo;
    private int rrhh;
    private boolean trabaja;
    
    //constructores
    public Empleado(){
    }
    
    public Empleado(String nombre, int edad, int sueldo, int rrhh, boolean trabaja){
        this.nombre=nombre;
        this.edad=edad;
        this.sueldo=sueldo;
        this.rrhh=rrhh;
        this.trabaja=trabaja;
    }
    
    //mutadores
    public void setNombre(String nom){
        this.nombre=nom;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setEdad(int e){
        this.edad=e;
    }
    
    public int getEdad(){
        return edad;
    }
    
    public void setSueldo(int s){
        this.sueldo=s;
    }
    
    public int getSueldo(){
        return sueldo;
    }
    
    public void setRrhh(int r){
        this.rrhh=r;
    }
    
    public int getRrhh(){
        return rrhh;
    }
    
    public void setTrabaja(boolean t){
        this.trabaja=t;
    }
    
    public boolean getTrabaja(){
        return trabaja;
    }
    
    //metodo admin
    public String toStringEm(){
        return "El empleado es: \n"
                + "Nombre: "+nombre+" Edad: "+edad+" Sueldo: "+sueldo+" Numero RRHH: "+rrhh+" Esta trabajando: "+trabaja;
    }
    
}//public class

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
public class Carro {
    //atributos
    private String marca;
    private String modelo;
    private int anofab;
    private String fechaingreso;
    private String estado;
    private String ref;
    private int costorep;
    
    //constructores
    public Carro(){        
    }
    
    public Carro(String marca, String modelo, int anofab, String fechaingreso, String estado, String ref, int costorep){
        this.marca=marca;
        this.modelo=modelo;
        this.anofab=anofab;
        this.fechaingreso=fechaingreso;
        this.estado=estado;
        this.ref=ref;
        this.costorep=costorep;
    }
    
    //mutadores

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnofab() {
        return anofab;
    }

    public void setAnofab(int anofab) {
        this.anofab = anofab;
    }

    public String getFechaingreso() {
        return fechaingreso;
    }

    public void setFechaingreso(String fechaingreso) {
        this.fechaingreso = fechaingreso;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public int getCostorep() {
        return costorep;
    }

    public void setCostorep(int costorep) {
        this.costorep = costorep;
    }
    
    //metodo admin
    public String toStringCa(){
        return "El carro es: \n"
                + "Marca: "+marca+" Modelo: "+modelo+" Ano fabricado: "+anofab+" Fecha Ingreso: "+fechaingreso+" Estado: "+estado+" Referencia dueno"+ref+" Costo reparacion: "+costorep;
    }
    
}//public class

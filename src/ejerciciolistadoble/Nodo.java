/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciolistadoble;

import java.util.ArrayList;

/**
 *
 * @author Samlml
 */
public class Nodo {
    
    
    private String Nom_Vendedor;
    private String Nom_Producto;
    private String Descripcion;
    private double Precio;
    Nodo Siguiente;
    Nodo Atras;
    
    ArrayList <Nodo> nodo=null;
    Nodo Anterior;

    public Nodo(String Nom_Vendedor, String Nom_Producto, String Descripcion, double Precio) {
        this.Nom_Vendedor = Nom_Vendedor;
        this.Nom_Producto = Nom_Producto;
        this.Descripcion = Descripcion;
        this.Precio = Precio;
    }
    
    
    public String getNom_Vendedor() {
        return Nom_Vendedor;
    }

    public void setNom_Vendedor(String Nom_Vendedor) {
        this.Nom_Vendedor = Nom_Vendedor;
    }

    public String getNom_Producto() {
        return Nom_Producto;
    }

    public void setNom_Producto(String Nom_Producto) {
        this.Nom_Producto = Nom_Producto;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    public Nodo getSiguiente() {
        return Siguiente;
    }

    public void setSiguiente(Nodo Siguiente) {
        this.Siguiente = Siguiente;
    }

    public Nodo getAtras() {
        return Atras;
    }

    public void setAtras(Nodo Atras) {
        this.Atras = Atras;
    }
    
    
}

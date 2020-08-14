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
public class Producto {
    private int Cod_Prod;
    private String Nom_Prod;
    private String Descripcion;
    private float Precio;
    
     ArrayList <Producto> producto=null;

    public Producto(int Cod_Prod, String Nom_Prod, String Descripcion, float Precio) {
        this.Cod_Prod = Cod_Prod;
        this.Nom_Prod = Nom_Prod;
        this.Descripcion = Descripcion;
        this.Precio = Precio;
    }

    Producto() {
       producto=new ArrayList();
    }
    
    
      public void AgregarProdcuto (int Cod_Prod, String Nom_Prod, String Descripcion, float Precio){
        producto.add(new Producto (Cod_Prod, Nom_Prod,  Descripcion,Precio));

      }
      
      public String buscarProducto (int dato){
          for (int i = 0; i <producto.size(); i++) {
              if (producto.get(i).getCod_Prod()==dato) {
                  this.Nom_Prod=producto.get(i).getNom_Prod();
              }
              
          }
          return this.Nom_Prod;
      }
      
      
      public String buscarProductoSegundo (int dato){
          for (int i = 0; i <producto.size(); i++) {
              if (producto.get(i).getCod_Prod()==dato) {
                  this.Descripcion=producto.get(i).getDescripcion();
              }
              
          }
          return this.Descripcion;
      }
      
      public float buscarProductoTercero (int dato){
          for (int i = 0; i <producto.size(); i++) {
              if (producto.get(i).getCod_Prod()==dato) {
                  this.Precio=producto.get(i).getPrecio();
              }
              
          }
          return this.Precio;
      }
      
      
      
      
      

      
     

    public int getCod_Prod() {
        return Cod_Prod;
    }

    public void setCod_Prod(int Cod_Prod) {
        this.Cod_Prod = Cod_Prod;
    }

    public String getNom_Prod() {
        return Nom_Prod;
    }

    public void setNom_Prod(String Nom_Prod) {
        this.Nom_Prod = Nom_Prod;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public float getPrecio() {
        return Precio;
    }

    public void setPrecio(float Precio) {
        this.Precio = Precio;
    }
    
    
    
}

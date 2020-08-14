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
public class Vendedor {
    private int id_vendedor;
    private String Nombre;
    private  String Correo;
    private int Edad;
    ArrayList <Vendedor> vendedor=null;

    public Vendedor(int id_vendedor, String Nombre, String Correo, int Edad) {
        this.id_vendedor = id_vendedor;
        this.Nombre = Nombre;
        this.Correo = Correo;
        this.Edad = Edad;
    }

          public Vendedor() {
         vendedor=new ArrayList();
    }
    
    public void AgregaVendedor (int id_vendedor, String Nombre, String Correo, int Edad){
        vendedor.add(new Vendedor (id_vendedor,Nombre,Correo,Edad ));
        
     
        
        
       
        for (int i = 0; i < vendedor.size(); i++) {
            System.out.println(vendedor.get(i).Nombre);
        }
        
        
    }
    
    public String igualacion(int codi){
        for (int i = 0; i < vendedor.size(); i++) {  //Recorrer el arrayList
            if (vendedor.get(i).getId_vendedor()==codi) {   //Agarrar valor del vendedor, y comparas vendedor con codigo
                
                this.Nombre=vendedor.get(i).getNombre();    //Este Nombre asignale el nombre de la posicion del arreglo
            }
        }
        
        return this.Nombre;         //Retorna el nombre global
    }
   

    public int getId_vendedor() {
        return id_vendedor;
    }

    public void setId_vendedor(int id_vendedor) {
        this.id_vendedor = id_vendedor;
    }

    public String getNombre() {
        return this.Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }
    
    
}

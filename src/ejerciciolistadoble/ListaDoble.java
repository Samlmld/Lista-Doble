/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciolistadoble;

/**
 *
 * @author Samlml
 */
public class ListaDoble {
    
    
   Vendedor emp;
   Producto prod;
    
   Nodo Primero;
   Nodo Ultimo;
   
   ListaDoble(){
       Primero=null;
       Ultimo=null;
   }
   
   public boolean estavacio()
	{
		if(Primero==null) return true;
		else return false;
	}
   
   public ListaDoble alta(String Nom_Vendedor,  String Nom_Producto, String Descripcion,float Precio)
	{
		if(estavacio())
		{
			Nodo nuevo = new Nodo(Nom_Vendedor,Nom_Producto,Descripcion,Precio);
			Primero=nuevo;
			Ultimo=nuevo;
		}
		else
		{
			Nodo nuevo = new Nodo(Nom_Vendedor,Nom_Producto,Descripcion,Precio);
			Ultimo.Siguiente=nuevo;
			nuevo.Atras=Ultimo;
			Ultimo=nuevo;
		}
		return this;
         
	}
   
   
          
                    
   
   
   
   
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones;

/**
 *
 * @author cduar
 */
public class ProductoNoExiste extends RuntimeException{

    public ProductoNoExiste(int id) {
        super("El producto con el numero de id: "+String.valueOf(id)+" no se encuentra en la base de datos");
    }
    
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import java.sql.SQLException;
import java.util.ArrayList;
import servicios.ServiceCategoria;
import servicios.ServiceProducto;

/**
 *
 * @author cduar
 */
public class ControladorVentanaFiltro {

    public ControladorVentanaFiltro() {
    }

    public ArrayList traerCategorias() throws SQLException{
        ArrayList listaCategorias = ServiceCategoria.getINSTANCE().obtenerCategorias();
        return listaCategorias;
        
        
    }  
    
    public ArrayList obtenerProductos(int id_categoria) throws SQLException{
        ArrayList listaProductos = ServiceProducto.getINSTANCE().obtenerProductos(id_categoria);
        
        
        return listaProductos ;
    }
    
}

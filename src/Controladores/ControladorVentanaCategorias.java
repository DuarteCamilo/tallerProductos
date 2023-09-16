/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;


import Modelos.Categoria;
import java.sql.SQLException;
import servicios.ServiceCategoria;
import servicios.ServiceProducto;

/**
 *
 * @author cduar
 */
public class ControladorVentanaCategorias {
    
    public void agregarCategoriaFul(int id_categoria , String nombre_categoria){
        ServiceCategoria.getINSTANCE().agregarCategoriaFul(id_categoria , nombre_categoria);  
    }
    
    public void editarCategoria(Categoria categoria) throws SQLException{
        Object[] values = {categoria.getId_categoria(), categoria.getNombre_categoria()};
        ServiceCategoria.getINSTANCE().editarCategoria(values);
    }
    public void eliminarCategoria( int id_producto) throws SQLException{
        ServiceCategoria.getINSTANCE().eliminarCategoria(id_producto);
    }
}

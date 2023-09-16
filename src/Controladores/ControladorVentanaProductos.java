/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;
import Modelos.Producto;
import java.awt.List;
import java.sql.SQLException;
import java.util.ArrayList;
import servicios.ServiceProducto;
import servicios.ServiceCategoria;

/**
 *
 * @author cduar
 */
public class ControladorVentanaProductos {

    public ControladorVentanaProductos() {
    }
    
    public  Producto buscarProducto( int id_producto ) throws SQLException{
        Producto producto = ServiceProducto.getINSTANCE().buscarProducto(id_producto );
        return producto;
    }
    
    public void crearProducto(Producto producto) throws SQLException{
        Object[] values = {producto.getId_producto(), producto.getNombre_producto(), producto.getCantidad_disp(), producto.getId_categoria()};
        ServiceProducto.getINSTANCE().agregarProducto(values);
    }
    
    public void editarProducto(Producto producto) throws SQLException{
        Object[] values = {producto.getId_producto(), producto.getNombre_producto(), producto.getCantidad_disp(), producto.getId_categoria()};
        ServiceProducto.getINSTANCE().editarProducto(values);
    }
    public void eliminar( int id_producto) throws SQLException{
        ServiceProducto.getINSTANCE().eliminarProducto(id_producto);
    }
    
    public ArrayList traerCategorias() throws SQLException{
        ArrayList listaCategorias = ServiceCategoria.getINSTANCE().obtenerCategorias();
        return listaCategorias; 
    }    
    public void aniadirCategoria(String nombre_categoria){
        ServiceCategoria.getINSTANCE().agregarCategoria(nombre_categoria);  
    }
    
    public String obternerCategoria (int id_categoria){
        String categoria = ServiceCategoria.getINSTANCE().obternerCategoria(id_categoria);
        return categoria;
        
    }
    
    
  
}

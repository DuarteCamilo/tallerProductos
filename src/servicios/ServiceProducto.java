/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import ConexioDB.ConexionDB;
import ConexioDB.ConexionDB;
import Modelos.Categoria;
import Modelos.Producto;
//import Vistas.VentanaUsuario;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author cduar
 */
public class ServiceProducto {
    private static ServiceProducto  INSTANCE = new ServiceProducto ();
    
    private static Connection conn = new ConexionDB().connect();
    
    public ServiceProducto () {
    }

    public static ServiceProducto  getINSTANCE() {
        return INSTANCE;
    } 
    
    
    
    
    public static Producto  buscarProducto(int id_producto  ) {
        ResultSet rs = null;
        try {
            
            String sql = "SELECT nombre_producto,cantidad_disp,id_categoria FROM productos WHERE id_producto=? ;" ;
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setInt(1, id_producto );
            


            rs = preparedStatement.executeQuery();

            if (rs.next()) {

                String nombre_producto = rs.getString("nombre_producto");
                
                int cantidad_disp = rs.getInt("cantidad_disp");
                int id_categoria = rs.getInt("id_categoria");
                
                
                
                Producto producto = new Producto(id_producto, nombre_producto, cantidad_disp, id_categoria);
                return producto;
                
                        
            }else {
                JOptionPane.showMessageDialog(null, " El producto no se encuentra en la base de datos", "Error", JOptionPane.ERROR_MESSAGE);
                return null;
            }

            
        } catch (SQLException ex) {
            Logger.getLogger(ServiceProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public static void agregarProducto ( Object[] values  ) throws SQLException{
        try{
            int id_producto = Integer.parseInt(values[0].toString()) ;
            String nombre_producto = values[1].toString();
            int cantidad_disp = Integer.parseInt(values[2].toString());
            int id_categoria = Integer.parseInt(values[3].toString());
            
            
           
        
            String sqlBuscarUsuario = "SELECT id_producto FROM productos WHERE id_producto=?";
            PreparedStatement buscarUsuarioStmt = conn.prepareStatement(sqlBuscarUsuario);
            buscarUsuarioStmt.setInt(1, id_producto);
            ResultSet resultado = buscarUsuarioStmt.executeQuery();

            
            if (resultado.next()) {
                
                JOptionPane.showMessageDialog(null, "El producto con el ID " + id_producto + " ya está registrado", "Error", JOptionPane.ERROR_MESSAGE);
            } else {

            
                String sql = "INSERT INTO productos(id_producto,nombre_producto,cantidad_disp,id_categoria)" +  "VALUES(?,?,?,?);";

                PreparedStatement preparedStatement = conn.prepareStatement(sql);


                preparedStatement.setInt(1, id_producto);
                preparedStatement.setString(2, nombre_producto);
                preparedStatement.setInt(3, cantidad_disp);
                preparedStatement.setInt(4, id_categoria);

                preparedStatement.executeUpdate();

                preparedStatement.close();
                JOptionPane.showMessageDialog(null, "Producto agregado");
            }
                   
        }catch( Exception ex){
            Logger.getLogger(ServiceProducto.class.getName()).log(Level.SEVERE, null, ex);
        }   
        
    }
    
    public static void editarProducto ( Object[] values ){
        try{
            int id_producto = Integer.parseInt(values[0].toString()) ;
            String nombre_producto = values[1].toString();
            int cantidad_disp = Integer.parseInt(values[2].toString());
            int id_categoria = Integer.parseInt(values[3].toString());
            

            String sqlBuscar = "SELECT id_producto FROM productos WHERE id_producto = ?";
            PreparedStatement buscarUsuarioStmt1 = conn.prepareStatement(sqlBuscar);
            buscarUsuarioStmt1.setInt(1, id_producto);
            ResultSet resultado1 = buscarUsuarioStmt1.executeQuery();

                
            if(resultado1.next()){
                String sql = "UPDATE productos SET nombre_producto=?, cantidad_disp=?, id_categoria=? WHERE id_producto=?;";          
            
                PreparedStatement preparedStatement = conn.prepareStatement(sql);


                
                preparedStatement.setString(1, nombre_producto);
                preparedStatement.setInt(2, cantidad_disp);
                preparedStatement.setInt(3, id_categoria);
                preparedStatement.setInt(4, id_producto);

                preparedStatement.executeUpdate();

                preparedStatement.close();
                JOptionPane.showMessageDialog(null, "Datos actualizados");
            }else {
                
                JOptionPane.showMessageDialog(null, "El producto con el numero de ID " + id_producto + " no está registrado", "Error", JOptionPane.ERROR_MESSAGE);               

            }
                   
        }catch(Exception ex){
            Logger.getLogger(ServiceProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static  void eliminarProducto( int id_producto ){
        try{
            
            
            String sql = "DELETE from productos where id_producto=?;";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setInt(1, id_producto );
            
            
            
            preparedStatement.executeUpdate();

            preparedStatement.close();
            
            JOptionPane.showMessageDialog(null, "Producto eliminado");

            
            conn.close();
   
        }catch(Exception ex){
            Logger.getLogger(ServiceProducto.class.getName()).log(Level.SEVERE, null, ex);  
        }

    }
    
    public static ArrayList obtenerProductos(int id_categoria){
        ResultSet rs = null;
        ArrayList<Producto> productos = new ArrayList<>();
        try {
            
            String sql = "SELECT id_producto,nombre_producto,cantidad_disp FROM productos WHERE id_categoria=? ;" ;
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setInt(1, id_categoria );
            


            rs = preparedStatement.executeQuery();

            while (rs.next()) {

                String nombre_producto = rs.getString("nombre_producto");
                
                int cantidad_disp = rs.getInt("cantidad_disp");
                int id_producto = rs.getInt("id_producto");
                
                
                
                
                Producto producto = new Producto(id_producto, nombre_producto, cantidad_disp, id_categoria);
                productos.add(producto);
                
                
                
                        
           }
            
           return productos;
//            else {
//                JOptionPane.showMessageDialog(null, " El producto no se encuentra en la base de datos", "Error", JOptionPane.ERROR_MESSAGE);
//                return null;
//            }

            
        } catch (SQLException ex) {
            Logger.getLogger(ServiceProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
        
    }
    
    
   
    
}

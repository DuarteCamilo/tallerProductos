/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import ConexioDB.ConexionDB;
import ConexioDB.ConexionDB;
import Modelos.Producto;
//import Vistas.VentanaUsuario;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

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
        try {
            
            String sql = "SELECT nombre_producto,cantidad_disp,id_categoria FROM productos WHERE id_producto=?" ;
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, String.valueOf(id_producto) );
            


            ResultSet rs = preparedStatement.executeQuery();

            if (rs.next()) {

                String nombre_producto = rs.getString("nombre_producto");
                
                int cantidad_disp = rs.getInt("cantidad_dis");
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
            
            
           
        
            String sqlBuscarUsuario = "SELECT id_producto FROM productos WHERE id_productos=?";
            PreparedStatement buscarUsuarioStmt = conn.prepareStatement(sqlBuscarUsuario);
            buscarUsuarioStmt.setInt(1, id_producto);
            ResultSet resultado = buscarUsuarioStmt.executeQuery();

            
            if (resultado.next()) {
                
                JOptionPane.showMessageDialog(null, "El usuario con el ID " + id_producto + " ya está registrado", "Error", JOptionPane.ERROR_MESSAGE);
            } else {

            
                String sql = "INSERT INTO usuarios(id_producto,nombre_producto,cantidad_disp,id_categoria)" +  "VALUES(?,?,?,?);";

                PreparedStatement preparedStatement = conn.prepareStatement(sql);


                preparedStatement.setString(1, String.valueOf(id_producto));
                preparedStatement.setString(2, nombre_producto);
                preparedStatement.setString(3, String.valueOf(cantidad_disp));
                preparedStatement.setString(4, String.valueOf(id_categoria));

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
            buscarUsuarioStmt1.setString(1, String.valueOf(id_producto));
            ResultSet resultado1 = buscarUsuarioStmt1.executeQuery();

                
            if(resultado1.next()){
                JOptionPane.showMessageDialog(null, "El PRODUCTO con el numero de ID " + id_producto + " ya está registrado", "Error", JOptionPane.ERROR_MESSAGE);               
            }
            else {
                String sql = "UPDATE productos set nombre_producto=?,cantidad_disp,id_categoria=? where id_producto=?;";
            
            
                PreparedStatement preparedStatement = conn.prepareStatement(sql);


                
                preparedStatement.setString(1, nombre_producto);
                preparedStatement.setString(2, String.valueOf(cantidad_disp));
                preparedStatement.setString(3, String.valueOf(id_categoria));
                preparedStatement.setString(4, String.valueOf(id_producto));

                preparedStatement.executeUpdate();

                preparedStatement.close();
                JOptionPane.showMessageDialog(null, "Datos actualizados");

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
   
    
}

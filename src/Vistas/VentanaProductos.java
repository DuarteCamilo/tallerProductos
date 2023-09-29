
package Vistas;


import ConexioDB.ConexionDB;
import javax.swing.JOptionPane;
import Controladores.ControladorVentanaProductos;
import Modelos.Categoria;
import Modelos.Producto;
import com.sun.jdi.connect.spi.Connection;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.table.DefaultTableModel;



/**
 *
 * @author diaza
 */
public class VentanaProductos extends javax.swing.JFrame {
    
    private ControladorVentanaProductos controlador;
    

    /**
     * Creates new form VentanaProductos
     */
    public VentanaProductos() {
        
        initComponents();
        this.controlador = new ControladorVentanaProductos();
        actualizarComboBox();
        actualizarTabla();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtId = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        txtCant = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProductos = new javax.swing.JTable();
        ComboBox1 = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btnEliminar = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        btnEditar = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        btnVolver = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btBuscar = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Txt_id_Buscar = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(222, 226, 230));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(92, 107, 115), 7));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtId.setBackground(new java.awt.Color(222, 226, 230));
        txtId.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        txtId.setForeground(new java.awt.Color(53, 79, 82));
        txtId.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtId.setBorder(null);
        txtId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdKeyTyped(evt);
            }
        });
        jPanel1.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 120, 20));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 120, 10));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(53, 79, 82));
        jLabel7.setText("Id");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, -1, -1));

        jLabel6.setFont(new java.awt.Font("Roboto Medium", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(53, 79, 82));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Producto");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 160, 30));

        txtNombre.setBackground(new java.awt.Color(222, 226, 230));
        txtNombre.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(53, 79, 82));
        txtNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNombre.setBorder(null);
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 120, 20));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 120, 10));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(53, 79, 82));
        jLabel8.setText("Ingrese el numero de  id:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, -1, -1));

        txtCant.setBackground(new java.awt.Color(222, 226, 230));
        txtCant.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        txtCant.setForeground(new java.awt.Color(53, 79, 82));
        txtCant.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCant.setBorder(null);
        txtCant.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantKeyTyped(evt);
            }
        });
        jPanel1.add(txtCant, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 120, 20));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 120, 10));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(53, 79, 82));
        jLabel9.setText("Cantidad");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, -1));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 120, 10));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(53, 79, 82));
        jLabel10.setText("Categoria Id");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));

        tablaProductos.setBackground(new java.awt.Color(255, 255, 255));
        tablaProductos.setForeground(new java.awt.Color(53, 79, 82));
        tablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id", "Nombre", "Cantidad", "Categoria Id"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaProductos.setSelectionBackground(new java.awt.Color(53, 79, 82));
        tablaProductos.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(tablaProductos);
        if (tablaProductos.getColumnModel().getColumnCount() > 0) {
            tablaProductos.getColumnModel().getColumn(0).setResizable(false);
            tablaProductos.getColumnModel().getColumn(1).setResizable(false);
            tablaProductos.getColumnModel().getColumn(2).setResizable(false);
            tablaProductos.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 490, 140));

        ComboBox1.setBackground(new java.awt.Color(222, 226, 230));
        ComboBox1.setForeground(new java.awt.Color(53, 79, 82));
        ComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "1" }));
        ComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(ComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 120, -1));

        jPanel3.setBackground(new java.awt.Color(92, 107, 115));

        btnGuardar.setBackground(new java.awt.Color(53, 79, 82));
        btnGuardar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnGuardar.setText("Guardar");
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGuardarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 140, 30));

        jPanel4.setBackground(new java.awt.Color(92, 107, 115));

        btnEliminar.setBackground(new java.awt.Color(53, 79, 82));
        btnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnEliminar.setText("Eliminar");
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 310, 140, 30));

        jPanel5.setBackground(new java.awt.Color(92, 107, 115));

        btnEditar.setBackground(new java.awt.Color(53, 79, 82));
        btnEditar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnEditar.setText("Editar");
        btnEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, -1, -1));

        jPanel6.setBackground(new java.awt.Color(92, 107, 115));

        btnVolver.setBackground(new java.awt.Color(53, 79, 82));
        btnVolver.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnVolver.setText("Regresar");
        btnVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVolverMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnVolver))
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 70, -1));

        jPanel2.setBackground(new java.awt.Color(53, 79, 82));

        btBuscar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btBuscar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btBuscar.setText("Buscar");
        btBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btBuscarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 40, 100, 30));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(53, 79, 82));
        jLabel11.setText("Nombre");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));

        Txt_id_Buscar.setBackground(new java.awt.Color(222, 226, 230));
        Txt_id_Buscar.setBorder(null);
        Txt_id_Buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Txt_id_BuscarKeyTyped(evt);
            }
        });
        jPanel1.add(Txt_id_Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, 100, 20));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, 100, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 676, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseClicked
        if(txtId.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Ingrese un numero de id en el campo de texto para eliminar el producto");
        }else{
            try {
                int id_producto = Integer.parseInt(Txt_id_Buscar.getText());
                controlador.eliminar(id_producto);
                LimpiarCampos();
                actualizarTabla();
            } catch (Exception ex) {
            } 
        }
    }//GEN-LAST:event_btnEliminarMouseClicked

    private void btnGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseClicked
        if(txtId.getText().isEmpty() || txtNombre.getText().isEmpty() || txtCant.getText().isEmpty()  ){
            JOptionPane.showMessageDialog(rootPane, "Ingrese todos los campos de texto para agregar el producto en la base de datos");
            return;
        }
        
        if(ComboBox1.getSelectedIndex()==0 || ComboBox1.getSelectedItem().equals("-Seleccionar-") ){
            JOptionPane.showMessageDialog(rootPane, "Selecione una categoria para agregar el producto a la base de datos");
            return;
        }
        try {
            int id_producto = Integer.parseInt(txtId.getText()) ;
            String nombre_producto = txtNombre.getText();
            int cantidad_disp = Integer.parseInt(txtCant.getText());
            String categoria1 = ComboBox1.getSelectedItem().toString();
            String[] catediv = categoria1.split("-",2);
            int id_categoria = Integer.parseInt(catediv[0]);
            Producto producto = new Producto(id_producto, nombre_producto, cantidad_disp, id_categoria);
            controlador.crearProducto(producto);
            LimpiarCampos();
            actualizarTabla();

        } catch (Exception e) {
        }
        
        
    }//GEN-LAST:event_btnGuardarMouseClicked

    private void btnEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseClicked
        if(txtId.getText().isEmpty() || txtNombre.getText().isEmpty() || txtCant.getText().isEmpty()  ){
            JOptionPane.showMessageDialog(rootPane, "Ingrese todos los campos de texto para actualizar los datos del producto en la base de datos");
            return;
        }
        
        if(ComboBox1.getSelectedIndex()==0 || ComboBox1.getSelectedItem().equals("-Seleccionar-") ){
            JOptionPane.showMessageDialog(rootPane, "Selecione una categoria para actualizar los datos del producto");
            return;
        }
        try {
            int id_producto = Integer.parseInt(txtId.getText()) ;
            String nombre_producto = txtNombre.getText();
            int cantidad_disp = Integer.parseInt(txtCant.getText());
            String categoria1 = ComboBox1.getSelectedItem().toString();
            String[] catediv = categoria1.split("-",2);
            int id_categoria = Integer.parseInt(catediv[0]);
            Producto producto = new Producto(id_producto, nombre_producto, cantidad_disp, id_categoria);
            controlador.editarProducto(producto);
            LimpiarCampos();
            actualizarTabla();

        } catch (Exception e) {
        }
        
    }//GEN-LAST:event_btnEditarMouseClicked

    private void btnVolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMouseClicked
        this.dispose();
        Inicio v2 = new Inicio();
        v2.setVisible(true);
    }//GEN-LAST:event_btnVolverMouseClicked

    private void btBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btBuscarMouseClicked
        if(Txt_id_Buscar.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Ingrese un numero de id en el campo de texto para buscar el producto en la base de datos");
        }else{
            try {
                int id_producto = Integer.parseInt(Txt_id_Buscar.getText());
                Producto producto = controlador.buscarProducto(id_producto);

                txtNombre.setText(producto.getNombre_producto());
                txtId.setText(String.valueOf(producto.getId_producto()));
                txtCant.setText(String.valueOf(producto.getCantidad_disp()));
               
                String name =controlador.obternerCategoria(producto.getId_categoria());
                String completo = String.valueOf(producto.getId_categoria())+"-"+name;
                ComboBox1.setSelectedItem(completo);
                
            } catch (Exception ex) {
            } 
        }
 
    }//GEN-LAST:event_btBuscarMouseClicked

    private void ComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBox1ActionPerformed
        Object selectedItem = ComboBox1.getSelectedItem();
        if (selectedItem != null && selectedItem.toString().equals("Añadir Categoria")) {
            String nombre_categoria = JOptionPane.showInputDialog(null, "Ingrese el nombre de la nueva categoría");
            if (nombre_categoria != null) {
                try {
                    
                    controlador.aniadirCategoria(nombre_categoria);
                    int id_categoria = obtenerIdCategoria(nombre_categoria);
                    System.out.println(id_categoria);
                    actualizarComboBox();

                    
                    String categoriaFormateada = id_categoria + "-" + nombre_categoria;

                    
                    ComboBox1.setSelectedItem(categoriaFormateada);

                } catch (Exception e) {
                }

            }
        }
   
    }//GEN-LAST:event_ComboBox1ActionPerformed

    
    private void txtIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c) && c != KeyEvent.VK_BACK_SPACE) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "Ingresar solo números");
        }

        if (txtId.getText().length() >= 10 && c != KeyEvent.VK_BACK_SPACE) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "Se ha alcanzado el límite máximo de 10 caracteres");
        }
    }//GEN-LAST:event_txtIdKeyTyped

    private void txtCantKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c) && c != KeyEvent.VK_BACK_SPACE) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "Ingresar solo números");
        }

        if (txtCant.getText().length() >= 10 && c != KeyEvent.VK_BACK_SPACE) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "Se ha alcanzado el límite máximo de 10 caracteres");
        }
    }//GEN-LAST:event_txtCantKeyTyped

    private void Txt_id_BuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Txt_id_BuscarKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c) && c != KeyEvent.VK_BACK_SPACE) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "Ingresar solo números");
        }

        if (Txt_id_Buscar.getText().length() >= 10 && c != KeyEvent.VK_BACK_SPACE) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "Se ha alcanzado el límite máximo de 10 caracteres");
        }
    }//GEN-LAST:event_Txt_id_BuscarKeyTyped

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped

        char c = evt.getKeyChar();

        if (!(Character.isLetter(c) || c == ' ' || c == KeyEvent.VK_BACK_SPACE)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "Ingresar solo caracteres permitidos para un nombre");
        }

        if (txtNombre.getText().length() >= 200 && c != KeyEvent.VK_BACK_SPACE) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "Se ha alcanzado el límite máximo de 200 caracteres");
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    
    public void LimpiarCampos(){
        txtId.setText("");
        txtCant.setText("");
        txtNombre.setText("");
        actualizarComboBox();
        
    }
    
    public int obtenerIdCategoria(String nombre_Categoria) {
        try {
            ArrayList<Categoria> listaCategorias = controlador.traerCategorias();
            for (Categoria categoria : listaCategorias) {
                if (categoria.getNombre_categoria().equals(nombre_Categoria)) {
                    return categoria.getId_categoria();
                }
            }
        } catch (Exception e) {
           
        }
        System.out.println("La categoría no se encontró o hubo un error.");
        return -1; 
    }
    
    public void actualizarComboBox() {
        ComboBox1.removeAllItems();
        ArrayList<String> lista_str = new ArrayList<>();

        try {
            ArrayList<Categoria> listaCategorias = controlador.traerCategorias();
            for (int i = 0; i < listaCategorias.size(); i++) {
                Categoria categoria = listaCategorias.get(i);
                String id_categoria = String.valueOf(categoria.getId_categoria());
                String nombre_categoria = categoria.getNombre_categoria();
                lista_str.add(id_categoria + "-" + nombre_categoria);
            }

            Collections.sort(lista_str, (a, b) -> {
                int idA = Integer.parseInt(a.split("-")[0]);
                int idB = Integer.parseInt(b.split("-")[0]);
                return Integer.compare(idA, idB);
            });

            ComboBox1.addItem("-Seleccionar-");
            for (int i = 0; i < lista_str.size(); i++) {
                String item = lista_str.get(i);
                ComboBox1.addItem(item);
            }
            ComboBox1.addItem("Añadir Categoria");

        } catch (Exception e) {
        }
    }

    
    public void actualizarTabla(){
        try{
            DefaultTableModel modelo = new  DefaultTableModel();
            tablaProductos.setModel(modelo);
            
            PreparedStatement ps = null;
            ResultSet rs = null;
            java.sql.Connection conn = ConexionDB.getINSTANCE().getConnection();
    
            
            String sql = "SELECT P.id_producto,P.nombre_producto,P.cantidad_disp,P.id_categoria,C.nombre_categoria  FROM productos as P,categorias as C WHERE P.id_categoria in (SELECT C.id_categoria FROM categorias)";                    
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();

            
            ResultSetMetaData rsMd = (ResultSetMetaData) rs.getMetaData();
            
            int cantidadColumnas = rsMd.getColumnCount();
            
            modelo.addColumn("Id");
            modelo.addColumn("Nombre");
            modelo.addColumn("Cantidad");
            modelo.addColumn("Id Categoria");
            modelo.addColumn("Nombre Categoria");

            

            int anchos[] = {30, 80, 30, 50 ,30 , 100 };
            for (int i = 0; i < tablaProductos.getColumnCount(); i++) {
                tablaProductos.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);                
            }
            
            while(rs.next()){
                Object[] filas = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                modelo.addRow(filas);
            }
            
        }catch(SQLException ex){
            System.err.println(ex.toString());
        }
    }
       

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaProductos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBox1;
    private javax.swing.JTextField Txt_id_Buscar;
    private javax.swing.JLabel btBuscar;
    private javax.swing.JLabel btnEditar;
    private javax.swing.JLabel btnEliminar;
    private javax.swing.JLabel btnGuardar;
    private javax.swing.JLabel btnVolver;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTable tablaProductos;
    private javax.swing.JTextField txtCant;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}

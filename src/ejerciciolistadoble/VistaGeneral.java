/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciolistadoble;

import javax.swing.JOptionPane;

/**
 *
 * @author Samlml
 */
public class VistaGeneral extends javax.swing.JFrame {
 Vendedor vendedor = new Vendedor();
  Producto producto = new Producto();
  
  ListaDoble lista = new ListaDoble();
  Nodo nodoAcutual;
  Nodo Incio;

     int conta =0;
     
      public void imprimir (Nodo nodo){
        String NombreVendedor = nodo.getNom_Vendedor();
        String NombreProducto = nodo.getNom_Producto();
        String Descripcion = nodo.getDescripcion();
        String Precio = String.valueOf(nodo.getPrecio());
       
      txtNotaNombreVendedor.setText(NombreVendedor);
       txtNotaNom_Producto.setText(NombreProducto);
       txtNotaDescripcion.setText(Descripcion);
       txtMostrarPrecio.setText(Precio);
    }
      public void Siguiente(String Nom_Vendedor,  String Nom_Producto, String Descripcion,float Precio){
                if (lista.estavacio()) {
                    return;
                }       
      }
    /**
     * Creates new form VistaGeneral
     */
    public VistaGeneral() {
        initComponents();
        
      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        PanelProducto = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtId_Vendedor = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        btnAgregarVendedor = new javax.swing.JButton();
        PanelVentas = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtCodigoProducto = new javax.swing.JTextField();
        txtNombreProducto = new javax.swing.JTextField();
        txtDescripcionProducto = new javax.swing.JTextField();
        txtPrecioProducto = new javax.swing.JTextField();
        btnAgregarProducto = new javax.swing.JButton();
        PanelVendedor = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtCod_Vendedor = new javax.swing.JTextField();
        txtId_Producto = new javax.swing.JTextField();
        btnGenerarVenta = new javax.swing.JButton();
        btnMostrar = new javax.swing.JButton();
        txtNotaNombreVendedor = new javax.swing.JTextField();
        txtNotaNom_Producto = new javax.swing.JTextField();
        txtNotaDescripcion = new javax.swing.JTextField();
        txtMostrarPrecio = new javax.swing.JTextField();
        btnSiguiente = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelProducto.setLayout(null);

        jLabel1.setText("Id_Vendedor");
        PanelProducto.add(jLabel1);
        jLabel1.setBounds(100, 74, 70, 20);

        jLabel2.setText("Nombre");
        PanelProducto.add(jLabel2);
        jLabel2.setBounds(110, 114, 50, 20);

        jLabel3.setText("Correo");
        PanelProducto.add(jLabel3);
        jLabel3.setBounds(110, 154, 50, 20);

        jLabel4.setText("Edad");
        PanelProducto.add(jLabel4);
        jLabel4.setBounds(110, 200, 50, 14);
        PanelProducto.add(txtId_Vendedor);
        txtId_Vendedor.setBounds(190, 70, 76, 29);
        PanelProducto.add(txtNombre);
        txtNombre.setBounds(190, 110, 76, 29);
        PanelProducto.add(txtCorreo);
        txtCorreo.setBounds(190, 150, 76, 30);
        PanelProducto.add(txtEdad);
        txtEdad.setBounds(190, 200, 76, 27);

        btnAgregarVendedor.setText("Agregar");
        btnAgregarVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarVendedorActionPerformed(evt);
            }
        });
        PanelProducto.add(btnAgregarVendedor);
        btnAgregarVendedor.setBounds(140, 250, 80, 40);

        jTabbedPane1.addTab("Vendedor", PanelProducto);

        PanelVentas.setLayout(null);

        jLabel5.setText("Cod_Prod");
        PanelVentas.add(jLabel5);
        jLabel5.setBounds(120, 70, 70, 20);

        jLabel6.setText("Nom_Prod");
        PanelVentas.add(jLabel6);
        jLabel6.setBounds(120, 110, 70, 20);

        jLabel7.setText("Descripcion");
        PanelVentas.add(jLabel7);
        jLabel7.setBounds(120, 150, 70, 20);

        jLabel8.setText("Precio");
        PanelVentas.add(jLabel8);
        jLabel8.setBounds(130, 190, 50, 14);
        PanelVentas.add(txtCodigoProducto);
        txtCodigoProducto.setBounds(220, 60, 50, 30);
        PanelVentas.add(txtNombreProducto);
        txtNombreProducto.setBounds(220, 100, 50, 30);
        PanelVentas.add(txtDescripcionProducto);
        txtDescripcionProducto.setBounds(220, 140, 50, 30);
        PanelVentas.add(txtPrecioProducto);
        txtPrecioProducto.setBounds(220, 180, 50, 30);

        btnAgregarProducto.setText("Agregar");
        btnAgregarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarProductoActionPerformed(evt);
            }
        });
        PanelVentas.add(btnAgregarProducto);
        btnAgregarProducto.setBounds(160, 233, 80, 30);

        jTabbedPane1.addTab("Producto", PanelVentas);

        PanelVendedor.setLayout(null);

        jLabel9.setText("Cod_Vendedor");
        PanelVendedor.add(jLabel9);
        jLabel9.setBounds(110, 60, 90, 20);

        jLabel10.setText("Id_Producto");
        PanelVendedor.add(jLabel10);
        jLabel10.setBounds(110, 100, 70, 20);
        PanelVendedor.add(txtCod_Vendedor);
        txtCod_Vendedor.setBounds(220, 50, 50, 30);
        PanelVendedor.add(txtId_Producto);
        txtId_Producto.setBounds(220, 90, 50, 30);

        btnGenerarVenta.setText("Generar Venta");
        btnGenerarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarVentaActionPerformed(evt);
            }
        });
        PanelVendedor.add(btnGenerarVenta);
        btnGenerarVenta.setBounds(60, 170, 110, 30);

        btnMostrar.setText("Mostar");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });
        PanelVendedor.add(btnMostrar);
        btnMostrar.setBounds(220, 170, 80, 30);
        PanelVendedor.add(txtNotaNombreVendedor);
        txtNotaNombreVendedor.setBounds(160, 260, 60, 30);

        txtNotaNom_Producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNotaNom_ProductoActionPerformed(evt);
            }
        });
        PanelVendedor.add(txtNotaNom_Producto);
        txtNotaNom_Producto.setBounds(160, 300, 60, 30);
        PanelVendedor.add(txtNotaDescripcion);
        txtNotaDescripcion.setBounds(160, 340, 60, 30);
        PanelVendedor.add(txtMostrarPrecio);
        txtMostrarPrecio.setBounds(160, 380, 60, 30);

        btnSiguiente.setText("Siguiente");
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });
        PanelVendedor.add(btnSiguiente);
        btnSiguiente.setBounds(260, 410, 100, 30);

        jButton2.setText("Atras");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        PanelVendedor.add(jButton2);
        jButton2.setBounds(40, 410, 80, 30);
        PanelVendedor.add(jSeparator1);
        jSeparator1.setBounds(30, 230, 340, 10);

        jLabel11.setText("Nom_Vendedor");
        PanelVendedor.add(jLabel11);
        jLabel11.setBounds(60, 270, 80, 14);

        jLabel12.setText("Nom_Producto");
        PanelVendedor.add(jLabel12);
        jLabel12.setBounds(60, 300, 80, 14);

        jLabel13.setText("Descripcion");
        PanelVendedor.add(jLabel13);
        jLabel13.setBounds(60, 340, 70, 14);

        jLabel14.setText("Precio");
        PanelVendedor.add(jLabel14);
        jLabel14.setBounds(70, 380, 29, 14);

        jTabbedPane1.addTab("Ventas", PanelVendedor);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNotaNom_ProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNotaNom_ProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNotaNom_ProductoActionPerformed

    private void btnAgregarVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarVendedorActionPerformed
        // TODO add your handling code here:
        
    
        
        if (conta<3) {
            vendedor.AgregaVendedor(Integer.parseInt(txtId_Vendedor.getText()), txtNombre.getText(), txtCorreo.getText(), Integer.parseInt(txtEdad.getText()));
              conta++;
        }else{
            JOptionPane.showMessageDialog(null, "NO se pueden registar mas");
          btnAgregarVendedor.setEnabled(false);
        }
          txtId_Vendedor.setText(null);
          txtNombre.setText(null);
          txtCorreo.setText(null);
          txtEdad.setText(null);
          
    }//GEN-LAST:event_btnAgregarVendedorActionPerformed

    private void btnAgregarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarProductoActionPerformed
        // TODO add your handling code here:
        
        producto.AgregarProdcuto(Integer.parseInt(txtCodigoProducto.getText()), txtNombreProducto.getText(), txtDescripcionProducto.getText(), Float.parseFloat(txtPrecioProducto.getText()));
          txtId_Vendedor.setText(null);
          txtNombre.setText(null);
          txtCorreo.setText(null);
          txtEdad.setText(null);
        
    }//GEN-LAST:event_btnAgregarProductoActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        // TODO add your handling code here:
  
       
       
        
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void btnGenerarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarVentaActionPerformed
        // TODO add your handling code here:
     

        txtNotaNombreVendedor.setText(vendedor.igualacion(Integer.parseInt(txtCod_Vendedor.getText()))); 
        txtNotaNom_Producto.setText(producto.buscarProducto(Integer.parseInt(txtId_Producto.getText())));
        txtNotaDescripcion.setText(producto.buscarProductoSegundo(Integer.parseInt(txtId_Producto.getText())));
        txtMostrarPrecio.setText(String.valueOf(producto.buscarProductoTercero(Integer.parseInt(txtId_Producto.getText()))));
        
          
          lista.alta(txtNotaNombreVendedor.getText(),txtNombreProducto.getText(), txtDescripcionProducto.getText(),Float.parseFloat(txtMostrarPrecio.getText()));
        
        
    }//GEN-LAST:event_btnGenerarVentaActionPerformed

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        // TODO add your handling code here:
        
        try{ if (lista.estavacio()) {
            return;
        }
        if (nodoAcutual==null) {
            
          nodoAcutual = lista.Primero;
         }else
            nodoAcutual = nodoAcutual.getSiguiente();
           imprimir(nodoAcutual);
      }catch
          (Exception ex){
          JOptionPane.showMessageDialog(null,"Ya no hay mas registros");
          
      }
         
    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try{ if (lista.estavacio()) {
            return;
        }
        if (nodoAcutual==null) {
            
          nodoAcutual = lista.Primero;
         }else
            nodoAcutual = nodoAcutual.getAtras();
           imprimir(nodoAcutual);
      }catch
          (Exception ex){
          JOptionPane.showMessageDialog(null,"Ya no hay mas registros");
          
      }
        
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(VistaGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaGeneral().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelProducto;
    private javax.swing.JPanel PanelVendedor;
    private javax.swing.JPanel PanelVentas;
    private javax.swing.JButton btnAgregarProducto;
    private javax.swing.JButton btnAgregarVendedor;
    private javax.swing.JButton btnGenerarVenta;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField txtCod_Vendedor;
    private javax.swing.JTextField txtCodigoProducto;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDescripcionProducto;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtId_Producto;
    private javax.swing.JTextField txtId_Vendedor;
    private javax.swing.JTextField txtMostrarPrecio;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreProducto;
    private javax.swing.JTextField txtNotaDescripcion;
    private javax.swing.JTextField txtNotaNom_Producto;
    private javax.swing.JTextField txtNotaNombreVendedor;
    private javax.swing.JTextField txtPrecioProducto;
    // End of variables declaration//GEN-END:variables

    
}


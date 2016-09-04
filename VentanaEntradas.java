/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import clases.*;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author user2
 */
public class VentanaEntradas extends javax.swing.JFrame {
    Cliente cliente = null;
    Auto auto = null;
    Arreglo arreglo = null;
    /**
     * Creates new form VentanaEntradas
     */
    public VentanaEntradas(Cliente clienteR, Auto autoR, Arreglo arregloR) {
        this.setIconImage(Clientes.getIconImage("imagenes/carpeta.png"));
        this.setLocationRelativeTo(null);
        cliente = clienteR;
        auto=autoR;
        arreglo=arregloR;
        initComponents();
        load();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        lblAuto = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lEntradas = new javax.swing.JList<>();
        btnAddEntrada = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        btnRemoveEntrada = new javax.swing.JButton();
        btnVerInformacion = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblCosteT = new javax.swing.JLabel();
        btnTerminarA = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jList1.setFont(new java.awt.Font("Monospaced", 0, 15)); // NOI18N
        jScrollPane1.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Entradas");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(254, 254, 254));
        jLabel1.setText("Auto :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 12, -1, -1));

        lblAuto.setForeground(new java.awt.Color(254, 254, 254));
        getContentPane().add(lblAuto, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 12, 267, 17));

        lEntradas.setFont(new java.awt.Font("Monospaced", 0, 15)); // NOI18N
        jScrollPane2.setViewportView(lEntradas);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 81, 369, 110));

        btnAddEntrada.setText("Agregar entrada");
        btnAddEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddEntradaActionPerformed(evt);
            }
        });
        getContentPane().add(btnAddEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 217, -1, -1));

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        getContentPane().add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 70, -1));

        btnRemoveEntrada.setText("Remover entrada");
        btnRemoveEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveEntradaActionPerformed(evt);
            }
        });
        getContentPane().add(btnRemoveEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 217, -1, -1));

        btnVerInformacion.setText("Ver informacion");
        btnVerInformacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerInformacionActionPerformed(evt);
            }
        });
        getContentPane().add(btnVerInformacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(259, 252, -1, -1));

        jLabel3.setForeground(new java.awt.Color(254, 254, 254));
        jLabel3.setText("Fecha");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 58, -1, -1));

        jLabel4.setForeground(new java.awt.Color(254, 254, 254));
        jLabel4.setText("Coste");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 58, -1, -1));

        jLabel5.setForeground(new java.awt.Color(254, 254, 254));
        jLabel5.setText("Coste total :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 35, -1, -1));

        lblCosteT.setForeground(new java.awt.Color(254, 254, 254));
        getContentPane().add(lblCosteT, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 35, 267, 17));

        btnTerminarA.setText("Terminar arreglo");
        btnTerminarA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTerminarAActionPerformed(evt);
            }
        });
        getContentPane().add(btnTerminarA, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 252, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 290));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        VentanaArreglos ven = new VentanaArreglos(cliente, auto);
        ven.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnAddEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddEntradaActionPerformed
        VentanaNEntrada ven = new VentanaNEntrada(cliente, auto, arreglo);
        ven.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAddEntradaActionPerformed

    private void btnRemoveEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveEntradaActionPerformed
        if (arreglo.getEstado().equals("Incompleto")){
            try {
                int confirmacion = JOptionPane.showConfirmDialog(this, "Desea eliminar la entrada seleccionada ?");
                if (JOptionPane.OK_OPTION == confirmacion){
                    arreglo.removeEntrada(arreglo.getEntradas().get(lEntradas.getSelectedIndex()));
                    load();
                }
            }catch(RuntimeException e){
                JOptionPane.showMessageDialog(this, "Seleccione una entrada");
            }
        }else{
            JOptionPane.showMessageDialog(this, "Este arreglo no se puede modificar porque ya esta finalizado");
        }
    }//GEN-LAST:event_btnRemoveEntradaActionPerformed

    private void btnVerInformacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerInformacionActionPerformed
        try {
            VentanaVEntrada ven = new VentanaVEntrada(cliente, auto, arreglo, arreglo.getEntradas().get(lEntradas.getSelectedIndex()));
            ven.setVisible(true);
            this.dispose();
        }catch(RuntimeException e){
            JOptionPane.showMessageDialog(this, "Seleccione una entrada");
        }
    }//GEN-LAST:event_btnVerInformacionActionPerformed

    private void btnTerminarAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTerminarAActionPerformed
        VentanaTArreglo ven = new VentanaTArreglo(cliente, auto, arreglo);
        ven.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnTerminarAActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddEntrada;
    private javax.swing.JButton btnRemoveEntrada;
    private javax.swing.JButton btnTerminarA;
    private javax.swing.JButton btnVerInformacion;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> lEntradas;
    private javax.swing.JLabel lblAuto;
    private javax.swing.JLabel lblCosteT;
    // End of variables declaration//GEN-END:variables
    private void load(){
        lblAuto.setText(auto.getMarca()+" ( "+auto.getModelo()+" ) ");      
        lblCosteT.setText("$ "+arreglo.getCostet());
        DefaultListModel model = new DefaultListModel();
        for (Entrada entrada : arreglo.getEntradas()) {
            model.addElement(entrada);        
        }
        lEntradas.setModel(model);
    }

}
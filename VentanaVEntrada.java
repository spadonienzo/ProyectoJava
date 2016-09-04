/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;
import clases.*;

/**
 *
 * @author Juani
 */
public class VentanaVEntrada extends javax.swing.JFrame {
    Cliente cliente = null;
    Auto auto = null;
    Arreglo arreglo = null;
    Entrada entrada = null;
    /**
     * Creates new form VentanaVEntrada
     */
    public VentanaVEntrada(Cliente clienteR, Auto autoR, Arreglo arregloR, Entrada entradaR) {
        this.setIconImage(Clientes.getIconImage("imagenes/carpeta_info.png"));
        this.setLocationRelativeTo(null);
        cliente = clienteR;
        auto=autoR;
        arreglo=arregloR;
        entrada=entradaR;
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        lblCoste = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtInfo = new javax.swing.JTextArea();
        btnVolver = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Informacion");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(254, 254, 254));
        jLabel1.setText("Fecha:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 12, -1, -1));

        jLabel2.setForeground(new java.awt.Color(254, 254, 254));
        jLabel2.setText("Coste:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 40, -1, -1));

        jLabel3.setForeground(new java.awt.Color(254, 254, 254));
        jLabel3.setText("Informacion");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 63, -1, -1));

        lblFecha.setForeground(new java.awt.Color(254, 254, 254));
        getContentPane().add(lblFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 12, 278, 17));

        lblCoste.setForeground(new java.awt.Color(254, 254, 254));
        getContentPane().add(lblCoste, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 40, 278, 14));

        txtInfo.setEditable(false);
        txtInfo.setColumns(20);
        txtInfo.setRows(5);
        jScrollPane1.setViewportView(txtInfo);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 86, 393, -1));

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        getContentPane().add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 220));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        VentanaEntradas ven = new VentanaEntradas(cliente, auto, arreglo);
        ven.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCoste;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JTextArea txtInfo;
    // End of variables declaration//GEN-END:variables

    private void load(){
        lblFecha.setText(entrada.getFecha());
        lblCoste.setText("$ "+entrada.getCoste());
        txtInfo.setText(entrada.getInfo());
    }

}

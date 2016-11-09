
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Claudia
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
         public Principal() {
                  initComponents();
                  String linea;
                  String frases [] = new String[5];
                  int c=0;
                  try {
                           BufferedReader br = new BufferedReader(new FileReader("Datos.txt"));
                           linea = br.readLine();
                           while(linea != null){
                                    System.out.println(linea);
                                    cmbFrases.addItem(linea);
                                    frases[c]=linea;
                                    linea = br.readLine();
                                    c++;
                           }
                           
                  } 
                  catch (Exception ex) {
                           Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                  }
                  
    }
     

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmbFrases = new javax.swing.JComboBox<>();
        txtLetras = new javax.swing.JTextField();
        txtElegida = new javax.swing.JTextField();
        txtCodificada = new javax.swing.JTextField();
        lblCodi = new javax.swing.JLabel();
        lblfrase = new javax.swing.JLabel();
        lblLetras = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cmbFrases.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<<Seleciona una frase>>" }));
        cmbFrases.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbFrasesItemStateChanged(evt);
            }
        });
        cmbFrases.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbFrasesActionPerformed(evt);
            }
        });

        lblCodi.setText(" Frase Codificada:");

        lblfrase.setText("Frase Elegida:");

        lblLetras.setText("Letras que contiene:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCodi, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(cmbFrases, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtElegida, javax.swing.GroupLayout.DEFAULT_SIZE, 444, Short.MAX_VALUE)
                        .addComponent(txtCodificada)
                        .addComponent(txtLetras, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(50, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(80, 80, 80)
                    .addComponent(lblfrase, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(227, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(80, 80, 80)
                    .addComponent(lblLetras, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(227, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(cmbFrases, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(txtElegida, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addComponent(txtLetras, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCodi, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtCodificada, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(114, 114, 114)
                    .addComponent(lblfrase, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(268, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(218, Short.MAX_VALUE)
                    .addComponent(lblLetras, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(164, 164, 164)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public static String Codficar(String elegida){
    String codificada = "";
    char [] palabra = new char [elegida.length()];
   for(int i = 0; i < elegida.length(); i++){
            if((elegida.charAt(i) >= 65) ){
                  if((elegida.charAt(i) <= 90) ){
                   int num= 3 + (int) elegida.charAt(i);
                   if(num >= 89)
                            num = num - 24;
                  palabra [i] =  (char) num;
                  codificada += palabra[i];
                  }}
         if((elegida.charAt(i) == 95) )   {
                  int num = 67;
                  palabra [i] =  (char) num;
                  codificada += palabra[i];
         }
                
   }
    
    return codificada;
    }
    private void cmbFrasesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbFrasesActionPerformed
        // TODO add your handling code here:
         Object cmbitem = cmbFrases.getSelectedItem();
         String elegida = (String) cmbitem;
         int letras = 0;
         txtElegida.setText(elegida);
         for(int i = 0; i < elegida.length(); i++){
                  if((elegida.charAt(i) >= 65) ){
                            if((elegida.charAt(i) <= 90) ){
                                    letras ++;
                            }
                  }
         }
         txtLetras.setText(Integer.toString(letras));
         txtCodificada.setText(Codficar(elegida));
    }//GEN-LAST:event_cmbFrasesActionPerformed
    
    private void cmbFrasesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbFrasesItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbFrasesItemStateChanged

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbFrases;
    private javax.swing.JLabel lblCodi;
    private javax.swing.JLabel lblLetras;
    private javax.swing.JLabel lblfrase;
    private javax.swing.JTextField txtCodificada;
    private javax.swing.JTextField txtElegida;
    private javax.swing.JTextField txtLetras;
    // End of variables declaration//GEN-END:variables
}

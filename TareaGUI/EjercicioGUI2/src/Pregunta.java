
import java.io.BufferedReader;
import java.io.FileReader;
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
public class Pregunta extends javax.swing.JFrame {

   
    int total = 0;
    /**
     * Creates new form Pregunta
     */
    public Pregunta() {
        initComponents();
          String linea,ta=""; 
                     int total =0;
                  try {
                           BufferedReader br = new BufferedReader(new FileReader("Datos.txt"));
                           linea = br.readLine();
                           while(linea != null){
                                    ta = ta +  linea +"\n\n" ;
                                    linea = br.readLine();
                                     
                           }
                           txta.setText(ta);
                           
                  } 
                  catch (Exception ex) {
                           Logger.getLogger(Pricipal.class.getName()).log(Level.SEVERE, null, ex);
                  }
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        respuesta = new javax.swing.ButtonGroup();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        buttonGroup7 = new javax.swing.ButtonGroup();
        buttonGroup8 = new javax.swing.ButtonGroup();
        buttonGroup9 = new javax.swing.ButtonGroup();
        buttonGroup10 = new javax.swing.ButtonGroup();
        jrbsi = new javax.swing.JRadioButton();
        jrbno = new javax.swing.JRadioButton();
        jrbaveces = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txta = new javax.swing.JTextArea();
        jrbno1 = new javax.swing.JRadioButton();
        jrbaveces1 = new javax.swing.JRadioButton();
        jrbsi1 = new javax.swing.JRadioButton();
        jrbno2 = new javax.swing.JRadioButton();
        jrbaveces2 = new javax.swing.JRadioButton();
        jrbsi2 = new javax.swing.JRadioButton();
        jrbno3 = new javax.swing.JRadioButton();
        jrbaveces3 = new javax.swing.JRadioButton();
        jrbno4 = new javax.swing.JRadioButton();
        jrbaveces4 = new javax.swing.JRadioButton();
        jrbsi3 = new javax.swing.JRadioButton();
        jrbno5 = new javax.swing.JRadioButton();
        jrbaveces5 = new javax.swing.JRadioButton();
        jrbsi4 = new javax.swing.JRadioButton();
        jrbsi5 = new javax.swing.JRadioButton();
        jrbno6 = new javax.swing.JRadioButton();
        jrbaveces6 = new javax.swing.JRadioButton();
        jrbno7 = new javax.swing.JRadioButton();
        jrbaveces8 = new javax.swing.JRadioButton();
        jrbsi7 = new javax.swing.JRadioButton();
        jrbno8 = new javax.swing.JRadioButton();
        jrbsi8 = new javax.swing.JRadioButton();
        jrbaveces9 = new javax.swing.JRadioButton();
        jrbsi9 = new javax.swing.JRadioButton();
        jrbno9 = new javax.swing.JRadioButton();
        jrbaveces10 = new javax.swing.JRadioButton();
        jrbno11 = new javax.swing.JRadioButton();
        jrbaveces11 = new javax.swing.JRadioButton();
        jrbsi10 = new javax.swing.JRadioButton();
        jrbsi11 = new javax.swing.JRadioButton();
        btnres = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        respuesta.add(jrbsi);
        jrbsi.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jrbsi.setText("Sí");
        jrbsi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbsiActionPerformed(evt);
            }
        });

        respuesta.add(jrbno);
        jrbno.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jrbno.setText("No");
        jrbno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbnoActionPerformed(evt);
            }
        });

        respuesta.add(jrbaveces);
        jrbaveces.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jrbaveces.setText("A veces");
        jrbaveces.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbavecesActionPerformed(evt);
            }
        });

        txta.setColumns(20);
        txta.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        txta.setRows(5);
        jScrollPane1.setViewportView(txta);

        buttonGroup1.add(jrbno1);
        jrbno1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jrbno1.setText("No");
        jrbno1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbno1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jrbaveces1);
        jrbaveces1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jrbaveces1.setText("A veces");
        jrbaveces1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbaveces1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jrbsi1);
        jrbsi1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jrbsi1.setText("Sí");
        jrbsi1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbsi1ActionPerformed(evt);
            }
        });

        buttonGroup2.add(jrbno2);
        jrbno2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jrbno2.setText("No");
        jrbno2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbno2ActionPerformed(evt);
            }
        });

        buttonGroup2.add(jrbaveces2);
        jrbaveces2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jrbaveces2.setText("A veces");
        jrbaveces2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbaveces2ActionPerformed(evt);
            }
        });

        buttonGroup2.add(jrbsi2);
        jrbsi2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jrbsi2.setText("Sí");
        jrbsi2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbsi2ActionPerformed(evt);
            }
        });

        buttonGroup3.add(jrbno3);
        jrbno3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jrbno3.setText("No");
        jrbno3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbno3ActionPerformed(evt);
            }
        });

        buttonGroup3.add(jrbaveces3);
        jrbaveces3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jrbaveces3.setText("A veces");
        jrbaveces3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbaveces3ActionPerformed(evt);
            }
        });

        buttonGroup5.add(jrbno4);
        jrbno4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jrbno4.setText("No");
        jrbno4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbno4ActionPerformed(evt);
            }
        });

        buttonGroup5.add(jrbaveces4);
        jrbaveces4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jrbaveces4.setText("A veces");
        jrbaveces4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbaveces4ActionPerformed(evt);
            }
        });

        buttonGroup5.add(jrbsi3);
        jrbsi3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jrbsi3.setText("Sí");
        jrbsi3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbsi3ActionPerformed(evt);
            }
        });

        buttonGroup4.add(jrbno5);
        jrbno5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jrbno5.setText("No");
        jrbno5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbno5ActionPerformed(evt);
            }
        });

        buttonGroup4.add(jrbaveces5);
        jrbaveces5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jrbaveces5.setText("A veces");
        jrbaveces5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbaveces5ActionPerformed(evt);
            }
        });

        buttonGroup4.add(jrbsi4);
        jrbsi4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jrbsi4.setText("Sí");
        jrbsi4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbsi4ActionPerformed(evt);
            }
        });

        buttonGroup3.add(jrbsi5);
        jrbsi5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jrbsi5.setText("Sí");
        jrbsi5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbsi5ActionPerformed(evt);
            }
        });

        buttonGroup6.add(jrbno6);
        jrbno6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jrbno6.setText("No");
        jrbno6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbno6ActionPerformed(evt);
            }
        });

        buttonGroup6.add(jrbaveces6);
        jrbaveces6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jrbaveces6.setText("A veces");
        jrbaveces6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbaveces6ActionPerformed(evt);
            }
        });

        buttonGroup10.add(jrbno7);
        jrbno7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jrbno7.setText("No");
        jrbno7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbno7ActionPerformed(evt);
            }
        });

        buttonGroup10.add(jrbaveces8);
        jrbaveces8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jrbaveces8.setText("A veces");
        jrbaveces8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbaveces8ActionPerformed(evt);
            }
        });

        buttonGroup10.add(jrbsi7);
        jrbsi7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jrbsi7.setText("Sí");
        jrbsi7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbsi7ActionPerformed(evt);
            }
        });

        buttonGroup8.add(jrbno8);
        jrbno8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jrbno8.setText("No");
        jrbno8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbno8ActionPerformed(evt);
            }
        });

        buttonGroup9.add(jrbsi8);
        jrbsi8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jrbsi8.setText("Sí");
        jrbsi8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbsi8ActionPerformed(evt);
            }
        });

        buttonGroup8.add(jrbaveces9);
        jrbaveces9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jrbaveces9.setText("A veces");
        jrbaveces9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbaveces9ActionPerformed(evt);
            }
        });

        buttonGroup8.add(jrbsi9);
        jrbsi9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jrbsi9.setText("Sí");
        jrbsi9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbsi9ActionPerformed(evt);
            }
        });

        buttonGroup9.add(jrbno9);
        jrbno9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jrbno9.setText("No");
        jrbno9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbno9ActionPerformed(evt);
            }
        });

        buttonGroup9.add(jrbaveces10);
        jrbaveces10.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jrbaveces10.setText("A veces");
        jrbaveces10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbaveces10ActionPerformed(evt);
            }
        });

        buttonGroup7.add(jrbno11);
        jrbno11.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jrbno11.setText("No");
        jrbno11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbno11ActionPerformed(evt);
            }
        });

        buttonGroup7.add(jrbaveces11);
        jrbaveces11.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jrbaveces11.setText("A veces");
        jrbaveces11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbaveces11ActionPerformed(evt);
            }
        });

        buttonGroup7.add(jrbsi10);
        jrbsi10.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jrbsi10.setText("Sí");
        jrbsi10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbsi10ActionPerformed(evt);
            }
        });

        buttonGroup6.add(jrbsi11);
        jrbsi11.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jrbsi11.setText("Sí");
        jrbsi11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbsi11ActionPerformed(evt);
            }
        });

        btnres.setText("Resulado");
        btnres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 727, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jrbsi)
                                .addGap(18, 18, 18)
                                .addComponent(jrbaveces)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jrbno))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jrbsi1)
                                .addGap(18, 18, 18)
                                .addComponent(jrbaveces1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jrbno1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jrbsi2)
                                .addGap(18, 18, 18)
                                .addComponent(jrbaveces2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jrbno2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jrbsi5)
                                .addGap(18, 18, 18)
                                .addComponent(jrbaveces3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jrbno3))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jrbsi4)
                                .addGap(18, 18, 18)
                                .addComponent(jrbaveces5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jrbno5))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jrbsi3)
                                .addGap(18, 18, 18)
                                .addComponent(jrbaveces4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jrbno4))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jrbsi11)
                                .addGap(18, 18, 18)
                                .addComponent(jrbaveces6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jrbno6))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jrbsi10)
                                .addGap(18, 18, 18)
                                .addComponent(jrbaveces11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jrbno11))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jrbsi9)
                                .addGap(18, 18, 18)
                                .addComponent(jrbaveces9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jrbno8))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jrbsi8)
                                .addGap(18, 18, 18)
                                .addComponent(jrbaveces10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jrbno9))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jrbsi7)
                                .addGap(18, 18, 18)
                                .addComponent(jrbaveces8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jrbno7))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(btnres, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jrbsi)
                            .addComponent(jrbno)
                            .addComponent(jrbaveces))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jrbsi1)
                            .addComponent(jrbno1)
                            .addComponent(jrbaveces1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jrbsi2)
                            .addComponent(jrbno2)
                            .addComponent(jrbaveces2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jrbsi5)
                            .addComponent(jrbno3)
                            .addComponent(jrbaveces3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jrbsi4)
                            .addComponent(jrbno5)
                            .addComponent(jrbaveces5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jrbsi3)
                            .addComponent(jrbno4)
                            .addComponent(jrbaveces4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jrbsi11)
                            .addComponent(jrbno6)
                            .addComponent(jrbaveces6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jrbsi10)
                            .addComponent(jrbno11)
                            .addComponent(jrbaveces11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jrbsi9)
                            .addComponent(jrbno8)
                            .addComponent(jrbaveces9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jrbsi8)
                            .addComponent(jrbno9)
                            .addComponent(jrbaveces10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jrbsi7)
                            .addComponent(jrbno7)
                            .addComponent(jrbaveces8))
                        .addGap(36, 36, 36)
                        .addComponent(btnres, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(65, Short.MAX_VALUE))
                    .addComponent(jScrollPane1)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jrbsiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbsiActionPerformed
        // TODO add your handling code here:
        total += 2;
    }//GEN-LAST:event_jrbsiActionPerformed

    private void jrbnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbnoActionPerformed

    private void jrbavecesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbavecesActionPerformed
        // TODO add your handling code here:
        total += 1;
    }//GEN-LAST:event_jrbavecesActionPerformed

    private void jrbno1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbno1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbno1ActionPerformed

    private void jrbaveces1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbaveces1ActionPerformed
        // TODO add your handling code here:
         total += 1;
    }//GEN-LAST:event_jrbaveces1ActionPerformed

    private void jrbsi1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbsi1ActionPerformed
        // TODO add your handling code here:
        total += 2;
    }//GEN-LAST:event_jrbsi1ActionPerformed

    private void jrbno2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbno2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbno2ActionPerformed

    private void jrbaveces2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbaveces2ActionPerformed
        // TODO add your handling code here:
         total += 1;
    }//GEN-LAST:event_jrbaveces2ActionPerformed

    private void jrbsi2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbsi2ActionPerformed
        // TODO add your handling code here:
        total += 2;
    }//GEN-LAST:event_jrbsi2ActionPerformed

    private void jrbno3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbno3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbno3ActionPerformed

    private void jrbaveces3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbaveces3ActionPerformed
        // TODO add your handling code here:
         total += 1;
    }//GEN-LAST:event_jrbaveces3ActionPerformed

    private void jrbno4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbno4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbno4ActionPerformed

    private void jrbaveces4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbaveces4ActionPerformed
        // TODO add your handling code here:
         total += 1;
    }//GEN-LAST:event_jrbaveces4ActionPerformed

    private void jrbsi3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbsi3ActionPerformed
        // TODO add your handling code here:
        total += 2;
    }//GEN-LAST:event_jrbsi3ActionPerformed

    private void jrbno5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbno5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbno5ActionPerformed

    private void jrbaveces5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbaveces5ActionPerformed
        // TODO add your handling code here total += 1;
         total += 1;
    }//GEN-LAST:event_jrbaveces5ActionPerformed

    private void jrbsi4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbsi4ActionPerformed
        // TODO add your handling code here:
        total += 2;
    }//GEN-LAST:event_jrbsi4ActionPerformed

    private void jrbsi5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbsi5ActionPerformed
        // TODO add your handling code here:
        total += 2;
    }//GEN-LAST:event_jrbsi5ActionPerformed

    private void jrbno6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbno6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbno6ActionPerformed

    private void jrbaveces6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbaveces6ActionPerformed
        // TODO add your handling code here:
         total += 1;
    }//GEN-LAST:event_jrbaveces6ActionPerformed

    private void jrbno7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbno7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbno7ActionPerformed

    private void jrbaveces8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbaveces8ActionPerformed
        // TODO add your handling code here:
         total += 1;
    }//GEN-LAST:event_jrbaveces8ActionPerformed

    private void jrbsi7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbsi7ActionPerformed
        // TODO add your handling code here:
        total += 2;
    }//GEN-LAST:event_jrbsi7ActionPerformed

    private void jrbno8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbno8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbno8ActionPerformed

    private void jrbsi8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbsi8ActionPerformed
        // TODO add your handling code here:
        total += 2;
    }//GEN-LAST:event_jrbsi8ActionPerformed

    private void jrbaveces9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbaveces9ActionPerformed
        // TODO add your handling code here:
         total += 1;
    }//GEN-LAST:event_jrbaveces9ActionPerformed

    private void jrbsi9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbsi9ActionPerformed
        // TODO add your handling code here:
        total += 2;
    }//GEN-LAST:event_jrbsi9ActionPerformed

    private void jrbno9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbno9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbno9ActionPerformed

    private void jrbaveces10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbaveces10ActionPerformed
        // TODO add your handling code here:
         total += 1;
    }//GEN-LAST:event_jrbaveces10ActionPerformed

    private void jrbno11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbno11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbno11ActionPerformed

    private void jrbaveces11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbaveces11ActionPerformed
        // TODO add your handling code here:
         total += 1;
    }//GEN-LAST:event_jrbaveces11ActionPerformed

    private void jrbsi10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbsi10ActionPerformed
        // TODO add your handling code here:
        total += 2;
    }//GEN-LAST:event_jrbsi10ActionPerformed

    private void jrbsi11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbsi11ActionPerformed
        // TODO add your handling code here:
        total += 2;
    }//GEN-LAST:event_jrbsi11ActionPerformed

    private void btnresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnresActionPerformed
        // TODO add your handling code here:
            System.out.println(total);
            res r = new res(total);
            r.setVisible(true);
    }//GEN-LAST:event_btnresActionPerformed

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
            java.util.logging.Logger.getLogger(Pregunta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pregunta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pregunta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pregunta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnres;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup10;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.ButtonGroup buttonGroup7;
    private javax.swing.ButtonGroup buttonGroup8;
    private javax.swing.ButtonGroup buttonGroup9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton jrbaveces;
    private javax.swing.JRadioButton jrbaveces1;
    private javax.swing.JRadioButton jrbaveces10;
    private javax.swing.JRadioButton jrbaveces11;
    private javax.swing.JRadioButton jrbaveces2;
    private javax.swing.JRadioButton jrbaveces3;
    private javax.swing.JRadioButton jrbaveces4;
    private javax.swing.JRadioButton jrbaveces5;
    private javax.swing.JRadioButton jrbaveces6;
    private javax.swing.JRadioButton jrbaveces8;
    private javax.swing.JRadioButton jrbaveces9;
    private javax.swing.JRadioButton jrbno;
    private javax.swing.JRadioButton jrbno1;
    private javax.swing.JRadioButton jrbno11;
    private javax.swing.JRadioButton jrbno2;
    private javax.swing.JRadioButton jrbno3;
    private javax.swing.JRadioButton jrbno4;
    private javax.swing.JRadioButton jrbno5;
    private javax.swing.JRadioButton jrbno6;
    private javax.swing.JRadioButton jrbno7;
    private javax.swing.JRadioButton jrbno8;
    private javax.swing.JRadioButton jrbno9;
    private javax.swing.JRadioButton jrbsi;
    private javax.swing.JRadioButton jrbsi1;
    private javax.swing.JRadioButton jrbsi10;
    private javax.swing.JRadioButton jrbsi11;
    private javax.swing.JRadioButton jrbsi2;
    private javax.swing.JRadioButton jrbsi3;
    private javax.swing.JRadioButton jrbsi4;
    private javax.swing.JRadioButton jrbsi5;
    private javax.swing.JRadioButton jrbsi7;
    private javax.swing.JRadioButton jrbsi8;
    private javax.swing.JRadioButton jrbsi9;
    private javax.swing.ButtonGroup respuesta;
    private javax.swing.JTextArea txta;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Claudia
 */
public class res extends javax.swing.JFrame {

    /**
     * Creates new form res
     */
    public res(int t) {
        initComponents();
        int total = t;
        if(total >= 13 && total <= 20){
          lbltitle.setText("Idealista Perfeccionista");
          txtades.setText("Tienes una visión ideal del mundo. Te guías por la forma en que crees que deberían ser las cosas y \n "
                  + "si algo se sale de la línea, aunque sea poco, crees que arruina todo. Tiendes a frustarte y \n "
                  + "martirizarte porque las cosas no se apegan a tu visión perfecta del mundo. Te comparas con\n"
                  + " los demás y si no ves defectos a simple vista, puedes idealizar a las personas o sus vidas. \n"
                  + "Es común que sufras decepciones porque tienes expectativas demasiado altas. Crees que \n"
                  + "los ideales están hechos para cumplirse. Debes entender que los ideales son guías, nos \n"
                  + " marcan una dirección, pero son por definición inalcanzables. Somos humanos, tenemos \n"
                  + "defectos y no ser “perfecto” es aceptable.");
        }
        if(total >= 4 && total <= 12){
          lbltitle.setText("Idealista Realista  ");
          txtades.setText("Como la mayoría de las personas tienes tus ideas de cómo deberían ser las cosas, pero eres capaz\n"
                  + " de reconocer que no necesariamente serán como imaginas. En ocasiones puedes decepcionarte y es \n"
                  + "normal, pero no dejas que eso te afecte. Sabes que la perfección no existe y eso te ayuda a establecer \n"
                  + "expectativas más realistas.");
        }
        if(total >= 0 && total <= 3){
          lbltitle.setText("Cero Idealista  ");
          txtades.setText("Al parecer esperas muy poco de la gente y del mundo. Tus motivos pueden variar, bien puede ser \n"
                  + " que te hayas decepcionado del mundo y tengas una actitud negativa o puede tratarse de que te ves como \n"
                  + "alguien que acepta la realidad tal cual es. Sea cual sea el caso, carecer de expectativas tampoco es sano,\n"
                  + " denota apatía por el mundo y por nosotros mismos. Las ideas nos guían y nos impulsan. Si bien los ideales\n"
                  + " no son alcanzables, nos mantienen en un camino. Conviene tener expectativas, especialmente en nosotros\n"
                  + " mismos pue eso nos llevará mas lejos.");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbltitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtades = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbltitle.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        txtades.setColumns(20);
        txtades.setFont(new java.awt.Font("Georgia", 0, 16)); // NOI18N
        txtades.setRows(5);
        jScrollPane1.setViewportView(txtades);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbltitle, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(145, 145, 145))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 784, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(lbltitle, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(118, 118, 118))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(res.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(res.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(res.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(res.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbltitle;
    private javax.swing.JTextArea txtades;
    // End of variables declaration//GEN-END:variables
}

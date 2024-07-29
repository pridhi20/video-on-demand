
public class Server_ON_OFF extends javax.swing.JFrame {

    myServer obj;
   
    public Server_ON_OFF() {
       
        initComponents();
         setSize(500, 500);
          stopbt.setEnabled(false);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        startbt = new javax.swing.JButton();
        stopbt = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        startbt.setBackground(new java.awt.Color(51, 51, 51));
        startbt.setForeground(new java.awt.Color(255, 255, 255));
        startbt.setText("Start Server");
        startbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startbtActionPerformed(evt);
            }
        });
        getContentPane().add(startbt);
        startbt.setBounds(120, 60, 170, 60);

        stopbt.setBackground(new java.awt.Color(153, 153, 153));
        stopbt.setText("Stop Server");
        stopbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopbtActionPerformed(evt);
            }
        });
        getContentPane().add(stopbt);
        stopbt.setBounds(130, 190, 160, 50);

        jButton1.setBackground(new java.awt.Color(102, 51, 0));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Launch My VOD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(70, 310, 310, 50);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void startbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startbtActionPerformed
        
        try {
            obj = new myServer(9000);
            startbt.setEnabled(false);
            stopbt.setEnabled(true);
        } 
        catch (Exception e)
        {
            e.printStackTrace();
        }
        
        
    }//GEN-LAST:event_startbtActionPerformed

    private void stopbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopbtActionPerformed
       obj.shutdown();
       startbt.setEnabled(true);
       stopbt.setEnabled(false);
    }//GEN-LAST:event_stopbtActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       Welcome obj = new Welcome();
       obj.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Server_ON_OFF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Server_ON_OFF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Server_ON_OFF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Server_ON_OFF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Server_ON_OFF().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton startbt;
    private javax.swing.JButton stopbt;
    // End of variables declaration//GEN-END:variables
}

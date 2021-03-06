/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacrud.view;

/**
 *
 * @author l.milan
 */
public class Mainform extends javax.swing.JFrame {

    /**
     * Creates new form Mainform
     */
    public Mainform() {
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

        bouton_Quitter = new javax.swing.JButton();
        bouton_UtilCrud = new javax.swing.JButton();
        bouton_Mail = new javax.swing.JButton();
        bouton_Cloud = new javax.swing.JButton();
        bouton_Imprimante = new javax.swing.JButton();
        bouton_Comptabilite = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bouton_Quitter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressource/exit.png"))); // NOI18N
        bouton_Quitter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bouton_QuitterMouseClicked(evt);
            }
        });
        bouton_Quitter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bouton_QuitterActionPerformed(evt);
            }
        });

        bouton_UtilCrud.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressource/user.png"))); // NOI18N
        bouton_UtilCrud.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bouton_UtilCrudMouseClicked(evt);
            }
        });

        bouton_Mail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressource/mail.png"))); // NOI18N
        bouton_Mail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bouton_MailMouseClicked(evt);
            }
        });

        bouton_Cloud.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressource/cloud.png"))); // NOI18N

        bouton_Imprimante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressource/imprimante.png"))); // NOI18N

        bouton_Comptabilite.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressource/comptabilite.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bouton_UtilCrud, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bouton_Comptabilite, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(136, 136, 136)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bouton_Mail, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bouton_Imprimante))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bouton_Cloud, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bouton_Quitter, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(164, 164, 164))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bouton_Mail, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bouton_UtilCrud, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bouton_Cloud, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bouton_Imprimante, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bouton_Quitter, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bouton_Comptabilite, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(104, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bouton_QuitterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bouton_QuitterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bouton_QuitterActionPerformed

    private void bouton_QuitterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bouton_QuitterMouseClicked
        // TODO add your handling code here:
        this.dispose();
        Login login = new Login();
        login.setVisible(true);
    }//GEN-LAST:event_bouton_QuitterMouseClicked

    private void bouton_UtilCrudMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bouton_UtilCrudMouseClicked
        // TODO add your handling code here:
        UtilCrud utilcrud = new UtilCrud();
        utilcrud.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bouton_UtilCrudMouseClicked

    private void bouton_MailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bouton_MailMouseClicked
        // TODO add your handling code here:
        Mail mail = new Mail();
        mail.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bouton_MailMouseClicked

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
            java.util.logging.Logger.getLogger(Mainform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mainform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mainform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mainform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mainform().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bouton_Cloud;
    private javax.swing.JButton bouton_Comptabilite;
    private javax.swing.JButton bouton_Imprimante;
    private javax.swing.JButton bouton_Mail;
    private javax.swing.JButton bouton_Quitter;
    private javax.swing.JButton bouton_UtilCrud;
    // End of variables declaration//GEN-END:variables
}

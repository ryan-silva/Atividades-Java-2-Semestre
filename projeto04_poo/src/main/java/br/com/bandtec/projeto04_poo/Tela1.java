/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bandtec.projeto04_poo;

import java.awt.Color;

/**
 *
 * @author Aluno
 */
public class Tela1 extends javax.swing.JFrame {

    /**
     * Creates new form Tela1
     */
    public Tela1() {
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

        lbTexto1 = new javax.swing.JLabel();
        lbTexto2 = new javax.swing.JLabel();
        lbTexto3 = new javax.swing.JLabel();
        tfCampo1 = new javax.swing.JTextField();
        tfCampo2 = new javax.swing.JTextField();
        tfCampo3 = new javax.swing.JTextField();
        btAcao1 = new javax.swing.JButton();
        brAcao2 = new javax.swing.JButton();
        btAcao3 = new javax.swing.JButton();
        btAcao4 = new javax.swing.JButton();
        btAcao5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbTexto1.setForeground(new java.awt.Color(0, 0, 255));
        lbTexto1.setText("Sou o 1º texto");

        lbTexto2.setForeground(new java.awt.Color(255, 0, 0));
        lbTexto2.setText("Sou o 2º");

        lbTexto3.setForeground(new java.awt.Color(0, 255, 0));
        lbTexto3.setText("Eu o 3°");

        tfCampo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCampo1ActionPerformed(evt);
            }
        });

        btAcao1.setText("Ação 1");
        btAcao1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAcao1ActionPerformed(evt);
            }
        });

        brAcao2.setText("Ação 2");
        brAcao2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brAcao2ActionPerformed(evt);
            }
        });

        btAcao3.setText("Ação 3");
        btAcao3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAcao3ActionPerformed(evt);
            }
        });

        btAcao4.setText("Ação 4");
        btAcao4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAcao4ActionPerformed(evt);
            }
        });

        btAcao5.setText("Ação 5");
        btAcao5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAcao5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfCampo1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTexto1)
                    .addComponent(btAcao1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfCampo2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(brAcao2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfCampo3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btAcao3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btAcao4)
                            .addComponent(btAcao5))
                        .addGap(22, 22, 22))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbTexto2)
                        .addGap(50, 50, 50)
                        .addComponent(lbTexto3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTexto1)
                    .addComponent(lbTexto2)
                    .addComponent(lbTexto3))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfCampo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfCampo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfCampo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btAcao4))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAcao1)
                    .addComponent(brAcao2)
                    .addComponent(btAcao3)
                    .addComponent(btAcao5))
                .addContainerGap(117, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btAcao1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAcao1ActionPerformed
       lbTexto1.setText("É nois no Java Swing");
      
    }//GEN-LAST:event_btAcao1ActionPerformed

    private void tfCampo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCampo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCampo1ActionPerformed

    private void brAcao2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brAcao2ActionPerformed
        lbTexto2.setText(tfCampo2.getText());
    }//GEN-LAST:event_brAcao2ActionPerformed

    private void btAcao3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAcao3ActionPerformed
       lbTexto3.setForeground(Color.PINK);
    }//GEN-LAST:event_btAcao3ActionPerformed

    private void btAcao4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAcao4ActionPerformed
        lbTexto1.setText(tfCampo1.getText());
        lbTexto2.setText(tfCampo1.getText());
        lbTexto3.setText(tfCampo1.getText());
    }//GEN-LAST:event_btAcao4ActionPerformed

    private void btAcao5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAcao5ActionPerformed
        lbTexto1.setForeground(lbTexto2.getForeground());
        lbTexto3.setForeground(lbTexto2.getForeground());
    }//GEN-LAST:event_btAcao5ActionPerformed

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
            java.util.logging.Logger.getLogger(Tela1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton brAcao2;
    private javax.swing.JButton btAcao1;
    private javax.swing.JButton btAcao3;
    private javax.swing.JButton btAcao4;
    private javax.swing.JButton btAcao5;
    private javax.swing.JLabel lbTexto1;
    private javax.swing.JLabel lbTexto2;
    private javax.swing.JLabel lbTexto3;
    private javax.swing.JTextField tfCampo1;
    private javax.swing.JTextField tfCampo2;
    private javax.swing.JTextField tfCampo3;
    // End of variables declaration//GEN-END:variables
}

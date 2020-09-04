/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bandtec.lista02;

/**
 *
 * @author Aluno
 */
public class IndiceMassaCorporal extends javax.swing.JFrame {

    /**
     * Creates new form IndiceMassaCorporal
     */
    public IndiceMassaCorporal() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfValor1 = new javax.swing.JTextField();
        tfValor2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btAcao = new javax.swing.JButton();
        lbTexto = new javax.swing.JLabel();
        rbMasculino = new javax.swing.JRadioButton();
        rbFeminino = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Sua altura");

        jLabel2.setText("Seu peso");

        jLabel3.setText("Sexo (escolha um só por favor):");

        btAcao.setText("Calcular IMC");
        btAcao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAcaoActionPerformed(evt);
            }
        });

        rbMasculino.setText("Homem");
        rbMasculino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbMasculinoActionPerformed(evt);
            }
        });

        rbFeminino.setText("Mulher");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rbMasculino)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rbFeminino))
                            .addComponent(btAcao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(tfValor1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 130, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(tfValor2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(lbTexto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(100, 100, 100))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfValor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfValor2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbMasculino)
                    .addComponent(rbFeminino))
                .addGap(17, 17, 17)
                .addComponent(btAcao)
                .addGap(18, 18, 18)
                .addComponent(lbTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(96, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btAcaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAcaoActionPerformed
      Double altura = Double.valueOf(tfValor1.getText());
      Double peso = Double.valueOf(tfValor2.getText());
      
      Double imc = peso / (altura*altura);
      
        if (imc < 19.1 && rbFeminino.isSelected()) {
            lbTexto.setText(String.format("IMC = %.2f,Abaixo do peso", imc));
        }else if (imc >= 19.1 && imc <= 25.8 && rbFeminino.isSelected()) {
            lbTexto.setText(String.format("IMC = %.2f,Peso normal", imc));
        }else if (imc >= 25.8 && imc <= 27.3 && rbFeminino.isSelected()) {
            lbTexto.setText(String.format("IMC = %.2f,Marginalmente acima do peso", imc));
        }else if (imc > 27.3 && imc <= 32.3 && rbFeminino.isSelected()) {
            lbTexto.setText(String.format("IMC = %.2f,Acima do peso ideal", imc));
        }else if (imc > 32.3 && rbFeminino.isSelected()) {
            lbTexto.setText(String.format("IMC = %.2f,Obeso", imc));
        }
        
         if (imc < 20.7 && rbMasculino.isSelected()) {
            lbTexto.setText(String.format("IMC = %.2f,Abaixo do peso", imc));
        }else if (imc >= 20.7 && imc <= 26.4 && rbMasculino.isSelected()) {
            lbTexto.setText(String.format("IMC = %.2f,Peso normal", imc));
        }else if (imc >= 26.4 && imc <= 27.8 && rbMasculino.isSelected()) {
            lbTexto.setText(String.format("IMC = %.2f,Marginalmente acima do peso", imc));
        }else if (imc > 27.8 && imc <= 31.1 && rbMasculino.isSelected()) {
            lbTexto.setText(String.format("IMC = %.2f,Acima do peso ideal", imc));
        }else if (imc > 31.1 && rbMasculino.isSelected()) {
            lbTexto.setText(String.format("IMC = %.2f,Obeso", imc));
        }
    }//GEN-LAST:event_btAcaoActionPerformed

    private void rbMasculinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbMasculinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbMasculinoActionPerformed

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
            java.util.logging.Logger.getLogger(IndiceMassaCorporal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IndiceMassaCorporal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IndiceMassaCorporal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IndiceMassaCorporal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IndiceMassaCorporal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAcao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lbTexto;
    private javax.swing.JRadioButton rbFeminino;
    private javax.swing.JRadioButton rbMasculino;
    private javax.swing.JTextField tfValor1;
    private javax.swing.JTextField tfValor2;
    // End of variables declaration//GEN-END:variables
}

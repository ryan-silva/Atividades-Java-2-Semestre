/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bandtec.correcao.c1.tipo1.poo;

import java.util.concurrent.ThreadLocalRandom;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

/**
 *
 * @author jose
 */
public class TelaMonitoramento extends javax.swing.JFrame {
    
    Componente cpu = new Componente();
    Componente disco = new Componente();
    Componente memoria = new Componente();
    
    void configurarComponentes() {        
        cpu.nome = "CPU";
        cpu.maximoPossivel = 100;
        cpu.minimo =  cpu.maximoPossivel;
        cpu.mascara = "%d%%";
        
        disco.nome = "Disco";
        disco.maximoPossivel = 250;
        disco.minimo =  disco.maximoPossivel;
        disco.mascara = "%dGB";
        
        memoria.nome = "Memória";
        memoria.maximoPossivel = 8 * 1024;
        memoria.minimo =  memoria.maximoPossivel;
        memoria.mascara = "%dMB";
    }
    
    void atribuirLeitura(JProgressBar pbBarra, JLabel lbAtual,  
            JLabel lbMinimo, JLabel lbMaximo, JLabel lbMedia,
            Componente componente, Integer novoValor) {
        
        componente.atual = novoValor;
        componente.soma += novoValor;
        
        if (novoValor < componente.minimo) {
            componente.minimo = novoValor;
        }
        
        if (novoValor > componente.maximo) {
            componente.maximo = novoValor;
        }
        
        
        // atualizando componentes na tela
        
        pbBarra.setValue(componente.atual);
        
        lbAtual.setText(
                String.format(componente.mascara, componente.atual));
        
        lbMinimo.setText(
                String.format(componente.mascara, componente.minimo));
        
        lbMaximo.setText(
                String.format(componente.mascara, componente.maximo));
        
        lbMedia.setText(
                String.format(componente.mascara, componente.soma / leituras));
    }
    
    
    
    Integer leituras = 0;

    /**
     * Creates new form TelaMonitoramento
     */
    public TelaMonitoramento() {
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

        pbCpu = new javax.swing.JProgressBar();
        lbMinimoCpu = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbMaximoCpu = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbMediaCpu = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        pbDisco = new javax.swing.JProgressBar();
        jLabel5 = new javax.swing.JLabel();
        lbMinimoDisco = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lbMaximoDisco = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lbMediaDisco = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lbMinimoMemoria = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lbMaximoMemoria = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lbMediaMemoria = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        pbMemoria = new javax.swing.JProgressBar();
        jLabel13 = new javax.swing.JLabel();
        btLeitura = new javax.swing.JButton();
        lbAtualCpu = new javax.swing.JLabel();
        lbAtualMemoria = new javax.swing.JLabel();
        lbAtualDisco = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbMinimoCpu.setText("0");

        jLabel2.setText("Mínimo:");

        lbMaximoCpu.setText("0");

        jLabel3.setText("Máximo:");

        lbMediaCpu.setText("0");

        jLabel4.setText("Média:");

        pbDisco.setMaximum(250);

        jLabel5.setText("Mínimo:");

        lbMinimoDisco.setText("0");

        jLabel6.setText("Máximo:");

        lbMaximoDisco.setText("0");

        jLabel7.setText("Média:");

        lbMediaDisco.setText("0");

        jLabel8.setText("Disco:");

        jLabel9.setText("CPU:");

        lbMinimoMemoria.setText("0");

        jLabel10.setText("Máximo:");

        lbMaximoMemoria.setText("0");

        jLabel11.setText("Média:");

        lbMediaMemoria.setText("0");

        jLabel12.setText("Memória:");

        pbMemoria.setMaximum(8192);

        jLabel13.setText("Mínimo:");

        btLeitura.setText("Realizar Leitura");
        btLeitura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLeituraActionPerformed(evt);
            }
        });

        lbAtualCpu.setText("----");

        lbAtualMemoria.setText("----");

        lbAtualDisco.setText("----");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pbCpu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pbDisco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pbMemoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbMinimoCpu)
                                .addGap(33, 33, 33)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbMaximoCpu)
                                .addGap(36, 36, 36)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbMediaCpu))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbMinimoDisco)
                                .addGap(33, 33, 33)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbMaximoDisco)
                                .addGap(36, 36, 36)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbMediaDisco))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btLeitura)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbMinimoMemoria)
                                        .addGap(33, 33, 33)
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbMaximoMemoria)
                                        .addGap(36, 36, 36)
                                        .addComponent(jLabel11)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbMediaMemoria))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbAtualCpu))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbAtualDisco))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbAtualMemoria)))
                        .addGap(0, 100, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(lbAtualCpu))
                .addGap(4, 4, 4)
                .addComponent(pbCpu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lbMinimoCpu)
                    .addComponent(jLabel3)
                    .addComponent(lbMaximoCpu)
                    .addComponent(jLabel4)
                    .addComponent(lbMediaCpu))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(lbAtualDisco))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pbDisco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lbMinimoDisco)
                    .addComponent(jLabel6)
                    .addComponent(lbMaximoDisco)
                    .addComponent(jLabel7)
                    .addComponent(lbMediaDisco))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(lbAtualMemoria))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pbMemoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(lbMinimoMemoria)
                    .addComponent(jLabel10)
                    .addComponent(lbMaximoMemoria)
                    .addComponent(jLabel11)
                    .addComponent(lbMediaMemoria))
                .addGap(18, 18, 18)
                .addComponent(btLeitura)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btLeituraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLeituraActionPerformed
    
        leituras++;
        
        if (leituras == 1) {
            configurarComponentes();
        }
        
        // valores aletórios p/ as 3 leituras
        Integer leituraCpu = ThreadLocalRandom.current().nextInt(0, cpu.maximoPossivel + 1);
        
        Integer leituraDisco = ThreadLocalRandom.current().nextInt(0, disco.maximoPossivel + 1);
        
        Integer leituraMemoria = ThreadLocalRandom.current().nextInt(0, memoria.maximoPossivel + 1);
        
        atribuirLeitura(pbCpu, lbAtualCpu, lbMinimoCpu, lbMaximoCpu, lbMediaCpu, cpu, leituraCpu);
        atribuirLeitura(pbDisco, lbAtualDisco, lbMinimoDisco, lbMaximoDisco, lbMediaDisco, disco, leituraDisco);
        atribuirLeitura(pbMemoria, lbAtualMemoria, lbMinimoMemoria, lbMaximoMemoria, lbMediaMemoria, memoria, leituraMemoria);
        
    }//GEN-LAST:event_btLeituraActionPerformed

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
            java.util.logging.Logger.getLogger(TelaMonitoramento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaMonitoramento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaMonitoramento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaMonitoramento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaMonitoramento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btLeitura;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lbAtualCpu;
    private javax.swing.JLabel lbAtualDisco;
    private javax.swing.JLabel lbAtualMemoria;
    private javax.swing.JLabel lbMaximoCpu;
    private javax.swing.JLabel lbMaximoDisco;
    private javax.swing.JLabel lbMaximoMemoria;
    private javax.swing.JLabel lbMediaCpu;
    private javax.swing.JLabel lbMediaDisco;
    private javax.swing.JLabel lbMediaMemoria;
    private javax.swing.JLabel lbMinimoCpu;
    private javax.swing.JLabel lbMinimoDisco;
    private javax.swing.JLabel lbMinimoMemoria;
    private javax.swing.JProgressBar pbCpu;
    private javax.swing.JProgressBar pbDisco;
    private javax.swing.JProgressBar pbMemoria;
    // End of variables declaration//GEN-END:variables
}
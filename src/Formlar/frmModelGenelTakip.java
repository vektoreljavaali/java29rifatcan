/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formlar;

import Modeller.ModelGenelTakip;
import java.util.ArrayList;

/**
 *
 * @author rbarka
 */
public class frmModelGenelTakip extends javax.swing.JFrame {
    ArrayList<Modeller.ModelGenelTakip> gt = new ArrayList<>();
    Modeller.ModelGenelTakip tmpgeneltakip;
    
    public frmModelGenelTakip() {
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnyenikayit = new javax.swing.JButton();
        btnkaydet = new javax.swing.JButton();
        btnduzenle = new javax.swing.JButton();
        btnsil = new javax.swing.JButton();
        btncikis = new javax.swing.JButton();
        txttarih = new javax.swing.JFormattedTextField();
        txtkilo = new javax.swing.JFormattedTextField();
        txtboy = new javax.swing.JFormattedTextField();
        txtyas = new javax.swing.JFormattedTextField();
        txtyagorani = new javax.swing.JFormattedTextField();
        txtbelcapi = new javax.swing.JFormattedTextField();
        txtvucutkitle = new javax.swing.JFormattedTextField();
        btnhesapla = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Tarih");
        jLabel1.setToolTipText("");

        jLabel2.setText("Kilo");
        jLabel2.setToolTipText("");

        jLabel3.setText("Boy");

        jLabel4.setText("Yaş");

        jLabel5.setText("Yağ Oranı");
        jLabel5.setToolTipText("");

        jLabel6.setText("Bel Çapı");

        jLabel7.setText("Vücut Kitle Endeksi");
        jLabel7.setToolTipText("");

        btnyenikayit.setIcon(new javax.swing.ImageIcon("C:\\Users\\rbarka.INNOVA\\Documents\\NetBeansProjects\\SporMerkeziUygulaması\\src\\images\\yenikayit.png")); // NOI18N
        btnyenikayit.setText("Yeni Kayıt");
        btnyenikayit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnyenikayitActionPerformed(evt);
            }
        });

        btnkaydet.setIcon(new javax.swing.ImageIcon("C:\\Users\\rbarka.INNOVA\\Documents\\NetBeansProjects\\SporMerkeziUygulaması\\src\\images\\kayit.png")); // NOI18N
        btnkaydet.setText("Kaydet");
        btnkaydet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkaydetActionPerformed(evt);
            }
        });

        btnduzenle.setIcon(new javax.swing.ImageIcon("C:\\Users\\rbarka.INNOVA\\Documents\\NetBeansProjects\\SporMerkeziUygulaması\\src\\images\\düzenle.png")); // NOI18N
        btnduzenle.setText("Düzenle");

        btnsil.setIcon(new javax.swing.ImageIcon("C:\\Users\\rbarka.INNOVA\\Documents\\NetBeansProjects\\SporMerkeziUygulaması\\src\\images\\sil.png")); // NOI18N
        btnsil.setText("Sil");

        btncikis.setIcon(new javax.swing.ImageIcon("C:\\Users\\rbarka.INNOVA\\Documents\\NetBeansProjects\\SporMerkeziUygulaması\\src\\images\\cikis.png")); // NOI18N
        btncikis.setText("Çıkış");
        btncikis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncikisActionPerformed(evt);
            }
        });

        txttarih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttarihActionPerformed(evt);
            }
        });

        txtkilo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtkiloActionPerformed(evt);
            }
        });

        txtvucutkitle.setToolTipText("");
        txtvucutkitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtvucutkitleActionPerformed(evt);
            }
        });

        btnhesapla.setIcon(new javax.swing.ImageIcon("C:\\Users\\rbarka.INNOVA\\Documents\\NetBeansProjects\\SporMerkeziUygulaması\\images\\hesapla.png")); // NOI18N
        btnhesapla.setText("Hesapla");
        btnhesapla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhesaplaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtkilo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
                            .addComponent(txtboy, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtyas, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtyagorani, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtbelcapi, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtvucutkitle)
                            .addComponent(txttarih, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnyenikayit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnkaydet)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnduzenle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnsil)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btncikis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnhesapla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txttarih, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtkilo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtboy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtyas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtyagorani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtbelcapi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtvucutkitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnyenikayit)
                    .addComponent(btnkaydet)
                    .addComponent(btnduzenle)
                    .addComponent(btnsil)
                    .addComponent(btnhesapla))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btncikis)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtkiloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtkiloActionPerformed
     
    }//GEN-LAST:event_txtkiloActionPerformed

    private void btnyenikayitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnyenikayitActionPerformed
        btnyenikayit.setEnabled(true);
        btnkaydet.setEnabled(false);
        btnduzenle.setEnabled(true);
        btnsil.setEnabled(true);
        btnhesapla.setEnabled(true);
        
        txttarih.setText("");
        txtbelcapi.setText("");
        txtboy.setText("");
        txtvucutkitle.setText("");
        txtyagorani.setText("");
        txtyas.setText("");
    }//GEN-LAST:event_btnyenikayitActionPerformed

    private void btnkaydetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkaydetActionPerformed
        tmpgeneltakip = new ModelGenelTakip();
        
        tmpgeneltakip.setBelcapi(txtbelcapi.getText());
        tmpgeneltakip.setBoy(txtboy.getText());
        tmpgeneltakip.setKilo(txtkilo.getText());
        tmpgeneltakip.setTarih(txttarih.getText());
        tmpgeneltakip.setVucutkitleendeksi(txtvucutkitle.getText());
        tmpgeneltakip.setYagorani(txtyagorani.getText());
        tmpgeneltakip.setYas(txtyas.getText());
        
        btnyenikayit.setEnabled(false);
        btnkaydet.setEnabled(true);
        btnduzenle.setEnabled(false);
        btnsil.setEnabled(false);
        btnhesapla.setEnabled(false);
        
    }//GEN-LAST:event_btnkaydetActionPerformed

    private void btncikisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncikisActionPerformed
        dispose();
    }//GEN-LAST:event_btncikisActionPerformed

    private void btnhesaplaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhesaplaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnhesaplaActionPerformed

    private void txtvucutkitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtvucutkitleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtvucutkitleActionPerformed

    private void txttarihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttarihActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttarihActionPerformed

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
            java.util.logging.Logger.getLogger(frmModelGenelTakip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmModelGenelTakip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmModelGenelTakip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmModelGenelTakip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmModelGenelTakip().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncikis;
    private javax.swing.JButton btnduzenle;
    private javax.swing.JButton btnhesapla;
    private javax.swing.JButton btnkaydet;
    private javax.swing.JButton btnsil;
    private javax.swing.JButton btnyenikayit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JFormattedTextField txtbelcapi;
    private javax.swing.JFormattedTextField txtboy;
    private javax.swing.JFormattedTextField txtkilo;
    private javax.swing.JFormattedTextField txttarih;
    private javax.swing.JFormattedTextField txtvucutkitle;
    private javax.swing.JFormattedTextField txtyagorani;
    private javax.swing.JFormattedTextField txtyas;
    // End of variables declaration//GEN-END:variables
}

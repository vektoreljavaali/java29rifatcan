/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formlar;

/**
 *
 * @author rbarka
 */
public class frmModelMainForm extends javax.swing.JFrame {

    /**
     * Creates new form frmModelMain
     */
    public frmModelMainForm() {
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

        jPanel1 = new javax.swing.JPanel();
        btnmusterikayit = new javax.swing.JButton();
        btnuyelikkayit = new javax.swing.JButton();
        btnegitimkarti = new javax.swing.JButton();
        btnsalonkayit = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        btnegiticikarti = new javax.swing.JButton();
        btnsporaletikayit = new javax.swing.JButton();
        btngidaicecek = new javax.swing.JButton();
        btncalisankayit = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        btnmusteritakipkarti = new javax.swing.JButton();
        btngenelraporlar = new javax.swing.JButton();
        btncikis = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ANA SAYFA");

        btnmusterikayit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/musteriKayit.png"))); // NOI18N
        btnmusterikayit.setText("Müşteri Kayıt");
        btnmusterikayit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnmusterikayit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmusterikayitActionPerformed(evt);
            }
        });

        btnuyelikkayit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/uyelikkarti.png"))); // NOI18N
        btnuyelikkayit.setText("Üyelik Kayıt");
        btnuyelikkayit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnuyelikkayit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnuyelikkayitActionPerformed(evt);
            }
        });

        btnegitimkarti.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/egitimkarti.png"))); // NOI18N
        btnegitimkarti.setText("Eğitim Kartı");
        btnegitimkarti.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnegitimkarti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnegitimkartiActionPerformed(evt);
            }
        });

        btnsalonkayit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/spor_salonu_kayit.png"))); // NOI18N
        btnsalonkayit.setText("Salon Kayıt");
        btnsalonkayit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnsalonkayit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalonkayitActionPerformed(evt);
            }
        });

        btnegiticikarti.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/egitici_karti.png"))); // NOI18N
        btnegiticikarti.setText("Eğitici Kartı");
        btnegiticikarti.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnegiticikarti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnegiticikartiActionPerformed(evt);
            }
        });

        btnsporaletikayit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/spor_aletleri.png"))); // NOI18N
        btnsporaletikayit.setText("Spor Aleti Kayıt");
        btnsporaletikayit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnsporaletikayit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsporaletikayitActionPerformed(evt);
            }
        });

        btngidaicecek.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gıda_icecek.png"))); // NOI18N
        btngidaicecek.setText("Gıda - İçecek Kayıt");
        btngidaicecek.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btngidaicecek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngidaicecekActionPerformed(evt);
            }
        });

        btncalisankayit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/calisan_kayit.png"))); // NOI18N
        btncalisankayit.setText("Çalışan Kayıt");
        btncalisankayit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btncalisankayit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncalisankayitActionPerformed(evt);
            }
        });

        btnmusteritakipkarti.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/musteri_takip_formu.png"))); // NOI18N
        btnmusteritakipkarti.setText("Müşteri Takip Kartı");
        btnmusteritakipkarti.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnmusteritakipkarti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmusteritakipkartiActionPerformed(evt);
            }
        });

        btngenelraporlar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/genel_raporlar.png"))); // NOI18N
        btngenelraporlar.setText("Genel Raporlar");
        btngenelraporlar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btngenelraporlar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngenelraporlarActionPerformed(evt);
            }
        });

        btncikis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cikis.png"))); // NOI18N
        btncikis.setText("Çıkış");
        btncikis.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btncikis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncikisActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addComponent(btnmusterikayit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnuyelikkayit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnegitimkarti, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnsalonkayit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnegiticikarti, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnsporaletikayit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btngidaicecek, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btncalisankayit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnmusteritakipkarti, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btngenelraporlar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btncikis, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnmusterikayit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnuyelikkayit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnegitimkarti)
                .addGap(4, 4, 4)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnsalonkayit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnegiticikarti)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnsporaletikayit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btngidaicecek)
                .addGap(4, 4, 4)
                .addComponent(btncalisankayit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnmusteritakipkarti)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btngenelraporlar)
                .addGap(48, 48, 48)
                .addComponent(btncikis)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnmusterikayit.getAccessibleContext().setAccessibleDescription("");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/spor-salonu-secimi.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 839, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnmusterikayitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmusterikayitActionPerformed
        frmModelMusteriKayitForm musterikayit = new frmModelMusteriKayitForm();
        musterikayit.setVisible(true);
    }//GEN-LAST:event_btnmusterikayitActionPerformed

    private void btnmusteritakipkartiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmusteritakipkartiActionPerformed
        frmModelMusteriTakipForm musteritakip = new frmModelMusteriTakipForm();
        musteritakip.setVisible(true);
        
    }//GEN-LAST:event_btnmusteritakipkartiActionPerformed

    private void btnuyelikkayitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnuyelikkayitActionPerformed
        frmModelUyelikKayit uyelikkayit = new frmModelUyelikKayit();
        uyelikkayit.setVisible(true);
    }//GEN-LAST:event_btnuyelikkayitActionPerformed

    private void btnegitimkartiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnegitimkartiActionPerformed
        frmModelEgitimKarti egitimkarti = new frmModelEgitimKarti();
        egitimkarti.setVisible(true);
    }//GEN-LAST:event_btnegitimkartiActionPerformed

    private void btnsalonkayitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalonkayitActionPerformed
       frmModelSalonKayit salonkayit = new frmModelSalonKayit();
       salonkayit.setVisible(true);
    }//GEN-LAST:event_btnsalonkayitActionPerformed

    private void btnegiticikartiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnegiticikartiActionPerformed
        frmModelEgiticiKarti egiticikarti = new frmModelEgiticiKarti();
        egiticikarti.setVisible(true);
    }//GEN-LAST:event_btnegiticikartiActionPerformed

    private void btnsporaletikayitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsporaletikayitActionPerformed
        frmModelSporAleti sporaletikayit = new frmModelSporAleti();
        sporaletikayit.setVisible(true);
    }//GEN-LAST:event_btnsporaletikayitActionPerformed

    private void btngidaicecekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngidaicecekActionPerformed
        frmModelGidaİcecek gidaicecek = new frmModelGidaİcecek();
        gidaicecek.setVisible(true);
    }//GEN-LAST:event_btngidaicecekActionPerformed

    private void btncalisankayitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncalisankayitActionPerformed
        frmModelCalisanKayit calisankayit = new frmModelCalisanKayit();
        calisankayit.setVisible(true);
    }//GEN-LAST:event_btncalisankayitActionPerformed

    private void btngenelraporlarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngenelraporlarActionPerformed
        frmModelGenelRaporlar genelraporlar = new frmModelGenelRaporlar();
        genelraporlar.setVisible(true);
        
    }//GEN-LAST:event_btngenelraporlarActionPerformed

    private void btncikisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncikisActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btncikisActionPerformed

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
            java.util.logging.Logger.getLogger(frmModelMainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmModelMainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmModelMainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmModelMainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmModelMainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncalisankayit;
    private javax.swing.JButton btncikis;
    private javax.swing.JButton btnegiticikarti;
    private javax.swing.JButton btnegitimkarti;
    private javax.swing.JButton btngenelraporlar;
    private javax.swing.JButton btngidaicecek;
    private javax.swing.JButton btnmusterikayit;
    private javax.swing.JButton btnmusteritakipkarti;
    private javax.swing.JButton btnsalonkayit;
    private javax.swing.JButton btnsporaletikayit;
    private javax.swing.JButton btnuyelikkayit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}

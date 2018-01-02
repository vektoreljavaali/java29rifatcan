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
public class frmModelCalisanKayit extends javax.swing.JFrame {

    /**
     * Creates new form frmModelCalisanKayit
     */
    public frmModelCalisanKayit() {
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
        txttckimlik = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtadi = new javax.swing.JTextField();
        txtsoyadi = new javax.swing.JTextField();
        txttelefon = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtadres = new javax.swing.JTextPane();
        btnyenikayit = new javax.swing.JButton();
        btnkayit = new javax.swing.JButton();
        btngeri = new javax.swing.JButton();
        btnileri = new javax.swing.JButton();
        btncikis = new javax.swing.JButton();
        btnduzenle = new javax.swing.JButton();
        btnsil = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ÇALIŞAN KAYIT FORMU");

        jLabel1.setText("T.C Kimlik No");

        try {
            txttckimlik.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txttckimlik.setToolTipText("");

        jLabel2.setText("Adı");

        jLabel3.setText("Soyadı");

        jLabel4.setText("Telefon");

        jLabel5.setText("Adres");

        txtadi.setToolTipText("");

        txtsoyadi.setToolTipText("");

        try {
            txttelefon.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("0 (###) - ### - ## - ##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jScrollPane1.setViewportView(txtadres);

        btnyenikayit.setIcon(new javax.swing.ImageIcon("C:\\Users\\rbarka.INNOVA\\Documents\\NetBeansProjects\\SporMerkeziUygulaması\\src\\images\\yenikayit.png")); // NOI18N
        btnyenikayit.setText("Yeni Kayıt");

        btnkayit.setIcon(new javax.swing.ImageIcon("C:\\Users\\rbarka.INNOVA\\Documents\\NetBeansProjects\\SporMerkeziUygulaması\\src\\images\\kayit.png")); // NOI18N
        btnkayit.setText("Kayıt");

        btngeri.setIcon(new javax.swing.ImageIcon("C:\\Users\\rbarka.INNOVA\\Documents\\NetBeansProjects\\SporMerkeziUygulaması\\src\\images\\geri_.png")); // NOI18N
        btngeri.setText("<<< Geri");

        btnileri.setIcon(new javax.swing.ImageIcon("C:\\Users\\rbarka.INNOVA\\Documents\\NetBeansProjects\\SporMerkeziUygulaması\\src\\images\\ileri.png")); // NOI18N
        btnileri.setText("İleri >>>");

        btncikis.setIcon(new javax.swing.ImageIcon("C:\\Users\\rbarka.INNOVA\\Documents\\NetBeansProjects\\SporMerkeziUygulaması\\src\\images\\cikis.png")); // NOI18N
        btncikis.setText("Çıkış");

        btnduzenle.setIcon(new javax.swing.ImageIcon("C:\\Users\\rbarka.INNOVA\\Documents\\NetBeansProjects\\SporMerkeziUygulaması\\src\\images\\düzenle.png")); // NOI18N
        btnduzenle.setText("Düzenle");

        btnsil.setIcon(new javax.swing.ImageIcon("C:\\Users\\rbarka.INNOVA\\Documents\\NetBeansProjects\\SporMerkeziUygulaması\\src\\images\\sil.png")); // NOI18N
        btnsil.setText("Sil");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txttckimlik)
                            .addComponent(txtadi)
                            .addComponent(txtsoyadi)
                            .addComponent(txttelefon, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                            .addComponent(jScrollPane1)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btncikis, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnyenikayit, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnkayit, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btngeri, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnileri)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnduzenle)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnsil, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txttckimlik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtadi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtsoyadi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txttelefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnyenikayit)
                    .addComponent(btnkayit)
                    .addComponent(btngeri)
                    .addComponent(btnileri)
                    .addComponent(btnduzenle)
                    .addComponent(btnsil))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btncikis)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            java.util.logging.Logger.getLogger(frmModelCalisanKayit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmModelCalisanKayit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmModelCalisanKayit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmModelCalisanKayit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmModelCalisanKayit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncikis;
    private javax.swing.JButton btnduzenle;
    private javax.swing.JButton btngeri;
    private javax.swing.JButton btnileri;
    private javax.swing.JButton btnkayit;
    private javax.swing.JButton btnsil;
    private javax.swing.JButton btnyenikayit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtadi;
    private javax.swing.JTextPane txtadres;
    private javax.swing.JTextField txtsoyadi;
    private javax.swing.JFormattedTextField txttckimlik;
    private javax.swing.JFormattedTextField txttelefon;
    // End of variables declaration//GEN-END:variables
}

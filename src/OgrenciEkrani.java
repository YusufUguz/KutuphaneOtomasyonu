
import java.awt.Frame;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class OgrenciEkrani extends javax.swing.JDialog {

    DefaultTableModel model;
    OgrenciIslemleri islemler = new OgrenciIslemleri();
    
    public OgrenciEkrani(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setTitle("Öğrenci İşlemleri");
        model=(DefaultTableModel)ogrenciTablo.getModel();
        ogrenciGoruntule();
        setResizable(false);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        anasayfaDönButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ogrenciTablo = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        ogrAdText = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        ogrNoText = new javax.swing.JTextField();
        aramaCubugu = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        ogrSoyadText = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        ogrEmailText = new javax.swing.JTextField();
        ogrGunButton = new javax.swing.JButton();
        ogrKaydetButton = new javax.swing.JButton();
        ogrSilButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(new java.awt.Point(230, 120));

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        jLabel1.setFont(new java.awt.Font("Zilla Slab SemiBold", 0, 36)); // NOI18N
        jLabel1.setText("Kütüphane Yönetim Sistemi");

        jLabel2.setFont(new java.awt.Font("Zilla Slab SemiBold", 0, 30)); // NOI18N
        jLabel2.setText("Öğrenci İşlemleri");

        anasayfaDönButton.setFont(new java.awt.Font("Zilla Slab SemiBold", 0, 14)); // NOI18N
        anasayfaDönButton.setText("Anasayfaya DÖN");
        anasayfaDönButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anasayfaDönButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(144, 144, 144)
                .addComponent(anasayfaDönButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(anasayfaDönButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(1045, 500));

        ogrenciTablo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Okul No", "Ad", "Soyad", "Email"
            }
        ));
        ogrenciTablo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ogrenciTabloMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ogrenciTablo);

        jLabel3.setFont(new java.awt.Font("Zilla Slab SemiBold", 0, 14)); // NOI18N
        jLabel3.setText("Ad:");

        jLabel4.setFont(new java.awt.Font("Zilla Slab SemiBold", 0, 14)); // NOI18N
        jLabel4.setText("Soyad:");

        aramaCubugu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                aramaCubuguKeyReleased(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Zilla Slab SemiBold", 0, 14)); // NOI18N
        jLabel5.setText("Okul NO:");

        jLabel6.setFont(new java.awt.Font("Zilla Slab SemiBold", 0, 14)); // NOI18N
        jLabel6.setText("Email:");

        ogrGunButton.setFont(new java.awt.Font("Zilla Slab SemiBold", 0, 14)); // NOI18N
        ogrGunButton.setText("Öğrenci GÜNCELLE");
        ogrGunButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ogrGunButtonActionPerformed(evt);
            }
        });

        ogrKaydetButton.setFont(new java.awt.Font("Zilla Slab SemiBold", 0, 14)); // NOI18N
        ogrKaydetButton.setText("Öğrenci KAYDET");
        ogrKaydetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ogrKaydetButtonActionPerformed(evt);
            }
        });

        ogrSilButton.setFont(new java.awt.Font("Zilla Slab SemiBold", 0, 14)); // NOI18N
        ogrSilButton.setText("Öğrenci SİL");
        ogrSilButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ogrSilButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(83, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 885, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ogrAdText, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ogrNoText, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(44, 44, 44)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ogrEmailText, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
                                    .addComponent(ogrSoyadText)))
                            .addComponent(aramaCubugu))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ogrGunButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ogrKaydetButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ogrSilButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(74, 74, 74))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ogrKaydetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ogrSoyadText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(ogrAdText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addComponent(ogrSilButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(ogrGunButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ogrNoText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ogrEmailText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(aramaCubugu, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void anasayfaDönButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anasayfaDönButtonActionPerformed
        Frame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
        AnasayfaEkrani anasayfaEkrani = new AnasayfaEkrani(frame,true);
        anasayfaEkrani.setLocationRelativeTo(null);
        setVisible(false);
        anasayfaEkrani.setVisible(true);
        
    }//GEN-LAST:event_anasayfaDönButtonActionPerformed

    private void ogrKaydetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ogrKaydetButtonActionPerformed
        
        String ogrNo = ogrNoText.getText();
        String ogrAd = ogrAdText.getText();
        String ogrSoyad = ogrSoyadText.getText();
        String ogrEmail = ogrEmailText.getText();
        
        if (ogrNo.isEmpty() || ogrAd.isEmpty() || ogrSoyad.isEmpty() || ogrEmail.isEmpty()) {
        // Eğer bir veya daha fazla alan boş ise, uyarı mesajı göster
        JOptionPane.showMessageDialog(this, "Lütfen tüm alanları doldurunuz.", "Uyarı", JOptionPane.WARNING_MESSAGE);
    } else {
        islemler.ogrKaydet(ogrNo,ogrAd,ogrSoyad,ogrEmail);
         ogrenciGoruntule();

         ogrSoyadText.setText("");
        ogrAdText.setText("");
        ogrNoText.setText("");
        ogrEmailText.setText("");
    }
        
        /*islemler.ogrKaydet(ogrNo,ogrAd,ogrSoyad,ogrEmail);
        ogrenciGoruntule();
        
        ogrSoyadText.setText("");
        ogrAdText.setText("");
        ogrNoText.setText("");
        ogrEmailText.setText("");*/
        
        
        
        
    }//GEN-LAST:event_ogrKaydetButtonActionPerformed

    private void ogrSilButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ogrSilButtonActionPerformed
        
        int selectedRow = ogrenciTablo.getSelectedRow();
        
        if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Lütfen bir satır seçin.", "Hata", JOptionPane.ERROR_MESSAGE);
        return;
    }
        
        int id = (int) model.getValueAt(selectedRow,0);
        islemler.ogrSil(id);
        ogrenciGoruntule();
        
        ogrSoyadText.setText("");
        ogrAdText.setText("");
        ogrNoText.setText("");
        ogrEmailText.setText("");
        
        
    }//GEN-LAST:event_ogrSilButtonActionPerformed

    private void ogrenciTabloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ogrenciTabloMouseClicked
        
        int selectedRow = ogrenciTablo.getSelectedRow();
        ogrNoText.setText((String)model.getValueAt(selectedRow,1));      
        ogrAdText.setText((String)model.getValueAt(selectedRow,2));
        ogrSoyadText.setText((String)model.getValueAt(selectedRow,3));
        ogrEmailText.setText((String)model.getValueAt(selectedRow,4));
        
    }//GEN-LAST:event_ogrenciTabloMouseClicked

    private void aramaCubuguKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_aramaCubuguKeyReleased
        
        String ara=aramaCubugu.getText();
        dinamikAra(ara);
        
    }//GEN-LAST:event_aramaCubuguKeyReleased

    private void ogrGunButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ogrGunButtonActionPerformed
        
        String ogrNo = ogrNoText.getText();
        String ogrAd = ogrAdText.getText();
        String ogrSoyad = ogrSoyadText.getText();
        String ogrEmail = ogrEmailText.getText();
        
        int selectedrow = ogrenciTablo.getSelectedRow();
        
        if (selectedrow == -1) {
        JOptionPane.showMessageDialog(this, "Lütfen bir satır seçin.", "Hata", JOptionPane.ERROR_MESSAGE);
        return;
    }
        
        int selectedRow = ogrenciTablo.getSelectedRow();
        
        if (ogrNo.isEmpty() ||  ogrAd.isEmpty() || ogrSoyad.isEmpty() || ogrEmail.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Lütfen tüm alanları doldurun.", "Uyarı", JOptionPane.WARNING_MESSAGE);
        return;
    }
        
        int id = (int) model.getValueAt(selectedRow,0);
        islemler.ogrGuncelle(id, ogrNo, ogrNo, ogrAd, ogrSoyad, ogrEmail);
        ogrenciGoruntule();
        
        ogrSoyadText.setText("");
        ogrAdText.setText("");
        ogrNoText.setText("");
        ogrEmailText.setText("");
        
        
    }//GEN-LAST:event_ogrGunButtonActionPerformed

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
            java.util.logging.Logger.getLogger(OgrenciEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OgrenciEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OgrenciEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OgrenciEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                OgrenciEkrani dialog = new OgrenciEkrani(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton anasayfaDönButton;
    private javax.swing.JTextField aramaCubugu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField ogrAdText;
    private javax.swing.JTextField ogrEmailText;
    private javax.swing.JButton ogrGunButton;
    private javax.swing.JButton ogrKaydetButton;
    private javax.swing.JTextField ogrNoText;
    private javax.swing.JButton ogrSilButton;
    private javax.swing.JTextField ogrSoyadText;
    private javax.swing.JTable ogrenciTablo;
    // End of variables declaration//GEN-END:variables

private void ogrenciGoruntule(){
   
    model.setRowCount(0);
    ArrayList<Ogrenci> ogrenciler = new ArrayList();
    ogrenciler = islemler.ogrenciGetir();
    
    if(ogrenciler != null){
        
        for(Ogrenci ogrenci : ogrenciler){
            
            Object[] eklenecek = {ogrenci.getId(),ogrenci.getOkulNo(),ogrenci.getAd(),ogrenci.getSoyad(),ogrenci.getEmail()};
            model.addRow(eklenecek);
            
        }
   
    }

}

    private void dinamikAra(String ara) {
        
        TableRowSorter <DefaultTableModel> tr = new TableRowSorter(model);
        ogrenciTablo.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(ara));
    }
}

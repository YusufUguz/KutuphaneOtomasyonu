import java.awt.Frame;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


public class KitapIslemleriEkrani extends javax.swing.JDialog {
    DefaultTableModel model;
    KitapIslemleri islemler = new KitapIslemleri();

    public KitapIslemleriEkrani(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setTitle("Kitap İşlemleri");
        model = (DefaultTableModel) KitapTablo.getModel();
        kitaplariGoruntule();
        setResizable(false);
    }
 
    @SuppressWarnings("unchecked")
    
    public void dinamikAra(String ara){
        
        TableRowSorter <DefaultTableModel> tr = new TableRowSorter(model);
        KitapTablo.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(ara));
 
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        AnasayfaDonButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        KitapTablo = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        kitapYazarText = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        kitapSayfaText = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        kitapAdText = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        kitapTurText = new javax.swing.JTextField();
        kitapGunButton = new javax.swing.JButton();
        kitapSilButton = new javax.swing.JButton();
        kitapKayitButton = new javax.swing.JButton();
        aramaCubugu = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(new java.awt.Point(250, 120));
        setPreferredSize(new java.awt.Dimension(975, 650));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(920, 600));

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));

        jLabel1.setFont(new java.awt.Font("Zilla Slab SemiBold", 0, 36)); // NOI18N
        jLabel1.setText("Kütüphane Yönetim Sistemi");

        jLabel2.setFont(new java.awt.Font("Zilla Slab SemiBold", 0, 30)); // NOI18N
        jLabel2.setText("Kitap İşlemleri");

        AnasayfaDonButton.setFont(new java.awt.Font("Zilla Slab SemiBold", 0, 14)); // NOI18N
        AnasayfaDonButton.setText("Anasayfaya DÖN");
        AnasayfaDonButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnasayfaDonButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(94, 94, 94)
                .addComponent(AnasayfaDonButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(AnasayfaDonButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        KitapTablo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kitap ID", "Kitap Adı", "Kitap Yazarı", "Kitap Türü", "Kitap Sayfası"
            }
        ));
        KitapTablo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KitapTabloMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(KitapTablo);

        jLabel3.setFont(new java.awt.Font("Zilla Slab SemiBold", 0, 14)); // NOI18N
        jLabel3.setText("Kitap Adı:");

        kitapYazarText.setFont(new java.awt.Font("Zilla Slab SemiBold", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Zilla Slab SemiBold", 0, 14)); // NOI18N
        jLabel4.setText("Kitabın Yazarı:");

        kitapSayfaText.setFont(new java.awt.Font("Zilla Slab SemiBold", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Zilla Slab SemiBold", 0, 14)); // NOI18N
        jLabel5.setText("Kitabın Sayfası:");

        kitapAdText.setFont(new java.awt.Font("Zilla Slab SemiBold", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Zilla Slab SemiBold", 0, 14)); // NOI18N
        jLabel6.setText("Kitabın Türü:");

        kitapTurText.setFont(new java.awt.Font("Zilla Slab SemiBold", 0, 14)); // NOI18N

        kitapGunButton.setFont(new java.awt.Font("Zilla Slab SemiBold", 0, 14)); // NOI18N
        kitapGunButton.setText("Kitap GÜNCELLE");
        kitapGunButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kitapGunButtonActionPerformed(evt);
            }
        });

        kitapSilButton.setFont(new java.awt.Font("Zilla Slab SemiBold", 0, 14)); // NOI18N
        kitapSilButton.setText("Kitap SİL");
        kitapSilButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kitapSilButtonActionPerformed(evt);
            }
        });

        kitapKayitButton.setFont(new java.awt.Font("Zilla Slab SemiBold", 0, 14)); // NOI18N
        kitapKayitButton.setText("Kitap KAYDET");
        kitapKayitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kitapKayitButtonActionPerformed(evt);
            }
        });

        aramaCubugu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                aramaCubuguKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(kitapYazarText))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(kitapAdText, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(36, 36, 36)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(kitapSayfaText, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(kitapTurText))))
                            .addComponent(aramaCubugu))
                        .addGap(52, 52, 52)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(kitapKayitButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kitapSilButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kitapGunButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kitapAdText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kitapTurText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kitapKayitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kitapYazarText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kitapSayfaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(kitapSilButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kitapGunButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aramaCubugu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 975, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 623, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kitapSilButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kitapSilButtonActionPerformed

        int selectedRow = KitapTablo.getSelectedRow();
        
        if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Lütfen bir satır seçin.", "Hata", JOptionPane.ERROR_MESSAGE);
        return;
    }
        
        int id = (int) model.getValueAt(selectedRow,0);
        islemler.kitapSil(id);
        kitaplariGoruntule();
        
        kitapAdText.setText("");
        kitapYazarText.setText("");
        kitapSayfaText.setText("");
        kitapTurText.setText("");

    }//GEN-LAST:event_kitapSilButtonActionPerformed

    private void kitapKayitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kitapKayitButtonActionPerformed
        
        
        String kitapAdi = kitapAdText.getText();
        String kitapYazari = kitapYazarText.getText();
        String kitapTuru = kitapTurText.getText();
        String kitapSayfasi = kitapSayfaText.getText();
        
       if (kitapAdi.isEmpty() || kitapYazari.isEmpty() || kitapTuru.isEmpty() || kitapSayfasi.isEmpty()) {
        // Eğer bir veya daha fazla alan boş ise, uyarı mesajı göster
        JOptionPane.showMessageDialog(this, "Lütfen tüm alanları doldurunuz.", "Uyarı", JOptionPane.WARNING_MESSAGE);
    } else {
        islemler.kitapKaydet(kitapAdi, kitapYazari, kitapSayfasi, kitapTuru);
        kitaplariGoruntule();

        kitapAdText.setText("");
        kitapYazarText.setText("");
        kitapSayfaText.setText("");
        kitapTurText.setText("");
    }
        
        
        /*islemler.kitapKaydet(kitapAdi,kitapYazari,kitapSayfasi,kitapTuru);
        kitaplariGoruntule();
        
        kitapAdText.setText("");
        kitapYazarText.setText("");
        kitapSayfaText.setText("");
        kitapTurText.setText("");*/

        
    }//GEN-LAST:event_kitapKayitButtonActionPerformed

    private void AnasayfaDonButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnasayfaDonButtonActionPerformed
        
        Frame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
        AnasayfaEkrani anasayfaEkrani = new AnasayfaEkrani(frame,true);
        anasayfaEkrani.setLocationRelativeTo(null);
        setVisible(false);
        anasayfaEkrani.setVisible(true);
        
        
        
    }//GEN-LAST:event_AnasayfaDonButtonActionPerformed

    private void aramaCubuguKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_aramaCubuguKeyReleased
        
        String ara = aramaCubugu.getText();        
        dinamikAra(ara);
    }//GEN-LAST:event_aramaCubuguKeyReleased

    private void KitapTabloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KitapTabloMouseClicked
        
        int selectedRow = KitapTablo.getSelectedRow();
        kitapAdText.setText((String) model.getValueAt(selectedRow,1));
        kitapYazarText.setText((String) model.getValueAt(selectedRow,2));
        kitapTurText.setText((String) model.getValueAt(selectedRow,3));
        kitapSayfaText.setText((String) model.getValueAt(selectedRow,4));

        
    }//GEN-LAST:event_KitapTabloMouseClicked

    private void kitapGunButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kitapGunButtonActionPerformed
        
        String kitapAdi = kitapAdText.getText();
        String kitapYazari = kitapYazarText.getText();
        String kitapSayfasi = kitapSayfaText.getText();
        String kitapTuru = kitapTurText.getText();
        
        int selectedrow = KitapTablo.getSelectedRow();
        
        if (selectedrow == -1) {
        JOptionPane.showMessageDialog(this, "Lütfen bir satır seçin.", "Hata", JOptionPane.ERROR_MESSAGE);
        return;
    }
    
        int id = (int) model.getValueAt(selectedrow,0);
        if (kitapAdi.isEmpty() || kitapYazari.isEmpty() || kitapSayfasi.isEmpty() || kitapTuru.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Lütfen tüm alanları doldurun.", "Uyarı", JOptionPane.WARNING_MESSAGE);
        return;
    }
        islemler.kitapGuncelle(id,kitapAdi,kitapYazari,kitapSayfasi,kitapTuru);
        kitaplariGoruntule();
        
        
        
        kitapAdText.setText("");
        kitapYazarText.setText("");
        kitapSayfaText.setText("");
        kitapTurText.setText("");
        
        
    }//GEN-LAST:event_kitapGunButtonActionPerformed

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
            java.util.logging.Logger.getLogger(KitapIslemleriEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KitapIslemleriEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KitapIslemleriEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KitapIslemleriEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                KitapIslemleriEkrani dialog = new KitapIslemleriEkrani(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton AnasayfaDonButton;
    private javax.swing.JTable KitapTablo;
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
    private javax.swing.JTextField kitapAdText;
    private javax.swing.JButton kitapGunButton;
    private javax.swing.JButton kitapKayitButton;
    private javax.swing.JTextField kitapSayfaText;
    private javax.swing.JButton kitapSilButton;
    private javax.swing.JTextField kitapTurText;
    private javax.swing.JTextField kitapYazarText;
    // End of variables declaration//GEN-END:variables

    private void kitaplariGoruntule() {
        model.setRowCount(0);
        ArrayList <Kitap> kitaplar = new ArrayList();
        kitaplar = islemler.kitaplariGetir();
        
        if(kitaplar!=null){
            
            for(Kitap kitap : kitaplar){
                
                Object[] eklenecek = {kitap.getId(),kitap.getKitapAdi(),kitap.getKitabinYazari(),kitap.getKitabinTuru(),kitap.getKitabinSayfasi()};
                model.addRow(eklenecek);
                
            }
            
        }
        
        
    }
}

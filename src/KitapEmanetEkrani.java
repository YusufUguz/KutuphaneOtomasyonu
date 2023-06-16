
import java.awt.Frame;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


public class KitapEmanetEkrani extends javax.swing.JDialog {
    
    DefaultTableModel model;
    DefaultTableModel model2;
    KitapEmanet islemler = new KitapEmanet();
    

    
    public KitapEmanetEkrani(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setTitle("Kitap Emanet İşlemleri");
        model=(DefaultTableModel)kitapTablo.getModel();
        model2=(DefaultTableModel)emanetTablo.getModel();
        kitaplariGoruntule();
        emanetGoruntule();
        setResizable(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        anasayfaDonButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        kitapTablo = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        emanetTablo = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        emanetKitapText = new javax.swing.JTextField();
        emanetOgrNoText = new javax.swing.JTextField();
        kitapAramaCubugu = new javax.swing.JTextField();
        emanetAramaCubugu = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        emanetTtext = new com.toedter.calendar.JDateChooser();
        STTtext = new com.toedter.calendar.JDateChooser();
        emanetSilButton = new javax.swing.JButton();
        emanetVerButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(new java.awt.Point(230, 50));

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        jLabel1.setFont(new java.awt.Font("Zilla Slab SemiBold", 0, 36)); // NOI18N
        jLabel1.setText("Kütüphane Yönetim Sistemi");

        jLabel2.setFont(new java.awt.Font("Zilla Slab SemiBold", 0, 30)); // NOI18N
        jLabel2.setText("Kitap Emanet İşlemleri");

        anasayfaDonButton.setText("Anasayfaya DÖN");
        anasayfaDonButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anasayfaDonButtonActionPerformed(evt);
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
                .addGap(140, 140, 140)
                .addComponent(anasayfaDonButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(anasayfaDonButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        kitapTablo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Kitap Adı", "Kİtap Yazarı", "Kitap Türü", "Kitap Sayfası"
            }
        ));
        kitapTablo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kitapTabloMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(kitapTablo);

        emanetTablo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Öğrenci No", "Kitap", "Emanet Tarihi", "Son Teslim Tarihi"
            }
        ));
        jScrollPane2.setViewportView(emanetTablo);

        jLabel3.setFont(new java.awt.Font("Zilla Slab SemiBold", 0, 15)); // NOI18N
        jLabel3.setText("Öğrenci Okul No:");

        jLabel4.setFont(new java.awt.Font("Zilla Slab SemiBold", 0, 15)); // NOI18N
        jLabel4.setText("Verilen Kitap Adı:");

        kitapAramaCubugu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                kitapAramaCubuguKeyReleased(evt);
            }
        });

        emanetAramaCubugu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                emanetAramaCubuguKeyReleased(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Zilla Slab SemiBold", 0, 15)); // NOI18N
        jLabel5.setText("Emanet Tarihi:");

        jLabel6.setFont(new java.awt.Font("Zilla Slab SemiBold", 0, 15)); // NOI18N
        jLabel6.setText("Son Teslim Tarihi:");

        emanetSilButton.setText("Emaneti SİL");
        emanetSilButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emanetSilButtonActionPerformed(evt);
            }
        });

        emanetVerButton.setText("Emanet VER");
        emanetVerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emanetVerButtonActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Zilla Slab SemiBold", 0, 18)); // NOI18N
        jLabel7.setText("Emanet Listesi");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(kitapAramaCubugu, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(emanetVerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(emanetSilButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(STTtext, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(emanetTtext, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(emanetOgrNoText))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(emanetKitapText, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(emanetAramaCubugu, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2))
                .addContainerGap(35, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(211, 211, 211))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(emanetOgrNoText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emanetAramaCubugu))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(emanetKitapText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emanetTtext, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(STTtext, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(emanetSilButton)
                            .addComponent(emanetVerButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(kitapAramaCubugu, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2))
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
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void emanetSilButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emanetSilButtonActionPerformed
        
        int selectedRow = emanetTablo.getSelectedRow();
        if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Lütfen bir satır seçin.", "Hata", JOptionPane.ERROR_MESSAGE);
        return;
    }
        String okulNo = (String) model2.getValueAt(selectedRow,0);
        islemler.emanetSil(okulNo);
        emanetGoruntule();
        
        emanetOgrNoText.setText("");
        emanetKitapText.setText("");
        
  
    }//GEN-LAST:event_emanetSilButtonActionPerformed

    private void kitapTabloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kitapTabloMouseClicked
        int selectedRow = kitapTablo.getSelectedRow();
        emanetKitapText.setText((String)model.getValueAt(selectedRow,1));
        
    }//GEN-LAST:event_kitapTabloMouseClicked

    private void emanetVerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emanetVerButtonActionPerformed
        
        String okulNo = emanetOgrNoText.getText();
        String emanetKitap = emanetKitapText.getText();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        String emanetTarihi = sdf.format(emanetTtext.getDate());
        String sonTeslimTarihi = sdf.format(STTtext.getDate());
        //String emanetTarihi = emanetTtext.getDateFormatString();
        //String sonTeslimTarihi = STTtext.getDateFormatString();
        
        
        
        islemler.emanetVer(okulNo,emanetKitap,emanetTarihi,sonTeslimTarihi);
        emanetGoruntule();
        
        emanetOgrNoText.setText("");
        emanetKitapText.setText("");
        
        
    }//GEN-LAST:event_emanetVerButtonActionPerformed

    private void kitapAramaCubuguKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_kitapAramaCubuguKeyReleased
        String ara = kitapAramaCubugu.getText();        
        dinamikAraKitap(ara);
    }//GEN-LAST:event_kitapAramaCubuguKeyReleased

    private void emanetAramaCubuguKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emanetAramaCubuguKeyReleased
        
        String ara = emanetAramaCubugu.getText();        
        dinamikAraEmanet(ara);
        
        
    }//GEN-LAST:event_emanetAramaCubuguKeyReleased

    private void anasayfaDonButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anasayfaDonButtonActionPerformed
        Frame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
        AnasayfaEkrani anasayfaEkrani = new AnasayfaEkrani(frame,true);
        anasayfaEkrani.setLocationRelativeTo(null);
        setVisible(false);
        anasayfaEkrani.setVisible(true);
    }//GEN-LAST:event_anasayfaDonButtonActionPerformed

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
            java.util.logging.Logger.getLogger(KitapEmanetEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KitapEmanetEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KitapEmanetEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KitapEmanetEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                KitapEmanetEkrani dialog = new KitapEmanetEkrani(new javax.swing.JFrame(), true);
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
    private com.toedter.calendar.JDateChooser STTtext;
    private javax.swing.JButton anasayfaDonButton;
    private javax.swing.JTextField emanetAramaCubugu;
    private javax.swing.JTextField emanetKitapText;
    private javax.swing.JTextField emanetOgrNoText;
    private javax.swing.JButton emanetSilButton;
    private javax.swing.JTable emanetTablo;
    private com.toedter.calendar.JDateChooser emanetTtext;
    private javax.swing.JButton emanetVerButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField kitapAramaCubugu;
    private javax.swing.JTable kitapTablo;
    // End of variables declaration//GEN-END:variables

    private void dinamikAraKitap(String ara) {
        
        TableRowSorter <DefaultTableModel> tr = new TableRowSorter(model);
        kitapTablo.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(ara));
        
        
    }
    private void dinamikAraEmanet(String ara) {
        
        TableRowSorter <DefaultTableModel> tr = new TableRowSorter(model2);
        emanetTablo.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(ara));
        
        
    }

    private void kitaplariGoruntule() {
        
        model.setRowCount(0);
        ArrayList<Kitap> kitaplar = new ArrayList();
        kitaplar=islemler.kitaplariGetir();
        
        if(kitaplar!=null){
            
            for(Kitap kitap : kitaplar){
                
                Object[] eklenecek = {kitap.getId(),kitap.getKitapAdi(),kitap.getKitabinYazari(),kitap.getKitabinTuru(),kitap.getKitabinSayfasi()};
                model.addRow(eklenecek);
                
            }
            
        }
         
    }

    private void emanetGoruntule() {
        model2.setRowCount(0);
        ArrayList<Emanet> emanetler = new ArrayList();
        emanetler = islemler.emanetleriGetir();
        
        if(emanetler != null){
            for(Emanet emanet : emanetler){
                Object[] eklenecek = {emanet.getOkulNo(),emanet.getEmanetKitap(),emanet.getEmanetTarihi(),emanet.getSonTeslimTarihi()};
                model2.addRow(eklenecek);
            }
        }
    }
}

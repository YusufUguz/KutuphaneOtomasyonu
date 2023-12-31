
import java.awt.Frame;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class IadeEkrani extends javax.swing.JDialog {

    DefaultTableModel model1;
    DefaultTableModel model2;
    KitapIade islemler = new KitapIade();
    
    
    public IadeEkrani(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
         model1=(DefaultTableModel)emanettablo.getModel();
         model2=(DefaultTableModel)iadeTablo.getModel();
         emanetGoruntule();
         iadeGoruntule();
         setResizable(false);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        anasayfaDonButton = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        emanettablo = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        iadeTablo = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        iadeAramaCubugu = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        iadeOgrNoText = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        iadeKitapText = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        iadeEmanetDate = new com.toedter.calendar.JDateChooser();
        jLabel17 = new javax.swing.JLabel();
        iadeTeslimDate = new com.toedter.calendar.JDateChooser();
        iadeSilButton = new javax.swing.JButton();
        iadeKaydetButton = new javax.swing.JButton();
        emanetAramaCubugu2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setLocation(new java.awt.Point(230, 50));

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        jLabel1.setFont(new java.awt.Font("Zilla Slab SemiBold", 0, 36)); // NOI18N
        jLabel1.setText("Kütüphane Yönetim Sistemi");

        jLabel2.setFont(new java.awt.Font("Zilla Slab SemiBold", 0, 30)); // NOI18N
        jLabel2.setText("Kitap İade İşlemleri");

        anasayfaDonButton.setFont(new java.awt.Font("Zilla Slab SemiBold", 0, 14)); // NOI18N
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
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(130, 130, 130)
                .addComponent(anasayfaDonButton, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(anasayfaDonButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        emanettablo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Öğrenci No", "Emanet Kitap", "Emanet Tarihi", "Son Teslim Tarihi"
            }
        ));
        emanettablo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                emanettabloMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(emanettablo);

        iadeTablo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Okul No", "Emanet Kitap", "Emanet Tarihi", "Teslim Tarihi"
            }
        ));
        iadeTablo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iadeTabloMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(iadeTablo);

        jLabel13.setFont(new java.awt.Font("Zilla Slab SemiBold", 0, 18)); // NOI18N
        jLabel13.setText("İade Listesi");

        iadeAramaCubugu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iadeAramaCubuguActionPerformed(evt);
            }
        });
        iadeAramaCubugu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                iadeAramaCubuguKeyReleased(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Zilla Slab SemiBold", 0, 14)); // NOI18N
        jLabel14.setText("Öğrenci Okul No:");

        jLabel15.setFont(new java.awt.Font("Zilla Slab SemiBold", 0, 14)); // NOI18N
        jLabel15.setText("Emanet Verilmiş Kitap:");

        jLabel16.setFont(new java.awt.Font("Zilla Slab SemiBold", 0, 15)); // NOI18N
        jLabel16.setText("Emanet Tarihi:");

        jLabel17.setFont(new java.awt.Font("Zilla Slab SemiBold", 0, 15)); // NOI18N
        jLabel17.setText("Teslim Tarihi:");

        iadeSilButton.setText("İadeyi SİL");
        iadeSilButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iadeSilButtonActionPerformed(evt);
            }
        });

        iadeKaydetButton.setText("İadeyi KAYDET");
        iadeKaydetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iadeKaydetButtonActionPerformed(evt);
            }
        });

        emanetAramaCubugu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emanetAramaCubugu2ActionPerformed(evt);
            }
        });
        emanetAramaCubugu2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                emanetAramaCubugu2KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(iadeOgrNoText, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel13)
                        .addGap(217, 217, 217))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(emanetAramaCubugu2, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(iadeKaydetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(iadeSilButton, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                    .addComponent(jLabel17)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(iadeTeslimDate, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(jLabel16)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(iadeEmanetDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(jLabel15)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(iadeKitapText, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(iadeAramaCubugu)
                            .addComponent(jScrollPane6))
                        .addGap(46, 46, 46))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(iadeOgrNoText, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(iadeAramaCubugu, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane6))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(iadeKitapText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel16)
                            .addComponent(iadeEmanetDate, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(iadeTeslimDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(iadeKaydetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(iadeSilButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(emanetAramaCubugu2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void anasayfaDonButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anasayfaDonButtonActionPerformed
        Frame frame = (JFrame)SwingUtilities.getWindowAncestor(this);
        AnasayfaEkrani ekran = new AnasayfaEkrani(frame,true);
        ekran.setLocationRelativeTo(null);
        setVisible(false);
        ekran.setVisible(true);
    }//GEN-LAST:event_anasayfaDonButtonActionPerformed

    private void emanettabloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emanettabloMouseClicked
        
        int selectedRow = emanettablo.getSelectedRow();
        iadeOgrNoText.setText((String)model1.getValueAt(selectedRow,0));
        iadeKitapText.setText((String)model1.getValueAt(selectedRow,1));

    }//GEN-LAST:event_emanettabloMouseClicked
//String ara = emanetAramaCubugu2.getText();        
        //dinamikAraEmanet(ara);
    private void emanetAramaCubugu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emanetAramaCubugu2ActionPerformed
        //String ara = emanetAramaCubugu2.getText();        
        //dinamikAraEmanet(ara);
    }//GEN-LAST:event_emanetAramaCubugu2ActionPerformed

    private void iadeAramaCubuguActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iadeAramaCubuguActionPerformed
     
    }//GEN-LAST:event_iadeAramaCubuguActionPerformed

    private void iadeTabloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iadeTabloMouseClicked
        
        
        
    }//GEN-LAST:event_iadeTabloMouseClicked

    private void emanetAramaCubugu2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emanetAramaCubugu2KeyReleased
        String ara = emanetAramaCubugu2.getText();        
        dinamikAraEmanet(ara);
    }//GEN-LAST:event_emanetAramaCubugu2KeyReleased

    private void iadeAramaCubuguKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_iadeAramaCubuguKeyReleased
        String ara = iadeAramaCubugu.getText();        
         dinamikAraIade(ara);
    }//GEN-LAST:event_iadeAramaCubuguKeyReleased

    private void iadeKaydetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iadeKaydetButtonActionPerformed
        
        String okulNo = iadeOgrNoText.getText();
        String iadeKitap = iadeKitapText.getText();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        String emanetTarihi = sdf.format(iadeEmanetDate.getDate());
        String teslimTarihi = sdf.format(iadeTeslimDate.getDate());
        
        islemler.iadeKaydet(okulNo,iadeKitap,emanetTarihi,teslimTarihi);
        iadeGoruntule();
        
        iadeOgrNoText.setText("");
        iadeKitapText.setText("");
        
        int selectedRow2 = emanettablo.getSelectedRow();        
        String okulNo2 = (String) model1.getValueAt(selectedRow2,0);
        islemler.emanetSil(okulNo2);
        emanetGoruntule();
        
        
        
    }//GEN-LAST:event_iadeKaydetButtonActionPerformed

    private void iadeSilButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iadeSilButtonActionPerformed
        
        int selectedRow = iadeTablo.getSelectedRow();
        
        if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Lütfen bir satır seçin.", "Hata", JOptionPane.ERROR_MESSAGE);
        return;
    }
        String okulNo = (String) model2.getValueAt(selectedRow,0);
        islemler.iadeSil(okulNo);
        iadeGoruntule();
        
        iadeOgrNoText.setText("");
        iadeKitapText.setText("");
        
        
        
    }//GEN-LAST:event_iadeSilButtonActionPerformed

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
            java.util.logging.Logger.getLogger(IadeEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IadeEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IadeEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IadeEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                IadeEkrani dialog = new IadeEkrani(new javax.swing.JFrame(), true);
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
    private com.toedter.calendar.JDateChooser STTtext1;
    private javax.swing.JButton anasayfaDonButton;
    private javax.swing.JTextField emanetAramaCubugu;
    private javax.swing.JTextField emanetAramaCubugu1;
    private javax.swing.JTextField emanetAramaCubugu2;
    private javax.swing.JTextField emanetKitapText;
    private javax.swing.JTextField emanetKitapText1;
    private javax.swing.JTextField emanetOgrNoText;
    private javax.swing.JTextField emanetOgrNoText1;
    private javax.swing.JButton emanetSilButton;
    private javax.swing.JButton emanetSilButton1;
    private javax.swing.JTable emanetTablo;
    private javax.swing.JTable emanetTablo1;
    private com.toedter.calendar.JDateChooser emanetTtext;
    private com.toedter.calendar.JDateChooser emanetTtext1;
    private javax.swing.JButton emanetVerButton;
    private javax.swing.JButton emanetVerButton1;
    private javax.swing.JTable emanettablo;
    private javax.swing.JTextField iadeAramaCubugu;
    private com.toedter.calendar.JDateChooser iadeEmanetDate;
    private javax.swing.JButton iadeKaydetButton;
    private javax.swing.JTextField iadeKitapText;
    private javax.swing.JTextField iadeOgrNoText;
    private javax.swing.JButton iadeSilButton;
    private javax.swing.JTable iadeTablo;
    private com.toedter.calendar.JDateChooser iadeTeslimDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTextField kitapAramaCubugu;
    private javax.swing.JTextField kitapAramaCubugu1;
    private javax.swing.JTable kitapTablo;
    private javax.swing.JTable kitapTablo1;
    // End of variables declaration//GEN-END:variables

    private void emanetGoruntule() {
        
        model1.setRowCount(0);
        ArrayList<Emanet> emanetler = new ArrayList();
        emanetler = islemler.emanetleriGetir();
        
        if(emanetler != null){
            for(Emanet emanet : emanetler){
                Object[] eklenecek = {emanet.getOkulNo(),emanet.getEmanetKitap(),emanet.getEmanetTarihi(),emanet.getSonTeslimTarihi()};
                model1.addRow(eklenecek);
            }
        }
    }
        

    private void iadeGoruntule() {
        model2.setRowCount(0);
        ArrayList<Iade> iadeler = new ArrayList();
        iadeler = islemler.iadeleriGetir();
        
        if(iadeler != null){
            for(Iade iade : iadeler){
                Object[] eklenecek = {iade.getOkulNo(),iade.getEmanetKitap(),iade.getEmanetTarihi(),iade.getTeslimTarihi()};
                model2.addRow(eklenecek);
            }
        }
    }
    

    private void dinamikAraEmanet(String ara) {
        
        TableRowSorter <DefaultTableModel> tr = new TableRowSorter(model1);
        emanettablo.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(ara));
    }

    private void dinamikAraIade(String ara) {
        TableRowSorter <DefaultTableModel> tr = new TableRowSorter(model2);
        iadeTablo.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(ara));
    }
}

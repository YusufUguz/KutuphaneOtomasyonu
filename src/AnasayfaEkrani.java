
import java.awt.Frame;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;


public class AnasayfaEkrani extends javax.swing.JDialog {
    
    KitapIslemleri islemler = new KitapIslemleri();
    OgrenciIslemleri ogrislemler = new OgrenciIslemleri();
 
    public AnasayfaEkrani(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setTitle("Anasayfa");
        setResizable(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        emanetButton = new javax.swing.JButton();
        ogrenciIsButton = new javax.swing.JButton();
        iadeButton = new javax.swing.JButton();
        kitapIsButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(new java.awt.Point(230, 120));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));

        jLabel1.setFont(new java.awt.Font("Zilla Slab SemiBold", 0, 36)); // NOI18N
        jLabel1.setText("Kütüphane Yönetim Sistemi");

        jLabel2.setFont(new java.awt.Font("Zilla Slab SemiBold", 0, 36)); // NOI18N
        jLabel2.setText("Anasayfa");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(453, 453, 453)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(297, 297, 297))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        emanetButton.setFont(new java.awt.Font("Zilla Slab SemiBold", 0, 18)); // NOI18N
        emanetButton.setText("Kitap Emanet İşlemleri");
        emanetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emanetButtonActionPerformed(evt);
            }
        });

        ogrenciIsButton.setFont(new java.awt.Font("Zilla Slab SemiBold", 0, 18)); // NOI18N
        ogrenciIsButton.setText("Öğrenci İşlemleri");
        ogrenciIsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ogrenciIsButtonActionPerformed(evt);
            }
        });

        iadeButton.setFont(new java.awt.Font("Zilla Slab SemiBold", 0, 18)); // NOI18N
        iadeButton.setText("Kitap İade İşlemleri");
        iadeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iadeButtonActionPerformed(evt);
            }
        });

        kitapIsButton.setFont(new java.awt.Font("Zilla Slab SemiBold", 0, 18)); // NOI18N
        kitapIsButton.setText("Kitap İşlemleri");
        kitapIsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kitapIsButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(kitapIsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emanetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(ogrenciIsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
                        .addComponent(iadeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(70, 70, 70))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ogrenciIsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kitapIsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emanetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(iadeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ogrenciIsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ogrenciIsButtonActionPerformed
        
        Frame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
        OgrenciEkrani ogrekrani = new OgrenciEkrani(frame,true);
        ogrekrani.setLocationRelativeTo(null);
        setVisible(false);
        ogrekrani.setVisible(true);

    }//GEN-LAST:event_ogrenciIsButtonActionPerformed

    private void emanetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emanetButtonActionPerformed
       Frame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
       KitapEmanetEkrani ekran = new KitapEmanetEkrani(frame,true);
       ekran.setLocationRelativeTo(null);
       setVisible(false);
       ekran.setVisible(true);
       

    }//GEN-LAST:event_emanetButtonActionPerformed

    private void iadeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iadeButtonActionPerformed
        Frame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
        IadeEkrani iadeEkrani = new IadeEkrani(frame,true);
        iadeEkrani.setLocationRelativeTo(null);
        setVisible(false);
        iadeEkrani.setVisible(true);
    }//GEN-LAST:event_iadeButtonActionPerformed

    private void kitapIsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kitapIsButtonActionPerformed
        Frame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
        KitapIslemleriEkrani kitapEkrani = new KitapIslemleriEkrani(frame,true);
        kitapEkrani.setLocationRelativeTo(null);
        setVisible(false);
        kitapEkrani.setVisible(true);
    }//GEN-LAST:event_kitapIsButtonActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AnasayfaEkrani dialog = new AnasayfaEkrani(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton emanetButton;
    private javax.swing.JButton iadeButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton kitapIsButton;
    private javax.swing.JButton ogrenciIsButton;
    // End of variables declaration//GEN-END:variables
}

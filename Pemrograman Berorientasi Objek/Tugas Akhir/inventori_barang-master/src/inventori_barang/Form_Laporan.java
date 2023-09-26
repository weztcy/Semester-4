package inventori_barang;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.*;

public class Form_Laporan extends javax.swing.JDialog {

    inventori_barang.Connection_DB konek = new inventori_barang.Connection_DB();
    inventori_barang.Report report = new inventori_barang.Report();

    public Form_Laporan(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        ImageIcon img = new ImageIcon("src/inventori_barang/img/icon.png");
        this.setIconImage(img.getImage());
        initComponents();

        dateEnabled(false);
    }

    private void dateEnabled(boolean x) {
        txtd_dari.setEnabled(x);
        txtd_sampai.setEnabled(x);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btncetak = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        cmbid_laporan = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txtd_dari = new com.toedter.calendar.JDateChooser();
        txtd_sampai = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setText("Dari Tanggal");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setText("Sampai Tanggal");

        btncetak.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btncetak.setText("Cetak");
        btncetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncetakActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 105, 105));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Dialog", 3, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Cetak Laporan");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        cmbid_laporan.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        cmbid_laporan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Menu", "Data Barang", "Transaksi Barang Masuk", "Transaksi Barang Keluar" }));
        cmbid_laporan.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbid_laporanItemStateChanged(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setText("Laporan");

        txtd_dari.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtd_dari.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtd_dariMouseClicked(evt);
            }
        });

        txtd_sampai.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btncetak, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmbid_laporan, 0, 250, Short.MAX_VALUE)
                            .addComponent(txtd_dari, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtd_sampai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cmbid_laporan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(txtd_dari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(txtd_sampai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btncetak, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtd_dariMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtd_dariMouseClicked

    }//GEN-LAST:event_txtd_dariMouseClicked

    private void btncetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncetakActionPerformed
        String id_laporan = cmbid_laporan.getSelectedItem().toString();
        switch (id_laporan) {
            case "Pilih":
                JOptionPane.showMessageDialog(null, "Terdapat inputan yang kosong.");
                break;
            case "Data Barang":
                try {
                File file = new File("src/report/report_barang.jrxml");
                JasperDesign jasperDesign = JRXmlLoader.load(file);
                JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);
                JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, null, konek.openkoneksi());
                JasperViewer.viewReport(jasperPrint, false);
            } catch (ClassNotFoundException | JRException e) {
                JOptionPane.showMessageDialog(null, "Error " + e);
            }
            this.hide();
            break;
            default:
                SimpleDateFormat date;
                date = new SimpleDateFormat("yyyy-MM-dd");
                String d_dari = date.format(txtd_dari.getDate());
                String d_sampai = date.format(txtd_sampai.getDate());
                if (id_laporan.equals("Transaksi Barang Masuk")) {
                    try {
                        HashMap hash = new HashMap();
                        hash.put("d_dari", d_dari);
                        hash.put("d_sampai", d_sampai);

                        File file1 = new File("src/report/report_barangMasuk.jrxml");
                        JasperDesign jasperDesign = JRXmlLoader.load(file1);
                        JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);
                        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, hash, konek.openkoneksi());
                        JasperViewer.viewReport(jasperPrint, false);
                    } catch (ClassNotFoundException | JRException e) {
                        JOptionPane.showMessageDialog(null, "Error " + e);
                    }
                } else if (id_laporan.equals("Transaksi Barang Keluar")) {
                    try {
                        HashMap hash = new HashMap();
                        hash.put("d_dari", d_dari);
                        hash.put("d_sampai", d_sampai);

                        File file2 = new File("src/report/report_barangKeluar.jrxml");
                        JasperDesign jasperDesign = JRXmlLoader.load(file2);
                        JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);
                        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, hash, konek.openkoneksi());
                        JasperViewer.viewReport(jasperPrint, false);
                    } catch (ClassNotFoundException | JRException e) {
                        JOptionPane.showMessageDialog(null, "Error " + e);
                    }
                }
                this.hide();
                break;
        }
    }//GEN-LAST:event_btncetakActionPerformed

    private void cmbid_laporanItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbid_laporanItemStateChanged

        String id_laporan = cmbid_laporan.getSelectedItem().toString();
        if (id_laporan.equals("Persedian Barang") || id_laporan.equals("Pilih")) {
            dateEnabled(false);
        } else {
            dateEnabled(true);
            txtd_dari.requestFocus();
        }
    }//GEN-LAST:event_cmbid_laporanItemStateChanged

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Form_Laporan dialog = new Form_Laporan(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btncetak;
    private javax.swing.JComboBox<String> cmbid_laporan;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private com.toedter.calendar.JDateChooser txtd_dari;
    private com.toedter.calendar.JDateChooser txtd_sampai;
    // End of variables declaration//GEN-END:variables
}

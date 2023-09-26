package inventori_barang;

import java.awt.event.FocusEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import net.proteanit.sql.DbUtils;

public final class Form_Dashboard extends javax.swing.JFrame {

    inventori_barang.Connection_DB konek = new inventori_barang.Connection_DB();
    inventori_barang.Session_Employee PetugasSession = new inventori_barang.Session_Employee();

    public Form_Dashboard() {
        ImageIcon img = new ImageIcon("src/inventori_barang/img/icon.png");
        this.setIconImage(img.getImage());
        initComponents();

        lblnama.setText(PetugasSession.getEmployee_name());
        lblusername.setText(PetugasSession.getEmployee_username());

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowActivated(WindowEvent e) {
                GetData();
            }
        });
    }

    public void windowActivated(WindowEvent e) {
        System.out.println("Window Activated Event");
    }

    public void windowDeactivated(WindowEvent e) {
        System.out.println("Window Deactivated Event");
    }

    public void focusGained(FocusEvent fe) {
        System.out.println("Focus gained in JPanel");
    }

    public void focusLost(FocusEvent fe) {
        System.out.println("Focus lost in JPanel");
    }

    private void GetData() {
        try {
            Connection conn = konek.openkoneksi();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet sql = stm.executeQuery("SELECT tmbarang.id, tmbarang.kode, tmbarang.nama, tmkategori.nama as kategori, tmbarang.stok, tmbarang.satuan FROM tmbarang JOIN tmkategori ON tmkategori.id = tmbarang.id_kategori");

            DefaultTableModel model = (DefaultTableModel) DbUtils.resultSetToTableModel(sql);
            datatable.setModel(model);

            datatable.getColumnModel().getColumn(0).setPreferredWidth(7);
            datatable.getColumnModel().getColumn(1).setPreferredWidth(20);
            datatable.getColumnModel().getColumn(2).setPreferredWidth(90);
            datatable.getColumnModel().getColumn(3).setPreferredWidth(60);
            datatable.getColumnModel().getColumn(4).setPreferredWidth(40);
            datatable.getColumnModel().getColumn(5).setPreferredWidth(25);

            JTableHeader header = datatable.getTableHeader();
            String[] columnNames = {"ID Barang", "Kode Barang", "Nama Barang", "Kategori Barang", "Stok", "Satuan", "Tanggal"};
            header.setReorderingAllowed(false);
            model.setColumnIdentifiers(columnNames);

            String count_rows = String.valueOf(sql.getRow());

            konek.closekoneksi();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error " + e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Form_Barang.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void GetData_View() {

    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnTransaksiBarangMasuk = new javax.swing.JButton();
        btnTransaksiBarangKeluar = new javax.swing.JButton();
        btnLaporan = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        lblnama = new javax.swing.JLabel();
        lblusername = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        datatable = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex) {
                return false;
            }
        };
        jLabel1 = new javax.swing.JLabel();
        btnAkun = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        submenuPegawai = new javax.swing.JMenuItem();
        submenuKategoriBarang = new javax.swing.JMenuItem();
        submenuBarang = new javax.swing.JMenuItem();
        submenuDistributor = new javax.swing.JMenuItem();
        submenuPelanggan = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inventori Barang");

        jPanel1.setBackground(new java.awt.Color(166, 208, 221));

        btnTransaksiBarangMasuk.setBackground(new java.awt.Color(255, 211, 176));
        btnTransaksiBarangMasuk.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        btnTransaksiBarangMasuk.setForeground(new java.awt.Color(0, 0, 0));
        btnTransaksiBarangMasuk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inventori_barang/img/incoming.png"))); // NOI18N
        btnTransaksiBarangMasuk.setText("Transaksi Barang Masuk");
        btnTransaksiBarangMasuk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransaksiBarangMasukActionPerformed(evt);
            }
        });

        btnTransaksiBarangKeluar.setBackground(new java.awt.Color(255, 211, 176));
        btnTransaksiBarangKeluar.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        btnTransaksiBarangKeluar.setForeground(new java.awt.Color(0, 0, 0));
        btnTransaksiBarangKeluar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inventori_barang/img/outgoing.png"))); // NOI18N
        btnTransaksiBarangKeluar.setText("Transaksi Barang Keluar");
        btnTransaksiBarangKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransaksiBarangKeluarActionPerformed(evt);
            }
        });

        btnLaporan.setBackground(new java.awt.Color(255, 211, 176));
        btnLaporan.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        btnLaporan.setForeground(new java.awt.Color(0, 0, 0));
        btnLaporan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inventori_barang/img/print.png"))); // NOI18N
        btnLaporan.setText("Print Reports");
        btnLaporan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLaporanActionPerformed(evt);
            }
        });

        btnLogout.setBackground(new java.awt.Color(255, 211, 176));
        btnLogout.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 18)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(0, 0, 0));
        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inventori_barang/img/logout.png"))); // NOI18N
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        lblnama.setBackground(new java.awt.Color(0, 0, 0));
        lblnama.setFont(new java.awt.Font("Dialog", 0, 23)); // NOI18N
        lblnama.setForeground(new java.awt.Color(0, 0, 0));
        lblnama.setText("Nama");

        lblusername.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblusername.setForeground(new java.awt.Color(0, 0, 0));
        lblusername.setText("Username");

        datatable.setBackground(new java.awt.Color(255, 249, 222));
        datatable.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        datatable.setForeground(new java.awt.Color(0, 0, 0));
        datatable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID Barang", "Kode Barang", "Nama Barang", "Kategori Barang", "Stok", "Satuan", "Tanggal"
            }
        ));
        datatable.setRowHeight(30);
        datatable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        datatable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                datatableMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                datatableMouseReleased(evt);
            }
        });
        datatable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                datatableKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                datatableKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(datatable);

        jLabel1.setFont(new java.awt.Font("Dialog", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("D A S H B O A R D");

        btnAkun.setBackground(new java.awt.Color(255, 211, 176));
        btnAkun.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inventori_barang/img/Female User.png"))); // NOI18N
        btnAkun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAkunActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnAkun, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblusername)
                                    .addComponent(lblnama))
                                .addGap(83, 83, 83))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnTransaksiBarangMasuk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnTransaksiBarangKeluar)
                                .addGap(18, 18, 18)
                                .addComponent(btnLaporan, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAkun)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblnama)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblusername))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnTransaksiBarangMasuk, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnTransaksiBarangKeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnLaporan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jMenuBar1.setBackground(new java.awt.Color(255, 105, 105));
        jMenuBar1.setBorder(null);
        jMenuBar1.setForeground(new java.awt.Color(0, 0, 0));

        jMenu2.setBackground(new java.awt.Color(255, 153, 0));
        jMenu2.setForeground(new java.awt.Color(0, 0, 0));
        jMenu2.setText("MASTER");
        jMenu2.setFont(new java.awt.Font("Dialog", 2, 24)); // NOI18N
        jMenu2.setPreferredSize(new java.awt.Dimension(115, 37));

        submenuPegawai.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        submenuPegawai.setText("Pegawai");
        submenuPegawai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submenuPegawaiActionPerformed(evt);
            }
        });
        jMenu2.add(submenuPegawai);

        submenuKategoriBarang.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        submenuKategoriBarang.setText("Kategori Barang");
        submenuKategoriBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submenuKategoriBarangActionPerformed(evt);
            }
        });
        jMenu2.add(submenuKategoriBarang);

        submenuBarang.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        submenuBarang.setText("Barang");
        submenuBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submenuBarangActionPerformed(evt);
            }
        });
        jMenu2.add(submenuBarang);

        submenuDistributor.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        submenuDistributor.setText("Distributor");
        submenuDistributor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submenuDistributorActionPerformed(evt);
            }
        });
        jMenu2.add(submenuDistributor);

        submenuPelanggan.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        submenuPelanggan.setText("Pelanggan");
        submenuPelanggan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submenuPelangganActionPerformed(evt);
            }
        });
        jMenu2.add(submenuPelanggan);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void submenuDistributorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submenuDistributorActionPerformed

        new Form_Distributor(this, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_submenuDistributorActionPerformed

    private void submenuBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submenuBarangActionPerformed

        new Form_Barang(this, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_submenuBarangActionPerformed

    private void submenuKategoriBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submenuKategoriBarangActionPerformed

        new Form_KategoriBarang(this, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_submenuKategoriBarangActionPerformed

    private void submenuPegawaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submenuPegawaiActionPerformed

        new Form_Pegawai(this, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_submenuPegawaiActionPerformed

    private void submenuPelangganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submenuPelangganActionPerformed

        new Form_Pelanggan(this, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_submenuPelangganActionPerformed

    private void datatableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_datatableKeyReleased

        GetData_View();
    }//GEN-LAST:event_datatableKeyReleased

    private void datatableKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_datatableKeyPressed

    }//GEN-LAST:event_datatableKeyPressed

    private void datatableMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_datatableMouseReleased

        GetData_View();
    }//GEN-LAST:event_datatableMouseReleased

    private void datatableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_datatableMouseClicked

        GetData_View();
    }//GEN-LAST:event_datatableMouseClicked

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed

        new Form_Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnLaporanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLaporanActionPerformed

        new Form_Laporan(this, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_btnLaporanActionPerformed

    private void btnTransaksiBarangKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransaksiBarangKeluarActionPerformed

        new Form_BarangKeluar(this, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_btnTransaksiBarangKeluarActionPerformed

    private void btnTransaksiBarangMasukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransaksiBarangMasukActionPerformed

        new Form_BarangMasuk(this, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_btnTransaksiBarangMasukActionPerformed

    private void btnAkunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAkunActionPerformed

        new Form_Akun(this, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_btnAkunActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAkun;
    private javax.swing.JButton btnLaporan;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnTransaksiBarangKeluar;
    private javax.swing.JButton btnTransaksiBarangMasuk;
    private javax.swing.JTable datatable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblnama;
    private javax.swing.JLabel lblusername;
    private javax.swing.JMenuItem submenuBarang;
    private javax.swing.JMenuItem submenuDistributor;
    private javax.swing.JMenuItem submenuKategoriBarang;
    private javax.swing.JMenuItem submenuPegawai;
    private javax.swing.JMenuItem submenuPelanggan;
    // End of variables declaration//GEN-END:variables
}

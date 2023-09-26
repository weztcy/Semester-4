package inventori_barang;

import java.awt.Color;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import net.proteanit.sql.DbUtils;

public class Form_Pelanggan extends javax.swing.JDialog {

    inventori_barang.Connection_DB konek = new inventori_barang.Connection_DB();

    public Form_Pelanggan(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        txttemp_kode.hide();
        GetData();
        BtnEnabled(false);
        btnsave.setText("Simpan");
    }

    private void TxtEmpty() {
        txtid.setText("");
        txtkode.setText("");
        txtnama.setText("");
        txttelp.setText("");
        txtalamat.setText("");
        txttemp_kode.setText("");
    }

    private void BtnEnabled(boolean x) {
        btnedit.setEnabled(x);
        btndelete.setEnabled(x);
    }

    private void GetData() {
        try {
            Connection conn = konek.openkoneksi();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet sql = stm.executeQuery("SELECT tmpelanggan.id, tmpelanggan.kode, tmpelanggan.nama, tmpelanggan.no_telp, tmpelanggan.alamat FROM tmpelanggan");

            DefaultTableModel model = (DefaultTableModel) DbUtils.resultSetToTableModel(sql);
            datatable.setModel(model);

            datatable.getColumnModel().getColumn(0).setPreferredWidth(35);
            datatable.getColumnModel().getColumn(1).setPreferredWidth(70);
            datatable.getColumnModel().getColumn(2).setPreferredWidth(100);
            datatable.getColumnModel().getColumn(3).setPreferredWidth(80);
            datatable.getColumnModel().getColumn(4).setPreferredWidth(100);

            JTableHeader header = datatable.getTableHeader();
            String[] columnNames = {"ID Pelanggan", "Kode Pelanggan", "Nama Pelanggan", "Nomor Telepon", "Alamat"};
            header.setReorderingAllowed(false);
            model.setColumnIdentifiers(columnNames);

            String count_rows = String.valueOf(datatable.getRowCount());
            lblcount_rows.setText("Jumlah Data : " + count_rows);
            konek.closekoneksi();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error " + e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Form_Pelanggan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void GetData_View() {
        int row = datatable.getSelectedRow();
        String row_id = (datatable.getModel().getValueAt(row, 0).toString());
        txtid.setText(row_id);
        BtnEnabled(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnedit = new javax.swing.JButton();
        panel = new javax.swing.JPanel();
        txttelp = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtkode = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtnama = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnsave = new javax.swing.JButton();
        btncancel = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtalamat = new javax.swing.JTextArea();
        txttemp_kode = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        datatable = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex) {
                return false;
            }
        };
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtid = new javax.swing.JTextPane();
        lbl_action = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnadd = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        lblcount_rows = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Dimpra Autocar 777");

        btnedit.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnedit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inventori_barang/img/edit.png"))); // NOI18N
        btnedit.setText("Ubah");
        btnedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditActionPerformed(evt);
            }
        });

        panel.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        panel.setForeground(new java.awt.Color(245, 245, 245));
        panel.setEnabled(false);

        txttelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttelpActionPerformed(evt);
            }
        });
        txttelp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txttelpKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setLabelFor(txtkode);
        jLabel1.setText("Kode Pelanggan");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setLabelFor(txtnama);
        jLabel2.setText("Nama Pelanggan");

        txtkode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtkodeActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel4.setLabelFor(txttelp);
        jLabel4.setText("Nomor Telepon");

        txtnama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnamaActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel6.setText("Alamat");

        btnsave.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnsave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inventori_barang/img/save.png"))); // NOI18N
        btnsave.setText("Simpan");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });

        btncancel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btncancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inventori_barang/img/delete.png"))); // NOI18N
        btncancel.setText("Batal");
        btncancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelActionPerformed(evt);
            }
        });

        txtalamat.setColumns(10);
        txtalamat.setRows(3);
        jScrollPane3.setViewportView(txtalamat);

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(btncancel))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtnama)
                    .addComponent(txttelp)
                    .addComponent(jScrollPane3)
                    .addComponent(txtkode, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnsave)))
                .addContainerGap())
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtkode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txttelp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnsave)
                    .addComponent(btncancel))
                .addContainerGap())
        );

        txttemp_kode.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        datatable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID Pelanggan", "Kode Pelanggan", "Nama Pelanggan", "Nomor Telepon", "Alamat"
            }
        ));
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

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N

        txtid.setBorder(null);
        txtid.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtid.setForeground(new java.awt.Color(43, 152, 240));
        txtid.setToolTipText("");
        txtid.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtid.setEnabled(false);
        txtid.setFocusable(false);
        jScrollPane2.setViewportView(txtid);

        lbl_action.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbl_action.setText("Form Tambah Data Pelanggan");

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel7.setLabelFor(txtid);
        jLabel7.setText("Baris ID Data");

        btnadd.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnadd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inventori_barang/img/add.png"))); // NOI18N
        btnadd.setText("Tambah");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });

        btndelete.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btndelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inventori_barang/img/delete.png"))); // NOI18N
        btndelete.setText("Hapus");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 105, 105));

        jLabel8.setFont(new java.awt.Font("Dialog", 3, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Data Pelanggan");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        lblcount_rows.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblcount_rows.setText("Jumlah Data");

        jButton1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inventori_barang/img/refresh.png"))); // NOI18N
        jButton1.setText("Perbarui");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnadd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnedit)
                        .addGap(18, 18, 18)
                        .addComponent(btndelete)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_action)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblcount_rows)
                        .addGap(18, 18, 18)
                        .addComponent(txttemp_kode, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnadd)
                            .addComponent(btnedit)
                            .addComponent(btndelete))
                        .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblcount_rows)
                        .addComponent(txttemp_kode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_action)
                                .addGap(18, 18, 18)
                                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btneditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditActionPerformed
        String row_id = txtid.getText();
        if (!"0".equals(row_id)) {
            try {
                btnsave.setText("Simpan");
                Connection conn = konek.openkoneksi();
                java.sql.Statement stm = conn.createStatement();
                java.sql.ResultSet sql = stm.executeQuery("SELECT tmpelanggan.id, tmpelanggan.kode, tmpelanggan.nama, tmpelanggan.no_telp, tmpelanggan.alamat FROM tmpelanggan WHERE tmpelanggan.id='" + row_id + "'");
                if (sql.next()) {
                    lbl_action.setForeground(new Color(43, 152, 240));
                    String kode = sql.getString("kode");
                    lbl_action.setText("Edit Data | " + kode);
                    txtid.setText(sql.getString("id"));
                    txtkode.setText(kode);
                    txtnama.setText(sql.getString("nama"));
                    txttelp.setText(sql.getString("no_telp"));
                    txtalamat.setText(sql.getString("alamat"));
                    txttemp_kode.setText(kode);
                    txtkode.requestFocus();
                }
                konek.closekoneksi();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error " + e);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Form_Pelanggan.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Terdapat kesalahan id null!");
        }
    }//GEN-LAST:event_btneditActionPerformed

    private void txttelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttelpActionPerformed

    }//GEN-LAST:event_txttelpActionPerformed

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        String row_id = txtid.getText();
        String row_txtkode = txtkode.getText();
        String row_txttemp_kode = txttemp_kode.getText();
        String row_txtnama = txtnama.getText();
        String row_txttelp = txttelp.getText();
        String row_txtalamat = txtalamat.getText();
        int c_kode = 0;

        if (!"".equals(row_txtkode) && !"".equals(row_txtnama) && !"".equals(row_txttelp) && !"".equals(row_txtalamat)) {
            try {
                Connection conn = konek.openkoneksi();
                java.sql.Statement stm = conn.createStatement();
                java.sql.ResultSet sql = stm.executeQuery("SELECT COUNT(tmpelanggan.id) as count FROM tmpelanggan WHERE tmpelanggan.kode='" + row_txtkode + "'");
                sql.next();
                c_kode = sql.getInt("count");
                konek.closekoneksi();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error " + e);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Form_Pelanggan.class.getName()).log(Level.SEVERE, null, ex);
            }

            if ("".equals(row_id)) {
                if (c_kode == 0) {
                    try {
                        Connection conn = konek.openkoneksi();
                        java.sql.Statement stm = conn.createStatement();
                        stm.executeUpdate("INSERT INTO tmpelanggan(kode, nama, no_telp, alamat) VALUES ('" + row_txtkode + "', '" + row_txtnama + "', '" + row_txttelp + "', '" + row_txtalamat + "')");
                        JOptionPane.showMessageDialog(null, "Berhasil menyimpan data.");
                        btnadd.doClick();
                        konek.closekoneksi();
                        GetData();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "Error " + e);
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(Form_Pelanggan.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Kode supplier sudah pernah disimpan.", "Gagal Disimpan", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                if (c_kode == 0 || row_txtkode.equals(row_txttemp_kode)) {
                    try {
                        Connection conn = konek.openkoneksi();
                        java.sql.Statement stm = conn.createStatement();
                        stm.executeUpdate("UPDATE tmpelanggan SET kode='" + row_txtkode + "',nama='" + row_txtnama + "',no_telp='" + row_txttelp + "',alamat='" + row_txtalamat + "' WHERE id = '" + row_id + "'");
                        JOptionPane.showMessageDialog(null, "Berhasil mengubah data.");
                        btnadd.doClick();
                        konek.closekoneksi();
                        GetData();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "Error " + e);
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(Form_Pelanggan.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Kode supplier sudah pernah disimpan.", "Gagal Disimpan", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Terdapat inputan yang kosong.");
        }
    }//GEN-LAST:event_btnsaveActionPerformed

    private void txtkodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtkodeActionPerformed

    }//GEN-LAST:event_txtkodeActionPerformed

    private void txtnamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnamaActionPerformed

    }//GEN-LAST:event_txtnamaActionPerformed

    private void btncancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelActionPerformed
        btnadd.doClick();
    }//GEN-LAST:event_btncancelActionPerformed

    private void datatableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_datatableMouseClicked
        GetData_View();
    }//GEN-LAST:event_datatableMouseClicked

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        lbl_action.setForeground(Color.black);
        lbl_action.setText("Tambah Data");
        datatable.clearSelection();
        TxtEmpty();
        BtnEnabled(false);
        btnsave.setText("Simpan");
        txtkode.requestFocus();
    }//GEN-LAST:event_btnaddActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        int ok = JOptionPane.showConfirmDialog(null, "Anda yakin ingin menghapus data ini?", "Konfirmasi", JOptionPane.OK_CANCEL_OPTION);
        if (ok == 0) {
            try {
                String row_id = txtid.getText();
                Connection conn = konek.openkoneksi();
                java.sql.Statement stm = conn.createStatement();
                stm.executeUpdate("DELETE FROM tmpelanggan WHERE id = '" + row_id + "'");
                JOptionPane.showMessageDialog(null, "Berhasil menghapus data.");
                btnadd.doClick();
                konek.closekoneksi();
                GetData();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error " + e);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Form_Pelanggan.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btndeleteActionPerformed

    private void datatableKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_datatableKeyPressed

    }//GEN-LAST:event_datatableKeyPressed

    private void datatableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_datatableKeyReleased
        GetData_View();
    }//GEN-LAST:event_datatableKeyReleased

    private void datatableMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_datatableMouseReleased
        GetData_View();
    }//GEN-LAST:event_datatableMouseReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        GetData();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txttelpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttelpKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c)) && !(c == KeyEvent.VK_BACK_SPACE)) {
            JOptionPane.showMessageDialog(null, "Inputan hanya boleh angka", "Ilegal Input", JOptionPane.ERROR_MESSAGE);
            evt.consume();
        }
    }//GEN-LAST:event_txttelpKeyTyped

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            Form_Pelanggan dialog = new Form_Pelanggan(new javax.swing.JFrame(), true);
            dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosing(java.awt.event.WindowEvent e) {
                    System.exit(0);
                }
            });
            dialog.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btncancel;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnedit;
    private javax.swing.JButton btnsave;
    private javax.swing.JTable datatable;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lbl_action;
    private javax.swing.JLabel lblcount_rows;
    private javax.swing.JPanel panel;
    private javax.swing.JTextArea txtalamat;
    private javax.swing.JTextPane txtid;
    private javax.swing.JTextField txtkode;
    private javax.swing.JTextField txtnama;
    private javax.swing.JTextField txttelp;
    private javax.swing.JTextField txttemp_kode;
    // End of variables declaration//GEN-END:variables
}
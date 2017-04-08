package kino;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import net.proteanit.sql.DbUtils;

public class mainWindow extends javax.swing.JFrame {
        PreparedStatement prepst=null;
        ResultSet rs=null;
    
    public mainWindow() {
        initComponents();
        System.out.println(szukane_field.getText());
        update_table();
        
    }

    private void update_table(){
    try {
        baza m=new baza();
        String sql="select `NAZWA`,`REZYSER`,`TYP`,`FILMWEB`,`OCENA WLASNA`, substr(`ROK`,1,4) as ROK, `LICZBA SEZONOW` as SEZONY from dane";
        prepst=baza.conn.prepareStatement(sql);
        rs=prepst.executeQuery();
        TabelaDanych.setModel(DbUtils.resultSetToTableModel(rs));
        m.conn.close();
    } catch (SQLException ex) {
        Logger.getLogger(mainWindow.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showConfirmDialog(null, ex);
    }
    } 
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        szukane_field = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        search_button = new javax.swing.JButton();
        film_check = new javax.swing.JCheckBox();
        serial_check = new javax.swing.JCheckBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        TabelaDanych = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        jLabel7 = new javax.swing.JLabel();
        mo_chb1 = new javax.swing.JComboBox();
        mo_chb2 = new javax.swing.JComboBox();
        fw_chb1 = new javax.swing.JComboBox();
        fw_chb2 = new javax.swing.JComboBox();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("WojTEKA");

        jButton1.setText("+");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        szukane_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                szukane_fieldActionPerformed(evt);
            }
        });

        jLabel1.setText("Moja ocena");

        jLabel2.setText("od");

        jLabel3.setText("do");

        jLabel4.setText("do");

        jLabel5.setText("od");

        jLabel6.setText("Filmweb");

        search_button.setText("Szukaj");
        search_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_buttonActionPerformed(evt);
            }
        });

        film_check.setSelected(true);
        film_check.setText("Film");
        film_check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                film_checkActionPerformed(evt);
            }
        });

        serial_check.setSelected(true);
        serial_check.setText("Serial");

        TabelaDanych.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TabelaDanych.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        TabelaDanych.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelaDanychMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TabelaDanych);

        jButton3.setText("Edytuj");
        jButton3.setEnabled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel8.setText("Opis");

        jScrollPane3.setViewportView(jLabel7);

        jScrollPane4.setViewportView(jScrollPane3);

        mo_chb1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        mo_chb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mo_chb1ActionPerformed(evt);
            }
        });

        mo_chb2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        mo_chb2.setSelectedIndex(9);

        fw_chb1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        fw_chb2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        fw_chb2.setSelectedIndex(9);

        jScrollPane5.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setWrapStyleWord(true);
        jScrollPane5.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mo_chb1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addGap(2, 2, 2)
                                .addComponent(mo_chb2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(search_button)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(fw_chb1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(2, 2, 2)
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(fw_chb2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(szukane_field, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(film_check)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(serial_check))
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 799, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane4)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)
                        .addGap(9, 9, 9)
                        .addComponent(jScrollPane4))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(szukane_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(film_check)
                                    .addComponent(serial_check))
                                .addGap(4, 4, 4)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(mo_chb1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(mo_chb2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(8, 8, 8)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(fw_chb1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fw_chb2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(search_button)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void search_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_buttonActionPerformed
        String m1,m2,f1,f3, sql=null, film=null, serial=null;
        boolean wpisanytekst=false;
        baza m=new baza();
            m1=mo_chb1.getSelectedItem().toString();
            m2=mo_chb2.getSelectedItem().toString();
            f1=fw_chb1.getSelectedItem().toString();
            f3=fw_chb2.getSelectedItem().toString();
if(szukane_field.getText().equals("")){            
sql="select `NAZWA`,`REZYSER`,`TYP`,`FILMWEB`,`OCENA WLASNA`, substr(`ROK`,1,4) as ROK, `LICZBA SEZONOW` as SEZONY from dane where TYP=? AND"
        + " (`OCENA WLASNA` BETWEEN ? AND ?) AND (`FILMWEB` BETWEEN ? AND ?)";

} else{
    sql="select `NAZWA`,`REZYSER`,`TYP`,`FILMWEB`,`OCENA WLASNA`, substr(`ROK`,1,4) as ROK, `LICZBA SEZONOW` as SEZONY from dane where TYP=? AND"
            + " (`OCENA WLASNA` BETWEEN ? AND ?) AND (`FILMWEB` BETWEEN ? AND ?) AND (LOWER(NAZWA)=LOWER(?) OR LOWER(REZYSER)=LOWER(?))";
    
    wpisanytekst=true;
}
        System.out.println(sql);

if(serial_check.isSelected()&film_check.isSelected()){
    if(wpisanytekst){
        
    sql="select `NAZWA`,`REZYSER`,`TYP`,`FILMWEB`,`OCENA WLASNA`, substr(`ROK`,1,4) as ROK, `LICZBA SEZONOW` as SEZONY from dane where "
                + "(`OCENA WLASNA` BETWEEN ? AND ?) AND (`FILMWEB` BETWEEN ? AND ?) AND (LOWER(NAZWA)=LOWER(?) OR LOWER(REZYSER)=LOWER(?))";
    }
    else{
     sql="select `NAZWA`,`REZYSER`,`TYP`,`FILMWEB`,`OCENA WLASNA`, substr(`ROK`,1,4) as ROK, `LICZBA SEZONOW` as SEZONY from dane where "
            + "(`OCENA WLASNA` BETWEEN ? AND ?) AND (`FILMWEB` BETWEEN ? AND ?)";
   
    }
    System.out.println(sql);
    try {
        prepst=m.conn.prepareStatement(sql);
        
        prepst.setString(1, m1);
        prepst.setString(2, m2);
        prepst.setString(3, f1);
        prepst.setString(4, f3);
        if(wpisanytekst){
        prepst.setString(5, szukane_field.getText());
        prepst.setString(6, szukane_field.getText());
        }
        
        rs=prepst.executeQuery();
        TabelaDanych.setModel(DbUtils.resultSetToTableModel(rs));
        jButton3.setEnabled(false);
        m.conn.close();
    } catch (SQLException ex) {
        Logger.getLogger(mainWindow.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showConfirmDialog(null, ex);
    }
    
}else if(film_check.isSelected()){
try {
        prepst=m.conn.prepareStatement(sql);
        prepst.setString(1, "Film");
        prepst.setString(2, m1);
        prepst.setString(3, m2);
        prepst.setString(4, f1);
        prepst.setString(5, f3);
        
        if(wpisanytekst){
        prepst.setString(6, szukane_field.getText());
        prepst.setString(7, szukane_field.getText());
        }
        
        rs=prepst.executeQuery();
        TabelaDanych.setModel(DbUtils.resultSetToTableModel(rs));
        
        m.conn.close();
    } catch (SQLException ex) {
    Logger.getLogger(mainWindow.class.getName()).log(Level.SEVERE, null, ex);
    JOptionPane.showConfirmDialog(null, ex);
}// sdadsa
} else if(serial_check.isSelected()){
    try {
        prepst=m.conn.prepareStatement(sql);
        prepst.setString(1, "Serial");
        prepst.setString(2, m1);
        prepst.setString(3, m2);
        prepst.setString(4, f1);
        prepst.setString(5, f3);
        
        if(wpisanytekst){
        prepst.setString(6, szukane_field.getText());
        prepst.setString(7, szukane_field.getText());
        }
        
        rs=prepst.executeQuery();
        TabelaDanych.setModel(DbUtils.resultSetToTableModel(rs));
        m.conn.close();
    } catch (SQLException ex) {
        Logger.getLogger(mainWindow.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showConfirmDialog(null, ex);
    }
}  else{
     JOptionPane.showMessageDialog(null,"Wybierz rodzaj szukanych dzieł !" ,"Koniec", JOptionPane.PLAIN_MESSAGE);
}          
        
    }//GEN-LAST:event_search_buttonActionPerformed

    private void film_checkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_film_checkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_film_checkActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
          close();
          Edycja e = new Edycja();
          e.klikniecie_tabeli=klikniecie_tabeli;
          e.klikniecie_tabeli2=klikniecie_tabeli2;
          e.Edycja();
          e.setVisible(true);
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        close();
        Dodawanie l = new Dodawanie();
        l.setVisible(true);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void szukane_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_szukane_fieldActionPerformed
       
    }//GEN-LAST:event_szukane_fieldActionPerformed

    private void mo_chb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mo_chb1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mo_chb1ActionPerformed

    private void TabelaDanychMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaDanychMouseClicked
        jButton3.setEnabled(true);
        try{
            baza m=new baza();
            int row = TabelaDanych.getSelectedRow();
            klikniecie_tabeli =(TabelaDanych.getModel().getValueAt(row, 0).toString());
            klikniecie_tabeli2=(TabelaDanych.getModel().getValueAt(row, 1).toString());
            String sql = "select*from dane where Nazwa='"+klikniecie_tabeli+"'and REZYSER='"+klikniecie_tabeli2+"'";
            prepst=baza.conn.prepareStatement(sql);
            rs=prepst.executeQuery();
            System.out.println(" ddsdds");
            if(rs.next()){

                String a = rs.getString("OPIS");
                jTextArea1.setText(a);

                if(rs.getBoolean("obrazek")){
                    byte[] imagedata = rs.getBytes("obrazek");
                    format = new ImageIcon(imagedata);
                    jLabel7.setIcon(format);
                }
                else{
                    ImageIcon brak = new ImageIcon("/Users/Wojciech/Documents/NetBeansProjects/kino/src/zdjęcie_informujące/brak_obrazka.jpg");
                    jLabel7.setIcon(brak);
                }

            }
            m.conn.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_TabelaDanychMouseClicked

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
            java.util.logging.Logger.getLogger(mainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainWindow().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TabelaDanych;
    private javax.swing.JCheckBox film_check;
    private javax.swing.JComboBox fw_chb1;
    private javax.swing.JComboBox fw_chb2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JComboBox mo_chb1;
    private javax.swing.JComboBox mo_chb2;
    private javax.swing.JButton search_button;
    private javax.swing.JCheckBox serial_check;
    private javax.swing.JTextField szukane_field;
    // End of variables declaration//GEN-END:variables

    private ImageIcon format=null;
    String klikniecie_tabeli=null;
    String klikniecie_tabeli2=null;
    
    private void close() {
        WindowEvent zam = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(zam);
    
    }
}


package kino;

import com.mysql.jdbc.exceptions.MySQLIntegrityConstraintViolationException;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class Edycja extends javax.swing.JFrame {

    public void Edycja() {
        
        initComponents();
        try{
            baza p=new baza();
            String sql="select*from dane where NAZWA='"+klikniecie_tabeli+"'and REZYSER='"+klikniecie_tabeli2+"'";
            
            Statement stm = p.conn.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            
            while(rs.next()){
                nazwa_field.setText(rs.getString("NAZWA"));
                type_combo.setSelectedItem(rs.getString("TYP"));
                year_field.setText(rs.getString("ROK").substring(0, 4));
                director_field.setText(rs.getString("REZYSER"));
                desc_field.setText(rs.getString("OPIS"));
                filmwebb_name.setText(rs.getString("FILMWEB"));
                userrate_field.setText(rs.getString("OCENA WLASNA"));
                if(rs.getString("LICZBA SEZONOW")!=null){
                    seasons_combo.setSelectedItem(rs.getString("LICZBA SEZONOW"));
                }else{
                    seasons_combo.setSelectedItem(0);
                }
                g=rs.getBytes("obrazek");
                
            }
            p.conn.close();
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Błąd wczytania danych do pól !" ,"Koniec", JOptionPane.PLAIN_MESSAGE);
        }
    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        desc_field = new javax.swing.JTextArea();
        nazwa_field = new javax.swing.JTextField();
        director_field = new javax.swing.JTextField();
        year_field = new javax.swing.JTextField();
        filmwebb_name = new javax.swing.JTextField();
        userrate_field = new javax.swing.JTextField();
        attach_button = new javax.swing.JButton();
        Attach_field = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        type_combo = new javax.swing.JComboBox();
        seasons_combo = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Edycja");

        jLabel1.setText("Nazwa");

        jLabel2.setText("Reżyser");

        jLabel3.setText("Rok");

        jLabel4.setText("Ocena Filmweb");

        jLabel5.setText("Ocena własna");

        jLabel6.setText("Opis");

        desc_field.setColumns(20);
        desc_field.setLineWrap(true);
        desc_field.setRows(5);
        desc_field.setWrapStyleWord(true);
        jScrollPane1.setViewportView(desc_field);

        nazwa_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nazwa_fieldActionPerformed(evt);
            }
        });

        year_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                year_fieldActionPerformed(evt);
            }
        });

        attach_button.setText("Załącz");
        attach_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attach_buttonActionPerformed(evt);
            }
        });

        Attach_field.setEditable(false);
        Attach_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Attach_fieldActionPerformed(evt);
            }
        });

        jButton2.setForeground(new java.awt.Color(0, 204, 102));
        jButton2.setText("Gotowe");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setForeground(new java.awt.Color(255, 102, 102));
        jButton3.setText("Usuń");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        type_combo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Film", "Serial" }));
        type_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                type_comboActionPerformed(evt);
            }
        });

        seasons_combo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25" }));
        seasons_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seasons_comboActionPerformed(evt);
            }
        });

        jLabel7.setText("Typ");

        jLabel8.setText("Sezony");

        jButton1.setText("Powrót");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(director_field, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(nazwa_field)
                                    .addComponent(year_field, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(filmwebb_name)
                                    .addComponent(jLabel5)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel2)))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(userrate_field, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(attach_button)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(type_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel7))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8)
                                            .addComponent(seasons_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(Attach_field)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(10, 10, 10)
                        .addComponent(nazwa_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addGap(5, 5, 5)
                        .addComponent(director_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jLabel3)
                        .addGap(3, 3, 3)
                        .addComponent(year_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addGap(2, 2, 2)
                        .addComponent(filmwebb_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addGap(3, 3, 3)
                        .addComponent(userrate_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(type_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(seasons_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(attach_button)
                            .addComponent(Attach_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void attach_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attach_buttonActionPerformed
       JFileChooser chooser = new JFileChooser();
       chooser.showOpenDialog(null);
       File f = chooser.getSelectedFile();
       filename=f.getAbsolutePath();
       Attach_field.setText(filename);
       
       File obr = new File(filename);
        try {
            FileInputStream obris = new FileInputStream(obr);
            ByteArrayOutputStream b = new ByteArrayOutputStream();
            byte[] bufor = new byte[1024];
        
        for(int i; (i=obris.read(bufor))!=-1;){
            b.write(bufor,0,i);
        }
        
        cover=b.toByteArray();
        obrazek_update=true;
        
       } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,"Błąd wczytania obrazka" ,"Koniec", JOptionPane.PLAIN_MESSAGE);
       }
       
    }//GEN-LAST:event_attach_buttonActionPerformed

    private void Attach_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Attach_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Attach_fieldActionPerformed

    private void seasons_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seasons_comboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_seasons_comboActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        baza e=new baza();
        try {
           
            String sql="update dane set `NAZWA`=?,`TYP`=?,`ROK`=?,`REZYSER`=?,`OPIS`=?,`FILMWEB`=?,`OCENA WLASNA`=?,`obrazek`=?,`LICZBA SEZONOW`=? where NAZWA='"+klikniecie_tabeli+"'and REZYSER='"+klikniecie_tabeli2+"'";
            PreparedStatement prepst = baza.conn.prepareStatement(sql);
          
            prepst.setString(1, nazwa_field.getText());
            prepst.setString(2, type_combo.getSelectedItem().toString());
            prepst.setString(3, year_field.getText());
            prepst.setString(4, director_field.getText());
            prepst.setString(5, desc_field.getText());
            prepst.setString(6, filmwebb_name.getText());
            prepst.setString(7, userrate_field.getText());
            if(obrazek_update){
                prepst.setBytes(8, cover);
            }else{
                prepst.setBytes(8, g);
            }
            
            if(type_combo.getSelectedItem().toString().equals("Serial")){
                prepst.setString(9, seasons_combo.getSelectedItem().toString());
            }else{
                prepst.setString(9, null);
            }
            
           
           prepst.execute();
           e.conn.close();
           JOptionPane.showMessageDialog(null,"Zapisono" ,"Koniec", JOptionPane.PLAIN_MESSAGE);
           
           
        }catch (SQLException ex) {
            System.out.println(ex.getErrorCode());
            Logger.getLogger(Dodawanie.class.getName()).log(Level.SEVERE, null, ex);
            if(ex.getErrorCode()==1062){
                JOptionPane.showMessageDialog(null,"Jest już taki film/serial !" ,"Koniec", JOptionPane.PLAIN_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null,"Zły format wprowadzonych danych !" ,"Koniec", JOptionPane.PLAIN_MESSAGE);
            }
        }
        
            close();
            mainWindow m = new mainWindow();
            m.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        baza p=new baza();
        try {
            String sql="delete from dane where NAZWA=? and REZYSER=?";
            PreparedStatement prepst = baza.conn.prepareStatement(sql);
            
            prepst.setString(1,klikniecie_tabeli);
            prepst.setString(2,klikniecie_tabeli2);
            
            prepst.execute();
            p.conn.close();
            
            } catch (SQLException ex) {
            Logger.getLogger(Edycja.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            close();
            mainWindow m = new mainWindow();
            m.setVisible(true);
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void nazwa_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nazwa_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nazwa_fieldActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

           close();
            mainWindow m = new mainWindow();
            m.setVisible(true);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void year_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_year_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_year_fieldActionPerformed

    private void type_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_type_comboActionPerformed
      
        if(type_combo.getSelectedItem().toString().equals("Serial")){
            seasons_combo.setEnabled(true);
        }
        else{
            seasons_combo.setEnabled(false);
        }
        
    }//GEN-LAST:event_type_comboActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Attach_field;
    private javax.swing.JButton attach_button;
    private javax.swing.JTextArea desc_field;
    private javax.swing.JTextField director_field;
    private javax.swing.JTextField filmwebb_name;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
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
    private javax.swing.JTextField nazwa_field;
    private javax.swing.JComboBox seasons_combo;
    private javax.swing.JComboBox type_combo;
    private javax.swing.JTextField userrate_field;
    private javax.swing.JTextField year_field;
    // End of variables declaration//GEN-END:variables

String filename=null;
int k=0;
byte[] cover =null;
String klikniecie_tabeli;
String klikniecie_tabeli2;
boolean obrazek_update=false;
byte[] g=null;

private void close() {
        WindowEvent zam = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(zam);
    
    }
}



package kino;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;


public class Dodawanie extends javax.swing.JFrame {

    public Dodawanie() {
        initComponents();
    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        desc_field = new javax.swing.JTextArea();
        attachment_field = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        nazwa_field = new javax.swing.JTextField();
        director_field = new javax.swing.JTextField();
        year_field = new javax.swing.JTextField();
        filmweb_field = new javax.swing.JTextField();
        userrate_field = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        typ_combobox = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        seasons_combox = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Dodawanie");

        jLabel1.setText("Nazwa");

        jLabel2.setText("Reżyser");

        jLabel3.setText("Rok");

        jLabel4.setText("Ocena Filmweb");

        jLabel5.setText("Ocena własna");

        desc_field.setColumns(20);
        desc_field.setLineWrap(true);
        desc_field.setRows(5);
        desc_field.setWrapStyleWord(true);
        jScrollPane1.setViewportView(desc_field);

        attachment_field.setEditable(false);
        attachment_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attachment_fieldActionPerformed(evt);
            }
        });

        jButton1.setText("Załącz");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        nazwa_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nazwa_fieldActionPerformed(evt);
            }
        });

        director_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                director_fieldActionPerformed(evt);
            }
        });

        year_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                year_fieldActionPerformed(evt);
            }
        });

        filmweb_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filmweb_fieldActionPerformed(evt);
            }
        });

        jButton2.setText("Gotowe");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel6.setText("Opis");

        jButton3.setText("Powrót");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        typ_combobox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Film", "Serial" }));
        typ_combobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typ_comboboxActionPerformed(evt);
            }
        });

        jLabel7.setText("Typ");

        jLabel8.setText("Sezony");

        seasons_combox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25" }));
        seasons_combox.setEnabled(false);
        seasons_combox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seasons_comboxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3)
                            .addComponent(year_field))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(190, 299, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1)
                                .addContainerGap())))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addComponent(director_field)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2)
                            .addComponent(filmweb_field, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                            .addComponent(userrate_field)
                            .addComponent(nazwa_field))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(typ_combobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(seasons_combox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))
                                .addContainerGap(145, Short.MAX_VALUE))
                            .addComponent(attachment_field)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nazwa_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(typ_combobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(seasons_combox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(director_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1)
                        .addComponent(attachment_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(year_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(filmweb_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(userrate_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void year_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_year_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_year_fieldActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        close();
        mainWindow k = new mainWindow();
        k.setVisible(true);
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void filmweb_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filmweb_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_filmweb_fieldActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       JFileChooser chooser = new JFileChooser();
       chooser.showOpenDialog(null);
       File f = chooser.getSelectedFile();
       filename =f.getAbsolutePath();
       attachment_field.setText(filename);
       
       File obr = new File(filename);
        try {
            FileInputStream obris = new FileInputStream(obr);
        
        ByteArrayOutputStream b = new ByteArrayOutputStream();
        byte[] bufor = new byte[1024];
        
        for(int i; (i=obris.read(bufor))!=-1;){
            b.write(bufor,0,i);
        }
        
        cover=b.toByteArray();
        
       } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,"Błąd wczytania obrazka" ,"Koniec", JOptionPane.PLAIN_MESSAGE);
       }  
    }//GEN-LAST:event_jButton1ActionPerformed

    private void attachment_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attachment_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_attachment_fieldActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       baza l=new baza();
        if(typ_combobox.getSelectedItem().toString().equals("Serial")){
            try {
            String sql="insert into dane(`NAZWA`,`TYP`,`ROK`,`REZYSER`,`OPIS`,`FILMWEB`,`OCENA WLASNA`,`obrazek`,`LICZBA SEZONOW`) values (?,?,?,?,?,?,?,?,?)";
            PreparedStatement prepst = l.conn.prepareStatement(sql);
            
            prepst.setString(1, nazwa_field.getText());
            prepst.setString(2, typ_combobox.getSelectedItem().toString());
            prepst.setString(3, year_field.getText());
            prepst.setString(4, director_field.getText());
            prepst.setString(5, desc_field.getText());
            prepst.setString(6, filmweb_field.getText());
            prepst.setString(7, userrate_field.getText());
            prepst.setBytes(8, cover);
            prepst.setString(9, seasons_combox.getSelectedItem().toString());
            
           prepst.execute();
           l.conn.close();
           JOptionPane.showMessageDialog(null,"Zapisono" ,"Koniec", JOptionPane.PLAIN_MESSAGE);
        } catch (SQLException ex) {
            System.out.print(ex.getErrorCode());
            Logger.getLogger(Dodawanie.class.getName()).log(Level.SEVERE, null, ex);
            if(ex.getErrorCode()==1062){
                JOptionPane.showMessageDialog(null,"Jest już taki film/serial !" ,"Koniec", JOptionPane.PLAIN_MESSAGE);
            }else{
            JOptionPane.showMessageDialog(null,"Zły format wprowadzonych danych !" ,"Koniec", JOptionPane.PLAIN_MESSAGE);
        }
        }
       }else{
           try {
            String sql="insert into dane(`NAZWA`,`TYP`,`ROK`,`REZYSER`,`OPIS`,`FILMWEB`,`OCENA WLASNA`,`obrazek`) values (?,?,?,?,?,?,?,?)";
            PreparedStatement prepst = baza.conn.prepareStatement(sql);
            
            prepst.setString(1, nazwa_field.getText());
            prepst.setString(2, typ_combobox.getSelectedItem().toString());
            prepst.setString(3, year_field.getText());
            prepst.setString(4, director_field.getText());
            prepst.setString(5, desc_field.getText());
            prepst.setString(6, filmweb_field.getText());
            prepst.setString(7, userrate_field.getText());
            prepst.setBytes(8, cover);
            
           prepst.execute();
           l.conn.close();
           JOptionPane.showMessageDialog(null,"Zapisono" ,"Koniec", JOptionPane.PLAIN_MESSAGE);
        } catch (SQLException ex) {
            Logger.getLogger(Dodawanie.class.getName()).log(Level.SEVERE, null, ex);
            if(ex.getErrorCode()==1062){
                JOptionPane.showMessageDialog(null,"Jest już taki film/serial !" ,"Koniec", JOptionPane.PLAIN_MESSAGE);
            }else{
            JOptionPane.showMessageDialog(null,"Zły format wprowadzonych danych !" ,"Koniec", JOptionPane.PLAIN_MESSAGE);
        }
        }
       }
       //cdsad
    }//GEN-LAST:event_jButton2ActionPerformed

    private void nazwa_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nazwa_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nazwa_fieldActionPerformed

    private void director_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_director_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_director_fieldActionPerformed

    private void typ_comboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typ_comboboxActionPerformed
        
        if(typ_combobox.getSelectedItem().toString().equals("Serial")){
            seasons_combox.setEnabled(true);
        }
        else{
            seasons_combox.setEnabled(false);
        }
        
    }//GEN-LAST:event_typ_comboboxActionPerformed

    private void seasons_comboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seasons_comboxActionPerformed
       
    }//GEN-LAST:event_seasons_comboxActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField attachment_field;
    private javax.swing.JTextArea desc_field;
    private javax.swing.JTextField director_field;
    private javax.swing.JTextField filmweb_field;
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
    private javax.swing.JComboBox seasons_combox;
    private javax.swing.JComboBox typ_combobox;
    private javax.swing.JTextField userrate_field;
    private javax.swing.JTextField year_field;
    // End of variables declaration//GEN-END:variables
String filename=null;
int k=0;
byte[] cover =null;

private void close() {
        WindowEvent zam = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(zam);
    
    }
}

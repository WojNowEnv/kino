package kino;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;

public class baza {
    static Connection conn = null;
    private String host = "188.128.218.206";
    private String db = "21764779_kino";
    private int port = 3306;
    private String user = "21764779_kino";
    private String pass = "A%^dxm3&!wRb";
    private String url = "jdbc:mysql://%s:%d/%s";


    baza (){
            int i=0;
        try {

            this.url = String.format(this.url,this.host, this.port, this.db);
            this.conn = DriverManager.getConnection(this.url,this.user,this.pass);
            System.out.println("Connected to database");
            String query="Select `NAZWA`, `FILMWEB`, `OCENA WLASNA`,`TYP` from dane";
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(query);
            
        } catch (SQLException ex) {
            Logger.getLogger(baza.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Błąd!");
        }
}
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacrud.tech;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author l.milan
 */
public class UtilDB {

    static Connection con;
    static String driver = "com.mysql.cj.jdbc.Driver";
    static String url = "jdbc:mysql://localhost:3306/gestion_utilisateur";
    static String user = "mysql";
    static String pass = "azerty";

    public static Connection getConnect() throws Exception {
        if (con == null) {
            Class.forName(driver);
            con = DriverManager.getConnection(url, user, pass);
        }
        return con;
    }
}

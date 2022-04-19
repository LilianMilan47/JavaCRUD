  /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacrud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javacrud.view.Login;

/**
 *
 * @author l.milan
 */
public class JavaCRUD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Connection con;
        String url = "jdbc:mysql://localhost:3306/gestion_utilisateur";
        String user = "mysql";
        String pass = "azerty";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pass);

            String rqSql = "SELECT * FROM utilisateur";
            PreparedStatement ps = con.prepareStatement(rqSql);
            ResultSet result = ps.executeQuery();
            while (result.next()) {
                System.out.print(result.getString("ut_pseudo") + " "
                        + result.getString("ut_nom") + " " + result.getString("ut_prenom") + "\n"
                );
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        Login login = new Login();
        login.setVisible(true);
    }

}

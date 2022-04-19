/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacrud.control;

import javacrud.tech.UtilDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.TreeMap;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javacrud.model.Commune;

/**
 *
 * @author l.milan
 */
public class VilleDAO implements VilleDAOInterface {

    public HashMap<Integer, Commune> villesPourCp(Integer codePostal) {
        HashMap<Integer, Commune> listVilles = new HashMap<>();
        try {
            Connection con = UtilDB.getConnect();
            String sql
                    = "SELECT * FROM codes_postaux WHERE Code_Postal= ? ORDER BY Nom_Commune;";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, codePostal.toString());
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Commune uneVille = new Commune(codePostal.toString(),
                        rs.getString("Num_Postal"),
                        rs.getString("Nom_Commune"));
                listVilles.put(rs.getInt("Num_Postal"), uneVille);
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "DB : Erreur au chargement des communes");
        }
        return listVilles;
    }

    @Override
    public HashMap<Integer, Commune> list() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

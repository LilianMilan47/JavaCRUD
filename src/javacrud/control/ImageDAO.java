/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacrud.control;

import java.io.InputStream;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javacrud.tech.UtilDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author l.milan
 */
public class ImageDAO {

    public static ImageIcon getUtIcon(String pseudo) {
        BufferedImage image = null;
        ImageIcon avatar = null;
        try {
            Connection con = UtilDB.getConnect();
            String sql = "SELECT * FROM util_avatar WHERE utPseudo=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, pseudo);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                InputStream img = rs.getBinaryStream("utAvatar");
                image = ImageIO.read(img);
                //affiche((BufferedImage) image);
            }
        } catch (Exception ex) {
            //JOptionPane.showMessageDialog(null, "Image : Erreur à la lecture de
//l'image\n" + ex);

        }
        if (image != null) {
            avatar = new ImageIcon(image);
        }
        return avatar;
    }
}
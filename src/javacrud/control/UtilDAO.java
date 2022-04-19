/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacrud.control;

import javacrud.model.Utilisateur;
import java.util.TreeMap;

/**
 *
 * @author l.milan
 */
public interface UtilDAO {

    public void create(Utilisateur utilisateur);

    public void update(Utilisateur utilisateur);

    public void delete(String pseudo);

    public Utilisateur get(String pseudo);

    public TreeMap<String, Utilisateur> list();
}

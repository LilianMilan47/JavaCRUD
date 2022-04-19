/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacrud.control;

import java.util.HashMap;
import javacrud.model.Commune;

/**
 *
 * @author l.milan
 */
public interface VilleDAOInterface {
     
    public HashMap<Integer, Commune> list();
    
}

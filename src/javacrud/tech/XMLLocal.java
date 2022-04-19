/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacrud.tech;

import java.io.File;
import java.io.FileWriter;
import java.nio.file.Paths;
import java.text.Format;
import javacrud.control.ConfigDAO;
import javax.swing.text.Document;

/**
 *
 * @author l.milan
 */
public class XMLLocal {
/*
    public static Document getDocument() throws Exception {
        Document docXML;
        String path;
        String homePath = System.getProperty("user.home");
        File fichier = new File(Paths.get(homePath, ".javacrud").toString());
        if (!fichier.exists()) {
            fichier.mkdir();
        }
        path = Paths.get(homePath, ".javacrud", "config.xml").toString();
        fichier = new File(path);
        if (!fichier.exists()) {
            new ConfigDAO().initXMLFile();
        }
        SAXBuilder builder = new SAXBuilder();
        docXML = builder.build(new File(path));
        return docXML;
    }

    public static void saveDocument(Document docXML) throws Exception {
        String path = Paths.get(System.getProperty("user.home"), ".javacrud", "config.xml").toString();
        File fichier = new File(path);
        XMLOutputter xml = new XMLOutputter();
        xml.setFormat(Format.getPrettyFormat());
        xml.output(docXML, new FileWriter(path));
    }
*/
}

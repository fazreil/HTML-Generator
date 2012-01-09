/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package my.mimos.HTMLGenerator;

import java.io.File;
import java.io.FileWriter;
/**
 *
 * @author fazreil.jalil
 */
public class FileGenerator {

    private File f;
    private FileWriter fw;

    public FileGenerator(String fileName) {
        //generate file
        try{
            f = new File(fileName);
            if(!f.exists())
            {
                f.createNewFile();
                System.out.println("File "+fileName+" has been created.");
            }
        }
        catch(Exception ex)
        {
            System.out.println("Unexpected error occurs.");
            System.out.println(ex.getMessage());
        }
    }

    private void printHtmlOnFile()
    {

    }

    public File getFile()
    {
        return f;
    }

    public void setFile(File f)
    {
        this.f = f;
    }
}

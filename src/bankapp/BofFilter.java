
package bankapp;

import java.io.File;
import javax.swing.filechooser.FileFilter;


class BofFilter extends FileFilter {

    public BofFilter() {
    }

    
    public boolean accept(File f) {
        if (f.isDirectory() || f.getName().toLowerCase().endsWith(".bof")) {
            return true;
        } else {
            return false;
        }
    }

   
    public String getDescription() {
        return "Bank Object File";
    }

}

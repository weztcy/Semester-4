package inventori_barang;

import net.sf.jasperreports.view.*;
import net.sf.jasperreports.engine.*;
import java.io.File;
import javax.swing.JOptionPane;
import java.sql.*;
import net.sf.jasperreports.engine.util.JRLoader;

public class Report {

    public Report() {
    }

    public Report(String filename, Connection conn) {
        try {
            File report = new File(filename);
            JasperReport jreprt = (JasperReport) JRLoader.loadObject(report);
            JasperPrint jprintt = JasperFillManager.fillReport(jreprt, null, conn);
            JasperViewer.viewReport(jprintt, false);
        } catch (JRException e) {
            JOptionPane.showMessageDialog(null, "Opening report failed!", "Print report!", JOptionPane.ERROR_MESSAGE);
        }
    }
}
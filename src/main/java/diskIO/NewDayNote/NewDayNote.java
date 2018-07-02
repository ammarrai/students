package diskIO.NewDayNote;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

public class NewDayNote {

    public static void main(String[] args) throws IOException {

        LocalDate ld = LocalDate.now();
        String fileName = ld.toString() + ".txt";
        File file = new File(fileName);


        // if file already exists, open it on desktop.

        if (file.exists() && file.isFile()) {
            PopUp.infoBox("File Already Exists", "Alert");

            if (Desktop.isDesktopSupported()) {
                Desktop.getDesktop().open(file);
            } else {
                PopUp.infoBox("Desktop Not Supported", "Alert");
            }
            return;

        } else {

            // otherwise, create a new file and open it.

            PrintWriter writer = new PrintWriter(fileName, "UTF-8");
            writer.close();

            if (Desktop.isDesktopSupported()) {
                Desktop.getDesktop().open(file);
            } else {
                PopUp.infoBox("Desktop Not Supported", "Alert");
            }
        }
    }
}

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

public class PictureClass {
    private static String motorradPfad = "src/Pictures/motorrad.jpg";
    private static String traktorPfad = "src/Pictures/traktor.jpg";
    private static String rennautoPfad = "src/Pictures/rennauto.jpg";
    private static String suvPfad = "src/Pictures/suv.jpg";

    public static ImageIcon getImage(String fahrzeugtypen){
        String filepath = "";
        if(fahrzeugtypen.equals("Motorrad")){
            filepath = motorradPfad;
        } else if(fahrzeugtypen.equals("Traktor")){
            filepath = traktorPfad;
        } else if (fahrzeugtypen.equals("Rennauto")) {
            filepath = rennautoPfad;
        } else if (fahrzeugtypen.equals("SUV")) {
            filepath = suvPfad;
        }

        if(!filepath.equals("")){
            BufferedImage image;
            try{
                image = ImageIO.read(new File(filepath));
            } catch (Exception e){
                e.printStackTrace();
                return null;
            }
            int width = image.getWidth();
            int height = image.getHeight();
            double scaleWidth = (double) 100 / width;
            double scaleHeight = (double) 100 / height;
            double scalefactor = Math.min(scaleHeight, scaleWidth);
            ImageIcon icon = new ImageIcon(image.getScaledInstance((int) (width * scalefactor),
                    (int) (height * scalefactor), Image.SCALE_SMOOTH));
            return icon;

        }

        return null;
    }
}

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

public class CheckBoxPanel extends JPanel {
    JLabel pictureLabel = new JLabel();
    JCheckBox checkBox = new JCheckBox();
    JPanel panel = new JPanel();

    public CheckBoxPanel(String text, String filepath){
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        try{
            BufferedImage image = ImageIO.read(new File(filepath));
            // Größe des Bildes ermitteln für Resizing
            int x = image.getWidth();
            int y = image.getHeight();
            double scaleX = (double) 100 / x;
            double scaleY = (double) 100 / y;
            // Skalierungsfaktor für die Anpassung der Bildgröße
            double scalefactor = Math.min(scaleX, scaleY);
            // Anpassung der Bildgröße und Erstellung eines ImageIcons
            ImageIcon icon = new ImageIcon(image.getScaledInstance((int)(x * scalefactor),(int)( y * scalefactor), Image.SCALE_DEFAULT));
            pictureLabel = new JLabel(icon);
        } catch (Exception e){
            e.printStackTrace();
        }

        panel.add(pictureLabel);
        checkBox = new JCheckBox(text, false);
        panel.add(checkBox);

        this.add(panel);
    }

    public CheckBoxPanel(String fahrzeugtypen){
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        pictureLabel = new JLabel(Pictureclass.getImage(fahrzeugtypen));

        panel.add(pictureLabel);
        checkBox = new JCheckBox(fahrzeugtypen, false);
        panel.add(checkBox);

        this.add(panel);
    }
}

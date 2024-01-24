import WettrennenV2.*;

import javax.swing.*;
import java.awt.*;

public class PlatzierungsPanel extends Panel {
    // ToDone: 3 Label -> 1. Label für den Platz, 2. Label für Fahrzeuginformation, 3. Label Fahrzeugbild
    // ToDone: Fahrzeugbilder exportierbar
    // ToDone: PlatzierungsPanel einbinden in GUI
    // ToDo: Konsolenausgaben rausnehmen
    // ToDo: Top3, der jeweiligen Fahrzeugklasse

    private JLabel platz = new JLabel();
    private JLabel fahrzeuginfos = new JLabel();
    private JLabel fahrzeugbild;

    private JPanel panel = new JPanel();
    private BoxLayout boxLayout = new BoxLayout(panel, BoxLayout.X_AXIS);

    public PlatzierungsPanel(){}

    public PlatzierungsPanel(String platz, Fahrzeug fahrzeug){
        this.platz.setText(platz);
        String fahrzeuginformationen = "<html>" +
                fahrzeug.getKennzeichen() + "<br/>" +
                fahrzeug.getRennstrecke() + " km <br/>" +
                fahrzeug.getMoney() + " Euro<br/>" +
                fahrzeug.getColor() + "</html>";
        this.fahrzeuginfos.setText(fahrzeuginformationen);
        ImageIcon icon = PictureClass.getImage(getType(fahrzeug)); // Methodenaufruf um Bild zu erhalten
        fahrzeugbild = new JLabel(icon);

        panel.add(this.platz);
        panel.add(this.fahrzeuginfos);
        panel.add(this.fahrzeugbild);

        this.add(panel);
    }

    public PlatzierungsPanel(int platz, Fahrzeug fahrzeug){
        this.platz.setText(platz + ".Platz: ");

        String fahrzeuginformationen = "<html>" +
                fahrzeug.getKennzeichen() + "<br/>" +
                fahrzeug.getRennstrecke() + " km <br/>" +
                fahrzeug.getMoney() + " Euro<br/>" +
                fahrzeug.getColor() + "</html>";
        this.fahrzeuginfos.setText(fahrzeuginformationen);
        ImageIcon icon = PictureClass.getImage(getType(fahrzeug)); // Methodenaufruf um Bild zu erhalten
        fahrzeugbild = new JLabel(icon);

        panel.add(this.platz);
        panel.add(this.fahrzeuginfos);
        panel.add(this.fahrzeugbild);

        this.add(panel);
    }

    private String getType(Fahrzeug fahrzeug){
        String type = "";
        if(fahrzeug instanceof SUV){
            type = "SUV";
        } else if (fahrzeug instanceof Traktor) {
            type = "Traktor";
        } else if (fahrzeug instanceof Rennauto) {
            type = "Rennauto";
        } else if (fahrzeug instanceof Motorrad) {
            type = "Motorrad";
        } else {
            type = null;
        }

        return type;
    }
}

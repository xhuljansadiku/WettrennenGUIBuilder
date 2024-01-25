import WettrennenV2.*;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Teilnehmerliste {

    JFrame frame = new JFrame("Erweiterung der Siegerliste");

    JLabel plätze = new JLabel("Die Plätze");

    JLabel motorrad = new JLabel("Motorrad");

    JLabel rennauto = new JLabel("Rennauto");

    JLabel traktor = new JLabel("Traktor");

    JLabel suv = new JLabel("SUV");

    private ArrayList<Fahrzeug> gesamtliste;
    private ArrayList<Fahrzeug> traktorListe = new ArrayList<>();
    private ArrayList<Fahrzeug> suvListe = new ArrayList<>();
    private ArrayList<Fahrzeug> rennautoListe = new ArrayList<>();
    private ArrayList<Fahrzeug> motorradListe = new ArrayList<>();

    public Teilnehmerliste() {}

    public void createAndShowTeilnehmerliste() {
        JPanel panel = new JPanel();

        GridBagLayout gbl = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        panel.setLayout(gbl);
        gbl.setConstraints(panel, gbc);

        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(plätze, gbc);
        plätze.setPreferredSize(new Dimension(300, 900));

        gbc.gridx = 1;
        gbc.gridy = 0;
        panel.add(motorrad, gbc);
        motorrad.setPreferredSize(new Dimension(200, 900));

        gbc.gridx = 2;
        gbc.gridy = 0;
        panel.add(rennauto, gbc);
        rennauto.setPreferredSize(new Dimension(200, 900));

        gbc.gridx = 3;
        gbc.gridy = 0;
        panel.add(traktor, gbc);
        traktor.setPreferredSize(new Dimension(200, 900));

        gbc.gridx = 4;
        gbc.gridy = 0;
        panel.add(suv, gbc);
        suv.setPreferredSize(new Dimension(200, 900));

        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setSize(1200, 900);
        frame.setVisible(true);
    }

    public ArrayList<Fahrzeug> getlist(ArrayList<Fahrzeug> liste) {
        gesamtliste = new ArrayList<>(liste);
        return gesamtliste;
    }

    public ArrayList<Fahrzeug> traktorliste() {
        int size = gesamtliste.size();

        for (int i = 0; i < size; i++) {
            if (gesamtliste.get(i) instanceof Traktor) {
                traktorListe.add(gesamtliste.get(i));
            }
        }

        return traktorListe;
    }

    public ArrayList<Fahrzeug> suvliste() {
        int size = gesamtliste.size();

        for (int i = 0; i < size; i++) {
            if (gesamtliste.get(i) instanceof SUV) {
                suvListe.add(gesamtliste.get(i));
            }
        }

        return suvListe;
    }

    public ArrayList<Fahrzeug> rennautoliste() {
        int size = gesamtliste.size();

        for (int i = 0; i < size; i++) {
            if (gesamtliste.get(i) instanceof Rennauto) {
                rennautoListe.add(gesamtliste.get(i));
            }
        }

        return rennautoListe;
    }

    public ArrayList<Fahrzeug> motorradliste() {
        int size = gesamtliste.size();

        for (int i = 0; i < size; i++) {
            if (gesamtliste.get(i) instanceof Motorrad) {
                motorradListe.add(gesamtliste.get(i));
            }
        }

        return motorradListe;
    }

    public void showlist() {
        int size = gesamtliste.size();
        String gesamttext = "<html><div style='background-color: yellow;'>Die Plätze:</div><br/><br/>";
        for (int i = 0; i < size; i++) {
            gesamttext += "Platz: " + (i + 1) + " mit dem Kennzeichen " + gesamtliste.get(i).getKennzeichen() + " ist eine Strecke von" + gesamtliste.get(i).getRennstrecke() + " gefahren." + " <br/> <br/>";
        }
        plätze.setText("<html>" + gesamttext + "</html>");
    }

    public void showMotorrad() {
        int size = motorradListe.size();
        String gesamttext = "<html><div style='background-color: yellow;'>Die Motorräder:</div><br/><br/>";
        for (int i = 0; i < size; i++) {
            gesamttext += "Platz: " + (i + 1) + " mit dem Kennzeichen " + motorradListe.get(i).getKennzeichen() + " ist eine Strecke von" + motorradListe.get(i).getRennstrecke() + " gefahren." + " <br/> <br/>";
        }
        motorrad.setText("<html>" + gesamttext + "</html>");
    }

    public void showSUV() {
        int size = suvListe.size();
        String gesamttext = "<html><div style='background-color: yellow;'>Die SUVs:</div><br/><br/>";
        for (int i = 0; i < size; i++) {
            gesamttext += "Platz: " + (i + 1) + " mit dem Kennzeichen " + suvListe.get(i).getKennzeichen() + " ist eine Strecke von" + suvListe.get(i).getRennstrecke() + " gefahren." + " <br/> <br/>";
        }
        suv.setText("<html>" + gesamttext + "</html>");
    }

    public void showTraktor() {
        int size = traktorListe.size();
        String gesamttext = "<html><div style='background-color: yellow;'>Die Traktoren:</div><br/><br/>";
        for (int i = 0; i < size; i++) {
            gesamttext += "Platz: " + (i + 1) + " mit dem Kennzeichen " + traktorListe.get(i).getKennzeichen() + " ist eine Strecke von" + traktorListe.get(i).getRennstrecke() + " gefahren." + " <br/> <br/>";
        }
        traktor.setText("<html>" + gesamttext + "</html>");
    }

    public void showrennauto() {
        int size = rennautoListe.size();
        String gesamttext = "<html><div style='background-color: yellow;'>Die Rennautos:</div><br/><br/>";

        for (int i = 0; i < size; i++) {
            gesamttext += "Platz: " + (i + 1) + " mit dem Kennzeichen " + rennautoListe.get(i).getKennzeichen() +
                    " ist eine Strecke von" + rennautoListe.get(i).getRennstrecke() + " gefahren." + "<br/><br/>";
        }
        rennauto.setText(gesamttext + "</html>");
    }

}

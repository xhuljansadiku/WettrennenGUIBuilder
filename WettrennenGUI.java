import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;

import WettrennenV2.Wettrennen;
import WettrennenV2.Fahrzeug;

public class WettrennenGUI {
    JFrame frame = new JFrame("Wettrennen");
    JLabel anzahlTeilnehmer = new JLabel("Anzahl der Teilnehmer");
    JTextField teilnehmerTF = new JTextField();
    JLabel anzahlRunden = new JLabel("Anzahl der Runden");
    JTextField rundenTF = new JTextField();
    JButton startButton = new JButton("Starte Rennen");

    JLabel platzierungsLabel = new JLabel("Platzierung");

    JPanel vehiclePanel = new JPanel();

    CheckBoxPanel suv_panel = new CheckBoxPanel("SUV", "src/Pictures/suv.jpg");
    CheckBoxPanel traktor_panel = new CheckBoxPanel("Traktor", "src/Pictures/traktor.jpg");
    CheckBoxPanel motorrad_panel = new CheckBoxPanel("Motorrad", "src/Pictures/motorrad.jpg");
    CheckBoxPanel rennauto_panel = new CheckBoxPanel("Rennauto", "src/Pictures/rennauto.jpg");



    JPanel platzPanel = new JPanel();

    CheckBoxPanel platz1 = new CheckBoxPanel("SUV", "src/Pictures/suv.jpg");
    CheckBoxPanel platz2 = new CheckBoxPanel("Traktor", "src/Pictures/traktor.jpg");
    CheckBoxPanel platz3 = new CheckBoxPanel("Motorrad", "src/Pictures/motorrad.jpg");
    CheckBoxPanel platz4 = new CheckBoxPanel("Rennauto", "src/Pictures/rennauto.jpg");





    public WettrennenGUI(){}

    private void createAndShowGUI(){
        JPanel panel = new JPanel();

        GridBagLayout gbl = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        panel.setLayout(gbl);
        gbl.setConstraints(panel, gbc);

        vehiclePanel.setLayout(new BoxLayout(vehiclePanel, BoxLayout.X_AXIS));
        vehiclePanel.add(suv_panel);
        vehiclePanel.add(traktor_panel);
        vehiclePanel.add(motorrad_panel);
        vehiclePanel.add(rennauto_panel);


        platzPanel.setLayout(new BoxLayout(platzPanel,BoxLayout.Y_AXIS));
        platzPanel.add(platz1);
        platzPanel.add(platz2);
        platzPanel.add(platz3);
        platzPanel.add(platz4);


        gbc.gridx = 0;
        gbc.gridy = 0;
        // ermöglicht die Überdeckung von 3 Spalten
        gbc.gridwidth = 8;
        panel.add(vehiclePanel, gbc);

        // setzt für alle nachfolgenden Elemente die Spaltenbreite wieder auf 1
        gbc.gridwidth = 1;
        gbc.gridx = 2;
        gbc.gridy = 1;
        panel.add(anzahlRunden, gbc);

        gbc.gridx = 3;
        gbc.gridy = 1;
        panel.add(rundenTF, gbc);
        rundenTF.setPreferredSize(new Dimension(100, 30));

        gbc.gridx = 2;
        gbc.gridy = 2;
        panel.add(anzahlTeilnehmer, gbc);

        gbc.gridx = 3;
        gbc.gridy = 2;
        panel.add(teilnehmerTF, gbc);
        teilnehmerTF.setPreferredSize(new Dimension(100, 30));



        gbc.gridx = 7;
        gbc.gridy = 8;
        panel.add(startButton, gbc);

        gbc.gridx = 2;
        gbc.gridy = 4;
        panel.add(platzierungsLabel, gbc);

        gbc.gridx = 3;
        gbc.gridy = 4;
        // ermöglicht die Überdeckung von 3 Spalten
        gbc.gridwidth = 3;
        panel.add(platz1, gbc);

        gbc.gridx = 3;
        gbc.gridy = 5;
        // ermöglicht die Überdeckung von 3 Spalten
        gbc.gridwidth = 3;
        panel.add(platz2, gbc);

        gbc.gridx = 3;
        gbc.gridy = 6;
        // ermöglicht die Überdeckung von 3 Spalten
        gbc.gridwidth = 3;
        panel.add(platz3, gbc);

        gbc.gridx = 3;
        gbc.gridy = 7;
        // ermöglicht die Überdeckung von 3 Spalten
        gbc.gridwidth = 3;
        panel.add(platz4, gbc);




        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setSize(1200, 800);
        frame.setVisible(true);
    }

    public void main(){
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                createAndShowGUI();
                setButtonListener();
            }
        });
    }

    private void setButtonListener(){
        ActionListener startListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int rundenZahl = 0;
                try{
                    rundenZahl = Integer.parseInt(rundenTF.getText());
                } catch (Exception exception){
                    rundenZahl = 6;
                }

                int teilnehmerZahl = 0;
                try{
                    teilnehmerZahl = Integer.parseInt(teilnehmerTF.getText());
                } catch (Exception exception){
                    teilnehmerZahl = 10;
                }

                ArrayList<String> vehicleList = new ArrayList<>();
                if(traktor_panel.checkBox.isSelected()){
                    vehicleList.add("Traktor");
                }

                if(suv_panel.checkBox.isSelected()){
                    vehicleList.add("SUV");
                }

                if(rennauto_panel.checkBox.isSelected()){
                    vehicleList.add("Rennauto");
                }

                if(motorrad_panel.checkBox.isSelected()){
                    vehicleList.add("Motorrad");
                }

                if(vehicleList.size() == 0){
                    Collections.addAll(vehicleList, "Rennauto", "SUV", "Traktor", "Motorrad");
                }

                String[] vehicleArray = vehicleList.toArray(new String[vehicleList.size()]);


                // ToDone: Wettrennen initialisieren
                Wettrennen wettrennen = new Wettrennen();
                wettrennen.initializeGUI(rundenZahl, teilnehmerZahl, vehicleArray);
                // wettrennen.guiInitializer(rundenZahl, teilnehmerZahl);
                /*
                System.out.println("RundenZahl: " + rundenZahl);
                System.out.println("TeilnehmerZahl: " + teilnehmerZahl);
                */

                // ToDone: Wettrennen starten
                wettrennen.raceStart();

                ArrayList<Fahrzeug> top3Liste = wettrennen.top3();
                // ToDone: Platzierung aus dem Rennen lesen

                platzierungsLabel.setText("<html>Platzierung: <br/> " +
                        "1.Platz: " + top3Liste.get(0).getKennzeichen() + " : " + top3Liste.get(0).getRennstrecke() + " <br/> " +
                        "2.Platz: " + top3Liste.get(1).getKennzeichen() + " : " + top3Liste.get(1).getRennstrecke()+ " <br/> " +
                        "3.Platz: " + top3Liste.get(2).getKennzeichen() + " : " + top3Liste.get(2).getRennstrecke()+ " </html>");

            }
        };
        startButton.addActionListener(startListener);

    }

    // ToDone: Fahrzeugklassen über Bilder+Checkbox auswählen für den RandomGenerator
    // ToDone: Bild raussuchen für die Checkboxen
    // ToDone: Bilder in Projekt einfügen
    // ToDone: Bilder in die Checkboxen einbinden
    // ToDone: Bilder in der Größe anpassen
    // ToDone: RandomGenerator modifizieren, dass er nur die ausgewählten Fahrzeugklassen nimmt
    // ToDone: Anpassungen in der Rennerstellung
    // ToDone: Liste aus ausgewählten Bildern erstellen

}

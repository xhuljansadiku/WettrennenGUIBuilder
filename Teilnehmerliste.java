import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.ImageObserver;
import java.text.AttributedCharacterIterator;
import java.util.ArrayList;
import java.util.Collections;

import WettrennenV2.Wettrennen;
import WettrennenV2.Fahrzeug;

public class Teilnehmerliste {
    JFrame frame = new JFrame("Wettrennen");

    JLabel plätze = new JLabel("Die Plätze");


    JLabel motorrad = new JLabel("Motorrad");


    JLabel rennauto = new JLabel("Rennauto");


    JLabel traktor = new JLabel("Traktor");



    JLabel suv = new JLabel("SUV");





    public Teilnehmerliste(){}

    private void createAndShowTeilnehmerliste(){
        JPanel panel = new JPanel();

        GridBagLayout gbl = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        panel.setLayout(gbl);
        gbl.setConstraints(panel, gbc);


        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(plätze, gbc);
        plätze.setPreferredSize(new Dimension(200, 300));


        gbc.gridx = 1;
        gbc.gridy = 0;
        panel.add(motorrad, gbc);
        motorrad.setPreferredSize(new Dimension(200, 300));


        gbc.gridx = 2;
        gbc.gridy = 0;
        panel.add(rennauto, gbc);
        rennauto.setPreferredSize(new Dimension(200, 300));



        gbc.gridx = 1;
        gbc.gridy = 2;
        panel.add(traktor, gbc);
        traktor.setPreferredSize(new Dimension(200, 300));



        gbc.gridx = 2;
        gbc.gridy = 2;
        panel.add(suv, gbc);
        suv.setPreferredSize(new Dimension(200, 300));


        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setSize(1200, 900);
        frame.setVisible(true);
    }

    public void main(){
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                createAndShowTeilnehmerliste();
                //setButtonListener();
            }
        });
    }

    /*
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


    /*
                // ToDone: Wettrennen starten
                wettrennen.raceStart();

                wettrennen.sortWinner();

                ArrayList<Fahrzeug> top3Liste = wettrennen.top3();
                // ToDone: Platzierung aus dem Rennen lesen
                firstPlace = new PlatzierungsPanel("1. Platz", top3Liste.get(0));
                secondPlace = new PlatzierungsPanel("2. Platz", top3Liste.get(1));
                thirdPlace = new PlatzierungsPanel(3, top3Liste.get(2));
                // ToDone: Löschen alter Gewinner
                // Löschen ALLER bisherigen Komponenten von treppchen
                treppchen.removeAll();

                // Einbinden der neuen Gewinner
                treppchen.add(firstPlace);
                treppchen.add(secondPlace);
                treppchen.add(thirdPlace);

                // Neuladen des Panels
                treppchen.revalidate();
                treppchen.repaint();


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


     */
}

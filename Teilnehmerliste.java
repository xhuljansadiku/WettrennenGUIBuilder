import WettrennenV2.*;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Teilnehmerliste {

    static JFrame frame = new JFrame("Erweiterung der Siegerliste");

    static JLabel plätze = new JLabel("Die Plätze" );


    static JLabel motorrad = new JLabel("Motorrad");


    static JLabel rennauto = new JLabel("Rennauto");


    static JLabel traktor = new JLabel("Traktor");



    static JLabel suv = new JLabel("SUV");



    public Teilnehmerliste(){}


    private static ArrayList<Fahrzeug> gesamtliste ;
    private static ArrayList<Fahrzeug> traktorListe = new ArrayList<>();
    private static ArrayList<Fahrzeug> suvListe = new ArrayList<>();
    private static ArrayList<Fahrzeug>  rennautoListe = new ArrayList<>();
    private static ArrayList<Fahrzeug>  motorradListe = new ArrayList<>();



    public static void createAndShowTeilnehmerliste(){
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




    public static ArrayList getlist(ArrayList<Fahrzeug> liste){

        gesamtliste = new ArrayList<>(liste);
        return gesamtliste;
    }

    public static ArrayList traktorliste(){
        int size = gesamtliste.size();

        for (int i = 0;i <size; i++){
            if(gesamtliste.get(i) instanceof Traktor){

                traktorListe.add(gesamtliste.get(i));
            }
        }

        return null;
    }

    public static ArrayList suvliste(){
        int size = gesamtliste.size();

        for (int i = 0;i <size; i++){
            if(gesamtliste.get(i) instanceof SUV){

                suvListe.add(gesamtliste.get(i));
            }
        }

        return null;
    }

    public static ArrayList rennautoliste(){
        int size = gesamtliste.size();

        for (int i = 0;i <size; i++){
            if(gesamtliste.get(i) instanceof Rennauto){

                rennautoListe.add(gesamtliste.get(i));
            }
        }

        return null;
    }

    public static ArrayList motorradliste(){
        int size = gesamtliste.size();

        for (int i = 0;i <size; i++){
            if(gesamtliste.get(i) instanceof Motorrad){

                motorradListe.add(gesamtliste.get(i));
            }
        }

        return null;
    }

    public static void showlist(){
        int size = gesamtliste.size();
        String gesamttext= "Die Plätze: " + " <br/> ";
        for (int i =0; i < size; i++){
            gesamttext += "Platz: "+ (i+1) + "mit dem Kennzeichen "+ gesamtliste.get(i).getKennzeichen() + "ist eine Strecke von" + gesamtliste.get(i).getRennstrecke()+ " gefahren." + " <br/> ";
        }
        plätze.setText("<html>" +gesamttext + "<html>");

    }

    public static void showMotorrad(){
        int size = motorradListe.size();
        String gesamttext= "Die Plätze: "+ " <br/> ";
        for (int i =0; i < size; i++){
            gesamttext += "Platz: "+ (i+1) + "mit dem Kennzeichen "+ motorradListe.get(i).getKennzeichen() + "ist eine Strecke von" + motorradListe.get(i).getRennstrecke()+ " gefahren." + " <br/> ";
        }
        motorrad.setText("<html>" +gesamttext + "<html>");

    }
    public static void showSUV(){
        int size = suvListe.size();
        String gesamttext= "Die SUVs: "+" <br/> ";
        for (int i =0; i < size; i++){
            gesamttext += "Platz: "+ (i+1) + "mit dem Kennzeichen "+ suvListe.get(i).getKennzeichen() + "ist eine Strecke von" + suvListe.get(i).getRennstrecke()+ " gefahren." + " <br/> ";
        }
        suv.setText("<html>" +gesamttext + "<html>");

    }
    public static void showTraktor(){
        int size = traktorListe.size();
        String gesamttext= "Die Traktoren: " + " <br/> ";
        for (int i =0; i < size; i++){
            gesamttext += "Platz: "+ (i+1) + "mit dem Kennzeichen "+ traktorListe.get(i).getKennzeichen() + "ist eine Strecke von" + traktorListe.get(i).getRennstrecke()+ " gefahren." + " <br/> ";
        }
        traktor.setText("<html>" +gesamttext + "<html>");

    }
    public static void showrennauto(){
        int size = rennautoListe.size();
        String gesamttext= "Die Rennautos: " + " <br/> ";
        for (int i =0; i < size; i++){
            gesamttext += "Platz: "+ (i+1) + "mit dem Kennzeichen "+ rennautoListe.get(i).getKennzeichen() + "ist eine Strecke von" + rennautoListe.get(i).getRennstrecke()+ " gefahren." + " <br/> ";
        }
        rennauto.setText("<html>" +gesamttext + "<html>");

    }




}

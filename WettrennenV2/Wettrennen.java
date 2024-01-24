package WettrennenV2;

import java.util.ArrayList;


public class Wettrennen {
    private ArrayList<Fahrzeug> teilnehmerListe = new ArrayList<>();
    private int rennDauer = 0;
    private int teilnehmerZahl = 0;

    private int zuschauerZahl = 0;

    private ArrayList<Zuschauer> zuschauerListe = new ArrayList<>();

    public Wettrennen() {
    }


    public void initializeGUI(int rennDauer, int teilnehmerZahl, String[] vehicle) {
        this.rennDauer = rennDauer;
        this.teilnehmerZahl = teilnehmerZahl;

        createVehicle(vehicle);
    }

    public void createVehicle(String[] vehicle) {
        for (int i = 0; i < this.teilnehmerZahl; i++) {
            Fahrzeug fahrzeug = new Fahrzeug();
            String car = Zufallsgenerator.vehiclePicker(vehicle);

            if (car.equals("Rennauto")) {
                fahrzeug = new Rennauto(
                        Zufallsgenerator.doubleGen(30, 90),
                        Zufallsgenerator.doubleGen(30, 90),
                        Zufallsgenerator.doubleGen(2.0, 8.9),
                        Zufallsgenerator.doubleGen(140, 350),
                        Zufallsgenerator.doubleGen(140, 350),
                        Zufallsgenerator.kennzeichenGen(),
                        Zufallsgenerator.colorGen(),
                        Zufallsgenerator.stringGen(15),
                        Zufallsgenerator.doubleGen(20, 140000),
                        0.0,
                        Zufallsgenerator.boolGen(),
                        Zufallsgenerator.doubleGen(50, 250),
                        Zufallsgenerator.doubleGen(14, 95),
                        Zufallsgenerator.intGen(200, 500));
            } else if (car.equals("SUV")) {
                fahrzeug = new SUV(
                        Zufallsgenerator.doubleGen(30, 90),
                        Zufallsgenerator.doubleGen(30, 90),
                        Zufallsgenerator.doubleGen(2.0, 8.9),
                        Zufallsgenerator.doubleGen(140, 350),
                        Zufallsgenerator.doubleGen(140, 350),
                        Zufallsgenerator.kennzeichenGen(),
                        Zufallsgenerator.colorGen(),
                        Zufallsgenerator.stringGen(15),
                        Zufallsgenerator.doubleGen(20, 140000),
                        0.0,
                        Zufallsgenerator.boolGen(),
                        Zufallsgenerator.doubleGen(50, 250),
                        Zufallsgenerator.doubleGen(14, 95),
                        Zufallsgenerator.boolGen()
                );
            } else if (car.equals("Traktor")) {
                fahrzeug = new Traktor(Zufallsgenerator.doubleGen(30, 90),
                        Zufallsgenerator.doubleGen(30, 90),
                        Zufallsgenerator.doubleGen(2.0, 8.9),
                        Zufallsgenerator.doubleGen(140, 350),
                        Zufallsgenerator.doubleGen(140, 350),
                        Zufallsgenerator.kennzeichenGen(),
                        Zufallsgenerator.colorGen(),
                        Zufallsgenerator.stringGen(15),
                        Zufallsgenerator.doubleGen(20, 140000),
                        0.0,
                        Zufallsgenerator.boolGen(),
                        Zufallsgenerator.doubleGen(50, 250),
                        Zufallsgenerator.doubleGen(14, 95),
                        Zufallsgenerator.boolGen(),
                        Zufallsgenerator.doubleGen(500, 15000));
            } else if (car.equals("Motorrad")) {
                fahrzeug = new Motorrad(
                        Zufallsgenerator.doubleGen(30, 90),
                        Zufallsgenerator.doubleGen(30, 90),
                        Zufallsgenerator.doubleGen(2.0, 8.9),
                        Zufallsgenerator.doubleGen(140, 350),
                        Zufallsgenerator.doubleGen(140, 350),
                        Zufallsgenerator.kennzeichenGen(),
                        Zufallsgenerator.colorGen(),
                        Zufallsgenerator.stringGen(15),
                        Zufallsgenerator.doubleGen(20, 140000),
                        0.0,
                        Zufallsgenerator.boolGen(),
                        Zufallsgenerator.doubleGen(50, 250),
                        Zufallsgenerator.doubleGen(14, 95),
                        Zufallsgenerator.intGen(2, 3)
                );
            }

            teilnehmerListe.add(fahrzeug);
            /*
            double tankvolumen, double tankinhalt, double vebrauch, double maxSpeed,
            double currentSpeed, String kennzeichen, String color, String driver,
            double strecke, double rennstrecke, boolean isFueling, double money,
            double reifenProzent
            */

        }
    }


    // Gibt eine Liste mit den besten 3 Fahrzeugen zurück
    public ArrayList<Fahrzeug> top3() {
        ArrayList<Fahrzeug> top3Liste = new ArrayList<>();

        if (teilnehmerListe.size() >= 3) {
            top3Liste.add(teilnehmerListe.get(0));
            top3Liste.add(teilnehmerListe.get(1));
            top3Liste.add(teilnehmerListe.get(2));
        }

        return top3Liste;
    }

    public void sortWinner() {
        // Fehler war das umgedrehte < -Zeichen
        Fahrzeug temp;
        do {
            int size = this.teilnehmerListe.size();
            for (int i = 0; i < size; i++) {
                for (int j = 1; j < (size - 1); j++) {
                    if (this.teilnehmerListe.get(j - 1).getRennstrecke() < this.teilnehmerListe.get(j).getRennstrecke()) {
                        temp = this.teilnehmerListe.get(j - 1);
                        this.teilnehmerListe.set(j - 1, this.teilnehmerListe.get(j));
                        this.teilnehmerListe.set(j, temp);
                    }
                }
            }
        } while (this.teilnehmerListe.get(0).getRennstrecke() < this.teilnehmerListe.get(1).getRennstrecke() || this.teilnehmerListe.get(1).getRennstrecke() < this.teilnehmerListe.get(2).getRennstrecke());

    }

    public void raceStart() {
        for (int j = 0; j < this.rennDauer; j++) {
            for (int i = 0; i < this.teilnehmerListe.size(); i++) {
                Fahrzeug fahrzeug = teilnehmerListe.get(i);
                fahrzeug.drive(1);
            }
        }
    }
}






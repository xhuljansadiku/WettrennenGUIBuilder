package WettrennenV2;

public class Traktor extends Fahrzeug{
    private boolean frontlader;
    private double ladung;

    public Traktor() {
    }

    // 1 Test -> Ob die beiden Variablen korrekt befüllt werden
    // Eigentlich sollte ladung nicht negativ sein dürfen -> 1 Test
    public Traktor(boolean frontlader, double ladung) {
        this.frontlader = frontlader;
        this.ladung = ladung;
    }

    // 1 Test -> Ob alle Variablen korrekt befüllt werden
    // 1 Test -> Wenn versucht wird, tankinhalt > tankvolumen; currentSpeed > maxSpeed
    // 1 Test -> Negative Werte in tankvolumen, tankinhalt, verbrauch, maxSpeed, currentSpeed, strecke, money, reifenProzent, ladung
    public Traktor(double tankvolumen, double tankinhalt, double vebrauch, double maxSpeed, double currentSpeed,
                   String kennzeichen, String color, String driver, double strecke, double money,
                   double reifenProzent, boolean frontlader, double ladung) {
        super(tankvolumen, tankinhalt, vebrauch, maxSpeed, currentSpeed, kennzeichen, color, driver, strecke, money,
                reifenProzent);
        this.frontlader = frontlader;
        this.ladung = ladung;
    }

    // 1 Test -> Ob alle Variablen korrekt befüllt werden
    // 1 Test -> Wenn versucht wird, tankinhalt > tankvolumen; currentSpeed > maxSpeed; rennstrecke > strecke
    // 1 Test -> Negative Werte in tankvolumen, tankinhalt, verbrauch, maxSpeed, currentSpeed, strecke, money,
    // reifenProzent, ladung, rennstrecke
    public Traktor(double tankvolumen, double tankinhalt, double vebrauch, double maxSpeed, double currentSpeed,
                   String kennzeichen, String color, String driver, double strecke, double rennstrecke,
                   boolean isFueling, double money, double reifenProzent, boolean frontlader, double ladung) {
        super(tankvolumen, tankinhalt, vebrauch, maxSpeed, currentSpeed, kennzeichen, color, driver, strecke,
                rennstrecke, isFueling, money, reifenProzent);
        this.frontlader = frontlader;
        this.ladung = ladung;
    }

    // 1 Test ob Methode funktioniert
    public boolean isFrontlader() {
        return frontlader;
    }

    // 1 Test mit true
    // 1 Test mit false
    public void setFrontlader(boolean frontlader) {
        this.frontlader = frontlader;
    }

    // 1 Test ob die Methode funktioniert
    public double getLadung() {
        return ladung;
    }

    // 1 Test, positiver Wert
    // 1 Test, negativer Wert
    // 1 Test mit Grenzwert (max.Double + 1) -> fällt weg, wenn Bedingung darunter erfüllt
    // 1 Test Grenzwert, mit realistischen Werten (0t - 40,0t) (DARF)
    public void setLadung(double ladung) {
        if(ladung < 0.0){
            this.ladung = 0.0;
        } else {
            this.ladung = ladung;
        }
    }

    // 1 Test, ob Geschwindigkeit und Ausgabe stimmen
    public void protestieren(){
        this.setCurrentSpeed(0);
        System.out.println("WIR PROTESTIEREN!!!!!!");
    }

    // 1 Test, ob Ausgabe mit den entsprechenden Objektenwerten stimmt
    public String toString(){
        String autoinformation = "Das Auto mit dem Kennzeichen " + getKennzeichen() + " hat einen " +
                "Kilometerstand von " + round(this.getStrecke(), 2) + " km, fährt derzeit " +
                getCurrentSpeed() + " km/h\n schnell und verbraucht dabei "+ getVebrauch() +
                " l/100km und hat noch " + round(getTankinhalt(), 2) + " l im Tank.\nDerzeitiger Fahrer ist: " +
                getDriver() + ", das Auto hat die Farbe: " + getColor() + " und im aktuellen Rennen: " +
                getRennstrecke() + " km zurück gelegt \n" +
                "Ich bin ein Traktor.";
        return autoinformation;
    }
}

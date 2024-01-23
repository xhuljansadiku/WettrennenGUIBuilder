package WettrennenV2;

public class Fahrzeug {
    // Attribute
    private double tankvolumen = 60.0;
    private double tankinhalt = 50.0;
    private double vebrauch = 4.2;
    private double maxSpeed = 130.0;
    private double currentSpeed = 32.0;

    private String kennzeichen = "N-KD 1234";
    private String color = "Rot";
    private String driver = "The Kuschel Rock";

    private double strecke = 0.0;
    private double rennstrecke = 0.0;

    private boolean isFueling = false;

    private double reifenProzent = 95.0;
    private double money = 123.15;


    // Konstruktoren

    public Fahrzeug() { }

    public Fahrzeug(double tankvolumen, double tankinhalt, double vebrauch, double maxSpeed,
                    double currentSpeed, String kennzeichen, String color, String driver,
                    double strecke, double money, double reifenProzent) {
        this.tankvolumen = tankvolumen;
        setTankinhalt(tankinhalt);
        this.vebrauch = vebrauch;
        this.maxSpeed = maxSpeed;
        setCurrentSpeed(currentSpeed);
        this.kennzeichen = kennzeichen;
        this.color = color;
        this.driver = driver;
        this.strecke = strecke;
        this.money = money;
        this.reifenProzent = reifenProzent;

    }

    public Fahrzeug(double tankvolumen, double tankinhalt, double vebrauch, double maxSpeed,
                    double currentSpeed, String kennzeichen, String color, String driver,
                    double strecke, double rennstrecke, boolean isFueling, double money,
                    double reifenProzent) {
        this.tankvolumen = tankvolumen;
        setTankinhalt(tankinhalt);
        this.vebrauch = vebrauch;
        this.maxSpeed = maxSpeed;
        setCurrentSpeed(currentSpeed);
        this.kennzeichen = kennzeichen;
        this.color = color;
        this.driver = driver;
        this.strecke = strecke;
        this.rennstrecke = rennstrecke;
        this.isFueling = isFueling;
        this.money = money;
        this.reifenProzent = reifenProzent;
    }

    // Setter + Getter

    // 1 Test, ob Objekt richtig angelegt
    protected double getTankvolumen() {
        return tankvolumen;
    }

    private void setTankvolumen(double tankvolumen) {
        this.tankvolumen = tankvolumen;
    }

    // 1 Test, ob Objekt richtig angelegt
    public double getTankinhalt() {
        return tankinhalt;
    }

    // 1 Test: tankinhalt > tankvolumen
    // 1 Test: 0 < tankinhalt < tankvolumen
    // 1 Test: tankinhalt < 0
    public void setTankinhalt(double tankinhalt) {
        if (tankinhalt > this.tankvolumen){
            this.tankinhalt = this.tankvolumen;
        } else if (tankinhalt < 0.0){
            this.tankinhalt = 0.0;
        }
        else {
            this.tankinhalt = tankinhalt;
        }
    }

    // 1 Test, ob Objekt richtig angelegt wurde
    public double getVebrauch() {
        return vebrauch;
    }

    // 1 Test: verbrauch > 3.5 && currentSpeed vom Objekt < 150
    // 2 Test: verbrauch < 3.5 && verbrauch == 3.5
    // 4 Test: (currentSpeed > 150 || currentSpeed == 150) && (verbrauch < 7.5 || verbrauch == 7.5)
    public void setVebrauch(double verbrauch) {
        if(verbrauch <= 3.5){
            this.vebrauch = Zufallsgenerator.doubleGen(3.5, 9.5);
        } else if (verbrauch <= 7.5 && this.currentSpeed >= 150){
            this.vebrauch = Zufallsgenerator.doubleGen(7.5, 14.2);
        } else {
            this.vebrauch = verbrauch;
        }

    }

    // 1 Test, ob Objekt richtig angelegt
    public double getMaxSpeed() {
        return maxSpeed;
    }

    private void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    // 1 Test: Ob Objekt richtig angelegt wurde
    public double getCurrentSpeed() {
        return currentSpeed;
    }

    // 1 Test, ob currentSpeed > this.macSpeed;
    // 1 Test: currentSpeed < maxSpeed
    // 1 Test: Negative Zahlen
    public void setCurrentSpeed(double currentSpeed) {
        if(currentSpeed > this.maxSpeed){
            this.currentSpeed = this.maxSpeed;
        } else {
            this.currentSpeed = currentSpeed;
        }
    }

    // 1 Test: Korrekt angelegt
    public String getKennzeichen() {
        return kennzeichen;
    }

    private void setKennzeichen(String kennzeichen) {
        this.kennzeichen = kennzeichen;
    }

    // 1 Test: Korrekt angelegt
    public String getColor() {
        return color;
    }

    // 1 Test: Farbwechsel korrekt
    public void setColor(String color) {
        this.color = color;
    }

    // 1 Test: Korrekt angelegt
    public String getDriver() {
        return driver;
    }

    // 1 Test: korrekt geändert
    public void setDriver(String driver) {
        this.driver = driver;
    }

    // 1 Test: Korrekt angelegt
    public double getStrecke() {
        return strecke;
    }

    // 2 Test: Positiv & Negativ
    protected void setStrecke(double strecke) {
        if(strecke < 0){
            strecke *= -1;
        }
        this.strecke = strecke;
    }

    // 1 Test: Korrekt angelegt
    public double getRennstrecke() {
        return rennstrecke;
    }

    // 2 Test: Positiv & Negativ
    protected void setRennstrecke(double rennstrecke) {
        if(rennstrecke < 0){
            rennstrecke *= -1;
        }
        this.rennstrecke = rennstrecke;
    }

    // 1 Test: Korrekt angelegt
    public boolean isFueling() {
        return isFueling;
    }

    // 2 Test: Positiv & Negativ
    public void setFueling(boolean fueling) {
        isFueling = fueling;
    }

    // 1 Test: Korrekt angelegt
    public double getReifenProzent() {
        return reifenProzent;
    }

    // 2 Test: Positiv & Negativ
    // (Grenzen , wenn reifenProzent 0 <= reifenProzent <= 100)
    public void setReifenProzent(double reifenProzent) {
        if (reifenProzent < 0.0){
            this.reifenProzent = 0.0;
        } else if (reifenProzent > 100.0){
            this.reifenProzent = 100.0;
        } else {
            this.reifenProzent = reifenProzent;
        }
    }

    // 1 Test: Korrekt angelegt
    public double getMoney() {
        return money;
    }

    // 2 Test: Positiv & Negativ
    // (Grenzen , wenn money 0 <= money <= MAX.double)
    public void setMoney(double money) {
        if(money < 0.0){
            this.money = 0.0;
        } else {
            this.money = money;
        }
    }

    // Methoden
    // 3 Test: (zeit < 0 || zeit == 0 || zeit > 0)
    // 2 Test: isFueling = true / isFueling = false
    // 2 Test: reifenProzent <= 0.0 && 0 < reifenProzent
    // 2 Test: tankinhalt <= 0 && tankinhalt > 0
    // 2 Test: driver == null && driver != null
    // 2 Test: tankinhalt < verbrauch && tankinhalt > verbrauch
    // 2 Test: reifenProzent > 1.125 && reifenProzent <= 1.125
    public void drive(int zeit) {
        if (this.tankinhalt > 0.0 && this.driver != null && zeit > 0.0 && !isFueling() && reifenProzent > 0.0) {
            // km = km/h * h / 60 min
            // km = km/min

            double strecke = this.currentSpeed * zeit / 60;

            // l = l/100km * km
            double verbrauch = this.getVebrauch() / 100 * strecke;

            this.strecke += strecke;
            this.rennstrecke += strecke;

            if (this.getVebrauch() > this.tankinhalt) {
                this.tankinhalt = 0.0;
            } else {
                this.tankinhalt -= verbrauch;
            }

            double reifenAbnutzung = 1.125;

            if(this.reifenProzent - reifenAbnutzung < 0.0){
                this.reifenProzent = 0.0;
            } else {
                this.reifenProzent -= reifenAbnutzung;
            }
        } else if (isFueling()) {
            tanken();
        } else if (reifenProzent <= 0.0) {
            this.reifenProzent = 100.0;
            System.out.println("Reifenwechsel");
        }
    }

    public String toString(){
        String autoinformation = "Das Auto mit dem Kennzeichen " + getKennzeichen() + " hat einen " +
                "Kilometerstand von " + round(this.strecke, 2) + " km, fährt derzeit " +
                getCurrentSpeed() + " km/h\n schnell und verbraucht dabei "+ getVebrauch() +
                " l/100km und hat noch " + round(getTankinhalt(), 2) + " l im Tank.\nDerzeitiger Fahrer ist: " +
                getDriver() + ", das Auto hat die Farbe: " + getColor() + " und im aktuellen Rennen: " +
                getRennstrecke() + " km zurück gelegt";
        return autoinformation;
    }

    // 1 Test: Korrekt angelegt
    public String kennzeichenStrecke(){
        return getKennzeichen() + " : " + getRennstrecke();
    }

    public double round(double value, int decimalPoint){
        // Potenzieren von 10 um decimalPoint => Anzahl der Nachkommastellen
        double d = Math.pow(10, decimalPoint);
        // Zahl, die gerundet werden soll, wird um entsprechend viele Nachkommastellen verschoben
        // und dann durch die Potenz geteilt nachdem die Zahl gerundet wurde.
        d = Math.round(value * d) / d;
        return d;
    }

    // 2 Tests: money = 0 && money > 0
    // 2 Tests: tankinhalt = tankvolumen && tankinhalt < tankvolumen
    // => 3 Test: money == 0 &&
    // (money > 0 && tankinhalt +tankrate >= tankvolumen || money > 0 && tankinhalt + tankrate > tankvolumen)
    public void tanken(){
        double tankrate = this.tankvolumen / 10;
        this.setFueling(true);
        double pricePerLiter = 1.79;

        double pay = pricePerLiter * tankrate;


        if(this.money == 0.0){
            System.out.println("Ich habe kein Geld mehr");
        } else {
            if(pay > this.money) {
                tankrate = this.money / pricePerLiter;
                pay = tankrate * pricePerLiter;
            }

            // Prüfen ob aktueller Inhalt + Tankrate größer ist als Maximaler Inhalt
            if (this.tankinhalt + tankrate >= this.tankvolumen) {
                this.tankinhalt = this.tankvolumen;
                this.setFueling(false);
            } else {
                this.tankinhalt += tankrate;
            }
            System.out.println("Tankvorgang");
            this.money -= pay;
        }

    }

}

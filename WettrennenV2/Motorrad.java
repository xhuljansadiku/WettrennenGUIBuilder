package WettrennenV2;

public class Motorrad extends Fahrzeug{
    private int wheelCount = 2;

    public Motorrad() {
    }

    public Motorrad(int wheelCount) {
        this.wheelCount = wheelCount;
    }

    public Motorrad(double tankvolumen, double tankinhalt, double vebrauch, double maxSpeed, double currentSpeed,
                    String kennzeichen, String color, String driver, double strecke, double money,
                    double reifenProzent, int wheelCount) {
        super(tankvolumen, tankinhalt, vebrauch, maxSpeed, currentSpeed, kennzeichen, color, driver, strecke, money,
                reifenProzent);
        this.wheelCount = wheelCount;
    }

    public Motorrad(double tankvolumen, double tankinhalt, double vebrauch, double maxSpeed, double currentSpeed,
                    String kennzeichen, String color, String driver, double strecke, double rennstrecke,
                    boolean isFueling, double money, double reifenProzent, int wheelCount) {
        super(tankvolumen, tankinhalt, vebrauch, maxSpeed, currentSpeed, kennzeichen, color, driver, strecke,
                rennstrecke, isFueling, money, reifenProzent);
        this.wheelCount = wheelCount;
    }

    public int getWheelCount() {
        return wheelCount;
    }

    public void setWheelCount(int wheelCount) {
        this.wheelCount = wheelCount;
    }

}

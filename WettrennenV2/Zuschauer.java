package WettrennenV2;

import java.time.LocalDate;

public class Zuschauer {
    private String platz;
    private double price;
    private String FahrzeugFan;
    private LocalDate verfallsdatum;
    private int sichtbereich;

    public Zuschauer() {
    }

    public Zuschauer(String platz, double price, String fahrzeugFan, LocalDate verfallsdatum, int sichtbereich) {
        this.platz = platz;
        this.price = price;
        FahrzeugFan = fahrzeugFan;
        this.verfallsdatum = verfallsdatum;
        this.sichtbereich = sichtbereich;
    }

    public String getPlatz() {
        return platz;
    }

    public void setPlatz(String platz) {
        this.platz = platz;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getFahrzeugFan() {
        return FahrzeugFan;
    }

    public void setFahrzeugFan(String fahrzeugFan) {
        FahrzeugFan = fahrzeugFan;
    }

    public LocalDate getVerfallsdatum() {
        return verfallsdatum;
    }

    public void setVerfallsdatum(LocalDate verfallsdatum) {
        this.verfallsdatum = verfallsdatum;
    }

    public int getSichtbereich() {
        return sichtbereich;
    }

    public void setSichtbereich(int sichtbereich) {
        this.sichtbereich = sichtbereich;
    }



}

package WettrennenV2;

import java.time.LocalDate;

public class VIPZuschauer extends Zuschauer{
    private String Verpflegung;
    private boolean massagestuhl;

    public VIPZuschauer() {
    }

    public VIPZuschauer(String verpflegung, boolean massagestuhl) {
        Verpflegung = verpflegung;
        this.massagestuhl = massagestuhl;
    }

    public VIPZuschauer(String platz, double price, String fahrzeugFan, LocalDate verfallsdatum, int sichtbereich, String verpflegung, boolean massagestuhl) {
        super(platz, price, fahrzeugFan, verfallsdatum, sichtbereich);
        Verpflegung = verpflegung;
        this.massagestuhl = massagestuhl;
    }

    public String getVerpflegung() {
        return Verpflegung;
    }

    public void setVerpflegung(String verpflegung) {
        Verpflegung = verpflegung;
    }

    public boolean isMassagestuhl() {
        return massagestuhl;
    }

    public void setMassagestuhl(boolean massagestuhl) {
        this.massagestuhl = massagestuhl;
    }
}

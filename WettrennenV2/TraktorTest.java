/*package WettrennenV2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TraktorTest {

    private Traktor traktor;

    @BeforeEach
    void setUp(){
        traktor = new Traktor(98, 67, 4.5, 80, 15,
                "S-OL 1", "rot", "Hubsi", 230456, 3, false,
                406590, 86.2, false, 23.4);
    }

    @Test
    void testSetUp(){
        Assertions.assertAll("default traktor",
                () -> Assertions.assertEquals(98.0, traktor.getTankvolumen()),
                () -> Assertions.assertEquals(67.0, traktor.getTankinhalt()),
                () -> Assertions.assertEquals(4.5, traktor.getVebrauch()),
                () -> Assertions.assertEquals(80, traktor.getMaxSpeed()),
                () -> Assertions.assertEquals(15, traktor.getCurrentSpeed()),
                () -> Assertions.assertEquals("S-OL 1", traktor.getKennzeichen()),
                () -> Assertions.assertEquals("rot", traktor.getColor()),
                () -> Assertions.assertEquals("Hubsi", traktor.getDriver()),
                () -> Assertions.assertEquals(230456, traktor.getStrecke()),
                () -> Assertions.assertEquals(3, traktor.getRennstrecke()),
                () -> Assertions.assertFalse(traktor.isFueling()),
                () -> Assertions.assertEquals(406590, traktor.getMoney()),
                () -> Assertions.assertEquals(86.2, traktor.getReifenProzent()),
                () -> Assertions.assertFalse(traktor.isFrontlader()),
                () -> Assertions.assertEquals(23.4, traktor.getLadung())
        );
    }

    @Test
    void testSetterPositiv(){
        traktor.setTankinhalt(43.3);
        traktor.setVebrauch(3.6);
        traktor.setCurrentSpeed(10);
        traktor.setColor("new holland gelb");
        traktor.setDriver("Staller");
        traktor.setStrecke(23045);
        traktor.setRennstrecke(5);
        traktor.setFueling(true);
        traktor.setMoney(450590);
        traktor.setReifenProzent(83.0);
        traktor.setFrontlader(true);
        traktor.setLadung(40.0);

        Assertions.assertAll("default traktor",
                () -> Assertions.assertEquals(98.0, traktor.getTankvolumen()),
                () -> Assertions.assertEquals(43.3, traktor.getTankinhalt()),
                () -> Assertions.assertEquals(3.6, traktor.getVebrauch()),
                () -> Assertions.assertEquals(80, traktor.getMaxSpeed()),
                () -> Assertions.assertEquals(10, traktor.getCurrentSpeed()),
                () -> Assertions.assertEquals("S-OL 1", traktor.getKennzeichen()),
                () -> Assertions.assertEquals("new holland gelb", traktor.getColor()),
                () -> Assertions.assertEquals("Staller", traktor.getDriver()),
                () -> Assertions.assertEquals(23045, traktor.getStrecke()),
                () -> Assertions.assertEquals(5, traktor.getRennstrecke()),
                () -> Assertions.assertTrue(traktor.isFueling()),
                () -> Assertions.assertEquals(450590, traktor.getMoney()),
                () -> Assertions.assertEquals(83.0, traktor.getReifenProzent()),
                () -> Assertions.assertTrue(traktor.isFrontlader()),
                () -> Assertions.assertEquals(40.0, traktor.getLadung())
        );
    }

    @Test
    void testSetterNull(){
        traktor.setTankinhalt(0.0);
        traktor.setCurrentSpeed(0);
        traktor.setColor(null);
        traktor.setDriver(null);
        traktor.setStrecke(0.0);
        traktor.setRennstrecke(0.0);
        traktor.setMoney(0.0);
        traktor.setReifenProzent(0.0);
        traktor.setLadung(0.0);

        Assertions.assertAll("default traktor",
                () -> Assertions.assertEquals(98.0, traktor.getTankvolumen()),
                () -> Assertions.assertEquals(0.0, traktor.getTankinhalt()),
                () -> Assertions.assertEquals(4.5, traktor.getVebrauch()),
                () -> Assertions.assertEquals(80, traktor.getMaxSpeed()),
                () -> Assertions.assertEquals(0, traktor.getCurrentSpeed()),
                () -> Assertions.assertEquals("S-OL 1", traktor.getKennzeichen()),
                () -> Assertions.assertNull(traktor.getColor()),
                () -> Assertions.assertNull(traktor.getDriver()),
                () -> Assertions.assertEquals(0, traktor.getStrecke()),
                () -> Assertions.assertEquals(0, traktor.getRennstrecke()),
                () -> Assertions.assertFalse(traktor.isFueling()),
                () -> Assertions.assertEquals(0, traktor.getMoney()),
                () -> Assertions.assertEquals(0, traktor.getReifenProzent()),
                () -> Assertions.assertFalse(traktor.isFrontlader()),
                () -> Assertions.assertEquals(0.0, traktor.getLadung())
        );
    }

    @Test
    void testSetterNegative(){
        traktor.setTankinhalt(-43.3);
        traktor.setCurrentSpeed(-10);
        traktor.setColor("new holland gelb");
        traktor.setDriver("Staller");
        traktor.setStrecke(-23045);
        traktor.setRennstrecke(-5);
        traktor.setFueling(true);
        traktor.setMoney(-450590);
        traktor.setReifenProzent(-83.0);
        traktor.setFrontlader(true);
        traktor.setLadung(-40.0);

        Assertions.assertAll("default traktor",
                () -> Assertions.assertEquals(98.0, traktor.getTankvolumen()),
                () -> Assertions.assertEquals(0.0, traktor.getTankinhalt()),
                () -> Assertions.assertEquals(4.5, traktor.getVebrauch()),
                () -> Assertions.assertEquals(80, traktor.getMaxSpeed()),
                () -> Assertions.assertEquals(-10, traktor.getCurrentSpeed()),
                () -> Assertions.assertEquals("S-OL 1", traktor.getKennzeichen()),
                () -> Assertions.assertEquals("new holland gelb", traktor.getColor()),
                () -> Assertions.assertEquals("Staller", traktor.getDriver()),
                () -> Assertions.assertEquals(23045, traktor.getStrecke()),
                () -> Assertions.assertEquals(5, traktor.getRennstrecke()),
                () -> Assertions.assertTrue(traktor.isFueling()),
                () -> Assertions.assertEquals(0, traktor.getMoney()),
                () -> Assertions.assertEquals(0.0, traktor.getReifenProzent()),
                () -> Assertions.assertTrue(traktor.isFrontlader()),
                () -> Assertions.assertEquals(0.0, traktor.getLadung())
        );
    }

}

 */

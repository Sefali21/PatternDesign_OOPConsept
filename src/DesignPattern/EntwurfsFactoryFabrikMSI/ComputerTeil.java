package DesignPattern.EntwurfsFactoryFabrikMSI;

public abstract class ComputerTeil {
    String bezeichnung;
    String hersteller;

    public ComputerTeil(String bezeichnung, String hersteller) {
        this.bezeichnung = bezeichnung;
        this.hersteller = hersteller;
    }

    @Override
    public String toString() {
        return "ComputerTeil{" +
                "bezeichnung='" + bezeichnung + '\'' +
                ", hersteller='" + hersteller + '\'' +
                '}';
    }


    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public String getHersteller() {
        return hersteller;
    }

    public void setHersteller(String hersteller) {
        this.hersteller = hersteller;
    }
}


class Grafikkarte extends ComputerTeil {
    public Grafikkarte(String bezeichnung, String hersteller) {
        super(bezeichnung, hersteller);
    }
}

class Mainboard extends ComputerTeil {
    public Mainboard(String bezeichnung, String hersteller) {
        super(bezeichnung, hersteller);
    }
}

class SSD extends ComputerTeil {
    public SSD(String bezeichnung, String hersteller) {
        super(bezeichnung, hersteller);
    }
}

package C13_Abstract;

import java.time.LocalDateTime;
import java.util.Date;

public class Mitarbeiter extends Buchungstelle{

    @Override
    protected double PreisProStunde() {
        return 12.85;
    }

    @Override
    protected double ArbeitZeitProMonat() {
        return 200;
    }

    @Override
    public String toString() {
        return "Mitarbeiter: \n" +
                "Die name des Unternehmens=\t" + nameUnternehmen +
                ", \npreisProStunde=\t" + preisProStunde +
                ", \narbeitZeitProMonat=\t" + arbeitZeitProMonat +
                ", \ngehalt=\t" + gehalt +
                ", \nnamePersonal=\t'" + namePersonal + '\'' +
                ", \npersonalId=\t'" + personalId + '\'' +
                ", \nprivateTelefon=\t'" + privateTelefon + '\'' +
                ", \nersteArbeitTag=\t'" + ersteArbeitTag + '\'' +
                ", \nidNummer=\t'" + idNummer + '\'' ;
    }

    public static void main(String[] args) {
        Mitarbeiter mitarbeiter1=new Mitarbeiter();
        mitarbeiter1.arbeitZeitProMonat= mitarbeiter1.ArbeitZeitProMonat();
        mitarbeiter1.preisProStunde= mitarbeiter1.PreisProStunde();
        mitarbeiter1.gehalt= mitarbeiter1.gehalt(mitarbeiter1.preisProStunde, mitarbeiter1.arbeitZeitProMonat);
        mitarbeiter1.namePersonal="Sefali";
        mitarbeiter1.idNummer= mitarbeiter1.personalIdAutoIncrement();
        mitarbeiter1.privateTelefon="1620000001";
        LocalDateTime now = LocalDateTime.now();
        mitarbeiter1.ersteArbeitTag= String.valueOf(now);
        System.out.println(mitarbeiter1.toString());
    }
}

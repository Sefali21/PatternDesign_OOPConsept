package C13_Abstract;

public abstract class Buchungstelle extends Personal {
    protected double preisProStunde;
    protected double arbeitZeitProMonat;
    protected double gehalt;

    protected abstract double PreisProStunde();
    protected abstract double ArbeitZeitProMonat();

    protected double gehalt(double preisProStunde, double arbeitZeitProMonat){
        double gehalt=preisProStunde*arbeitZeitProMonat;
        return gehalt;
    }

}

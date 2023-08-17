package u_Brauerei;

import java.util.ArrayList;
import java.util.Collection;

public abstract class Bier {
    final Collection<Observer> getrankeHaendler=new ArrayList<>();
    float aluol;
    double preis;
    String sorte;
    String brauerei;

    public Bier(float aluol, double preis, String sorte, String brauerei) {
        this.aluol = aluol;
        this.preis = preis;
        this.sorte = sorte;
        this.brauerei = brauerei;
    }


    @Override
    public String toString() {
        return "Bier{" +
                "aluol=" + aluol +
                ", preis=" + preis +
                ", sorte='" + sorte + '\'' +
                ", brauerei='" + brauerei + '\'' +
                '}';
    }
    
    public void bierPreisBezieher(Observer observer){
        getrankeHaendler.add(observer);
    }
    
    private void infoBierPreisAnderung(String info){
        for (Observer tmp:getrankeHaendler ) {
            tmp.update(info);
        }
    }
    
    
    
    public float getAluol() {        return aluol;    }

    public void setAluol(float aluol) {        this.aluol = aluol;    }

    public double getPreis() {        return preis;    }

    public void setPreis(double preis) {        this.preis = preis;
    infoBierPreisAnderung("Der Bierpreis hat sich geändert"+preis);}

    public String getSorte() {
        return sorte;
    }

    public void setSorte(String sorte) {
        this.sorte = sorte;
    }

    public String getBrauerei() {
        return brauerei;
    }

    public void setBrauerei(String brauerei) {
        this.brauerei = brauerei;
    }
}

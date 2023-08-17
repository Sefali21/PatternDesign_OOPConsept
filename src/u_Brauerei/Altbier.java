package u_Brauerei;

public class Altbier extends Bier{
    String farbe;


    public Altbier(float aluol, double preis, String sorte, String brauerei, String farbe) {
        super(aluol, preis, sorte, brauerei);
        this.farbe = farbe;
    }
    @Override
    public String toString(){
        return super.toString()+" {Farbe: "+farbe+"}";
    }
}

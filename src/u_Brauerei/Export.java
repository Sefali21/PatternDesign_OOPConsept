package u_Brauerei;

public class Export extends Bier {
    String herkunft;


    public Export(float aluol, double preis, String sorte, String brauerei, String herkunft) {
        super(aluol, preis, sorte, brauerei);
        this.herkunft = herkunft;
    }
}

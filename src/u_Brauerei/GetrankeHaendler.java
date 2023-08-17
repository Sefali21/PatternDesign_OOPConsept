package u_Brauerei;

public class GetrankeHaendler implements Observer{
    String name;

    public GetrankeHaendler(String name) {
        this.name = name;
    }
    @Override
    public void update(String preisAnderung) {
        System.out.println("Hallo, "+name+" der Bier Preis hat sich geändert:\n");
    }


}

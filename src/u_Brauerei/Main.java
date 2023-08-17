package u_Brauerei;

import java.io.DataInput;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {

        Altbier diebels=new Altbier(5.7f, 1.50, "Alt Bier", "Deibels Brauerei", "Bernstein");
        System.out.println(diebels.toString());

        GetrankeHaendler maierGmbH=new GetrankeHaendler("Meier GmbH");

        diebels.getrankeHaendler.add(maierGmbH);



        //System.out.println("Farbe "+diebels.farbe+" Name " +diebels.brauerei+" Sorte " +diebels.sorte+" Aluol " +diebels.aluol+" Preis " +diebels.preis);
        diebels.setPreis(1.80);
        //System.out.println(diebels.toString());

        Export binding=new Export(5.2f,1.90,"Export", "Binding Export", "Spanien" );
        GetrankeHaendler exportBinding=new GetrankeHaendler("Export");
        diebels.getrankeHaendler.add(exportBinding);


    }





}

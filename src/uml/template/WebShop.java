package uml.template;

import C18_Linkedin_JavaCollections.Iterating.Room;

import javax.swing.plaf.PanelUI;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class WebShop {
    private final Collection<Beobachter> newsletterAbonnenten=new ArrayList<>();

    public void abonnentenHinzufuegen(Beobachter beobachter){  newsletterAbonnenten.add(beobachter);   }

    public void abonnentenEntfernen(Beobachter beobachter){
        Iterator<Beobachter> iterator= newsletterAbonnenten.iterator();
        while (iterator.hasNext()){
            if(iterator.next().equals(beobachter)){
                newsletterAbonnenten.remove(iterator.next());
            }
        }

        //newsletterAbonnenten.remove(beobachter);


    }

    private void versendeNewsletter(String newsletter){

        for (Beobachter tmp : newsletterAbonnenten ) {
            tmp.update(newsletter);
        }
    }

    public void neuerProduktKatalog(){
        String s="Wir haben soeben einen neuen Produktkatalog veröffentlicht";
        versendeNewsletter(s);
    }



}

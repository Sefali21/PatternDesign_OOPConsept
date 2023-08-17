package uml.template;

import java.util.Arrays;

public class EntfurwmusterObserver {
    public static void main(String[] args) {
        WebShop webShop=new WebShop();
        WebShopKunde k1=new WebShopKunde("Johannes");
        WebShopKunde k2=new WebShopKunde("Susanne");
        WebShopKunde k3=new WebShopKunde("Dimitri");

        webShop.abonnentenHinzufuegen(k1);
        webShop.abonnentenHinzufuegen(k2);
        webShop.abonnentenHinzufuegen(k3);

        WebShopLieferantan f1=new WebShopLieferantan("Hubert Klein GmbH");
        webShop.abonnentenHinzufuegen(f1);


        webShop.neuerProduktKatalog();

    }
}

package DesignPattern.Adapter.template;

import DesignPattern.Adapter.template.externeBibliothek.JsonRoutenBerechnung;
import DesignPattern.Adapter.template.externeBibliothek.XmlDatei;

public class EntwursmusterAdapter {
    public static void main(String[] args) {
        ClientInterface routenBerechnung = new XmlJsonAdapter(new JsonRoutenBerechnung());

        XmlDatei xmlDaten=new XmlDatei();
        xmlDaten.daten="Fahrzeugdaten: Standort Oldenburg....";

        XmlDatei ergebnisXml= routenBerechnung.getFahrtZeitXml(xmlDaten);

        System.out.println("Die Fahrtzeit liegt nun in XML vor "+ergebnisXml.daten);


    }
}

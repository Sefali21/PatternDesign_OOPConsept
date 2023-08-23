package DesignPattern.Adapter.template;

import DesignPattern.Adapter.template.externeBibliothek.JsonDatei;
import DesignPattern.Adapter.template.externeBibliothek.JsonRoutenBerechnung;
import DesignPattern.Adapter.template.externeBibliothek.XmlDatei;

public class XmlJsonAdapter implements ClientInterface{
    private final JsonRoutenBerechnung JSONROUTENBERECHNUNG;

    public XmlJsonAdapter(JsonRoutenBerechnung JSONROUTENBERECHNUNG) {
        this.JSONROUTENBERECHNUNG = JSONROUTENBERECHNUNG;
    }

    @Override
    public XmlDatei getFahrtZeitXml(XmlDatei xmlDaten) {
        JsonDatei jsonDaten = transformiereXmlZuJson(xmlDaten);
        JsonDatei ergebnisJson=JsonRoutenBerechnung.berechnenFahrtZeit(jsonDaten);
        XmlDatei ergebnissXml=transformiereJsonZuXml(ergebnisJson);
        return ergebnissXml;

    }
    private JsonDatei transformiereXmlZuJson(XmlDatei xmlDaten) {
        System.out.println("Habe XML-DATEN empfangen. Beginne die Transformation zu JSON...");
        JsonDatei jsonDaten =new JsonDatei();
        jsonDaten.daten=xmlDaten.daten;
        return jsonDaten;
    }

    private XmlDatei transformiereJsonZuXml (JsonDatei jsonDaten) {
        System.out.println("Habe JSON-DATEN empfangen. Beginne die Transformation zu XML...");
        XmlDatei xmlDaten=new XmlDatei();
        xmlDaten.daten=jsonDaten.daten;
        return xmlDaten;
    }

}

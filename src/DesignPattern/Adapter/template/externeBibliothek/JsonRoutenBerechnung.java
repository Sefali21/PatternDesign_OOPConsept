package DesignPattern.Adapter.template.externeBibliothek;

public class JsonRoutenBerechnung {
    //JsonDatei jsonDatei=null;
    public static JsonDatei berechnenFahrtZeit(JsonDatei jsonDatei){
        System.out.println("Die Bibloothek hat folgende JSON daten erhalten"+jsonDatei.daten);
        JsonDatei ergebnisJson=new JsonDatei();
        ergebnisJson.daten="Die Fahrzeit beträgt 12 Minuten und 37 sekunden";
        return ergebnisJson;
    }
}

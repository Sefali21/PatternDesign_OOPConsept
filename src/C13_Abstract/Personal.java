package C13_Abstract;

public abstract class Personal {
    static final String nameUnternehmen="Sefali GmbH";
    static final String adresseUnternehmen="schulstr 00000";
    protected String namePersonal;
    protected String personalId;
    protected String privateTelefon;
    protected String ersteArbeitTag;

    static int counter=1000;
    protected String idNummer;

    protected String personalIdAutoIncrement(){
        counter++;
        String nummer=counter+"";
        return nummer;
    }





}

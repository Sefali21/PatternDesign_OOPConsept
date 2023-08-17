package C05_Method;

import java.util.Locale;

public class CreateMethod {
    public static void main(String[] args) {
        double presis=250;
        boolean mitglieder=true;
        int mitgliederAge=3;
        preisnachlass(mitglieder,mitgliederAge,presis);
        preisnachlass(true,6,250);
        preisnachlass(false,6,250);
        String name="ALI";
        String nachname="CAN";
        String nameneuVersion=nameNachnameErsteBuchstabenUpperCase(name,nachname);
        System.out.println(nameneuVersion);

    }

    public static void preisnachlass(boolean mitgilieder, int mitgliederAge, double preis) {
        if (mitgilieder) {
            if (mitgliederAge < 5) preis *=0.9;
            else preis*=0.85;
        }
        else preis*=0.95;
        System.out.println("Für Sie ist Preis: "+preis);
    }

    public static String nameNachnameErsteBuchstabenUpperCase(String name, String nachname){
        name=name.toLowerCase(Locale.of(name));
        nachname=nachname.toLowerCase(Locale.of(nachname));
        name=String.valueOf(Character.toUpperCase(name.charAt(0))+name.substring(1));
        nachname=String.valueOf(Character.toUpperCase(nachname.charAt(0))+nachname.substring(1));
        name=name.join(" ",name, nachname);

        return name;
    }

}

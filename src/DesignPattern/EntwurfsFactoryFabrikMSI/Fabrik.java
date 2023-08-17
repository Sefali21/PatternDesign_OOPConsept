package DesignPattern.EntwurfsFactoryFabrikMSI;

import java.util.Scanner;

public class Fabrik {
    public static void main(String[] args) {
        ComputerFabrik computerFabrik=null;
        ComputerTeil computerTeil=null;

//        ComputerFabrik computerFabrik=new MSIFabrik();
//        computerFabrik.erstelleComputerTeil("Grafikkarte");
//        ComputerTeil computerTeil=computerFabrik.erstelleComputerTeil("Grafikkarte");
//        System.out.println(computerTeil.toString());

        Scanner scanner=new Scanner(System.in);
        System.out.println("MSI, Gigabyte");
        String eingabe=scanner.nextLine();
        switch (eingabe.toLowerCase().trim()){
            case "msi" : computerFabrik= new MSIFabrik(); break;
            case "gigabyte" : computerFabrik= new GigaByteFabrik();
            default:
                System.out.println("Etwas schiff gelaufen"); break;
        }
        System.out.println("Grafikkarte, Mainboard, SSD");
        eingabe=scanner.nextLine();
        if(computerFabrik != null){
            //computerFabrik.erstelleComputerTeil(eingabe);
            computerTeil=computerFabrik.erstelleComputerTeil(eingabe.toLowerCase().trim());
            System.out.println(computerTeil.toString().toLowerCase().trim());
        }


    }
}

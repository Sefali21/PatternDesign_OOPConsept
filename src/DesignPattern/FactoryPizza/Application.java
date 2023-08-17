package DesignPattern.FactoryPizza;

import java.util.Scanner;

public class Application {
    static Fabrik fabrik=null;
    static Pizza pizza;
    static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {

        fabrik=wahl();
        String eingabe=eingabe();
//        pizza=fabrik.erstellePizza(eingabe.toLowerCase().trim());
//        pizza.print();
        if (fabrik != null){
            pizza=fabrik.erstellePizza(eingabe.toLowerCase().trim()) ;
            pizza.print();
        }

    }


    static Fabrik wahl(){
        System.out.println("Bitte geben die Name des Fabriks ein!\nMars oder Venus");
        //Scanner scanner = new Scanner(System.in);
        String eingabe=scanner.nextLine();
        switch (eingabe.toLowerCase().trim()) {
            case "mars" -> fabrik = new MarsFabrik();
            case "venus" -> fabrik = new VenusFabrik();
            default -> System.out.println("Etwas schiff gelaufen");
        }
        return fabrik;
    }

    static String eingabe(){
        System.out.println("Bitte geben die Sorte der Pizza ein!\nSalami oder Schinken");
        return scanner.nextLine();
    }
}




//Scanner scanner=new Scanner(System.in);

//        System.out.println("Bitte geben die Name des Fabriks ein!\nMars oder Venus");
//        String eingabe=scanner.nextLine();
//        switch (eingabe.toLowerCase().trim()) {
//            case "mars" -> fabrik = new MarsFabrik();
//            case "venus" -> fabrik = new VenusFabrik();
//            default -> System.out.println("etwas schiff gelaufen");
//        }

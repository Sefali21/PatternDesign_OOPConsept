package DesignPattern.FactoryPizza;

public abstract class Fabrik {
    abstract Pizza erstellePizza (String sorte);
}

class VenusFabrik extends Fabrik {

    @Override
    Pizza erstellePizza(String sorte) {
        switch (sorte.toLowerCase().trim()) {
            case "salami" -> {
                return new VenusSalami();
            }
            case "schinken" -> {
                return new VenusSchinkel();
            }
            default -> {
                System.out.println("etwas schiff gelaufen");
                return null;
            }
        }
    }
}

class MarsFabrik extends Fabrik {

    @Override
    Pizza erstellePizza(String sorte) {
        switch (sorte.toLowerCase().trim()) {
            case "salami" -> {
                return new MarsSalami();
            }
            case "schinken" -> {
                return new MarsSchinkel();
            }
            default -> {
                System.out.println("etwas schiff gelaufen");
                return null;
            }
        }
    }
}


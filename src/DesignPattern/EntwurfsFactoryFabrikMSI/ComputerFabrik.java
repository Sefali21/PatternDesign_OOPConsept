package DesignPattern.EntwurfsFactoryFabrikMSI;

public abstract class ComputerFabrik {
    final String msi="MSI";
    final String giga="GigabyteFabrik";
    abstract ComputerTeil erstelleComputerTeil(String art);
}

class MSIFabrik extends ComputerFabrik{

    @Override
    ComputerTeil erstelleComputerTeil(String art) {
        switch (art.toLowerCase().trim()) {
            case "grafikkarte" -> {
                return new Grafikkarte(art, msi);
            }
            case "mainboard" -> {
                return new Mainboard(art, msi);
            }
            case "ssd" -> {
                return new SSD(art, msi);
            }
            default -> System.out.println("Etwas schiff gelaufen");
        }
        return new ComputerTeil(art,msi) {
            @Override
            public String toString() {
                return super.toString();
            }
        };
    }
}

class GigaByteFabrik extends ComputerFabrik{

    @Override
    ComputerTeil erstelleComputerTeil(String art) {
        switch (art.toLowerCase().trim()) {
            case "grafikkarte" -> {
                return new Grafikkarte(art, giga);
            }
            case "mainboard" -> {
                return new Mainboard(art, giga);
            }
            case "ssd" -> {
                return new SSD(art, giga);
            }
            default -> System.out.println("Etwas schiff gelaufen");
        }
        return new ComputerTeil(art,giga) {
            @Override
            public String toString() {
                return super.toString();
            }
        };
    }
}

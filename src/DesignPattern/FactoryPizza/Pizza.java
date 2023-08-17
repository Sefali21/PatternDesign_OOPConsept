package DesignPattern.FactoryPizza;

public abstract class Pizza {
    String name;
    abstract void print();
}

class MarsSalami extends Pizza{

    @Override
    void print() {
        System.out.println("Mars Salami Pizza ist abholungsbereit");
    }
}

class MarsSchinkel extends Pizza{

    @Override
    void print() {
        System.out.println("Mars Schinken Pizza ist abholungsbereit");
    }
}

class VenusSalami extends Pizza{

    @Override
    void print() {
        System.out.println("Venus Salami Pizza ist abholungsbereit");
    }
}

class VenusSchinkel extends Pizza {

    @Override
    void print() {
        System.out.println("Venus Schinken Pizza ist abholungsbereit");
    }
}

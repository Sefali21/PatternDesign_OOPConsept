package uml.template;

public class WebShopKunde implements Beobachter{
    private String name;
    @Override
    public void update(String newsletter) {
        System.out.println("Hallo"+name+"!Sie haben folgende Nachricht erhalten\n"+newsletter);
    }


    public WebShopKunde(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

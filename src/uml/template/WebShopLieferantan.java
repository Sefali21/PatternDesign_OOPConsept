package uml.template;

public class WebShopLieferantan implements Beobachter{
    String firmaName;
    public WebShopLieferantan(String firmaName){
        this.firmaName=firmaName;
    }
    @Override
    public void update(String s) {
        System.out.println("Hallo lieber Geschäftskunde soeben"+firmaName+", unser Sortiment hat sich wie folgt geöndert: "+s);
    }
}

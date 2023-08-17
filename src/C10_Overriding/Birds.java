package C10_Overriding;

public class Birds extends Animals{
    private boolean hasBeak;
    private static boolean hasWings;

    protected static boolean test=false;

    protected static String string="Static String in Birds";

    protected String stringNotStatic="I am not Static String in Birds";

    @Override
    protected void respriration() {
        super.respriration();
    }

    @Override
    protected void reproduktion() {
        super.reproduktion();
    }

    protected static void staticMethod(){
        System.out.println(hasWings);
    }

    public boolean isHasBeak() {
        return hasBeak;
    }

    public void setHasBeak(boolean hasBeak) {
        this.hasBeak = hasBeak;
    }

    public static boolean isHasWings() {
        return hasWings;
    }

    public static void setHasWings(boolean hasWings) {
        Birds.hasWings = hasWings;
    }
}

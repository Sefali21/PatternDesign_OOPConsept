package C07_RecursiveMethod;

public class Palindrome {
    public static void main(String[] args) {

        String input="ey edip adanada pide ye";
        boolean flag=palindromControl(input);
        System.out.println(flag);

        double monatlich=((19.99*6)+(18*44.99)-(80+100))/24;
        System.out.println(monatlich);
        double monatlich100_50=((19.99*6)+(18*39.99)-(70+100))/24;
        System.out.println(monatlich100_50);

    }

    private static boolean palindromControl(String input) {
        input=input.trim();

        if(input.length()==0 || input.length()==1){
            return true;
        }else {
            if(input.substring(0,1).equalsIgnoreCase(input.substring(input.length()-1))){
                return palindromControl(input.substring(1,input.length()-1));
            }
            else return false;
        }
    }
}

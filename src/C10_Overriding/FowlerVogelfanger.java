package C10_Overriding;

import java.util.Scanner;

public class FowlerVogelfanger extends Birds{
    @Override
    protected void movement() {
        super.movement();
    }

    public static void main(String[] args) {
        FowlerVogelfanger fowlerVogelfanger =new FowlerVogelfanger();
        Birds.staticMethod();
        boolean hasBeak=true;
        boolean test=true;
        String string="String in FowlerVogelfanger";
        String stringNotStatic="I am a String in FowlerVogelfanger";
        System.out.println(fowlerVogelfanger.hasEyesToSee);
        System.out.println(fowlerVogelfanger.isHasBeak());
        //System.out.println(Birds.isHasWings());
        System.out.println(isHasWings());
        System.out.println("test");
        System.out.println(test);
        System.out.println(fowlerVogelfanger.test);
        System.out.println("------------String------------");
        System.out.println(string);
        System.out.println(fowlerVogelfanger.string);
        System.out.println(stringNotStatic);
        System.out.println(fowlerVogelfanger.stringNotStatic);

        Birds birdsFowlerVogelfanger=new FowlerVogelfanger();
        System.out.println("birdsFowlerVogelfanger");
        System.out.println("test");
        System.out.println(test);
        System.out.println(birdsFowlerVogelfanger.test);
        System.out.println(string);
        System.out.println(birdsFowlerVogelfanger.string);
        System.out.println(stringNotStatic);
        System.out.println(birdsFowlerVogelfanger.stringNotStatic);

        Scanner scanner=new Scanner(System.in);
        double d=scanner.nextDouble();
        scanner.nextLine();
        String s=scanner.nextLine();

        System.out.println(d);
        System.out.println(s);

        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            if(x<100){
                System.out.println(s1+"\t"+"0"+x);
            }else System.out.println(s1+"\t"+x);
        }
        System.out.println("================================");




    }
}

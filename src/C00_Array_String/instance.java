package C00_Array_String;

import java.util.Arrays;

public class instance {
    static String str="str-1 static";
    String ohnestatic="C00_Array_String.instance variable";
    public static void main(String[] args) {
        System.out.println(str);
        System.out.println(method1());
//        method2();
        instance mtd=new instance();
        System.out.println(mtd);
        System.out.println(mtd.ohnestatic);
        mtd.method2();
        System.out.println(mtd.method2());
        System.out.println('a'+ 'b'+'c');
        boolean doWhile=false;
        do{
            System.out.println("do while false aber schleife is true");
        }while (doWhile==true);
        System.out.println("nach dem schleife");
        if (doWhile) System.out.println("if bedienung");
        else if (!doWhile) System.out.println("if else bedienung");

        String str11="Java ist ein Insel!";
        System.out.println(str11.charAt(5));


        String[] names=new String[5];
        names[0]="name-1";
        names[1]="name-2";
        names[2]="name-3";
        names[3]="name-4";
        //names[4]="name-5";
        System.out.println(Arrays.toString(names));
        for (var c:names ) {
            System.out.print(c+" ");
        }
        System.out.println();
        for (int i = 0; i < names.length ; i++) {
            System.out.print(names[i]+" ");
        }


    }

    public static String method1(){
        System.out.println(str);
        return "Method-1";


    }

    public String method2(){
        System.out.println(str);
        System.out.println(ohnestatic);
        return "Method-2";
    }
}

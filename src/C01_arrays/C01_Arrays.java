package C01_arrays;

public class C01_Arrays {
    public static void main(String[] args) {
        //primitive types short, int, boolean, char, double, float, byte, long
        //String welt=Character.codePointAt(127757);
        String name="sefalI ";
//        name= String.valueOf(Character.toUpperCase(name.charAt(0))+name.substring(1));
//        System.out.println(name);
//        name=name.substring(0,5)+String.valueOf(Character.toLowerCase(name.charAt(5)));

//        System.out.println(name);
//        int [][]arr={{1,2,3},{4,5,6},{7,8,9}};
//        int []arr1={1,2,3,4,5,6,7,8,9};
//        System.out.println(Arrays.toString(arr[0]));
//        System.out.println((arr[0]));
//
//        String[] names={"Johhny", "Elby", "Adam"};
//        String [] names2=names.clone();
//        System.out.println(Arrays.toString(names2));
//        System.out.println(Arrays.toString(names.clone()));
//
//        System.out.println("CodePoint "+name.codePointAt(2));
//        System.out.println(Character.toString(127757));
//        System.out.println(name.codePointCount(0, 6));

        String nameCompare="  cefaLi , d   ";
        System.out.println("CompateTo "+name.compareTo(nameCompare));
        System.out.println("ComparetoIgnoteCase "+name.compareToIgnoreCase(nameCompare));

        System.out.println(nameCompare.contains("c"));
        System.out.println(nameCompare.contentEquals("cefaLi"));
        System.out.println(nameCompare.startsWith("Se"));
        System.out.println(nameCompare.trim());



    }
}

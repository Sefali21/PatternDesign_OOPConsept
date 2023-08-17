package C04_ArrayLists;

import java.util.*;

public class C06_Questions {
    public static void main(String[] args) {
//        List<String> listWithRepetion=new ArrayList<>();
//        listWithRepetion.add("Ömeren");
//        listWithRepetion.add("Ömeren");
//        listWithRepetion.add("Zehran");
//        listWithRepetion.add("Zehran");
//        listWithRepetion.add("Betty");
//        listWithRepetion.add("Betty");
//        listWithRepetion.add("Betty");
//        listWithRepetion.add("Sefali");
//        listWithRepetion.add("Sefali");
//        listWithRepetion.add("Sefali");
//        System.out.println("\n-------------Q-1----------------");
//        try {
//            listWithRepetion=uniqList(listWithRepetion);
//        } catch (IndexOutOfBoundsException e) {
//            System.out.println("C00_Array_String.Main Method exception");
//        }
//        System.out.println(listWithRepetion);
//        System.out.println("\n------------Q-1-------------");
//        System.out.println("Call For Loop");
//        listWithRepetion=uniqwithforLoop(listWithRepetion);
//        System.out.println(listWithRepetion);
//
//        System.out.println("\n----------Q-2------------");
//        System.out.println(names());

       // System.out.println(fibonacciNumbers(16));

        System.out.println(fibonacciNumbersPrintReverse(92));
        System.out.println(allNumbersDivideByIntegerExactly());

    }

    public static List<String> uniqList(List<String> stringList){
        System.out.println("Inside of Method");
        Iterator<String> iterator=stringList.iterator();
        int counter=0;
        while (iterator.hasNext()){
            String currentElement= stringList.get(counter);
            System.out.println(currentElement);
            try {
                if(stringList.lastIndexOf(currentElement)!=stringList.indexOf(currentElement)){
                    System.out.println("lastIndexOf Current Element "+stringList.lastIndexOf(currentElement));
                    System.out.println("indexof current element"+stringList.indexOf(currentElement));
                    System.out.println(stringList);
                    stringList.remove(stringList.lastIndexOf(currentElement));
                }
            } catch (IndexOutOfBoundsException  e) {
                System.out.println("Exception");
                System.out.println(stringList);
                System.out.println(stringList.indexOf(currentElement));
                System.out.println(stringList);
            }
            counter++;
        }
        System.out.println("Last of method");
        return stringList;
    }

    public static List<String> uniqwithforLoop(List<String> stringList){
        List<String> newList=new ArrayList<>();
        for (var c:stringList ) {
            if(!newList.contains(c)) newList.add(c);
        }
        return newList;
    }

    public static List<String> names(){
        List<String> names=new ArrayList<>();
        Scanner scanner=new Scanner(System.in);
        boolean flag=true;
        while (flag) {
            System.out.println("Enter a name:");
            names.add(scanner.next());
            System.out.println("Do you want to enter one more j/n");
            String ch=scanner.next();
            flag=ch.equalsIgnoreCase("j");
        }

        scanner.close();
        return names;
    }

    public static List<Integer> fibonacciNumbers(int num){
        int counter=0;
        List<Integer> fibonacciNumbers=new ArrayList<>();
        int a=0;
        int b=1;
        int sum=0;

        fibonacciNumbers.add(a);
        fibonacciNumbers.add(b);
        while (num!=counter+1){
            sum=a+b;
            a=b;
            b=sum;
            fibonacciNumbers.add(sum);
            //System.out.print(sum+" ");

            counter++;
        }
        return fibonacciNumbers;
    }

    public static List<Integer> fibonacciNumbersPrintReverse(int num){
        List<Integer> fibonacciNumbersReverse=new ArrayList<>();
        int a=0;
        int b=1;
        int sum=0;

        fibonacciNumbersReverse.add(a);
        fibonacciNumbersReverse.add(b);
        while (sum<num){
           sum=a+b;
            a=b;
            b=sum;
            if (sum<num) fibonacciNumbersReverse.add(sum);
        }

        List<Integer> fibonacciNumbersPrintReverse=new ArrayList<>();
        for (int i = fibonacciNumbersReverse.size()-1; i >=0 ; i--) {
            fibonacciNumbersPrintReverse.add(fibonacciNumbersReverse.get(i));
        }

        return fibonacciNumbersPrintReverse;
    }

//    public static List<String>
    public static List<Integer> allNumbersDivideByIntegerExactly (){
        List<Integer> allNumbersDivideByExactly =new ArrayList<>();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Type a number");
        int num=scanner.nextInt();
        for (int i = 1; i <=num ; i++) {
            if(num%i==0) allNumbersDivideByExactly.add(i);
        }
        return allNumbersDivideByExactly;
    }

}

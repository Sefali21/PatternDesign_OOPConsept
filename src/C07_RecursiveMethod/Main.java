package C07_RecursiveMethod;

public class Main {
    public static void main(String[] args) {
        int input=5;
        int result=add(input);
        System.out.println(result);
        System.out.println("Recursive Method");
        System.out.println(add2(8));
        System.out.println("End of the main method");

    }

    public static int add(int input){
        int result=0;
        for (int i = 0; i <input+1 ; i++) {
            result+=i;
        }
        return  result;
    }

    public static int add2(int input){
        System.out.println("Enter the method");
        if(input==1){
            return 1;
        }else {
            System.out.println("input "+input);
             return input + add2(input - 1);
        }

    }


}

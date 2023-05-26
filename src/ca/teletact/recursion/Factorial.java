package ca.teletact.recursion;

public class Factorial{

    public static void main(String[] args) {
        System.out.println("Finding factorials...");
        System.out.println("Factorial 5! : "+factR(5));
        System.out.println("Factorial 0! : "+factR(0));
        System.out.println("Factorial 1! : "+factR(1));
        System.out.println("Factorial 6! : "+factR(6));
        System.out.println("Factorial 5! : "+factI(5));
        System.out.println("Factorial 0! : "+factI(0));
        System.out.println("Factorial 1! : "+factI(1));
        System.out.println("Factorial 6! : "+factI(6));
    }

    public static int factR(int num){

        if (num == 0) return 1;
        return num * factR(num-1);
    }

    public static int factI(int num){
        int result = 1;
        for(int i=num; i >= 1; i--) result *= i;
        return result;
    }
}
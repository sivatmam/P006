package ca.teletact.recursion;
import java.time.Instant;
import java.util.Map;
import java.util.HashMap;

public class Fibonacci {

    public static Map <Integer,Integer> cache = new HashMap<Integer,Integer>();
    public static void main(String[] args) {

        fibRPerf(37);
        fibRPerf(38);
        fibRPerf(39);


        fibMPerf(37);
        fibMPerf(38);
        fibMPerf(39);

        fibIPerf(37);
        fibIPerf(38);
        fibIPerf(39);
        


    }

    public static void fibRPerf(int index){
        int result = 0;
        Instant start = Instant.now();
        
          // function performance under test
          result = fibR(index);

        Instant stop = Instant.now();
        System.out.println("The fibonacci index of "+index+" is "+result);
        long timediff = stop.toEpochMilli()-start.toEpochMilli();
        System.out.println("The start time: "+ start.toEpochMilli());
        System.out.println("The stop time : "+ stop.toEpochMilli());
        System.out.println("Time difference: "+timediff);
    }
    public static void fibMPerf(int index){
        int result = 0;
        Instant start = Instant.now();
        
          // function performance under test
          result = fibM(index);

        Instant stop = Instant.now();
        System.out.println("The fibonacci Memoization index of "+index+" is "+result);
        long timediff = stop.toEpochMilli()-start.toEpochMilli();
        System.out.println("The start time: "+ start.toEpochMilli());
        System.out.println("The stop time : "+ stop.toEpochMilli());
        System.out.println("Time difference: "+timediff);
    }

    public static void fibIPerf(int index){
        int result = 0;
        Instant start = Instant.now();
        
          // function performance under test
          result = fibI(index);

        Instant stop = Instant.now();
        System.out.println("The fibonacci Iterative index of "+index+" is "+result);
        long timediff = stop.toEpochMilli()-start.toEpochMilli();
        System.out.println("The start time: "+ start.toEpochMilli());
        System.out.println("The stop time : "+ stop.toEpochMilli());
        System.out.println("Time difference: "+timediff);
    }

    
    public static int fibR(int index){
        if (index == 0) return 0;
        if (index == 1) return 1;
        return fibR(index - 1) + fibR(index - 2);
    }
    public static int fibM(int index){
        if (index == 0) return 0;
        if (index == 1) return 1;
        if (cache.containsKey(index)) return cache.get(index);
        int result = fibM(index - 1) + fibM(index - 2);
        cache.put(index,result);
        return result;
    }

    public static int fibI(int index){

        int result = 0;
        int a = 0;
        int b = 1;

        if (index == 0) return 0;
        if (index == 1) return 1;
        for (int i = 2; i <= index; i++){
          result = a + b;
          a = b;
          b = result;
        }
        return result;
    }
}

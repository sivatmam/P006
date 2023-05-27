package ca.teletact.recursion;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class Pascal {

    
    public static void main(String[] args) {
        
        System.out.println("Pascal 9:"+pascalI(9));
        System.out.println("Pascal 12:"+pascalI(12));
        System.out.println("Pascal 3:"+pascalI(3));
        System.out.println("Pascal 3:"+pascalI(1));

        
    }



    public static Map<Integer,List<Integer>> pascalI(int row){

        Map<Integer,List<Integer>> pascalTriangle = new HashMap<Integer,List<Integer>>();
        
        if (row >=2){
            List<Integer> pascalRow = new ArrayList<Integer>();
            pascalRow.add(1);
            pascalRow.add(1);
            pascalTriangle.put(2,pascalRow);
            
        }
        

        if (row >=1){
            List<Integer> pascalRow = new ArrayList<Integer>();
            pascalRow.add(1);
            pascalTriangle.put(1,pascalRow);
            
        }

        for(int i=3; i <= row; i++){
            
              List<Integer> pascalRow = new ArrayList<Integer>();
              List<Integer> prevRow = pascalTriangle.get(i-1);

              pascalRow.add(1);
              for(int j=1; j<prevRow.size();j++){
                int temp = prevRow.get(j-1) + prevRow.get(j);
                pascalRow.add(temp);
              }
              pascalRow.add(1);

              pascalTriangle.put(i,pascalRow);
            
        }

        return pascalTriangle;

    }
}

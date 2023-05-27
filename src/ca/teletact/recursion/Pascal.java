package ca.teletact.recursion;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class Pascal {

    
    public static void main(String[] args) {
        
        System.out.println("Pascal Iterative 9:"+pascalI(9));
        System.out.println("Pascal Iterative 12:"+pascalI(12));
        System.out.println("Pascal Iterative 3:"+pascalI(3));
        System.out.println("Pascal Iterative 2:"+pascalI(2));
        System.out.println("Pascal Iterative 1:"+pascalI(1));

        System.out.println("Pascal Recursive 1:"+pascalR(new HashMap<Integer,List<Integer>>(),1));
        System.out.println("Pascal Recursive 2:"+pascalR(new HashMap<Integer,List<Integer>>(),2));
        System.out.println("Pascal Recursive 3:"+pascalR(new HashMap<Integer,List<Integer>>(),3));
        System.out.println("Pascal Recursive 9:"+pascalR(new HashMap<Integer,List<Integer>>(),9));
        System.out.println("Pascal Recursive 12:"+pascalR(new HashMap<Integer,List<Integer>>(),12));
    }

    public static Map<Integer,List<Integer>> pascalR(Map <Integer, List<Integer>> pt, int row){

        if (row == 1){
            List<Integer> pascalRow = new ArrayList<Integer>();
            pascalRow.add(1);
            pt.put(1,pascalRow);
            return pt;
        }

        List<Integer> pascalRow = new ArrayList<Integer>();
        List<Integer> prevRow = pascalR(pt, row - 1).get(row-1);

        pascalRow.add(1);
        for(int j=1; j<prevRow.size();j++){
          int temp = prevRow.get(j-1) + prevRow.get(j);
          pascalRow.add(temp);
        }
        pascalRow.add(1);

        pt.put(row, pascalRow);

        return pt;
        
    }

    public static Map<Integer,List<Integer>> pascalI(int row){

        Map<Integer,List<Integer>> pascalTriangle = new HashMap<Integer,List<Integer>>();
               

        if (row >=1){
            List<Integer> pascalRow = new ArrayList<Integer>();
            pascalRow.add(1);
            pascalTriangle.put(1,pascalRow);
            
        }

        for(int i=2; i <= row; i++){
            
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

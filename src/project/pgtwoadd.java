package project;
import java.util.*;

public class pgtwoadd {        
    public int[] solution(int[] numbers) {
        int[] answer = {};
        List<Integer> arrList = new ArrayList<>();
        
        for(int i = 0; i<numbers.length ; i++ ) {   
            for(int j = i+1; j<numbers.length ; j++ ) {
                arrList.add(numbers[i]+numbers[j]);
            }
        }
        
        return answer;
    }
    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] array = {2,1,3,4,1};
        int[] ans = {};
        ans = solution(array);
        
        for(int outp : ans) {
            System.out.println(outp);
        }
        
        //System.out.println("Hello test!");
    }

}

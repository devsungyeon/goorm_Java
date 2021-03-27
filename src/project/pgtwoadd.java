package project;
import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        Set<Integer> set = new HashSet<>();
        
        for(int i = 0; i<numbers.length ; i++ ) {   
            for(int j = i+1; j<numbers.length ; j++ ) {
                set.add(numbers[i]+numbers[j]);
            }
        }
        int[] answer = new int[set.size()];
        Iterator<Integer> it = set.iterator();
        for(int i=0; i<set.size(); i++) {
            answer[i] = it.next();
        }
        Arrays.sort(answer);
        return answer;
    }
}
public class pgtwoadd {        
    
    public static void main(String[] args) {

        int[] array = {2,1,3,4,1};
        int[] ans = {};
        Solution sl = new Solution();
        ans = sl.solution(array);
        for(int outp : ans) {
            System.out.println(outp);
        }
    }

}

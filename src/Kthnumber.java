import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = {};
        List<Integer> ans = new ArrayList<Integer>();

        for(int[] i : commands) {
            List<Integer> temp = new ArrayList<Integer>();
            for(int j = i[0]-1 ; j<i[1];j++){
                temp.add(array[j]);
            }
            temp.sort(Comparator.naturalOrder());
            ans.add(temp.get(i[2]-1));
        }
        answer = ans.stream().mapToInt(i->i).toArray();
        return answer;
    }
}

public class Kthnumber {
    public static void main() {
        int[] arr = {1, 5, 2, 6, 3, 7, 4};
        int[][] com = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}} ;
        Solution sol = new Solution();

        sol.solution(arr, com);
    }
}

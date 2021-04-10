package project;

import java.util.ArrayList;
import java.util.Arrays;

class Solutiond {
    public int[] solution(int[] arr, int divisor) {
        /*
        ArrayList<Integer> temp = new ArrayList<Integer>();
        for(int a : arr) {
            if(a % divisor == 0) {
                temp.add(a);
            }
        }

        if(temp.size() == 0)
            temp.add(-1);

        int[] answer = new int[temp.size()];
        for(int i = 0 ; i < answer.length; i++ ) {
            answer[i] = temp.get(i).intValue();
        }
        
        return answer;
        */

        return Arrays.stream(arr).filter(factor -> factor % divisor == 0).toArray();
    }
}

public class divzeroarr {
    
}

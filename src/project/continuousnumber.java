package project;

import java.util.*;
public class Solution {
    public int[] solution(int []arr) {
        int[] answer;
        int count = 0;
        
        for(int i = 1 ; i < arr.length ; i++ ) {
            if(arr[i-1] == arr[i]) {
                arr[i-1] = -1;
                count++;
            }
        }
        
        

        return answer;
    }
}

public class continuousnumber {
    public static void main(String[] args) {
        
    }
}

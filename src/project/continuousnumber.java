package project;

import java.util.*;
public class Solution {
    public int[] solution(int []arr) {/*
        int[] answer;
        int count = 0;
        
        for(int i = 1 ; i < arr.length ; i++ ) {
            if(arr[i-1] == arr[i]) {
                arr[i-1] = -1;
                count++;
            }
        }
        answer = new int[arr.length-count];
        count = 0;
        for(int i = 0 ; i < arr.length ; i++ ) {
            if(arr[i] != -1) {
                answer[count++] = arr[i];
            }
        }
        
        return answer;
        */
        ArrayList<Integer> temp = new ArrayList<Integer>();
        int preNum = 10;
        for(int a : arr) {
            if(a != preNum)
                temp.add(a);
            preNum = a;
        }
        
        int[] answer = new int[temp.size()];
        for(int i = 0 ; i < answer.length; i++ ) {
            answer[i] = temp.get(i).intValue();
        }

        Arrays.sort(answer);

        return answer;
    }
    
}

public class continuousnumber {
    public static void main(String[] args) {
        
    }
}

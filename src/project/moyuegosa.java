package project;

import java.util.ArrayList;
import java.util.Arrays;

class Solutionm {
    public int[] solution(int[] answers) {
        int[] answer = {};
        int[] cnt = {0,0,0};
        int[] first = {1,2,3,4,5};
        int[] second = {2,1,2,3,2,4,2,5};
        int[] third = {3,3,1,1,2,2,4,4,5,5};
        

        for(int i = 0;i < answers.length;i++) {
            if(first[i % first.length] == answers[i]) {
                cnt[0]++;
            }
            if(second[i % second.length] == answers[i]) {
                cnt[1]++;
            }
            if(third[i % third.length] == answers[i]) {
                cnt[2]++;
            }
        }
        int max = Arrays.stream(cnt).max().getAsInt();
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0 ; i < cnt.length; i++) {
            if(cnt[i] == max) {
                ans.add(i+1);
            }
        }
        answer = ans.stream().mapToInt(i->i).toArray();
        return answer;
    }
}

public class moyuegosa {
    public static void main(String[] args) {
        int[] answers = {1,2,3,4,5};
        Solutionm sol = new Solutionm();
        sol.solution(answers);
    }
}

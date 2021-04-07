package project;

import java.util.*;
class Solutiong {
    public int solution(int n, int[] lost, int[] reserve) {
    /*
    int answer = 0;

        int[] visit = new int[n+1];
        Arrays.fill(visit,1);
        visit[0] = 0;
        
        for(int a : lost) {
            visit[a]--;
        }
        for(int a : reserve) {
            visit[a]++;
        }

        for(int i = 1;i<=n ;i++) {
            if(visit[i] == 0) {
                if(i==1){
                    if(visit[i+1] == 2) {
                        visit[i+1] = 1;
                        visit[i] = 1;
                    }
                }
                else if(i==n){
                    if(visit[i-1] == 2) {
                        visit[i-1] = 1;
                        visit[i] = 1;
                    }
                }
                else{
                    if(visit[i-1] == 2) {
                        visit[i-1] = 1;
                        visit[i] = 1;
                    }
                    else if(visit[i+1] == 2) {
                        visit[i+1] = 1;
                        visit[i] = 1;
                    }
                }
            }
        }
        for(int a : visit)
            if(a>0)
                answer++;
        
        return answer;
        */
        int[] people = new int[n];
        int answer = n;

        for (int l : lost)
            people[l-1]--;
        for (int r : reserve)
            people[r-1]++;
        
        for(int i = 0 ; i < people.length ;i ++) {
            if(people[i] == -1) {
                if(i-1>=0 && people[i-1] == 1) {
                    people[i]++;
                    people[i-1]--;
                }
                else if(i+1 < people.length && people[i+1] == 1) {
                    people[i]++;
                    people[i+1]--;
                }
                else {
                    answer--;
                }
            }
        }

        return answer;
    }
}

public class Gymclothes {
    public static void main(String[] args) {
        Solutiong sol = new Solutiong();
        int n = 5;
        int[] lost = {2,4};
        int[] reserve = {1,3,5};
        sol.solution(n, lost, reserve);
    }
}

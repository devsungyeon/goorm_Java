package project;

import java.util.Stack;

import javax.lang.model.element.Element;

class Solutioncrain {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for(int m : moves) {
            int temp = 0;
            for(int i = 0;i<board[0].length;i++){
                if(board[i][m-1] != 0) {
                    temp = board[i][m-1];
                    board[i][m-1] = 0;
                    break;
                }
            }
            if(temp!=0) {
                if (stack.empty()) {
                    stack.push(temp);
                }
                else {
                    if(temp == stack.peek()) {
                        answer+=2;
                        stack.pop();
                    }
                    else {
                        if(temp != 0) {
                            stack.push(temp);
                        }
                    }
                    
                }
            }

            
            
            
        }
        return answer;
    }
}

public class craingame {
    public static void main(String[] args) {
        int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
        int moves[] = {1,5,3,5,1,2,1,4}	;

        Solutioncrain sc = new Solutioncrain();
        int answer=0;
        answer = sc.solution(board, moves);
        System.out.println(answer);
    }
}

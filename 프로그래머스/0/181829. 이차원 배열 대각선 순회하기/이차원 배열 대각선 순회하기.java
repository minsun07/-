class Solution {
    public int solution(int[][] board, int k) {
        int answer = 0;
        for(int i=0; i<board.length; i++){  //board배열의 길이 만큼 반복
            for(int j=0; j<board[i].length; j++){ //board의 각 원소 배열의 길이 만큼 반복
                if(i+j<=k) //이때 i+j값을 k와 비교
                    answer += board[i][j]; //i,j의 항의 값 더하기
            }
        }
        return answer;
    }
}
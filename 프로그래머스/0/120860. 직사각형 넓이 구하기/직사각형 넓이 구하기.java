class Solution {
    public int solution(int[][] dots) {
        //초기값 지정
        int minX = dots[0][0];
        int maxX = dots[0][0];
        int minY = dots[0][1];
        int maxY = dots[0][1];
        
        //최대최소값 구하기
        for(int i=1; i<dots.length; i++){
            if(minX > dots[i][0])
                minX = dots[i][0]; //최소 x값
            if(maxX < dots[i][0])
                maxX = dots[i][0]; //최대 x값
            if(minY > dots[i][1])
                minY = dots[i][1];
            if(maxY < dots[i][1])
                maxY = dots[i][1];
        }
        
        int width = maxX - minX;
        int height = maxY - minY;
        
        return width*height;
    }
}
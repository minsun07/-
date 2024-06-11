import java.util.*;

class Solution {
    public List solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>(); //배열 동적할당(가변적 배열 할당)
        
        for(int i=0; i<arr.length; i++){ //arr 반복
            for(int j=1; j<=arr[i]; j++){ //원소 수만큼 반복
                list.add(arr[i]);         //list에 원소 저장
            }
        }
        
        return list;
    }
}
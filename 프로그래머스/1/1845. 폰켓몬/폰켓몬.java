import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int max = nums.length/2;
        
        //중복 값 제거하기
        HashSet<Integer> setnum = new HashSet<>();  //빈HashSet생성
        
        for(int num : nums) //차례대로 num에 nums의 값을 넣을 때마다
            setnum.add(num);  //setnum에 num을 추가한다.
                              //단, setnum은 HashSet이므로 중복된 값은 들어가지 못한다.
        
        if(setnum.size() > max) return max;
        else return setnum.size();

    }
}
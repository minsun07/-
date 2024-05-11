import java.util.ArrayList;
class Solution {
    public String[] solution(String[] names) {
        ArrayList<String> as = new ArrayList<>();
        for(int i=0; i<names.length; i++){
            if(i%5==0)
                as.add(names[i]);
        }       
        return as.toArray(new String[as.size()]);
    }
}
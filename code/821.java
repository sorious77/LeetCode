class Solution {
    public int[] shortestToChar(String s, char c) {
        List<Integer> locate = new ArrayList<>();
        int []answer = new int[s.length()];
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == c){
                locate.add(i);
            }
        }
        
        for(int i=0;i<s.length();i++){
            int min = Integer.MAX_VALUE;
            for(int j=0;j<locate.size();j++){
                min = Math.min(min, Math.abs(i - locate.get(j)));
            }
            answer[i] = min;
        }
        return answer;
    }
}

class Solution {
    public int hammingDistance(int x, int y) {
        String str1 = Integer.toBinaryString(x);
        String str2 = Integer.toBinaryString(y);
        
        str1 = String.format("%32s", str1).replaceAll(" ", "0");
        str2 = String.format("%32s", str2).replaceAll(" ", "0");
        
        int answer = 0;
        for(int i=0;i<str1.length();i++){
            if(str1.charAt(i) != str2.charAt(i))
                answer++;
        }
        
        return answer;
    }
}

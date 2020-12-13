class Solution {
    public int minPartitions(String n) {
        int max = 0;
        for(int i=0;i<n.length();i++){
            char temp = n.charAt(i);
            
            if(max < temp - '0')
                max = temp - '0';
        }
        
        return max;
    }
}

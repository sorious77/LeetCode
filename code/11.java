class Solution {
    int findMin(int a, int b){
        return a > b ? b : a;
    }
    
    public int maxArea(int[] height) {
        int answer = 0;
        
        for(int i=0;i<height.length-1;i++){
            for(int j=i+1;j<height.length;j++){
                int temp = (j - i) * findMin(height[i], height[j]);
                if(temp > answer)
                    answer = temp;
            }
        }
        
        return answer;
    }
}
class Solution {
    public int findJudge(int N, int[][] trust) {
        if(N == 1)
            return 1;
        
        int []count = new int[N + 1];
        int answer = -1;
        
        for(int i=0;i<trust.length;i++){
            count[trust[i][1]]++;
            
            if(count[trust[i][1]] >= N - 1){
                answer = trust[i][1];
                break;
            }
        }
        
        for(int i=0;i<trust.length;i++){
            if(trust[i][0] == answer){
                answer = -1;
                break;
            }
        }
        
        return answer;
    }
}

class Solution {
    public int[] sortArrayByParityII(int[] A) {
        int odd = 1, even = 0;
        int []answer = new int[A.length];
                
        for(int i=0;i<A.length;i++){
            if(A[i] % 2 == 0){
                answer[even] = A[i];
                even += 2;
            }
            else{
                answer[odd] = A[i];
                odd += 2;
            }
        }
        
        return answer;
    }
}

class Solution {
    public List<String> buildArray(int[] target, int n) {
        int index = 0;
        int len = target.length;
        List<String> answer = new ArrayList<>();
        
        for(int i=1;i<=n;i++){
            answer.add("Push");
            
            if(target[index] != i){
                answer.add("Pop");
            }
            else{
                index++;
                
                if(index >= len){
                    break;
                }
            }
        }
        
        return answer;
    }
}

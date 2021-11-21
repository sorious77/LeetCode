class data{
    int left;
    int right;
    String str;
    
    data(){
        left = 0;
        right = 0;
        str = "";
    }
    
    data(int left, int right, String str){
        this.left = left;
        this.right = right;
        this.str = str;
    }
}

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> answer = new ArrayList<>();
        Queue<data> q = new LinkedList<>();
        q.offer(new data(0, 0, ""));
        
        while(!q.isEmpty()){
            data temp = q.poll();
            
            if(temp.str.length() == n * 2)
                answer.add(temp.str);
                
            if(temp.left < n){
                q.offer(new data(temp.left + 1, temp.right, temp.str.concat("(")));
            }
            if(temp.right < n && temp.right < temp.left){
                q.offer(new data(temp.left, temp.right + 1, temp.str.concat(")")));
            }
        }
        
        return answer;
    }
}

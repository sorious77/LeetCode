class Solution {
    public int calPoints(String[] ops) {
        List<Integer> score = new ArrayList<>();
        int index = 0;
        
        for(int i=0;i<ops.length;i++){
            String temp = ops[i];
            
            if(Character.isDigit(temp.charAt(0))){
                score.add(Integer.parseInt(temp));
                index++;
            }
            else{
                if(temp.charAt(0) == '-'){
                    score.add(Integer.parseInt(temp));
                    index++;
                }
                else if(temp.charAt(0) == '+'){
                    score.add(score.get(index - 2) + score.get(index - 1));
                    index++;
                }
                else if(temp.charAt(0) == 'D'){
                    score.add(score.get(index - 1) * 2);
                    index++;
                }
                else{
                    score.remove(--index);
                }
            }
        }
        
        int answer = 0;
        
        for(int i=0;i<score.size();i++){
            answer += score.get(i);
        }
        
        return answer;
    }
}
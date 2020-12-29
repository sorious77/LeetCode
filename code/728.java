class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        Boolean flag;
        
        for(int i=left;i<=right;i++){
            int temp = i;
            flag = true;
            
            while(temp >= 10){
                if(temp % 10 == 0){
                    flag = false;
                    break;
                }
                
                if(i % (temp % 10) != 0){
                    flag = false;
                    break;
                }
                
                temp /= 10;
            }
            
            if(temp != 0){
                if(i % temp != 0)
                    flag = false;
            }
            
            if(flag)
                list.add(i);
        }
        
        return list;
    }
}
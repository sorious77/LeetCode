class SmallestInfiniteSet {
    int min = 1;
    boolean[] isExist = new boolean[1001];
    
    public SmallestInfiniteSet() {
        Arrays.fill(isExist, true);
    }
    
    public int popSmallest() {
        int smallest = min;
        
        isExist[min] = false;
        for(int i = min; i <= 1000; i++) {
            if(isExist[i]) {
                min = i;
                break;
            }
        }
        
        return smallest;
    }
    
    public void addBack(int num) {
        isExist[num] = true;
        
        if(num <= min) {
            min = num;
        }
    }
}

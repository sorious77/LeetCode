class pos{
    int x;
    int y;
    pos(){}
    pos(int x, int y){
        this.x = x;
        this.y = y;
    }
}
class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        Queue<pos> q = new LinkedList<>();
        boolean flag = true;
        
        for(int i=0;i<matrix.length;i++){
            q.offer(new pos(0, i));
        }
        for(int i=1;i<matrix[0].length;i++){
            q.offer(new pos(i, 0));
        }
        
        while(!q.isEmpty()){
            pos temp = q.poll();
            int nextX = temp.x;
            int nextY = temp.y;
            int val = matrix[temp.y][temp.x];
            
            while(nextX < matrix[0].length && nextY < matrix.length){
                if(matrix[nextY][nextX] != val){
                    flag = false;
                    break;
                }
                nextX++;
                nextY++;
            }
            
            if(!flag)
                break;
        }
        
        return flag;
    }
}

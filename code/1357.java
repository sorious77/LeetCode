class Cashier {
    int n;
    int discount;
    HashMap<Integer, Integer> productInfo;
    int count;
    
    public Cashier(int n, int discount, int[] products, int[] prices) {
        this.n = n;
        this.discount = discount;
        
        productInfo = new HashMap<>();
        
        for(int i=0;i<products.length;i++){
            productInfo.put(products[i], prices[i]);
        }
        
        this.count = 0;
    }
    
    public double getBill(int[] product, int[] amount) {
        int length = product.length;
        
        double sum = 0;
        
        for(int i=0;i<length;i++){
            int id = product[i];
            
            sum += (double)productInfo.get(id) * amount[i];
        }
        
        count++;
                
        if(count % n == 0){
            return sum * ((double)(100 - discount) / 100);
        } else {
            return sum;
        }
    }
}
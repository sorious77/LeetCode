class ParkingSystem {
    int []size;
    public ParkingSystem(int big, int medium, int small) {
        size = new int[3];
        size[0] = big;
        size[1] = medium;
        size[2] = small;
    }
    
    public boolean addCar(int carType) {
        if(size[carType-1] <= 0)
            return false;
        
        size[carType-1]--;
        return true;
    }
}

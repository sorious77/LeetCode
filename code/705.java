class MyHashSet {
    boolean[] hashSet;

    public MyHashSet() {
        hashSet = new boolean[1000001];
    }
    
    public void add(int key) {
        hashSet[key] = true;
    }
    
    public void remove(int key) {
        hashSet[key] = false;
    }
    
    public boolean contains(int key) {
        return hashSet[key];
    }
}

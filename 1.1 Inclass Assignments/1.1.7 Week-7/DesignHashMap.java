class MyHashSet {
    int[]arr;
    public MyHashSet() {
        arr=new int[1000001];
        arr[0]=-1;
    }
    
    public void add(int key) {
        arr[key]=key;
    }
    
    public void remove(int key) {
        // arr.remove(Integer.valueOf(key));
        arr[key]=-1;
    }
    
    public boolean contains(int key) {
        if(arr[key] == key) return true;
        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
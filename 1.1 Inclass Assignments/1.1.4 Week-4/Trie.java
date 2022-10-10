class Node{
    Node ref[];
    boolean flag;
    
    public Node(){
      ref=new Node[26];
      flag=false;
    }

    void put(char ch,Node node){
        ref[ch-'a']=node;
    }
    void setEnd(){
        flag=true;
    }
    Node get(char ch){
        return ref[ch-'a'];
    }
    boolean isEnd(){
        return flag;
    }
    boolean containsKey(char ch){
        return (ref[ch-'a']!=null);
    }
}
class Trie {
    Node root; 
    
    public Trie(){
        root=new Node();
    }
    public void insert(String word) {
        Node node=root;
        for(int index=0;index<word.length();index++){
            if(!node.containsKey(word.charAt(index))){
                node.put(word.charAt(index),new Node());
            }
            node=node.get(word.charAt(index));
        }
        node.setEnd();
    }
    
    public boolean search(String word) {
        Node node=root;
        for(int index=0;index<word.length();index++){
            if(!node.containsKey(word.charAt(index))){
                return false;
            }
            node=node.get(word.charAt(index));
        }
        if(node.isEnd()){
            return true;
        }
        return false;
    }
    
    public boolean startsWith(String prefix) {
        Node node=root;
        for(int index=0;index<prefix.length();index++){
            if(!node.containsKey(prefix.charAt(index))){
                return false;
            }
            node=node.get(prefix.charAt(index));
        }        
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
class Solution {
    public List<String> findRepeatedDnaSequences(String str) {
        Map<String,Integer> map=new HashMap<>();
        for(int index=0;index+9<str.length();index++){
            String subs=str.substring(index,index+10);
            if(!map.containsKey(subs)){
                map.put(subs,1);
            }else{
                map.put(subs,map.get(subs)+1);
            }
        }
        List<String> res=new ArrayList<>();
        for(Map.Entry<String,Integer> elements : map.entrySet()){
            int f = elements.getValue();
            String temp=elements.getKey();
            if(f>1){
                res.add(temp);
            }
        }
        return res;
    }
}
class Solution {
    public int[] topKFrequent(int[] arr, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int index=0;index<arr.length;index++){
            map.put(arr[index],map.getOrDefault(arr[index],0)+1);
        }
        int max = Collections.max(map.values());
        List<Integer> res = new ArrayList<>();
        int flag=0;
        for(int i=max;i>0 && flag<k;i--){
            for(Map.Entry<Integer,Integer> o:map.entrySet()){
                int f = o.getValue();
                if(f == i){
                    res.add(o.getKey());
                    flag++;
                }
                if(flag>=k){
                    break;
                }
            }
        }
        //System.out.print(al);
        int[] fin = new int[k];
        for(int i=0;i<k;i++){
            fin[i] = res.get(i);
        }
        return fin;
    }
}
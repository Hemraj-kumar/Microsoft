class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        List<Integer> res=new ArrayList<>();
        Comparator<Integer> cmp=(x,y)->{
            if(map.get(x)!=map.get(y)){
                return map.get(y)-map.get(x);
            }return map.get(x)-map.get(y);
        };
        PriorityQueue<Integer> q=new PriorityQueue<>(cmp);
        for(int index=0;index<nums.length;index++){
            map.put(nums[index],map.getOrDefault(nums[index],0)+1);
        }
        for(Integer i:map.keySet()){
            q.add(i);
        }
        for(int index=0;index<k;index++) res.add(q.poll());
        System.out.println(res);
        int[]arr=new int[k];
        for(int index=0;index<k;index++) arr[index]=res.get(index);
        return arr;
    }
}
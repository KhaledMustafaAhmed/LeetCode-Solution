class Solution {
    public int removeDuplicates(int[] nums) {
        Map<Integer, Integer> map = new LinkedHashMap<>();
        int count = 0, size = nums.length;
        for(int i=0; i<size; ++i){
            if(!(map.containsKey(nums[i]))){
                map.put(nums[i], i);
                count++;
                continue;
            }
            nums[i] = -200;
        }
        int index = 0;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            nums[index++]= entry.getKey();
        }
        return count;
    }
}
/* First Try */
class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();
        int size = nums.length;
        boolean first = true;
        int firstOcc = 0;
        for(int i=0; i<size; i++){
            if((i+1 < size)){
                long temp = (long)nums[i+1] - nums[i];
                if((temp > 1)){
                    if(first){
                        list.add(nums[0]==nums[i]? (nums[0]+"") : (nums[0]+"->"+nums[i]));
                        first = false;
                        firstOcc = i+1;
                        continue;
                    }
                    list.add(nums[firstOcc]==nums[i]? (nums[firstOcc]+"") : (nums[firstOcc]+"->"+nums[i]));
                    firstOcc = i+1;
                    continue;
                }
                continue;
            }
            if(i == firstOcc){
                list.add(nums[firstOcc]+"");
                break;
            }
            list.add(nums[firstOcc]+"->"+nums[i]);
            firstOcc = i+1;
        } 
        return list;

    }
}

/* second try */
class Solution {
    public List<String> summaryRanges(int[] nums) {
        int start =  0, end = 0; 
        List<String> list = new ArrayList<>();
        if(nums.length == 1){
            list.add(nums[0]+"");
            return list;
        }
        for(int i=1; i<nums.length; ++i, ++end){

            if(i==nums.length-1){
                 if( (nums[end]+1) == nums[i]){
                    list.add( ((end==i)? (nums[start]+"") : (nums[start]+"->"+nums[i]) ) );
                    break;
                }

                list.add( ((end==start)? (nums[start]+"") : (nums[start]+"->"+nums[end]) ) );
                list.add(nums[i]+"");
                break; 
            }

            if( (nums[end]+1) != nums[i]){
                list.add(( (start==end) ? (nums[start] + ""): (nums[start] + "->" + nums[end])));
                start = i;
            }

            
        }
        

        return list;
    }
}
class Solution {
    public int[] plusOne(int[] digits) {
        int size = digits.length; 
        int start = 0;
        if(size <= 1) return digits[0] == 9?  new int []{1,0}: new int []{digits[0]+1}; 

        boolean carry = true;

        List <Integer> list = new LinkedList<>();
        for(int i=size-1; i>=0; --i){
            if(carry){
                if(digits[i] == 9){
                    list.add(0);
                }else{
                    list.add(digits[i]+1);
                    carry = false;
                }
            }else{
                list.add(digits[i]);
            }
        }
        if(carry ) list.add(1);
        Collections.reverse(list);
        int []arr = new int[list.size()];
        int arrSize = arr.length;
        for(int i=0; i<arrSize; ++i){
            arr[i] = list.removeFirst();
        }

        return arr;
    }
}
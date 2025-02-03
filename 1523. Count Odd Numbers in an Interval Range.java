class Solution {
    public int countOdds(int low, int high) {
        int n = high - low + 1;
        return (n%2 == 0 n2 n2+ ((low%2 != 0  high%2!= 0) 1  0));
    }
}
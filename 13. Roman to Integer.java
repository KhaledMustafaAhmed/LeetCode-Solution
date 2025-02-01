class Solution {
    public int romanToInt(String s) {
        Map<String,Integer> map = new HashMap<>();
        int result = 0;
        map.put("I",1);
        map.put("V",5);
        map.put("X",10);
        map.put("L",50);
        map.put("C",100);
        map.put("D",500);
        map.put("M",1000);
        int size = s.length();
        for(int i=0; i<size; ++i){
            if((s.charAt(i) == 'I')  && (i+1<size) && ((s.charAt(i+1)=='V') || (s.charAt(i+1)=='X'))){
                result+= s.charAt(i+1)=='V' ? 4 : 9;
                i=i+1;
                continue;
            }

            if((s.charAt(i) == 'X') && (i+1<size) && ((s.charAt(i+1)=='L') || (s.charAt(i+1)=='C'))){
                result+= s.charAt(i+1)=='L' ? 40 : 90;
                i=i+1;
                continue;
            }

            if((s.charAt(i) == 'C') && (i+1<size) && ((s.charAt(i+1)=='D') || (s.charAt(i+1)=='M'))){
                result+= s.charAt(i+1)=='D' ? 400 : 900;
                i=i+1;
                continue;
            }
            result += map.get(String.valueOf(s.charAt(i)));
        }
        return result;
    }
}
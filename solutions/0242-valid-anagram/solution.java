class Solution {
    public boolean isAnagram(String s, String t) {
        /*
        char arr_s[] = s.toCharArray();
    	char arr_t[] = t.toCharArray();
    	Arrays.sort(arr_s);
    	Arrays.sort(arr_t);
    	if(Arrays.equals(arr_s, arr_t)) return true;
    	else return false;
        */

        // Another approch using HashMap
        HashMap<Character, Integer> map = new HashMap<>();
        if(s.length() != t.length()) return false;
        for(char c: s.toCharArray())
            map.put(c, map.getOrDefault(c, 0) + 1);
        for(char c: t.toCharArray()){
            if(!map.containsKey(c)) return false;
            map.put(c, map.get(c) -1 );
            if(map.get(c)<0) return false;
        }
        return true;
    }
}

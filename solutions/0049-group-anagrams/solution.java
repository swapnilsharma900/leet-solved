
/**
*	#Intuition
*	<!-- For comparing multiple strings i can create a key(sorted string) and assign value(original string) to it.-->

*	#Approach
*	<!-- 
        Since Key value pairs are involved => HashMap
        Sorting of string(repeated) => Arrays (string->char array)
        return => List
    -->
*	<!-- 
        1. key varible = Arrays.sort(strs[i].tocharArray());
        2. value variable = strs[i];
        2.5 add value to list
        3. add key and list to HashMap
        4. if(strs[i] == key) goto 2
        5. else goto 1.
        6. create list of all values list and return it;
    -->

*	#Code
*	<!-- Implement your logic into code -->
*	<!-- Dry run your code and Find edge cases in your logic -->

*	#Optimization
*	Check time complexity of your code
*	Try to improve space complexity of your code
*/
import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars); // sorted string as key

            map.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }

        return new ArrayList<>(map.values());
    }
}


package daySix;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for(String str : strs) {
            char[] ch = new char[26];
            for(int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                ch[c-'a']++;
            }
            String key = "";
            for(int i = 0; i < 26; i++) {
                key += ch[i];
                key += '#';
            }
            if(!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            List<String> strings = map.get(key);
            strings.add(str);
            map.put(key, strings);
        }
        for(String str : map.keySet()) {
            result.add(map.get(str));
        }
        return result;
    }
}

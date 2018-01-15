/**
 * Given an array of strings, group anagrams together.

 For example, given: ["eat", "tea", "tan", "ate", "nat", "bat"],
 Return:

 [
 ["ate", "eat","tea"],
 ["nat","tan"],
 ["bat"]
 ]

 思路：
 将每个字符串转为字符数组，对字符数组进行排序，排序后再转为字符串
 则 "eat", "tea"，"ate"在转换后都为"aet"
 使用hashmap，转换后的字符串作为key，转换前原字符串作为value
 最终取map的value就是所要的答案
 */

import java.util.*;

public class Solution49 {

    public List<List<String>> groupAnagrams(String[] strs) {

        if(strs.length == 0) return new ArrayList<>();

        Map<String,ArrayList> map = new HashMap<String,ArrayList>();

        for(String s : strs){
            char[] c = s.toCharArray();
            Arrays.sort(c);//对字符数组c进行排序
            String key = String.valueOf(c);//将字符数组转换为字符串

            if(!map.containsKey(key)) {//若map中不存在这个key
                map.put(key, new ArrayList<String>());
            }

            map.get(key).add(s);//map.get(key)得到的是ArrayList<String>，add()是对这个ArrayList来说的

        }

        return new ArrayList(map.values());

    }

}

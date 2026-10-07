/*
 * @lc app=leetcode id=49 lang=java
 *
 * [49] Group Anagrams
 */

// @lc code=start
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, String[]> helper = new HashMap<>();
        String tmp;
        for(String s : strs){
            tmp = Stream.of(s.split("")).sorted()
                .collect(Collectors.joining());
            helper.computeIfAbsent(tmp, k -> new ArrayList<>()).add(s);
        }
        // {'act': ['cat', 'act'], 'ant': ['tan', 'ant', 'nat']}
        return new ArrayList<>(helper.values());
    }
}
// @lc code=end

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> groupies= new HashMap<>();

        for (String s : strs){
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

            if (!groupies.containsKey(key)){
               groupies.put(key, new ArrayList<>()); 
            }
            groupies.get(key).add(s);
        }
        return new ArrayList<>(groupies.values());

    }
}
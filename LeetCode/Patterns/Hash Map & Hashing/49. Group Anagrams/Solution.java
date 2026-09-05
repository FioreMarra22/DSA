class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //First thought is the use of a hashmap to store groups, Maybe sort through strings for a key 
        HashMap<String, List<String>> group = new HashMap<>();

        for (String s : strs){
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            //Sorted key
            String sortingKey = new String(chars);

            //Check then create 
            if (!group.containsKey(sortingKey)) {
                group.put(sortingKey, new ArrayList<>());
            }
            group.get(sortingKey).add(s);
        }

        return new ArrayList<>(group.values());
    }
}
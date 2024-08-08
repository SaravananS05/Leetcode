class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        for(String words : strs)
        {
            char[] mp = words.toCharArray();
            Arrays.sort(mp);
            String sortword = new String(mp);
            if(!map.containsKey(sortword))
            {
                map.put(sortword,new ArrayList<>());
            }
            map.get(sortword).add(words);
        }

        ArrayList<List<String>> list = new ArrayList<>(map.values());

        for (List<String> group : list) {
            Collections.sort(group);
        }

        return list;
    }
}
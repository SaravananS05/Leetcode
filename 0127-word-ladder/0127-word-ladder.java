class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> s = new HashSet<>();
        int flag=1;
        for(String word:wordList){
            if(word.equals(endWord)){
                flag = 0;
            }
            s.add(word);
        }
        if(flag==1){
            return 0;
        }
        Queue<String> q = new LinkedList<>();
        q.offer(beginWord);
        int level = 0;
        int lsize;
        while(!q.isEmpty()){
            level++;
            lsize = q.size();
            while(lsize-- != 0){
                String curr = q.remove();
                for(int i=0;i<curr.length();i++){
                    StringBuilder temp = new StringBuilder(curr);
                    for(char a = 'a';a<='z';a++){
                        temp.setCharAt(i,a);
                        if(temp.toString().equals(curr)){
                            continue;
                        }
                        if(temp.toString().equals(endWord)){
                            return level+1;
                        }
                        if(s.contains(temp.toString())){
                            q.add(temp.toString());
                        }
                        s.remove(temp.toString());
                    }
                }
            }
        }
        return 0;
    }
}
class Solution {
    boolean isContain(String s, char c) {
        return s.contains(String.valueOf(c));
    }
    
    public String[] findWords(String[] words) {
        List<String> list = new ArrayList<>();
        
        String first = "qwertyuiop";
        String second = "asdfghjkl";
        String third = "zxcvbnm";
        
        for(String word : words) {
            String lowerWord = word.toLowerCase();
            char firstChar = lowerWord.charAt(0);
            boolean check = true;
            
            String compare = "";
            
            if(isContain(first, firstChar)) {
                compare = first;
            } else if(isContain(second, firstChar)) {
                compare = second;
            } else {
                compare = third;
            }
            
            for(char c : lowerWord.toCharArray()) {
                if(!isContain(compare, c)) {
                    check = false;
                    break;
                }
            }
            
            if(check) {
                list.add(word);
            }
        }
        
        return list.toArray(new String[list.size()]);
    }
}

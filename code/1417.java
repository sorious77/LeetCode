class Solution {
    String reformat(List<Character> list1, List<Character> list2) {
        StringBuilder sb = new StringBuilder();
        
        int i = 0;
        for(i = 0; i < list2.size(); i++) {
            sb.append(list1.get(i)).append(list2.get(i));
        }
        
        if(list1.size() > i) {
            sb.append(list1.get(i));
        }
        
        return sb.toString();
    }
    
    public String reformat(String s) {
        List<Character> digits = new ArrayList<>();
        List<Character> letters = new ArrayList<>();
        
        for(char c : s.toCharArray()) {
            if(Character.isDigit(c)) {
                digits.add(c);
            } else {
                letters.add(c);
            }
        }
        
        if(Math.abs(digits.size() - letters.size()) >= 2) {
            return "";
        }
        
        if(digits.size() > letters.size()) {
            return reformat(digits, letters);
        } else {
            return reformat(letters, digits);
        }
    }
}

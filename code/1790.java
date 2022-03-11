class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1.equals(s2)) {
            return true;
        }

        int count = 0;
        int firstIdx = -1;

        for(int i = 0; i < s1.length(); i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);

            if(c1 != c2) {
                if(count > 2) {
                    return false;
                }

                if(firstIdx == -1) {
                    firstIdx = i;
                } else {
                    if(c1 != s2.charAt(firstIdx) || c2 != s1.charAt(firstIdx)) {
                        return false;
                    }
                }

                count += 1;
            }
        }

        if(count == 1) {
            return false;
        }

        return true;
    }
}
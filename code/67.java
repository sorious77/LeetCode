import java.lang.StringBuilder;

class Solution {
    public String addBinary(String a, String b) {
        StringBuilder answer = new StringBuilder();

        a = new StringBuilder(a).reverse().toString();
        b = new StringBuilder(b).reverse().toString();

        int flag = 0;
        int idx = 0;

        while(true) {
            if(idx >= a.length() || idx >= b.length()) {
                break;
            }

            int sum = (a.charAt(idx) - '0') + (b.charAt(idx) - '0') + flag;

            if(sum >= 2) {
                flag = 1;

                answer.append(sum - 2);
            } else {
                flag = 0;

                answer.append(sum);
            }

            idx++;
        }

        for(int i = idx; i < a.length(); i++) {
            int sum = (a.charAt(i) - '0') + flag;

            if(sum >= 2) {
                flag = 1;

                answer.append(sum - 2);
            } else {
                flag = 0;

                answer.append(sum);
            }
        }

        for(int i = idx; i < b.length(); i++) {
            int sum = (b.charAt(i) - '0') + flag;

            if(sum >= 2) {
                flag = 1;

                answer.append(sum - 2);
            } else {
                flag = 0;

                answer.append(sum);
            }
        }
        
        if(flag == 1) {
            answer.append(flag);
        }

        return answer.reverse().toString();
    }
}

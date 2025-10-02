class Solution {
    public int myAtoi(String s) {
        s = s.trim(); //remove leading whitespace
        int sign = 1; //assume positive number unless a - is found
        int i = 0; //index to track current charcter
        long res = 0; //Using long to handle overflow cases

        if(s.length() == 0) {
            return 0;
        }

        if(s.charAt(0) == '-') {
            sign = -1; 
            i++;
        }

        else if(s.charAt(0) == '+') {
            i++;
        }

        //Process numerical characters
        while(i < s.length()) {
            char ch = s.charAt(i);
            if (ch < '0' || ch > '9') {
                break; // stop at non numeric charcter
            }

            res = res * 10 + (ch - '0'); //convert char to number
            if(sign * res > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE; // handles overflow
            }
            if(sign * res < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE; // handles overflow
            }
            i++;
        }
        return (int) (sign * res);
    }
}
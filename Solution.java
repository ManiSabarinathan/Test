class Solution {
    public static void main(String ... args) {
        Solution s = new Solution();
        int resut = s.reverse(23);
    }
    public int reverse(int x) {
        String numString=String.valueOf(x);
        int slength = numString.length();
        char cArr[] = numString.toCharArray();
        String combine="";
        for(int i = slength-1 ;i>=0;--i) {
        	combine += cArr[i];
              System.out.println(combine);   
        }
        return Integer.parseInt(combine);
    }
    
}
//https://leetcode.com/problems/number-of-1-bits/
//191. Number of 1 Bits


public class numberBits {
    public int hammingWeight(int n) {
        
        int count =0;
        while(n!=0){
            count += n & 1;
            n = n >>> 1;
        }
        return count;
    }

    public static void main(String[] args) {
        numberBits nb = new numberBits();
        int value = nb.hammingWeight(00000000000000000000000000001011);
       System.out.println(value);
       
    }
    
}

import java.util.Arrays;
//https://leetcode.com/problems/check-if-one-string-swap-can-make-strings-equal/
// 1790. Check if One String Swap Can Make Strings Equal

public class SwapString {
    public boolean areAlmostEqual(String s1, String s2) {
            int count = 0;
            int[] index = new int[2];
            int k = 0;
            for(int i=0; i<s1.length();i++){
                if(s1.charAt(i)!=s2.charAt(i)){
                    count++;
                    if(count>2){
                        return false;
                    }
                    index[k] = i; //i = 0 3
                    k++;
                }
            }
            if(count==1){
                return false;
            }
            if((s1.charAt(index[0])==s2.charAt(index[1])) && (s1.charAt(index[1])==s2.charAt(index[0])) || count == 0){
                return true;
            }else{
                return false;

            }
          }

     public static void main(String[] args) {
         SwapString swapString = new SwapString();
         boolean value = swapString.areAlmostEqual("bank", "kanb");
         System.out.println(value);
    }
}


import java.util.Arrays;

//https://leetcode.com/problems/can-make-arithmetic-progression-from-sequence/

// 1502. Can Make Arithmetic Progression From Sequence



public class arithmeticProgression {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        for(int nums = 2; nums<arr.length;nums++){
            if(arr[nums-2]-arr[nums-1]!=arr[nums-1]-arr[nums]){
                 return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        arithmeticProgression ap = new arithmeticProgression();
        int[] arr = {1,100};
        boolean value =  ap.canMakeArithmeticProgression(arr);
        System.out.println(value);
    }
}

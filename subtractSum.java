
//https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/

// 1281. Subtract the Product and Sum of Digits of an Integer

public class subtractSum {
    public int subtractProductAndSum(int n) {
        String temp = Integer.toString(n);
        int[] numbers = new int[temp.length()];

        int sub=1, sum=0, res;

        for (int i = 0; i < temp.length(); i++) {
            numbers[i] = temp.charAt(i) - '0';
            sub *= numbers[i];
            sum += numbers[i];
        }
       
        res = sub - sum;
        return res;
    }

    public static void main(String [] args){
        subtractSum sts = new subtractSum();
        int value = sts.subtractProductAndSum(234);
        System.out.println(value);
    }
}

import java.util.HashSet;

/**
 * happyNumber
 */
public class happyNumber {
    public boolean isHappy(int n) {
        HashSet<Integer> setValue = new HashSet<>();
        setValue.add(n);

        while(n!=1){
            int currentNum = n;
            int sum = 0;
            while(currentNum!=0){
                sum+=Math.pow(currentNum%10, 2);
                currentNum /= 10;
            }
            if (setValue.contains(sum)) {
                return false;
            }
            setValue.add(sum);
            n = sum;
        }
        return true;
    }

    public static void main(String[] args) {
        happyNumber hn = new happyNumber();
        boolean value = hn.isHappy(29);
        System.out.println(value);
    }
    
    
}
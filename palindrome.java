public class palindrome {
    public static void main(String arg[]) {
        int r, sum=0, temp;
        int n = 12;

        temp = n;
        while (n>0) {
            r = n%10;
            System.out.println("r value = "+r);
            sum = (sum*10)+r;
            System.out.println("sum value = "+sum);
            n=n/10;
            System.out.println("n value = "+n);

        }
        if(temp == sum){
            System.out.println("palindrome number");
        }else{
            System.out.println("false");
        }
    }
    
}

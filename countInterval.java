//1523. Count Odd Numbers in an Interval Range


public class countInterval {

    public int countOdds(int low, int high) {
        return (high+1)/2 - low/2;
    }

    public static void main(String[] args){
        countInterval CI = new countInterval();
        int value = CI.countOdds(3, 7);
        System.out.println("Output: "+value);

    }

}

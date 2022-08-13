//1491. Average Salary Excluding the Minimum and Maximum Salary


public class avgExMinMax {
    public double average(int[] salary) {
        int lgth = salary.length;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int sum = 0;

        for(int i = 0; i < lgth; i++){
            sum += salary[i];
            max = Math.max(max,salary[i]);
            min = Math.min(min,salary[i]);

        }
        return (double)(sum - max - min) / (lgth-2);

        
    }

    public static void main(String[] args){
        avgExMinMax amm = new avgExMinMax();
        int[] avg = {2000,4000,3000,1000};
        double value = amm.average(avg);
        System.out.printf(" %.5f\n",value);
    }
}

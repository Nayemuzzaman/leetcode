
class Solution {
  public int romanToInt(String s) {
    int[] numbers = new int[s.length()];
  System.out.println(s.length()+" int[] numbers ::"+numbers);

    for(int i= 0; i<s.length();i++){
      switch (s.charAt(i)) {
        case 'M': numbers[i] = 1000;
          break;
        case 'D': numbers[i] = 500;
          break;  
        case 'C': numbers[i] = 100;
          break;
        case 'L': numbers[i] = 50;
          break; 
        case 'X': numbers[i] = 10;
          break;
        case 'V': numbers[i] = 5;
          break;   
        case 'I': numbers[i] = 1;
          break;
      }
    }

    int sum = numbers[s.length()-1];
    System.out.println(s.length()+" int sum ::"+sum);
    for (int i = 0; i < numbers.length-1; i++) {
      if (numbers[i]<numbers[i+1]) {
       sum -= numbers[i];
       System.out.println("sum -= numbers[i] ::"+sum);
      }
      else
        sum += numbers[i];
        System.out.println("sum += numbers[i] ::"+sum);

    }
      
    return sum;
  }
public static void main(String args[])  //static method  
{  
  Solution s = new Solution();
  System.out.println(s.romanToInt("LVIII"));
 
}  

}
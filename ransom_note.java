import java.util.Arrays;

public class ransom_note {
    public boolean canConstruct(String ransomNote, String magazine) {

        int i = 0;
        int j = 0;
        int count = 0;

        char Ransom[] = ransomNote.toCharArray();
        Arrays.sort(Ransom);
        char Magazine[] = magazine.toCharArray();
        Arrays.sort(Magazine);

        if (Ransom.length > Magazine.length) {
            return false;
        }

        while (i < Ransom.length) {
            j = 0;
            while (j < Magazine.length) {
                if (Ransom[i]== Magazine[j]) {
                    count++;
                    Ransom[i]='_';
                    Magazine[j]='_';
                }
                j++;
            }
            i++;

        }
        if (count==Ransom.length) {
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        ransom_note rn = new ransom_note();
        //rn.canConstruct("aa", "aab");
        if ( rn.canConstruct("aa", "aba")) {
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }

}

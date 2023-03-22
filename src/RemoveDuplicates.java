import java.util.Arrays;
import java.util.stream.Collectors;


public class RemoveDuplicates {

    public static void main(String[] args) {

        String aaFF3H64HH = removeNumbersFromString("aaFF3H64HH");
        System.out.println(aaFF3H64HH);

        String[] init = {"a", "", "", "c", "d", "f"};
        String[] toRemove = {"", "f"};

        System.out.println("removeDuplicates(init, toRemove) = " + Arrays.toString(removeDuplicates(init, toRemove)));
        System.out.println("removeDuplicates(init, toRemove) = " + Arrays.toString(removeDuplicates(new String[] {"vys", "egces", "zyryzai", "objiqono", "zawofu"}, new String[]{"vys", "zawofu", "egces"}
        )));
    }

    public static String[] removeDuplicates(String[] initialArray, String[] toRemoveElements) {
        int count = 0;

        for (String element : initialArray) {
            for (String toRemove : toRemoveElements) {
                if (element.equals(toRemove)) {
                    count++;
                }
            }
        }

        String[] res = new String[initialArray.length - count];

        int nextElementToWrite = 0;

        for (int i = 0; i < initialArray.length; i++) {
            boolean failAtLeastOnce = false;
            for (int j = 0; j < toRemoveElements.length; j++) {
                if (initialArray[i].equals(toRemoveElements[j])) {
                    failAtLeastOnce = true;
                }
                if (j == toRemoveElements.length - 1 && !failAtLeastOnce){
                    res[nextElementToWrite] = initialArray[i];
                    nextElementToWrite++;
                }
            }
        }
        return res;
    }

    public static String removeNumbersFromString(String s) {
        char[] chars = s.toCharArray();
        StringBuilder sb = new StringBuilder();

        for(char ch : chars) {
            if (!Character.isDigit(ch)) {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}

import java.util.Arrays;

public class Replacer {

    public static void main(String[] args) {
        String sprt = "This is aSparta aa apartais apartais";

        String[] toRemove = {"is"};

        System.out.println(sprt);
        System.out.println(removeStreamApi(sprt, toRemove));
    }

    public static String remove(String phrase, String[] toRemove) {
        String[] parts = phrase.split(" ");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < toRemove.length; i++) {
            for (int j = 0; j < parts.length; j++) {
                if (parts[j].contains(toRemove[i]) && toRemove[i].length() == parts[j].length()) {
                    String replaced = parts[j].replaceAll(toRemove[i], "");
                    sb.append(replaced).append(" ");
                } else {
                    sb.append(parts[j]).append(" ");
                }
            }
        }
        return sb.toString();
    }

    public static String removeStreamApi(String phrase, String[] toRemove) {
        StringBuilder sb = new StringBuilder();

        for(String s : toRemove){

        }

        Arrays.asList(phrase.split(" "))
                .stream()
                .distinct()
                .filter(s -> s.startsWith("a"))
                .forEach(part -> {
                    Arrays.stream(toRemove)
                            .forEach(toRemoveEl -> {
                                if (part.contains(toRemoveEl) && toRemoveEl.length() == part.length()) {
                                    String replaced = part.replaceAll(toRemoveEl, "");
                                    sb.append(replaced).append(" ");
                                } else {
                                    sb.append(part).append(" ");
                                }
                            });
                });
        return sb.toString();
    }
}

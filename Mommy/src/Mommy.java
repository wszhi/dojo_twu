import java.util.Arrays;
import java.util.List;

public class Mommy {

    List<Character> vowels = Arrays.asList('o', 'e', 'i', 'u', 'a');

    public String mommify(String input) {
        if (input.equals("")) {
            return "";
        }
        if (calculatePercent(input)) {
            input = replaceVowelsWithMommy(input);
        }
        return keepOneMommy(input);
    }

    private String replaceVowelsWithMommy(String input) {
        for (int position = 0; position < vowels.size(); position++) {
            if (input.contains(String.valueOf(vowels.get(position)))) {
                input = input.replace(String.valueOf(vowels.get(position)), "mommy");
            }
        }
        return input;
    }

    public String keepOneMommy(String input) {
        while (input.contains("mommymommy")) {
            input = input.replace("mommymommy", "mommy");
        }
        return input;
    }

    private boolean calculatePercent(String input) {
        int count = 0;
        int position = 0;
        while (position < input.length()) {
            if (vowels.contains(input.charAt(position))) {
                count++;
            }
            position++;
        }
        return ((double) count / input.length()) > 0.3;
    }

}

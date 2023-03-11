import java.util.List;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Define the original code phrase
        String codePhrase = "{firstValue} - {secondValue} - {thirdValue}!";

        // Define an array of values
        String[] values = {"Symfony", "Java", "Our", "PHP", "Values", "C#", "JavaScript", "Are"};

        // Convert the array into a list
        List<String> valueList = Arrays.asList(values);

        // Check if the list contains the value "Our"
        if (valueList.contains("Our")) {
            // If it does, replace the placeholder in the code phrase
            codePhrase = codePhrase.replace("{secondValue}", "HUMAN");
        }

        // Check if the list contains the value "Values"
        if (valueList.contains("Values")) {
            // If it does, replace the placeholder in the code phrase
            codePhrase = codePhrase.replace("{firstValue}", "UNITED");
        }

        // Check if the list contains the value "Are"
        if (valueList.contains("Are")) {
            // If it does, replace the placeholder in the code phrase
            codePhrase = codePhrase.replace("{thirdValue}", "GROWTH");
        }

        // Print the final code phrase
        System.out.println(codePhrase);
    }
}

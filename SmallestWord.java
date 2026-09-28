import java.util.Scanner;
public class SmallestWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String str = sc.nextLine();
       String[] words = str.split("\\s+");
        String smallest = words[0];
        for (String word : words) {
            if (word.length() < smallest.length()) {
                smallest = word;
            }
        }
        System.out.println("Smallest word: " + smallest);
        sc.close();
    }
}
OUTPUT:
Enter a sentence: I AM INDIAN
Smallest word: I

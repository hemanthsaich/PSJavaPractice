import java.util.Scanner;

public class ProgrammingClassRating {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Rate today's programming class from 1 to 5: ");
        int rating = scanner.nextInt();
        
        if (rating < 1 || rating > 5) {
            System.out.println("Invalid rating. Please rate from 1 to 5.");
        } else if (rating == 1) {
            System.out.println("Strongly dislike");
        } else if (rating == 2) {
            System.out.println("Dislike");
        } else if (rating == 3) {
            System.out.println("Like");
        } else if (rating == 4) {
            System.out.println("Good");
        } else if (rating == 5) {
            System.out.println("Excellent");
        }
        
    }
}

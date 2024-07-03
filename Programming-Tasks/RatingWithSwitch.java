import java.util.Scanner;

public class RatingWithSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Rate today's programming class from 1 to 5: ");
        int rating = scanner.nextInt();
        
        switch (rating) {
            case 1:
                System.out.println("Strongly dislike");
                break;
            case 2:
                System.out.println("Dislike");
                break;
            case 3:
                System.out.println("Like");
                break;
            case 4:
                System.out.println("Good");
                break;
            case 5:
                System.out.println("Excellent");
                break;
            default:
                System.out.println("Invalid rating. Please rate from 1 to 5.");
                break;
        }

    }
}

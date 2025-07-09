import java.util.Random;
import java.util.Scanner;

public class FakeJobTitleGenerator {
    public static void main(String[] args) {
        String[] adjectives = {"Quantum", "Digital", "Turbo", "Epic", "Ultra", "Mega", "Cyber", "Pixel"};
        String[] jobTitles = {"Engineer", "Ninja", "Strategist", "Technologist", "Evangelist", "Officer", "Wizard", "Architect"};

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String response;

        do {
            int adjIndex = random.nextInt(adjectives.length);
            int titleIndex = random.nextInt(jobTitles.length);

            String generatedTitle = adjectives[adjIndex] + " " + jobTitles[titleIndex];
            System.out.println("🧠 Your new job title is: " + generatedTitle);

            System.out.print("Generate another one? (yes/no): ");
            response = scanner.nextLine().trim().toLowerCase();
        } while (response.equals("yes"));

        System.out.println("Thanks for playing the corporate name game!");
    }
}
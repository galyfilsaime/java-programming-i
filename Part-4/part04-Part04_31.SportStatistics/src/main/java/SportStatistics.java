
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> homeTeam = new ArrayList<>();
        ArrayList<String> visitingTeam = new ArrayList<>();
        System.out.println("File:");
        String fileName = scan.nextLine();

        System.out.println("Team:");
        String teamName = scan.nextLine();
        int count = 0;
        int wins = 0;
        int losses = 0;

        try (Scanner file = new Scanner(Paths.get(fileName))) {
            while (file.hasNextLine()) {
                String[] parts = file.nextLine().split(",");
                String home = parts[0];
                String visiting = parts[1];
                int homePoints = Integer.valueOf(parts[2]);
                int visitingPoints = Integer.valueOf(parts[3]);

                if (home.contains(teamName)) {
                    count++;
                    if (homePoints > visitingPoints) {
                        wins++;
                    } else {
                        losses++;
                    }
                } else if (visiting.contains(teamName)) {
                    count++;
                    if (homePoints < visitingPoints) {
                        wins++;
                    } else {
                        losses++;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Games: " + count);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
    }

}


import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<SportStatistics> results = new ArrayList<>();
        
        System.out.println("File: ");
        String file = scan.nextLine();
        System.out.println("Team: ");
        String team = scan.nextLine();
        
        
        int games = 0;
        int wins = 0;
        int losses = 0;
        
        try(Scanner s = new Scanner(Paths.get(file))){
            while(s.hasNextLine()){
                String line = s.nextLine();
                
                String[] split = line.split(",");
                if (split.equals("")) {
                    continue;
                }
               
                String homeTeam = split[0];
                String awayTeam = split[1];
                int homePoints = Integer.valueOf(split[2]);
                int awayPoints = Integer.valueOf(split[3]);
                
                if (team.equals(homeTeam)){
                    games++;
                    if (homePoints > awayPoints){
                        wins++;
                    } else {
                        losses++;
                    }
                }
                if (team.equals(awayTeam)){
                    games++;
                    if (awayPoints > homePoints){
                        wins++;
                    } else {
                        losses++;
                    }
                }
                
                
            }
            System.out.println("Games: " + games);
            System.out.println("Wins: " + wins);
            System.out.println("Losses: " + losses);
            
            
        }catch (Exception e){
            System.out.println("Not possible to read the file");
        }
       
        

    }

}

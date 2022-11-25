
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file: ");
        String file = scanner.nextLine();
        
        
        try(Scanner s = new Scanner(Paths.get(file))){
            while(s.hasNextLine()){
                String row = s.nextLine();
                String[] split = row.split(",");
                
                if (split.equals("")){
                    continue;
                }
                String name = split[0];
                int age = Integer.valueOf(split[1]);
                
                if (age > 1 || age == 0){
                    System.out.println(name + ", age: " + age + " years");
                } else {
                    System.out.println(name + ", age: " + age + " year");
                }
            }
              
          
        } 
                       
        catch (Exception e){
            System.out.println("File was not able to be read" + e.getMessage());
        }
        

    }
}

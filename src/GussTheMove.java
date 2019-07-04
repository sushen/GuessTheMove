import java.io.File;
import java.util.Scanner;

public class GussTheMove {

    //Read the movie list and display the whole list
    public static void main(String [] args)throws Exception {
        File file = new File("movies.txt");
        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()){
            String line = scanner.nextLine();
            System.out.println(line);

        }
    }
    //Randomly pick one movie and display that title only


}

import java.util.Scanner;

public class Assignment8_4 {


    public static void main(String[] args) throws Exception {

    	// Create a File instance
        java.io.File file = new java.io.File("C:\\Users\\Mayank\\Desktop\\file.txt");

        // Create a Scanner for the file
        Scanner input = new Scanner(file);

        // Create the Content String       
        String fileContent = "";

        // Read data from a file
        while (input.hasNext()) {
            fileContent += input.next() + " ";
        }

        // Close the file
        input.close();

        //Split the string into a character array
        char[] charArr = fileContent.toCharArray();

        //loop through every character to find the vowels
        int counter = 0;

        for(char c : charArr)

        {
              if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                   counter++;
        }

        //Print the number of vowels
        System.out.println("Number of Vowels: " + counter);
    }
}

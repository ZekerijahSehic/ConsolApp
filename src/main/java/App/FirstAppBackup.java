package App;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class FirstAppBackup {
    @SuppressWarnings("empty-statement") // -> Working And Without This
    public static void main(String[] args) throws IOException {
        
        System.out.println("Please write 'yes' or 'y' if yoy want to write text into file");
        String userAnswer = new Scanner(System.in).nextLine().toLowerCase();;
        String answerYes = "yes";
        String answerY = "y";
        
        // Test User Answer If True Enter Text To File 
        
        if (userAnswer.equals(answerYes) || userAnswer.equals(answerY)) {
            System.out.println("Please write text");
            writeText();
        } else {
            System.out.println("Bye");
        }
                
        /* Creat File in Root Folder
        
        System.out.println("Wellcome !");       
        System.out.println("Enter file name?");
        String userInput = new Scanner(System.in).nextLine();
        System.out.println("Thank you");

        File fileName = new File(userInput + ".txt"); 
        
        */
        
        /* Creat TXT File in Specific Folder
        - missing userInput
        
        File fileName = new File("/Users/Zekerijah/Documents/" + userInput + ".txt");
        fileName.getParentFile().mkdirs();
        FileWriter creator = new FileWriter(fileName);
        FileWriter inputText = new FileWriter("/Users/Zekerijah/Documents/seha.txt", true);    
        inputText.write(inputText);
        inputText.close();  
        
        */
        
        /* Write Text To File

        System.out.println("Please enter text!");
        String inputUserText = new Scanner(System.in).nextLine();
        FileWriter textForWrite = new FileWriter("/Users/Zekerijah/Documents/seha.txt", true);
        textForWrite.write(inputUserText);
        textForWrite.close();

        */
    }
    
    // Method writeText() - Write Text To File
    private static void writeText() throws IOException {
        String inputUserText = new Scanner(System.in).nextLine();
        FileWriter textForWrite = new FileWriter("/Users/Zekerijah/Documents/seha.txt", true);
        textForWrite.write(inputUserText);
        textForWrite.close();
    }
}

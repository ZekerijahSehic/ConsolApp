package App;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class FirstApp {
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
    }
    
    // Method writeText() - Write Text To File
    private static void writeText() throws IOException {
        String inputUserText = new Scanner(System.in).nextLine();
        FileWriter textForWrite = new FileWriter("/Users/Zekerijah/Documents/seha.txt", true);
        textForWrite.write(inputUserText);
        textForWrite.close();
    }
}

package App;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class FirstApp {
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) throws IOException {
        
        System.out.println("Please write 'yes' or 'y' if yoy want to write text into file");
        String userAnswer = new Scanner(System.in).nextLine().toLowerCase();;
        String answerYes = "yes";
        String answerY = "y";
        
        // Napraviti da odgovor mora biti Yes 
        
        if (userAnswer.equals(answerYes) || userAnswer.equals(answerY)) {
            System.out.println("Please write text");
            typeText();
        } else {
            System.out.println("Bye");
        }
        
        
                

        
        //System.out.println("Wellcome !");       
        //System.out.println("Enter folder name?");
        //String userInput = new Scanner(System.in).nextLine();
        //System.out.println("Thank you");

        /* File fileName = new File(userInput + ".txt");
        
         if (fileName.createNewFile()) {
            System.out.println("File created: " + fileName.getName());
        } */
        
        //File fileName = new File("/Users/Zekerijah/Documents/" + userInput + ".txt");
        //fileName.getParentFile().mkdirs();
        //FileWriter creator = new FileWriter(fileName);
        //FileWriter inputText = new FileWriter("/Users/Zekerijah/Documents/seha.txt", true);    
        //inputText.write(inputText);
        //inputText.close();  
        
        //System.out.println("Please enter text!");
        //String inputUserText = new Scanner(System.in).nextLine();
        //FileWriter textForWrite = new FileWriter("/Users/Zekerijah/Documents/seha.txt", true);
        //textForWrite.write(inputUserText);
        //textForWrite.close();
        
        

    }

    private static void typeText() throws IOException {
        String inputUserText = new Scanner(System.in).nextLine();
        FileWriter textForWrite = new FileWriter("/Users/Zekerijah/Documents/seha.txt", true);
        textForWrite.write(inputUserText);
        textForWrite.close();
    }
}

package FileHandling;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Name your file must include (.txt) extension: ");
        String fileName = sc.nextLine();

        try  (FileWriter file = new FileWriter(fileName)){
            System.out.println("Write anything: ");
            String anything = sc.nextLine();

            file.write(anything);
            file.close();
            System.out.println("Output: ");

        } catch (IOException e){
            System.out.println("There was an error in creating the file.");
        }

        
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))){
            String line;
            while ((line = reader.readLine()) != null){
                System.out.println(line);
            }
        } catch (IOException e){
            System.out.println("There is a problem in outputting the file.");
        }

        sc.close();
    }
}

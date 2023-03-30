import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.SecureRandom;
import java.sql.*;

public class Main {
    public static void main(String[] args) {

        generateDetails test = new generateDetails();
//        System.out.println(test.getRandomName() + " is the random name");

        //based off ethnicity
//        System.out.println(test.getRandomNameBasedOfEthnicity("BLACK NON HISPANIC"));

//        //based off gender
//        System.out.println(test.getRandomNameBasedOfGender("MALE"));

        //based off gender and ethnicity
        System.out.println(test.getRandomNameBasedOf("ethnicity", "BLACK NON HISPANIC"));


    }
}
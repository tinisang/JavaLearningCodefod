
package myMainPackage;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Objects;

import static CustomPackage.CustomMath.*;

public class MyFirstClass {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String args[]) {
        takeInputs();
    }

    static void takeInputs(){
        System.out.println("Enter the list of names (type 'exit' to complete):");
        try {
            String nameItem;
            ArrayList<String> nameArr = new ArrayList<>();
            while (!(nameItem = br.readLine()).equalsIgnoreCase("exit")){
                nameArr.add(nameItem);
                System.out.println("You just type: "+ nameItem );
            };
            for (String name:nameArr){
                System.out.println("So your name is: " + name);

            };
            System.out.println("Do you want to start over? y/n");
            String nextCommand = br.readLine();
            if (Objects.equals(nextCommand, "y")){
                takeInputs();
            }else{
                System.out.println("Program ended");
                br.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        };


    };
}
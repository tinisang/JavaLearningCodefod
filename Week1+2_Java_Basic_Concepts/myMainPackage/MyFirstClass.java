
package myMainPackage;
import CustomPackage.CustomScanner;

import java.io.*;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Objects;


public class MyFirstClass {

    CustomScanner scanner = new CustomScanner();
    static String filePath = "JavaLearningCodefod/output.txt";
    public static void main(String args[]) throws IOException {
//       takeInputs();
        CustomScanner.mainScanner();
        writeFile(filePath);
        readFile(filePath);
    }
    static void takeInputs(){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
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
    static void readFile(String path) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(path));

        String line;
        while((line = br.readLine())!=null){
            System.out.println(line);
        };
        br.close();
    };
    static void writeFile(String path) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(path));
        bw.write("Hello! I am Sang");
        bw.newLine();
        bw.newLine();
        bw.write("Hello Codefod. I love you");
        bw.close();
    }
}
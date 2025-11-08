package exceptionHandling;
/*
    In this class I used File package for
    read file
    create file in give path
    To write in file
    I handled exceptions using try-catch block and try with resources
    Try with resources is special type of try it will take of resource(file or streams) closing even if error occur.
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class IntegerFormatFile {
    private String filePath;
    public IntegerFormatFile(String filePath){
        this.filePath=filePath;
        filecreation();
    }
    private File filecreation(){
        File intFormatt=new File(filePath);
        try {
            if(intFormatt.createNewFile()){
                System.out.println("File Created "+intFormatt.getName());
            }else System.out.println("File already exists");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return intFormatt;
    }
    public void write()  {
        try (FileWriter write = new FileWriter(filePath,true)){
            write.write("append");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void readFile(){
        try(Scanner read=new Scanner(filecreation())){
            while(read.hasNext()){
                String data=read.nextLine();
                System.out.println("data is...."+data);
                try {
                    int number = Integer.parseInt(data);
                    System.out.println("Number is: " + number);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid number format: " + data);
                }
            }
        }catch(FileNotFoundException e){
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}

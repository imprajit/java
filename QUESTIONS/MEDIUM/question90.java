import java.io.*;
import java.io.IOException;
class Main {

    public static void main(String[] args) throws IOException {
        try{
        FileReader input = new FileReader("input.txt");
        FileWriter output = new FileWriter("copy.txt");
        int data;
        while ((data = input.read()) != -1) {
            output.write(data);
        }
        input.close();
        output.close();
        System.out.println("File copied successfully!");
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));

        int count = 0;

        while (br.readLine() != null) {
            count++;
        }

        br.close();

        System.out.println("Number of lines = " + count);
        }
        catch(Exception e)
        {
            System.out.print("Error occured");
        }
    }
}
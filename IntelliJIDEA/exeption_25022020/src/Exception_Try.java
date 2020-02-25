import javafx.scene.transform.Scale;

import java.io.*;
import java.util.Scanner;

public class Exception_Try {
    public Exception_Try() {
    }

    public static void main(String[] args) {
        run();
    }
    static void run()
    {
        try(BufferedReader reader=new BufferedReader(new FileReader("arr.txt"))){
            String line;
            int sum=0;
            while ((line=reader.readLine())!=null)
            {
                String[] s= line.split(" ");
                int[] a = new int[s.length];
                for (int i=0;i<a.length;i++){
                    a[i]=Integer.parseInt(s[i]);
                }
                for(int x=0:a)
                {
                    sum+=x;
                }
            }
        }
        catch (FileNotFoundException e){//first exception
            e.printStackTrace();
        }catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    private void run1()
    {
        try(PrintWriter writer = new PrintWriter(
                new File("hello.txt"));
                Scanner scanner = new Scanner(System.in);
            ){
            String username=scanner.nextLine();

        }
    }
}

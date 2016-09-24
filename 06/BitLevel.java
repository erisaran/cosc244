import java.io.*;
import java.util.*;

public class BitLevel {

    public static void main(String[] args){
        String infile = "";
        String outfile = "";
        String key;
        
        if (args.length > 0){
            infile = args[0];
            outfile = args[1];
        }
        System.out.print("Enter key: ");
        Scanner sc = new Scanner(System.in);
        key = sc.nextLine();
        //byte [] x = key.getBytes();
        try {
            FileInputStream fin = new FileInputStream(infile);
            FileOutputStream out = new FileOutputStream(outfile);
            try {
                int b = fin.read();
                int i = 0;
                while (b != -1){
                    byte q = (byte)b;
                    out.write(q ^ key.codePointAt(i));
                    i++;
                    b = fin.read();
                    if (i == key.length()){
                        i = 0;
                    }
                    
                }
                out.close();
            }catch (IOException e){
                System.err.println("no io");
            }
                
        }catch (FileNotFoundException e){
            System.err.println("File not found");
        }
    }
}

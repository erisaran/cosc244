import java.io.InputStream;
import java.io.PrintStream;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class lab3q3{

    public static void main(String[] args){

        InputStream in = System.in;
        PrintStream out = System.out;
        Scanner sc = new Scanner(in);
        char ch = ' ';
        try {
            while (sc.hasNext()){
                StringBuilder s = new StringBuilder(sc.nextLine());
                for (int i = 0; i< s.length(); i++){
                    if (s.charAt(i) >= 97 && s.charAt(i) <= 122){
                        s.setCharAt(i, s.charAt(i) - ch);
                    }
                }
                out.println(s);
            }
            
        }catch (IOException e){
            System.out.println("IOException"); return;
        }
        
    }
}

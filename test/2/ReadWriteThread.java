import java.io.*;

public class ReadWriteThread extends Thread {

    private BufferedReader input;
    private PrintWriter output;
    private String s;

    public ReadWriteThread(InputStream in,OutputStream out, String s){
        this.input = new BufferedReader(new InputStreamReader(in));
        this.output = new PrintWriter(out,true);
        this.s = s;
    }

    public void run(){
        try {
            String line;
            while ((line = input.readLine()) != null){
                output.println(s + line);
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}

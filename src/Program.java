import java.io.IOException;

public class Program {
    public static void main (String [] args){
        Runtime run = Runtime.getRuntime();
        try {
            run.exec("shutdown /r /t 10");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

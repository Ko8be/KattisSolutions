import java.io.*;
import java.util.*;

public class Soylent {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++){
            pw.println( (int) Math.ceil(Integer.parseInt(br.readLine())/400.0));
        }

        br.close();
        pw.close();
    }

}

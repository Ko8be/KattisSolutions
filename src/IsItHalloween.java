import java.io.*;
import java.util.*;

public class IsItHalloween {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        if (s.equals("OCT 31") || (s.equals("DEC 25"))) System.out.println("yup");
        else System.out.println("nope");


    }

}

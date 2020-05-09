package DataStructures;

import java.io.*;

public class CreateHashCode {
    public static int createHashCode(String key) {
        int hashVal = 0;
        for (int i = 0; i < key.length(); i++) {
            hashVal = (127 * hashVal + key.charAt(i)) % 16908799;
        }
        return hashVal;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the string: ");
        System.out.println(createHashCode(br.readLine()));
    }
}

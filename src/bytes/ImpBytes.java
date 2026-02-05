package bytes;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImpBytes {
    public static void main(String[] args) throws IOException {

        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in = new FileInputStream("xanadu.txt");
            out = new FileOutputStream("outagain.txt");
            int c;
            int contador = 0;

            while ((c = in.read()) != -1) {
                out.write(c);
                
                if ((char)c == 'a') {
                	contador ++;
                }
            }
            System.out.print(contador);
            
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
}
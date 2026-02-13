package binarios;

import java.io.*;

public class DataStreams {

    static final String dataFile = "invoicedata";
    static final double[] prices = { 19.99, 9.99, 15.99, 3.99, 4.99 };
    static final int[] units = { 12, 8, 13, 29, 50 };
    static final String[] descs = {
        "Java T-shirt",
        "Java Mug",
        "Duke Juggling Dolls",
        "Java Pin",
        "Java Key Chain"
    };

    public static void main(String[] args) throws IOException {

        DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(dataFile)));

        for (int i = 0; i < prices.length; i ++) {
            out.writeDouble(prices[i]);
            out.writeInt(units[i]);
            out.writeUTF(descs[i]);
        }
        out.close(); 

        DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream(dataFile)));

        double price;
        int unit;
        String desc;
        double total = 0.0;

        try {
            while (in.available()>0) {
                price = in.readDouble();
                unit = in.readInt();
                desc = in.readUTF();
                System.out.format("Has pedido %d unidades de %s a %.2f€%n",unit, desc, price);
                total += unit * price;
            }
        } catch (EOFException e) {
           
        }
        
        System.out.format("Total acumulado: %.2f€%n", total);
        in.close(); 
    }
}
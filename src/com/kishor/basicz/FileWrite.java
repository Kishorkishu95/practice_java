package com.kishor.basicz;

import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {
    public static void main(String[] args) {
        String str="public static void main(String[] args) throws IOException";
        try {
            FileWriter writer=new FileWriter("data.txt");
            for (int i = 0; i < str.length(); i++) {
                    writer.write(str.charAt(i));
            }
            System.out.println("Successful.");
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally {
            System.out.println("Done.");
        }
    }
}

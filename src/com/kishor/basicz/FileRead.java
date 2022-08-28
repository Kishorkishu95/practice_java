package com.kishor.basicz;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {
    public static void main(String[] args) throws IOException {
        int ch;
        FileReader fileReader = null;
        try {
            fileReader = new FileReader("data.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");

        }
        while ((ch = (char) fileReader.read()) != -1) {
            System.out.print(ch + "");

        }
        fileReader.close();



    }
}

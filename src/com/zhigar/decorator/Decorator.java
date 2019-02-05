package com.zhigar.decorator;

import com.zhigar.gameException.GameException;
import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

import java.io.*;

public class Decorator extends BufferedReader {

    public Decorator(Reader in) {
        super(in);
    }

    @Override
    public String readLine() throws IOException {
        String line = super.readLine();
        return line != null ? line.replaceAll("\\s+", " ") : null;
    }





    public static void writeFromFileToFile(String fileName, String fileName2) throws GameException, IOException {

        BufferedWriter fileToWrite = new BufferedWriter(new FileWriter(fileName2));
        try (Decorator dr = new Decorator(new FileReader(fileName))) {
            String s;
            while ((s = dr.readLine()) != null) {

                fileToWrite.write(s);
            }
            fileToWrite.close();
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }
}

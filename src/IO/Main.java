package IO;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        MyIO myIO = new MyIO();
        myIO.copy("/home/briz/slug.pl", "/home/briz/slug_.pl");
    }
}

class MyIO {

    public void copy (String inFileName, String outFileName) {
        InputStream in;
        OutputStream out;
        File inFile = new File(inFileName);
        File outFile = new File(outFileName);
        try {
            in = new FileInputStream(inFile);
            out = new FileOutputStream(outFile);
        } catch (FileNotFoundException e) {
            return;
        }
        int count;
        byte[] buffer = new byte[256];
        try {
            while((count = in.read(buffer)) > 0) {
                int random = (int) (Math.random() * 100);
                if (random == 1) {
                    throw new IOException();
                }
                out.write(buffer, 0, count);
            }
        } catch (IOException e) {
            outFile.delete();
        } finally {
            try {
                out.close();
            } catch (IOException e) {
                //NOP
            }
            try {
                in.close();
            } catch (IOException e) {
                try {
                    out.flush();
                } catch (IOException e1) {
                    //NOP
                }
            }
            try {
                out.flush();
            } catch (IOException e) {
                //NOP
            }
        }
    }
}

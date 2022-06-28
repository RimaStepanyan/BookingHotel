package classwork.lesson22.fileExample.ioExample;

import java.io.*;

public class FileReadAndWrite {

    private static final String FILE_PATH ="D:\\Lessons\\Java2022\\src\\classwork\\lesson22\\fileExample\\ioExample\\file\\textExample.txt";

    public static void main(String[] args) throws IOException {
        write();
        read();



    }

    private static void write() throws IOException {
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_PATH))){
            bw.write("H e llo From Java\r\n");
            bw.write("Hello From JAVA line 2!!!!!!");
        }
    }

    private static void read() throws IOException {
        try(BufferedReader inputStream = new BufferedReader(new FileReader(FILE_PATH))){
            String line = "";
            while((line = inputStream.readLine()) != null){
                System.out.println(line);
            }
        }


    }
}

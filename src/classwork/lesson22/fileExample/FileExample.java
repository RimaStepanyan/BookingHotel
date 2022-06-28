package classwork.lesson22.fileExample;

import java.io.File;
import java.io.IOException;

public class FileExample {

    static String filePath = "D:\\Lessons\\Java2022\\src\\classwork\\lesson22\\fileExample\\testFolder\\hello.txt";
    static String newFilePath = "D:\\Lessons\\Java2022\\src\\classwork\\lesson22\\fileExample\\testFolder\\hello3.txt";

    public static void main(String[] args) throws IOException {
        File myFile = new File(filePath);

        boolean b = myFile.renameTo(new File(newFilePath));
        System.out.println(b);


//         System.out.println(myFile.exists());
//        if(!myFile.exists()){
//            myFile.createNewFile();
//            System.out.println(myFile.exists());
//        }
//        System.out.println("isFile: " + myFile.isFile());
//        System.out.println("isDirectory: " + myFile.isDirectory());
//
//        if(myFile.isDirectory()){
//            File[] files = myFile.listFiles();
//            for (File file : files) {
//                if(file.isDirectory())
//                System.out.println(file.getName());
//            }
//        }


    }
}

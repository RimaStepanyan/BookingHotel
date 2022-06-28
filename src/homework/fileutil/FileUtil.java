package homework.fileutil;

import java.io.*;
import java.util.Scanner;

public class FileUtil {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //  fileSearch();
         contentSearch();
        // findLines();
        //   printSizeOfPackage();
      //  createFileWithContent();
    }

    // այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1-path թե որ ֆոլդերում ենք փնտրելու
    // 2-fileName-ֆայլի անունը, որը փնտրում ենք
    // Որպես արդյունք ծրագիրը պետք է տպի true եթե կա այդ պապկի մեջ, false եթե չկա

    static void fileSearch() {
        System.out.println("Please input path");
        String path = scanner.nextLine();
        System.out.println("please input file name for search");
        String fileName = scanner.nextLine();
        File file = new File(path);
        System.out.println(file.exists());

    }

    // այս մեթոդը պետք է սքաններով վերցնի երկու string
    // 1-path թե որ ֆոլդերում ենք փնտրելու
    // 2- keyword - ինչ որ բառ
    // Մեթոդը պետք է նծված path-ում գտնի բոլոչ ․txt ֆայլերը և իրենց մեջ փնտրի
    // մեր տված keyword-ը, եթե գտնի, պետք է տպի տվյալ ֆայլի անունը

    static void contentSearch() {
        System.out.println("Please input path");
        String path = scanner.nextLine();
        System.out.println("please input keyword for search");
        String keyword = scanner.nextLine();
        findFile(path, keyword);
    }

    private static void findFile(String path, String keyword) {
        File directory = new File(path);
        if (directory.exists() && directory.isDirectory()) {
            File[] files = directory.listFiles();
            if (files != null)
                for (File file : files) {
                    if (file.isDirectory()) {
                        findFile(file.getAbsolutePath(), keyword);
                    } else {
                        if (file.getName().endsWith(".txt")) {
                            try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                                String line = "";
                                while ((line = br.readLine()) != null) {
                                    if (line.contains(keyword)) {
                                        System.out.println(file.getAbsolutePath());
                                        break;
                                    }
                                }
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                    }

                }
        } else {
            System.out.println("Please input correct directory path");
        }
    }


    // այս մեթոդը պետք է սքաններով վերցնի երկու string
    // 1 - txtPath txt ֆայլի փաթը
    //2-keyword-ինչ որ բառ
    // տալու ենք txt ֆայլի տեղը, ու ինչ որ բառ, ինքը տպելու է էն տողերը, որտեղ գտնի էդ բառերը

    static void findLines() {
        System.out.println("Please input filePath");
        String filePath = scanner.nextLine();
        System.out.println("please input keyword for search");
        String keyword = scanner.nextLine();

        File file = new File(filePath);
        if (file.exists() && file.isFile()
                && file.getName().endsWith(".txt")) {
            try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                String line;
                int lineCount = 1;
                while ((line = br.readLine()) != null) {
                    if (line.contains(keyword)) {
                        System.out.println(lineCount + "-> " + line);
                    }
                    lineCount++;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }

    // այս մեթոդը պետք է սքաններով վերցնի մեկ string
    //1-path թե որ ֆոլդերի չափն ենք ուզում հածվել
    // ֆոլդերի բոլոր ֆայլերի չափսերը գումարում ենք իրար ու տպեւմ

    static void printSizeOfPackage() {
        System.out.println("Please input directory path");
        String directoryPath = scanner.nextLine();

        File file = new File(directoryPath);

        if (file.exists() && file.isDirectory()) {
            File[] files = file.listFiles();
            long size = 0;
            for (File file1 : files) {
                if (file1.isFile()) {
                    size += file1.length();
                }
            }
            System.out.println("Size of package: " + size / 1024);
        }
    }


    // այս մեթոդը պետք է սքաններով վերցնի երեք string
    // 1 - path պապկի տեղը, թե որտեղ է սարքելու նոր ֆայլը
    // 2 - fileName ֆֆայլի անունը, թե ինչ անունով ֆայլ է սարքելու
    // 3 - content ֆայլի պարունակությունը։ Այսինքն ստեղծված ֆայլի մեջ ինչ է գրելու
    // որպես արդյունք պապկի մեջ սարքելու է ներ ֆայլ, իրա մեջ էլ լինելու է content - ով տվածը

    static void createFileWithContent() {
        System.out.println("Please input directory path");
        String directoryPath = scanner.nextLine();
        System.out.println("Please input file name");
        String fileName = scanner.nextLine();
        System.out.println("Please input file content");
        String fileContent = scanner.nextLine();

        File directory = new File(directoryPath);
        if (directory.exists()) {
            fileName = fileName.endsWith(".txt") ? fileName : fileName + ".txt";
            File newFile = new File(directory, fileName);
            if (!newFile.exists()) {
                try {
                    newFile.createNewFile();
                    try (BufferedWriter bw = new BufferedWriter(new FileWriter(newFile))) {
                        bw.write(fileContent);
                        System.out.println("File is ready");
                    }
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            } else {
                System.out.println("Please input fileName that is not exisist");
            }
        } else {
            System.out.println("Please input correct directory");
        }
    }
}



package com.codedifferentlty.regex.practice.part02.readingFiles;

import java.io.IOException;

public class ReadingInDataDriver {

    public static void main(String[] args)  {
        try {
            String pathToFile = "./files/Sample1.txt";
            String str = ReadingInDataMethod01.readDataIn(pathToFile);
            System.out.println(str);
        }catch (IOException ex){
            System.out.println("Error: no file "+ex.getMessage());
        }
    }

}

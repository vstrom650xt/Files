package org.example;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        try (FileInputStream fis = new FileInputStream("/home/jcerveram/IdeaProjects/Files/src/main/java/org/example/hola.txt"); FileOutputStream fos = new FileOutputStream("tusalida.txt")) {

            int c;
            c = fis.read();

            while (c != -1) {
                fos.write(c);
                c = fis.read();


            }

        }





    }
}
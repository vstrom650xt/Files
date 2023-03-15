package org.example.ejercicio2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import static java.lang.System.out;

public class MaxMin {
    static  final String fileName = "/home/jcerveram/IdeaProjects/Files/src/main/java/org/example/Documentos/numeros.txt";
    public static void main(String[] args) {
        int max =0 , min=0;
        boolean isFirst = true;

        try ( BufferedReader bf = new BufferedReader(new FileReader(fileName))) {
            String linea;
            while ((linea = bf.readLine()) != null) {
                System.out.println(linea);
                if (isFirst){
                    min = max =Integer.parseInt(linea);
                    isFirst = false;
                }else{
                    if (Integer.parseInt(linea)>max){
                        max = Integer.parseInt(linea);
                    }
                    if (Integer.parseInt(linea)<min){
                        min = Integer.parseInt(linea);
                    }

                }


            }

            out.println("///////////////////////");

            out.println(max);
            out.println(min);



        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }




    }


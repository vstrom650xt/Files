package org.example.ejer4;

import java.io.*;
import java.util.*;

public class Nombre {
    public static void main(String[] args) throws RuntimeException {
        List<String> listaNombre = new ArrayList<>();
        List<String> listaApe = new ArrayList<>();

        String fileNames = "/home/jcerveram/IdeaProjects/Files/src/main/java/org/example/Documentos/usa_apellidos.txt";
        String fileLastName = "/home/jcerveram/IdeaProjects/Files/src/main/java/org/example/Documentos/usa_nombres.txt";



        try (BufferedReader bf = new BufferedReader(new FileReader(fileNames))){
            String linea ="";
            while ((linea = bf.readLine()) != null){
                listaNombre.add(linea);


            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try (BufferedReader bf = new BufferedReader(new FileReader(fileLastName))){
            String linea ="";
            while ((linea = bf.readLine()) != null){
                listaApe.add(linea);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(listaNombre);
        System.out.println("hasta aqui");
        Collections.shuffle(listaNombre);
        Collections.shuffle(listaApe);
        System.out.println(listaNombre);






    }
}

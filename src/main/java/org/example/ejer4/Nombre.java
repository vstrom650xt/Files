package org.example.ejer4;

import javax.swing.*;
import java.io.*;
import java.util.*;

public class Nombre {
    public static void main(String[] args) throws RuntimeException {
        List<String> listaNombre = new ArrayList<>();
        List<String> listaApe = new ArrayList<>();
        File file;

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
  //      System.out.println(listaNombre);
   //     System.out.println("hasta aqui");
        Collections.shuffle(listaNombre);
        Collections.shuffle(listaApe);
 //       System.out.println(listaNombre);

        //ESTO ES PARA HACERLO CON MAPA
//        Map<String,String> mapEscritura = new LinkedHashMap<>();
//
//        for (int i = 0; i < listaNombre.size(); i++) {
//            mapEscritura.put(listaNombre.get(i),listaApe.get(i));
//        }
//
//        System.out.println(mapEscritura);
        file=chooseFile();
//
//        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))){
//            bw.write(mapEscritura.toString());
//            bw.newLine();
//
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

         listaNombre.spliterator();
 int a = chooseNUmber();
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))){
            for (int i = 0; i < a; i++) {
                Collections.shuffle(listaNombre);
                Collections.shuffle(listaApe);
                bw.write(listaNombre.get(0));
                bw.write(" ");
                bw.write(listaApe.get(0));
                bw.newLine();



            }
         //   bw.write(mapEscritura.toString());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    public static File chooseFile() {
        File archivo2 = null;
        JFileChooser fileChooser = new JFileChooser();
        int seleccion = fileChooser.showSaveDialog(null);

        if (seleccion == JFileChooser.APPROVE_OPTION) {
            archivo2 = fileChooser.getSelectedFile();
            System.out.println(archivo2);
        }
        return archivo2;
    }

    public   static int  chooseNUmber(){
        Scanner sc= new Scanner(System.in);
        System.out.println("pon num");
        return sc.nextInt();


    }
}

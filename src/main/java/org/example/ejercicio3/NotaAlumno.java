package org.example.ejercicio3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class NotaAlumno {
    public static void main(String[] args) {
        Map<String,Double> mapAlumno = new LinkedHashMap<>();
        String fileName = "/home/jcerveram/IdeaProjects/Files/src/main/java/org/example/Documentos/alumnos_notas.txt";
        double total = 0;


        try ( BufferedReader bf = new BufferedReader(new FileReader(fileName))){
            String line;
            while((line = bf.readLine()) != null){
                String[] alumnEnArray = line.split(" ");
                for (int i = 2; i < alumnEnArray.length; i++) {
                    total += Double.parseDouble(alumnEnArray[i])/(alumnEnArray.length-2);
                }
                mapAlumno.put(alumnEnArray[0]+" "+alumnEnArray[1],total);
                total = 0;
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        System.out.println(mapAlumno);

        List<Map.Entry<String, Double>> list = new ArrayList<>(mapAlumno.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<String, Double>>() {
            public int compare(Map.Entry<String, Double> o1, Map.Entry<String, Double> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });

        Map<String, Double> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<String, Double> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        System.out.println(sortedMap);

    }

}

package org.ieslosremedios.daw1.prog.ut5.actividad52;

import java.util.*;
public class Actividad52Main {

    public static void main(String[] args) {
        System.out.println("           Lista de Tareas   ");
        String opcion1="ArrayList";
        System.out.println("La verdad que hoy me apetece usar "+opcion1);
        List<String> l;
        if (opcion1.equalsIgnoreCase("ArrayList")){
            l=new ArrayList<>();
        }else{
            l=new LinkedList();
        }
        System.out.println("Opciones disponibles de "+opcion1);
        System.out.println("__________________________________");
        System.out.println("1. Agrega una nueva tarea a la lista");
        System.out.println("2. ");
        List<TaskList>tareas;


    }
}
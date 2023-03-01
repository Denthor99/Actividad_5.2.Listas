package org.ieslosremedios.daw1.prog.ut5.actividad52;

import java.util.*;
public class Actividad52Main{

    public static void main(String[] args) {
        System.out.println("           Lista de Tareas   ");
        String opcion1="ArrayList";
        System.out.println("Usaremos, en este caso, "+opcion1);
        List<String> lista;
        if (opcion1.equalsIgnoreCase("ArrayList")){
            lista=new ArrayList<String>();
        }else{
            lista=new LinkedList<>();
        }
        System.out.println("Opciones disponibles de "+opcion1);
        System.out.println("__________________________________");
        System.out.println("1. Agrega una nueva tarea a la lista");
        System.out.println();
        TaskList.addTask(lista,"Tomar apuntes");
        TaskList.addTask(lista,"Apuntar posibles dudas");
        TaskList.addTask(lista,"Realizar los ejercicios correspondientes");
        TaskList.addTask(lista,"Preguntar las dudas al profesor");
        TaskList.addTask(lista,"Estudiar para el examen");
        System.out.println("2. Eliminar una tarea de la lista");
        System.out.println();
        TaskList.removeTask(lista,"Preguntar las dudas al profesor");
        TaskList.removeTask(lista,"Apuntar posibles dudas");
        System.out.println();
        System.out.println("3. Completar alguna de las tareas");
        System.out.println();
        TaskList.completeTask(lista,"Tomar apuntes");
        System.out.println();
        System.out.println("4. Imprimir todas las tareas");
        System.out.println();
        for (String e:
             lista) {
            System.out.println(e);
        }


    }
}
package org.ieslosremedios.daw1.prog.ut5.actividad52;

import java.util.*;

import static java.awt.SystemColor.window;

public class TaskList {
    private List<String> listaTareas;

    public TaskList(String tipoLista) {
        if (tipoLista.equalsIgnoreCase("ArrayList")){
            listaTareas=new ArrayList<String>();
        }else{
            listaTareas=new LinkedList<>();
        }
    }

    public static void addTask(List<String> list, String task){
        list.add(task);
        System.out.println("Tarea añadida: "+task);
    }

    public static void removeTask(List<String> list,String task){
        list.remove(task);
        System.out.println("Tarea eliminada: "+task);
    }
    public static void completeTask(List<String> list,String task){
        String completado="Tarea completada: ["+ task +"]";
        list.set(list.indexOf(task), completado);
        System.out.println(completado);
    }

    public static String[] getTasks(List<String> list){
        String[] array=(String [])list.toArray();
        return array;
    }

}

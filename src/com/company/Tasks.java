package com.company;

import java.util.ArrayList;

/**
 * Created by Pasha on 13/07/2017.
 */
public class Tasks {

    private ArrayList<String> taskList = new ArrayList<String>();

    public void addTaskItem(String item){

        taskList.add(item);

    }

    public void printTasks(){

        System.out.println("You have " + taskList.size() + " tasks to do.");
        for(int i=0 ; i<taskList.size() ; i++){

            System.out.println((i+1) + ". " + taskList.get(i));

        }

    }

    public void modifyTasks(int position, String newTask){

        taskList.set(position, newTask);
        System.out.println("Task item " + (position+1) + " was changed.");

    }

    public void removeTask(int position){

        String oneTask = taskList.get(position);
        taskList.remove(position);

    }

    public String findTask(String searchTask){

        int position = taskList.indexOf(searchTask);
        if(position >= 0){

            return taskList.get(position);

        }
        return null;

    }
}

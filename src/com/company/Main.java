package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static Tasks tasks = new Tasks();

    public static void main(String[] args) {
	    boolean exit = false;
	    int task = 0;
	    printInfo();

	    while(!exit){

            System.out.println("Enter a choice: ");
            task = scanner.nextInt();
            scanner.nextLine();

            switch(task){
                case 0:
                    printInfo();
                    break;
                case 1:
                    tasks.printTasks();
                    break;
                case 2:
                    addTask();
                    break;
                case 3:
                    modifyTask();
                    break;
                case 4:
                    removeTask();
                    break;
                case 5:
                    searchTask();
                    break;
                case 6:
                    exit = true;
                    break;
            }

        }
    }

    public static void printInfo(){

        System.out.println("\nType");
        System.out.println("\t 0- Main menu");
        System.out.println("\t 1- Show Tasks");
        System.out.println("\t 2- Add new task");
        System.out.println("\t 3- Change a current task");
        System.out.println("\t 4- Delete task");
        System.out.println("\t 5- Search for a task");
        System.out.println("\t 6- Exit");

    }

    public static void addTask(){

        System.out.println("Please enter a new task: ");
        tasks.addTaskItem(scanner.nextLine());

    }

    public static void modifyTask(){

        System.out.println("Enter task number: ");
        int taskNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter a new task: ");
        String newTask = scanner.nextLine();
        tasks.modifyTasks(taskNumber-1, newTask);

    }

    public static void removeTask(){

        System.out.println("Enter task number: ");
        int taskNumber = scanner.nextInt();
        scanner.nextLine();
        tasks.removeTask(taskNumber-1);

    }

    public static void searchTask(){

        System.out.println("Whats the task You want to find? ");
        String taskName = scanner.nextLine();
        if(tasks.findTask(taskName) != null){

            System.out.println("Found " + taskName + " in list.");

        } else {

            System.out.println(taskName + " is not in list.");

        }

    }
}

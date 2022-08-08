package com.jap.marksevaluation;

import java.util.Arrays;

public class OakBridgeSchool {

    // Convert the given string name to upper case
    public String convertToUpperCase(String name){
        String name1 ="";
        if(name.equals(name1)){
            return " ";
        }else {
            String upper = name.toUpperCase();
            return upper;
        }
    }

    // Find the shortest word in the list of surnames
    public String shortestSurname(String[] surnames)
    {
        if(surnames == null || surnames.length < 1) {
            return "";
        }
        String smallest = surnames[0];
        for (int i = 1; i < surnames.length; i++) {
            if(surnames[i].length() < smallest.length()){
                smallest = surnames[i];
            }
        }
        return smallest;
    }

    // Check if any of the names in the array is repeated, if yes return true else false
    public boolean checkIfNamesAreRepeated(String[] names){
        boolean flag = false;
        for (int i = 0; i < names.length; i++) {
            for (int j = i+1; j < names.length; j++) {
                if(names[i] != null && names[i].equals(names[j])){
                    return true;
                }
            }
        }

        return flag;
    }

    // Concatenate the name and surname of the students
    public String[] concatenateNameAndSurname(String[] names, String [] surnames){
        String []  concatenatedNames = new String[names.length];
        String str1 ="";
        String str2="";
        for (int i = 0; i < names.length; i++) {
            str1=names[i];
            str2 = " ".concat(surnames[i]);
            concatenatedNames[i] = str1.concat(str2);
        }

        return  concatenatedNames;
    }

    // Display the names
    public void displayStudentNames(String[] namesArray){
        Arrays.sort(namesArray);
        System.out.println(Arrays.toString(namesArray));
    }

    public static void main(String[] args) {
        OakBridgeSchool oakBridgeSchool = new OakBridgeSchool();
        // Declare and Initialize values to the arrays
        String[] studentNames = new String[]{"Michelle", "Kate", "Ann", "Tina", "Tom", "Sam", "Ria", "Pam", "Kate", "Leo"};
        String[] studentSurnames = new String[]{"Smith", "Johnson", "Williams", "Brown", "Jones", "Miller", "Davis", "Martin", "Clark", "King"};
        // Call the method to convert all the student names to upper case and display results
        for (int i = 0; i < studentNames.length; i++) {
            String students = oakBridgeSchool.convertToUpperCase(studentNames[i]);
            System.out.print(students+", ");
        }
        System.out.println();
        // Call the method to sort names in alphabetical order and display results
        oakBridgeSchool.displayStudentNames(studentNames);
        // Call the method to find the shortest surname and display results
        String sortName = oakBridgeSchool.shortestSurname(studentSurnames);
        System.out.println(" Sort Sur Name = " +  sortName);
        // Call the method to check if two names in the array are the same and display results
        boolean value = oakBridgeSchool.checkIfNamesAreRepeated(studentNames);
        System.out.println("There are repeated name in the name list : "+value);
        // Call the method to concatenate name and surname with a space in between and display results
        System.out.println("The student full name (name and surname) : ");
        String[] finalName = oakBridgeSchool.concatenateNameAndSurname(studentNames,studentSurnames);
        System.out.println(Arrays.toString(finalName));

    }
}

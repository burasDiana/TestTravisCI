package com.company;


public class Main {

    public static void main(String[] args) {
	// write your code here
        Grade grade = new Grade();
        System.out.println(grade.convertGrade('a'));
    }
    public static class Grade{
         int convertGrade(char c) {
            if(c == 'a')
                return 12;
            return -5;
        }
    }
}

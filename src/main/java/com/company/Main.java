package com.company;


public class Main {

    public static void main(String[] args) {
	// write your code here
        Grade grade = new Grade();
        grade.convertGrade(grade);
        if(grade.GetValue_Danish() >= -3 ){
            System.out.println(grade.GetValue_Danish());
        }
        else if(grade.GetValue_English() != null){
            System.out.println(grade.GetValue_English());
        }
    }
}

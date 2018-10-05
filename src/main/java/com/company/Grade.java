package com.company;

public class Grade {
    enum Type{Danish,English}
    private String value;
    private int value_Danish;
    private String  value_English;
    private String type;
    private String chars = "ABCDEF";

    public String getType(String value){
        if(chars.contains(value)){
           return Type.English.toString();
        }
        return Type.Danish.toString();
    }
    public void convertGrade(Grade g) {
        g.getType(g.value);
        if(g.type == Type.English.toString() && chars.contains(g.value)){
            g.value_English = g.value;
    }
        g.value_Danish = Integer.parseInt(g.value);
    }
    public void Set_Value(String value){
        this.value = value;
    }
    public int GetValue_Danish(){
        return value_Danish;
    }
    public String GetValue_English(){
        return value_English;
    }
}

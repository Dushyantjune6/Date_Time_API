package org.Abdul_Bari;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    String str = "Hello";
        System.out.println("Updated hashcode : "+str.hashCode());
        str = str+"1";
        System.out.println("Updated hashcode : "+str.hashCode());
    }
}
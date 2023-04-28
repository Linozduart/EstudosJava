package com.indra.estudosjava;

public class SystemLanguage {
    public static void main(String[] args) {
    String language = System.getProperty("user.language");
     System.out.print(language);
    }
}
package resources;

import java.util.List;

public class Style {
    
public static final String RESET = "\u001B[0m";
public static final String CYAN = "\u001B[36m";
public static final String YELLOW = "\u001B[33m";
public static final String RED = "\u001B[31m";
public static final String BOLD = "\u001B[1m";
public static final String GREEN = "\u001B[32m";

        
    public static void show (String text) {
        System.out.print(text);
    }
    
    public static void show(String text,String... styles) {
        for (String style : List.of(styles)) {
            text = style + text;
        } 
        text = text + RESET;
        System.out.print(text);
    } 
    
    public static void showln (String text) {
        System.out.println(text);
    }
    
    public static void showln(String text,String... styles) {
        for (String style : List.of(styles)) {
            text = style + text;
        } 
        text = text + RESET;
        System.out.println(text);
    } 
}




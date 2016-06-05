package analizador;

import java.io.File;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class Flex {

    public static void main(String[] args) {
        /*
         try {
         String path = getWorkingDirectory() + "\\src\\analizador\\lexer.flex";
         generadorLexer(path);

         while (true) {
         String input = (JOptionPane.showInputDialog("Ingrese el identificador"));

                
                
         //TODO extract parenteshis strigns
                
                
                
                
                
         AnalizadorJFlex analizador = new AnalizadorJFlex(new StringReader(input));
         //                
         //                System.out.println("Expresion Regular=" + analizador.yylex());

         for (int i = 0; i < input.length(); i++) {
         if (input.charAt(i) >= '0' && input.charAt(i) <= '9') {
         AnalizadorJFlex analizer = new AnalizadorJFlex(new StringReader(String.valueOf(input.charAt(i))));
         System.out.println(analizer.yylex());
         }
         if (input.charAt(i) == '+' || input.charAt(i) == '-' || input.charAt(i) == '*' || input.charAt(i) == '/') {
         AnalizadorJFlex analizer = new AnalizadorJFlex(new StringReader(String.valueOf(input.charAt(i))));
         System.out.println(analizer.yylex());
         }
         if (input.charAt(i) == '(' || input.charAt(i) == ')') {
         AnalizadorJFlex analizer = new AnalizadorJFlex(new StringReader(String.valueOf(input.charAt(i))));
         System.out.println(analizer.yylex());
         }
         }

         System.out.println("Expresion Regular=" + analizador.yylex());
         }

         } catch (Exception ex) {
         System.out.println("ERROR LEXICO || " + ex);
         }
         */
        String myString = "(2*((3-2)+(5-3)))";
	String new_s = myString.toLowerCase().replaceAll("[()]", "");
        System.out.println(new_s);
        System.out.println(checkParentheses(myString));

    }

    public static void generadorLexer(String path) {
        File file = new File(path);
        jflex.Main.generate(file);
    }

    public static String getWorkingDirectory() {
        String dir = System.getProperty("user.dir");
//        System.out.println("current dir = " + dir);
        return dir;
    }
    
    public static boolean checkParentheses(String s) {
    int nesting = 0;
    for (int i = 0; i < s.length(); ++i)
    {
        char c = s.charAt(i);
        switch (c) {
            case '(':
                nesting++;
                break;
            case ')':
                nesting--;
                if (nesting < 0) {
                    return false;
                }
                break;
        }
    }
    return nesting == 0;
}

}
